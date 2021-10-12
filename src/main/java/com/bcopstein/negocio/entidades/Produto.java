package com.bcopstein.negocio.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Produto {

  @Id
  private long codigo;
  private String descricao;
  private double preco;

  public Produto(long codigo, String descricao, double preco) {
    this.codigo = codigo;
    this.descricao = descricao;
    this.preco = preco;
  }

  public Produto(){}

  public long getId() {
    return codigo;
  }
  public void setId(long codigo) {
    this.codigo = codigo;
  }
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
  public double getPreco() {
    return preco;
  }
  public void setPreco(double preco) {
    this.preco = preco;
  }

  @Override
  public String toString() {
    return "Produto [descricao=" + descricao + ", codigo=" + codigo + ", preco=" + preco + ", qtdade=" + "]";
  }
}
