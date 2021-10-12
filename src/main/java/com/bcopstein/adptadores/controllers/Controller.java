package com.bcopstein.adptadores.controllers;

import java.util.List;

import com.bcopstein.aplicacao.casosDeUso.UC_EfetivarVenda;
import com.bcopstein.negocio.entidades.Produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vendas")
public class Controller {
    private UC_EfetivarVenda efetivarVenda;
    
    @Autowired
    public Controller(UC_EfetivarVenda efetivarVenda) {
        this.efetivarVenda = efetivarVenda;
    }

    @GetMapping("/produtos")
    @CrossOrigin(origins = "*")
    public List<Produto> todosProdutos() {
        return efetivarVenda.run();
    }
}
