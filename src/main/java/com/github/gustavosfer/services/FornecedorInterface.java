package com.github.gustavosfer.services;

import com.github.gustavosfer.dto.FornecedorRequestDTO;
import com.github.gustavosfer.entities.Fornecedor;

import java.util.List;

public interface FornecedorInterface {

    public Fornecedor criarFornecedor(FornecedorRequestDTO fornecedor);
    public List<Fornecedor> listaFornecedores();
    public Fornecedor findByFornecedor(Long id);
    public Fornecedor atualizarFornecedor(Long id, FornecedorRequestDTO fornecedor);
    public void deletarFornecedor(Long id);
}
