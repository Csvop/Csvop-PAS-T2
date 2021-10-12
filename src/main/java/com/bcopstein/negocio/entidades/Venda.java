package com.bcopstein.negocio.entidades;

import java.util.Date;
import javax.persistence.Entity;

import org.springframework.web.bind.annotation.RequestBody;

@Entity
public class Venda{
    long numero;
    Date data;

    public Venda(long numero, Date data){
        this.numero = numero;
        this.data = data;
    }



    public Integer[] calculaSubtotal(@RequestBody final ItemVenda[] itens) {
    Integer subtotal = 0;
    Integer imposto = 0;

    for (final ItemVenda it : itens) {
        // Procurar o produto pelo código
        final Produto prod =
            produtos.stream().filter(p -> p.getCodigo() == it.getCodigo()).findAny().orElse(null);

        if (prod != null) {
        subtotal += (int) (prod.getPreco() * it.getQuantidade());
        } else {
        throw new IllegalArgumentException("Codigo invalido");
        }
    }
    imposto = (int) (subtotal * 0.1);
    final Integer[] resp = new Integer[3];
    resp[0] = subtotal;
    resp[1] = imposto;
    resp[2] = subtotal + imposto;
    return resp;
    }
}