package com.bcopstein.negocio.servicos;

import java.util.List;

import com.bcopstein.negocio.entidades.ItemEstoque;
import com.bcopstein.negocio.repositorios.IRepositoryEstoque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicoDeEstoque {
    public IRepositoryEstoque estoqueRepository;

    @Autowired
    public ServicoDeEstoque(IRepositoryEstoque estoqueRepository) {
        this.estoqueRepository = estoqueRepository;
    }

    public List<ItemEstoque> todos() {
        return estoqueRepository.todos();
    }
}
