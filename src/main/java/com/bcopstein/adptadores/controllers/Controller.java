package com.bcopstein.adptadores.controllers;

import java.util.List;

import com.bcopstein.aplicacao.casosDeUso.UC_AutorizaProduto;
import com.bcopstein.aplicacao.casosDeUso.UC_CalculaSubtotal;
import com.bcopstein.aplicacao.casosDeUso.UC_ConfirmaVenda;
import com.bcopstein.aplicacao.casosDeUso.UC_ConsultarProdutos;
import com.bcopstein.aplicacao.casosDeUso.UC_ConsultarVendas;
import com.bcopstein.aplicacao.dtos.ProdutoDTO;
import com.bcopstein.negocio.entidades.ItemVenda;
import com.bcopstein.negocio.entidades.Venda;

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
    private UC_ConsultarVendas consultarVendas;
    private UC_ConfirmaVenda confirmaVenda;
    
    @Autowired
    public Controller(UC_ConsultarProdutos consultarProdutos, UC_AutorizaProduto autorizaProduto,
            UC_CalculaSubtotal calculaSubtotal, UC_ConsultarVendas consultarVendas, UC_ConfirmaVenda confirmaVenda) {
        this.consultarProdutos = consultarProdutos;
        this.autorizaProduto = autorizaProduto;
        this.calculaSubtotal = calculaSubtotal;
        this.consultarVendas = consultarVendas;
        this.confirmaVenda = confirmaVenda;
    }
    
    @GetMapping("/produtos")
    @CrossOrigin(origins = "*")
    public List<ProdutoDTO> todosProdutos() {
        return consultarProdutos.run();
    }

    @PostMapping("/confirmacao")
    @CrossOrigin(origins = "*")
    public boolean confirmaVenda(@RequestBody final ItemVenda[] itens) { 
        return confirmaVenda.run(itens);    
    }

    @GetMapping("/autorizacao")
    @CrossOrigin(origins = "*")
    public boolean podeVender(@RequestParam final Integer codProd, @RequestParam final Integer qtdade) {
        return autorizaProduto.run(codProd, qtdade);
    }

    @PostMapping("/subtotal")
    @CrossOrigin(origins = "*")
    public int[] calculaSubtotal(@RequestBody final ItemVenda[] itens) {
        return calculaSubtotal.run(itens);
    }

    @GetMapping("/historico")
    @CrossOrigin(origins = "*")
    public List<Venda> vendasEfetuadas() {
        return consultarVendas.run();
    }
}
