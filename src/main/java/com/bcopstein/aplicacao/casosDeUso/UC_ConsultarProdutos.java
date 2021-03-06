package com.bcopstein.aplicacao.casosDeUso;

import java.util.List;

import com.bcopstein.aplicacao.dtos.ProdutoDTO;
import com.bcopstein.aplicacao.servicos.ServicoProdutoDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UC_ConsultarProdutos {
    private ServicoProdutoDTO servicoProdutoDTO;

    @Autowired
    public UC_ConsultarProdutos(ServicoProdutoDTO servicoProdutoDTO) {
        this.servicoProdutoDTO = servicoProdutoDTO;
    }

    public List<ProdutoDTO> run() {
        return servicoProdutoDTO.todos();
    }
}