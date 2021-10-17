package com.bcopstein.negocio.repositorios;

import java.util.List;

import com.bcopstein.negocio.entidades.ItemEstoque;

public interface IRepositoryEstoque {
    List<ItemEstoque> todos();
    boolean adiciona(ItemEstoque itemEstoque);
    boolean deleta(ItemEstoque itemEstoque);
    boolean atualiza(ItemEstoque itemEstoqueOld, ItemEstoque itemEstoqueNew);
}
