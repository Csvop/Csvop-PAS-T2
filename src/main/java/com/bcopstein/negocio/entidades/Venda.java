package com.bcopstein.negocio.entidades;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Venda {
    @Id
    public long codigo;
    public Date data;
    
    public Venda(long codigo, Date data) {
        this.codigo = codigo;
        this.data = data;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Venda [codigo=" + codigo + ", data=" + data + "]";
    }
}