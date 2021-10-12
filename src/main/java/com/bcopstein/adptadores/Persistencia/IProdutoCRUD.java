package com.bcopstein.adptadores.Persistencia;

import java.util.List;

import com.bcopstein.negocio.entidades.Produto;

import org.springframework.data.repository.CrudRepository;

public interface IProdutoCRUD extends CrudRepository<Produto,String>{
    List<Produto> findAll();
}
