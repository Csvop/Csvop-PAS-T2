package com.bcopstein.negocio.servicos;

import com.bcopstein.negocio.entidades.ItemVenda;
import com.bcopstein.negocio.entidades.Produto;
import com.bcopstein.negocio.repositorios.IProdutosRepository;
import com.bcopstein.negocio.repositorios.IVendasRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicoDeVendas {
    IVendasRepository vendasRepository;
    IProdutosRepository produtosRepository;

    @Autowired
    public ServicoDeVendas(IVendasRepository vendasRepository, IProdutosRepository produtoRepository) {
        this.vendasRepository = vendasRepository;
        this.produtosRepository = produtoRepository;
    }

    public int[] todoCarrinho(ItemVenda[] itens) {
        int subtotal = 0;
        int imposto = 0;

        for (final ItemVenda it : itens) {
            // Procurar o produto pelo código
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
}
