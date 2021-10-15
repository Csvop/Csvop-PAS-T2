package com.bcopstein.adptadores.Persistencia.cruds;

import java.util.List;

import com.bcopstein.negocio.entidades.Venda;

import org.springframework.data.repository.CrudRepository;

public interface IVendasCRUD extends CrudRepository<Venda,String>{
    List<Venda> findAll();
}
