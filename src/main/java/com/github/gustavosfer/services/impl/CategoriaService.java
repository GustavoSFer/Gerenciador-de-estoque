package com.github.gustavosfer.services.impl;

import com.github.gustavosfer.entities.Categoria;
import com.github.gustavosfer.repository.CategoriaRepository;
import com.github.gustavosfer.services.CategoriaInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoriaService implements CategoriaInterface {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public Categoria criarCategoria(Categoria categoria) {
        return null;
    }

    @Override
    public List<Categoria> listarCategoria() {
        return List.of();
    }

    @Override
    public Categoria buscarCategoria(Long id) {
        return null;
    }

    @Override
    public Categoria atualizarCategoria(Categoria categoria) {
        return null;
    }

    @Override
    public void deletarCategoria(Long id) {

    }
}
