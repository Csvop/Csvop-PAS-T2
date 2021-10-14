package com.bcopstein.adptadores.Persistencia.cruds;

import java.util.List;

import com.bcopstein.negocio.entidades.ItemEstoque;

import org.springframework.data.repository.CrudRepository;

public interface IEstoqueCRUD extends CrudRepository<ItemEstoque, String>{
    List<ItemEstoque> findAll();
}
