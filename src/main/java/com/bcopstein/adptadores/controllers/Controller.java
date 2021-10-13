package com.bcopstein.adptadores.controllers;

import java.util.ArrayList;
import java.util.List;

import com.bcopstein.aplicacao.casosDeUso.UC_ConsultarProdutos;
import com.bcopstein.negocio.entidades.Produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vendas")
public class Controller {
    private UC_ConsultarProdutos consultarProdutos;
    
    @Autowired
    public Controller(UC_ConsultarProdutos consultarProdutos) {
        this.consultarProdutos = consultarProdutos;
    }

    @GetMapping("/produtos")
    @CrossOrigin(origins = "*")
    public List<Produto> todosProdutos() {
        return consultarProdutos.run();
    }
}
