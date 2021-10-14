package com.bcopstein.negocio.repositorios;

import java.util.List;

import com.bcopstein.negocio.entidades.ItemEstoque;

public interface IEstoqueRepository {
    List<ItemEstoque> todos();
}
