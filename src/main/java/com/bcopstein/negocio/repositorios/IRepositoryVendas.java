package com.bcopstein.negocio.repositorios;

import java.util.List;

import com.bcopstein.negocio.entidades.Venda;

public interface IRepositoryVendas {
    List<Venda> todasVendas();
    boolean salvaVenda(Venda venda);
}