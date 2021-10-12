package com.bcopstein.negocio.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ItemVenda {
    @Id
    long codigo;
    int quantidade;
    int precoUnitVenda;
    long imposto;

    public ItemVenda(long codigo, int quantidade, int precoUnitVenda, long imposto) {
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.precoUnitVenda = precoUnitVenda;
        this.imposto = imposto;
    }

    public ItemVenda() {}

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getPrecoUnitVenda() {
        return precoUnitVenda;
    }

    public void setPrecoUnitVenda(int precoUnitVenda) {
        this.precoUnitVenda = precoUnitVenda;
    }

    public long getImposto() {
        return imposto;
    }

    public void setImposto(long imposto) {
        this.imposto = imposto;
    }

    @Override
    public String toString() {
        return "ItemVenda [codigo=" + codigo + ", imposto=" + imposto + ", precoUnitVenda=" + precoUnitVenda
                + ", quantidade=" + quantidade + "]";
    }
}