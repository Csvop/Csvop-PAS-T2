package com.bcopstein.aplicacao.casosDeUso;

import com.bcopstein.negocio.entidades.ItemVenda;
import com.bcopstein.negocio.servicos.ServicoDeVendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UC_CalculaSubtotal {
    ServicoDeVendas servicoDeVendas;

    @Autowired
    public UC_CalculaSubtotal(ServicoDeVendas servicoDeVendas) {
        this.servicoDeVendas = servicoDeVendas;
    }

    public int[] run(ItemVenda[] itens) {
        return servicoDeVendas.todoCarrinho(itens);
    }
}
