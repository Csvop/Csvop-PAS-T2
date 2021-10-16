package com.bcopstein.aplicacao.casosDeUso;

import java.util.List;

import com.bcopstein.negocio.entidades.Venda;
import com.bcopstein.negocio.servicos.ServicoDeVendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UC_ConsultarVendas {
    private ServicoDeVendas servicoDeVendas;

    @Autowired
    public UC_ConsultarVendas(ServicoDeVendas servicoDeVendas) {
        this.servicoDeVendas = servicoDeVendas;
    }

    public List<Venda> run() {
        return servicoDeVendas.todos();
    }
}
