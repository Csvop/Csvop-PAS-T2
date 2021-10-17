package com.bcopstein.negocio.repositorios;

import java.util.List;

import com.bcopstein.negocio.entidades.ItemVenda;

public interface IRepositoryItemVendas {
    List<ItemVenda> todosItemVenda();
    boolean deletaItem(ItemVenda itemVenda);
    boolean atualizaItem(ItemVenda itemVendaOld, ItemVenda itemVendaNew);
    boolean adiciona(ItemVenda itemVenda);
}
