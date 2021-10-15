package com.bcopstein.adptadores.controllers;

import java.util.List;

import com.bcopstein.aplicacao.casosDeUso.UC_AutorizaProduto;
import com.bcopstein.aplicacao.casosDeUso.UC_CalculaSubtotal;
import com.bcopstein.aplicacao.casosDeUso.UC_ConsultarProdutos;
import com.bcopstein.aplicacao.dtos.ProdutoDTO;
import com.bcopstein.negocio.entidades.ItemVenda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vendas")
public class Controller {
    private UC_ConsultarProdutos consultarProdutos;
    private UC_AutorizaProduto autorizaProduto;
    private UC_CalculaSubtotal calculaSubtotal;
    
    @Autowired
    public Controller(UC_ConsultarProdutos consultarProdutos, UC_AutorizaProduto autorizaProduto,
            UC_CalculaSubtotal calculaSubtotal) {
        this.consultarProdutos = consultarProdutos;
        this.autorizaProduto = autorizaProduto;
        this.calculaSubtotal = calculaSubtotal;
    }

    @GetMapping("/produtos")
    @CrossOrigin(origins = "*")
    public List<ProdutoDTO> todosProdutos() {
        return consultarProdutos.run();
    }

    @PostMapping("/confirmacao")
    @CrossOrigin(origins = "*")
    public boolean confirmaVenda(@RequestBody final ItemVenda[] itens) { 
        if(itens.length > 0)
            return true;
        else
            return false;    
    }

    @GetMapping("/autorizacao")
    @CrossOrigin(origins = "*")
    public boolean podeVender(@RequestParam final Integer codigo, @RequestParam final Integer quantidade) {
        return autorizaProduto.run(codigo, quantidade);
    }

    @PostMapping("/subtotal")
    @CrossOrigin(origins = "*")
    public int[] calculaSubtotal(@RequestBody final ItemVenda[] itens) {
        return calculaSubtotal.run(itens);
    }
}
