package com.bcopstein.negocio.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Venda {
    @Id
    public long codigo;
    public String data_venda;
    public String descricao;
    public long cod_prod;
    public int quantidade;
    
    public Venda(long codigo, String data_venda, String descricao, long cod_prod, int quantidade) {
        this.codigo = codigo;
        this.data_venda = data_venda;
        this.descricao = descricao;
        this.cod_prod = cod_prod;
        this.quantidade = quantidade;
    }

    public Venda(){}

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getData_venda() {
        return data_venda;
    }

    public void setData_venda(String data_venda) {
        this.data_venda = data_venda;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public long getCod_prod() {
        return cod_prod;
    }

    public void setCod_prod(long cod_prod) {
        this.cod_prod = cod_prod;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Venda [cod_prod=" + cod_prod + ", codigo=" + codigo + ", data_venda=" + data_venda + ", descricao=" + descricao
                + ", quantidade=" + quantidade + "]";
    }
}