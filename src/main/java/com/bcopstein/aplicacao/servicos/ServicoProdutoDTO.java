package com.bcopstein.aplicacao.servicos;

import java.util.ArrayList;
import java.util.List;

import com.bcopstein.aplicacao.dtos.ProdutoDTO;
import com.bcopstein.negocio.entidades.ItemEstoque;
import com.bcopstein.negocio.servicos.ServicoDeEstoque;
import com.bcopstein.negocio.servicos.ServicoDeProduto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicoProdutoDTO {
    public ServicoDeProduto servicoDeProduto;
    public ServicoDeEstoque servicoDeEstoque;

    @Autowired
    public ServicoProdutoDTO(ServicoDeProduto servicoDeProduto, ServicoDeEstoque servicoDeEstoque) {
        this.servicoDeProduto = servicoDeProduto;
        this.servicoDeEstoque = servicoDeEstoque;
    }

    public List<ProdutoDTO> todos() {
        List<ProdutoDTO> produtos = new ArrayList<>();
        servicoDeProduto.todos().forEach((p) -> {
            int quantidade = 0;
            for(ItemEstoque ie : servicoDeEstoque.todos()) {
                if(ie.getCodProduto() == p.getCodigo()) {
                    quantidade = ie.getQuantidade();
                }
            }

            produtos.add(new ProdutoDTO(p.getCodigo(), p.getDescricao(), p.getPreco(), quantidade));
        });
        return produtos;
    }

    public boolean valida(int codigo, int quantidade) {
        return todos().stream().anyMatch(p -> p.getCodigo() == codigo && p.getQuantidade() >= quantidade);
    }
}
