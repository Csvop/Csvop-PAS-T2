package com.bcopstein.adptadores.Persistencia.repositorios;

import java.util.List;

import com.bcopstein.adptadores.Persistencia.cruds.IItemVendaCRUD;
import com.bcopstein.negocio.entidades.ItemVenda;
import com.bcopstein.negocio.repositorios.IRepositoryItemVendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RepositoryItemVenda implements IRepositoryItemVendas{
    IItemVendaCRUD itemVendaCRUD;

    @Autowired
    public RepositoryItemVenda(IItemVendaCRUD itemVendaCRUD) {
        this.itemVendaCRUD = itemVendaCRUD;
    }

    @Override
    public List<ItemVenda> todosItemVenda() {
        return itemVendaCRUD.findAll();
    }

    @Override
    public boolean deletaItem(ItemVenda itemVenda) {
        itemVendaCRUD.delete(itemVenda);
        return true;
    }

    @Override
    public boolean atualizaItem(ItemVenda itemVendaOld, ItemVenda itemVendaNew) {
        itemVendaCRUD.delete(itemVendaOld);
        itemVendaCRUD.save(itemVendaNew);
        return true;
    }

    @Override
    public boolean adiciona(ItemVenda itemVenda) {
        itemVendaCRUD.save(itemVenda);
        return true;
    }
}
