package com.bcopstein.adptadores.Persistencia.repositorios;

import java.util.List;

import com.bcopstein.adptadores.Persistencia.cruds.IItemVendaCRUD;
import com.bcopstein.adptadores.Persistencia.cruds.IVendasCRUD;
import com.bcopstein.negocio.entidades.ItemVenda;
import com.bcopstein.negocio.entidades.Venda;
import com.bcopstein.negocio.repositorios.IVendasRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VendasRepository implements IVendasRepository{
    private IVendasCRUD vendasCRUD;
    private IItemVendaCRUD itemVendaCRUD;
    
    @Autowired
    public VendasRepository(IVendasCRUD vendasCRUD, IItemVendaCRUD itemVendaCRUD) {
        this.vendasCRUD = vendasCRUD;
        this.itemVendaCRUD = itemVendaCRUD;
    }

    @Override
    public List<Venda> todasVendas() {
        return vendasCRUD.findAll();
    }

    @Override
    public List<ItemVenda> todosItemVenda() {
        return itemVendaCRUD.findAll();
    }
}
