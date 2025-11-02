package com.github.gustavosfer.services.impl;

import com.github.gustavosfer.entities.Produto;
import com.github.gustavosfer.repository.ProdutoRepository;
import com.github.gustavosfer.services.ProdutoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService implements ProdutoInterface {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public Produto criarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    @Override
    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }
}
