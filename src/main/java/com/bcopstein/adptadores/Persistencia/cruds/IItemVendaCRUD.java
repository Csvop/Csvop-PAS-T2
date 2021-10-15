package com.bcopstein.adptadores.Persistencia.cruds;

import java.util.List;

import com.bcopstein.negocio.entidades.ItemVenda;

import org.springframework.data.repository.CrudRepository;

public interface IItemVendaCRUD extends CrudRepository<ItemVenda,String>{
    List<ItemVenda> findAll();
}
