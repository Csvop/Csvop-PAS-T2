package com.bcopstein.aplicacao.casosDeUso;

import java.util.List;

import com.bcopstein.aplicacao.dtos.ProdutoDTO;
import com.bcopstein.negocio.servicos.ServicoVendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UC_ConsultarProdutos {
    private ServicoVendas servicoVendas;

    @Autowired
    public UC_ConsultarProdutos(ServicoVendas servicoVendas) {
        this.servicoVendas = servicoVendas;
    }

    public List<ProdutoDTO> run() {
        return servicoVendas.todos();
    }
}