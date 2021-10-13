package com.bcopstein.negocio.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ItemEstoque {
    @Id
    private long codProduto;
    private int quantidadeDisponivel;

    public ItemEstoque(long codProduto, int quantidadeDisponivel){
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.codProduto = codProduto;
    }

    public ItemEstoque() {}

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }
    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}