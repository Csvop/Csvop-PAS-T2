package com.bcopstein.negocio.entidades;

public class ItemEstoque{

    int quantidadeDisponivel;

    public ItemEstoque(int quantidadeDisponivel){
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public int getQuantidadeDisponivel(){
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel){
        this.quantidadeDisponivel = quantidadeDisponivel;
    }
}