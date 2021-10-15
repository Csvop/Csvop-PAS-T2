package com.bcopstein.aplicacao.casosDeUso;

import com.bcopstein.aplicacao.servicos.ServicoProdutoDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UC_AutorizaProduto {
    private ServicoProdutoDTO servicoProdutoDTO;

    @Autowired
    public UC_AutorizaProduto(ServicoProdutoDTO servicoProdutoDTO) {
        this.servicoProdutoDTO = servicoProdutoDTO;
    }

    public boolean run(int codigo, int quantidade) {
        return servicoProdutoDTO.valida(codigo, quantidade);
    }
}
