package com.bcopstein.adptadores.Persistencia.repositorios;

import java.util.List;

import com.bcopstein.adptadores.Persistencia.cruds.IVendasCRUD;
import com.bcopstein.negocio.entidades.Venda;
import com.bcopstein.negocio.repositorios.IRepositoryVendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RepositoryVendas implements IRepositoryVendas{
    private IVendasCRUD vendasCRUD;
    
    @Autowired
    public RepositoryVendas(IVendasCRUD vendasCRUD) {
        this.vendasCRUD = vendasCRUD;
    }

    @Override
    public List<Venda> todasVendas() {
        return vendasCRUD.findAll();
    }

    @Override
    public boolean salvaVenda(Venda venda) {
        vendasCRUD.save(venda);
        return true;
    }
}
