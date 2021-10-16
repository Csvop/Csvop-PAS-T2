package com.bcopstein.negocio.repositorios;

import java.util.List;

import com.bcopstein.negocio.entidades.ItemVenda;
import com.bcopstein.negocio.entidades.Venda;

//import com.bcopstein.negocio.entidades.Venda;

public interface IVendasRepository {
    //public void salvar(Venda venda);
    public List<Venda> todasVendas();
    public List<ItemVenda> todosItemVenda(); 
    public boolean salvaVenda(Venda venda);
}
