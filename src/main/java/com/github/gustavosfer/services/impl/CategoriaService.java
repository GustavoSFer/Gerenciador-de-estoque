package com.github.gustavosfer.services.impl;

import com.github.gustavosfer.entities.Categoria;
import com.github.gustavosfer.exceptions.fornecedorException.CategoriaNotFoundException;
import com.github.gustavosfer.repository.CategoriaRepository;
import com.github.gustavosfer.services.CategoriaInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CategoriaService implements CategoriaInterface {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public Categoria criarCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public List<Categoria> listarCategoria() {
        return categoriaRepository.findAll();
    }

    @Override
    public Categoria buscarCategoria(Long id) {
        Optional<Categoria> categoria = categoriaRepository.findById(id);

        return categoria.orElseThrow(() -> new CategoriaNotFoundException("Categoria não encontrata!"));
    }

    @Override
    public Categoria atualizarCategoria(Categoria categoria) {
        Categoria categoriaBanco = buscarCategoria(categoria.getId());

        categoriaBanco.setNome(categoria.getNome());
        categoriaBanco.setDescricao(categoria.getDescricao());
        categoriaBanco.setProdutos(categoria.getProdutos());

        return categoriaRepository.save(categoriaBanco);
    }

    @Override
    public void deletarCategoria(Long id) {

    }
}
