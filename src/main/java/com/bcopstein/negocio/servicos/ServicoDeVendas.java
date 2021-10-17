package com.bcopstein.negocio.servicos;

import java.util.ArrayList;
import java.util.List;

import com.bcopstein.negocio.entidades.ItemEstoque;
import com.bcopstein.negocio.entidades.ItemVenda;
import com.bcopstein.negocio.entidades.Produto;
import com.bcopstein.negocio.entidades.Venda;
import com.bcopstein.negocio.repositorios.IRepositoryProdutos;
import com.bcopstein.negocio.repositorios.IRepositoryVendas;
import com.bcopstein.negocio.repositorios.IRepositoryEstoque;
import com.bcopstein.negocio.repositorios.IRepositoryItemVendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicoDeVendas {
    IRepositoryVendas vendasRepository;
    IRepositoryProdutos produtosRepository;
    IRepositoryItemVendas itemVendaRepository;
    IRepositoryEstoque estoqueRepository;

    @Autowired
    public ServicoDeVendas(IRepositoryVendas vendasRepository, IRepositoryProdutos produtoRepository,
    IRepositoryItemVendas itemVendaRepository, IRepositoryEstoque estoqueRepository) {
        this.vendasRepository = vendasRepository;
        this.produtosRepository = produtoRepository;
        this.itemVendaRepository = itemVendaRepository;
        this.estoqueRepository = estoqueRepository;
    }

    public int[] todoCarrinho(ItemVenda[] itens) {
        int subtotal = 0;
        int imposto = 0;

        for (final ItemVenda it : itens) {
        
            final Produto prod =
                produtosRepository.todos().stream().filter(p -> p.getCodigo() == it.getCodigo()).findAny().orElse(null);

            if (prod != null) {
                subtotal += (int) (prod.getPreco() * it.getQuantidade());
            } else {
                throw new IllegalArgumentException("Codigo invalido");
            }
        }

        imposto = (int) (subtotal * 0.1);
        final int[] resp = new int[3];
        resp[0] = subtotal;
        resp[1] = imposto;
        resp[2] = subtotal + imposto;
        return resp;
    }

    public List<Venda> todos() {
        return vendasRepository.todasVendas();
    }

    public boolean confirmaVenda(ItemVenda[] itens) {

        ArrayList<ItemEstoque> listaEstoque = new ArrayList<>();
        ArrayList<Integer> listaQtdades = new ArrayList<>();

        for (ItemVenda item : itens) {
            final ItemEstoque itemEstoque = estoqueRepository.todos().stream().filter(p -> p.getCodProduto() == item.getCodigo()).findAny().orElse(null);

            if (itemEstoque == null) {
                return false;
            }

            listaEstoque.add(itemEstoque);
            listaQtdades.add(item.getQuantidade());
        }

        int i = 0;
        for(ItemEstoque item : listaEstoque) {
            int quantidade = item.getQuantidade() - listaQtdades.get(i);

            ItemEstoque itemEstoqueNew = new ItemEstoque(item.getCodProduto(), quantidade);
        
            estoqueRepository.atualiza(listaEstoque.get(i), itemEstoqueNew);

            registraVenda(itemEstoqueNew.getCodProduto(), listaQtdades.get(i));

            i++;
        }

        return true;    
    }

    private void registraVenda(long codProd, int quantidade) {
        int codigo = 0;
        String descricao = "";
        for (Produto produto : produtosRepository.todos()) {
            if(produto.getCodigo() == codProd)
                descricao = produto.getDescricao();  
        }

        codigo = vendasRepository.todasVendas().size() + 1;

        Venda venda = new Venda(codigo, descricao, quantidade);

        vendasRepository.salvaVenda(venda);
    }

}
