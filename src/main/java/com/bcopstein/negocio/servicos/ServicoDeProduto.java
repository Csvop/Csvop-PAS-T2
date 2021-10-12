package com.bcopstein.negocio.servicos;

import java.util.List;

import com.bcopstein.negocio.entidades.Produto;
import com.bcopstein.negocio.repositorios.IProdutosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicoDeProduto {
    public IProdutosRepository produtosRepository;

    @Autowired
    public ServicoDeProduto(IProdutosRepository produtosRepository) {
        this.produtosRepository = produtosRepository;
    }

    public List<Produto> todos() {
        return produtosRepository.todos();
    }
}