package com.bcopstein.negocio.repositorios;

import java.util.List;

import com.bcopstein.negocio.entidades.Produto;

public interface IProdutosRepository {
    List<Produto> todos();
}