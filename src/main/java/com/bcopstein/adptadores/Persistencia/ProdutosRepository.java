package com.bcopstein.adptadores.Persistencia;

import java.util.List;

import com.bcopstein.negocio.entidades.Produto;
import com.bcopstein.negocio.repositorios.IProdutosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProdutosRepository implements IProdutosRepository {
    private IProdutoCRUD prodCRUD;

    @Autowired
    public ProdutosRepository(IProdutoCRUD prodCRUD) {
        this.prodCRUD = prodCRUD;
    }

    @Override
    public List<Produto> todos() {
        return prodCRUD.findAll();
    }
}
