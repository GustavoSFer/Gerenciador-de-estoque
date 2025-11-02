package com.github.gustavosfer.services;

import com.github.gustavosfer.entities.Produto;

import java.util.List;

public interface ProdutoInterface {

    Produto criarProduto(Produto produto);
    List<Produto> listarProdutos();
}
