package com.bcopstein.aplicacao.casosDeUso;

import com.bcopstein.negocio.entidades.ItemVenda;
import com.bcopstein.negocio.servicos.ServicoDeVendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UC_ConfirmaVenda {
    ServicoDeVendas servicoDeVendas;

    @Autowired
    public UC_ConfirmaVenda(ServicoDeVendas servicoDeVendas) {
        this.servicoDeVendas = servicoDeVendas;
    }

    public boolean run(ItemVenda[] itens) {
        return servicoDeVendas.confirmaVenda(itens);
    }
}
