package com.github.gustavosfer.services;

import com.github.gustavosfer.entities.Categoria;

import java.util.List;

public interface CategoriaInterface {

    Categoria criarCategoria(Categoria categoria);
    List<Categoria> listarCategoria();
    Categoria buscarCategoria(Long id);
    Categoria atualizarCategoria(Categoria categoria);
    void deletarCategoria(Long id);

}
