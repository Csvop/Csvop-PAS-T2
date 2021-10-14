package com.bcopstein.negocio.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ItemEstoque {
    @Id
    private long codProduto;
    private int quantidade;

    public ItemEstoque(long codProduto, int quantidade){
        this.quantidade = quantidade;
        this.codProduto = codProduto;
    }

    public ItemEstoque() {}

    public long getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(long codProduto) {
        this.codProduto = codProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}