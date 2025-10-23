package com.github.gustavosfer.services;

import com.github.gustavosfer.entities.Fornecedor;

import java.util.List;

public interface FornecedorInterface {

    public Fornecedor criarFornecedor(Fornecedor fornecedor);
    public List<Fornecedor> listaFornecedores();
    public Fornecedor findByFornecedor(Long id);
    public Fornecedor atualizarFornecedor(Fornecedor fornecedor);
    public void deletarFornecedor(Long id);
}
