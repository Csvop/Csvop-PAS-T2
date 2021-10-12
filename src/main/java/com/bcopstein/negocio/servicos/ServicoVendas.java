package com.bcopstein.negocio.servicos;

import java.util.List;

import com.bcopstein.negocio.entidades.Produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicoVendas {
    public ServicoDeProduto servicoDeProduto;

    @Autowired
    public ServicoVendas(ServicoDeProduto servicoDeProduto) {
        this.servicoDeProduto = servicoDeProduto;
    }

    public List<Produto> todos() {
        return servicoDeProduto.todos();
    }
}
