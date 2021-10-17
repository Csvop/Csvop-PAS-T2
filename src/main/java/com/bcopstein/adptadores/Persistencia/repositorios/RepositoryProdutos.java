package com.bcopstein.adptadores.Persistencia.repositorios;

import java.util.List;

import com.bcopstein.adptadores.Persistencia.cruds.IProdutoCRUD;
import com.bcopstein.negocio.entidades.Produto;
import com.bcopstein.negocio.repositorios.IRepositoryProdutos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RepositoryProdutos implements IRepositoryProdutos {
    private IProdutoCRUD prodCRUD;

    @Autowired
    public RepositoryProdutos(IProdutoCRUD prodCRUD) {
        this.prodCRUD = prodCRUD;
    }

    @Override
    public List<Produto> todos() {
        return prodCRUD.findAll();
    }
}
