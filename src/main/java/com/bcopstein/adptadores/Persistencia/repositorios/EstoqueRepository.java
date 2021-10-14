package com.bcopstein.adptadores.Persistencia.repositorios;

import java.util.List;

import com.bcopstein.adptadores.Persistencia.cruds.IEstoqueCRUD;
import com.bcopstein.negocio.entidades.ItemEstoque;
import com.bcopstein.negocio.repositorios.IEstoqueRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EstoqueRepository implements IEstoqueRepository{
    public IEstoqueCRUD estoqueCRUD;

    @Autowired
    public EstoqueRepository(IEstoqueCRUD estoqueCRUD) {
        this.estoqueCRUD = estoqueCRUD;
    }

    @Override
    public List<ItemEstoque> todos() {
        return estoqueCRUD.findAll();
    }
}
