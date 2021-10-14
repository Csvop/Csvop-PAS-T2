package com.bcopstein.negocio.servicos;

import java.util.List;

import com.bcopstein.aplicacao.dtos.ProdutoDTO;
import com.bcopstein.aplicacao.servicos.ServicoProdutoDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicoVendas {
    public ServicoProdutoDTO sProdutoDTO;

    @Autowired
    public ServicoVendas(ServicoProdutoDTO sProdutoDTO) {
        this.sProdutoDTO = sProdutoDTO;
    }

    public List<ProdutoDTO> todos() {
        return sProdutoDTO.todos();
    }
}
