package com.bcopstein.adptadores.Persistencia.repositorios;

import java.util.List;

import com.bcopstein.adptadores.Persistencia.cruds.IEstoqueCRUD;
import com.bcopstein.negocio.entidades.ItemEstoque;
import com.bcopstein.negocio.repositorios.IRepositoryEstoque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RepositoryEstoque implements IRepositoryEstoque{
    public IEstoqueCRUD estoqueCRUD;

    @Autowired
    public RepositoryEstoque(IEstoqueCRUD estoqueCRUD) {
        this.estoqueCRUD = estoqueCRUD;
    }

    @Override
    public List<ItemEstoque> todos() {
        return estoqueCRUD.findAll();
    }

    @Override
    public boolean adiciona(ItemEstoque itemEstoque) {
        estoqueCRUD.save(itemEstoque);
        return true;
    }

    @Override
    public boolean deleta(ItemEstoque itemEstoque) {
        estoqueCRUD.delete(itemEstoque);
        return true;
    }

    @Override
    public boolean atualiza(ItemEstoque itemEstoqueOld, ItemEstoque itemEstoqueNew) {
        estoqueCRUD.delete(itemEstoqueOld);
        estoqueCRUD.save(itemEstoqueNew);
        return true;
    }
}
