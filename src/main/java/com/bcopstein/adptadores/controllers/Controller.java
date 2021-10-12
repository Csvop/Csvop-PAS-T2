package com.bcopstein.adptadores.controllers;

import java.util.List;

import com.bcopstein.negocio.entidades.Produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vendas")
public class Controller {
    
    
    @Autowired
    public Controller() {
        //Vazio por enquanto, esperando os <Use Cases>.
    }

    @GetMapping("/produtos")
    @CrossOrigin(origins = "*")
    public List<Produto> todosProdutos() {
        return null;
    }
}
