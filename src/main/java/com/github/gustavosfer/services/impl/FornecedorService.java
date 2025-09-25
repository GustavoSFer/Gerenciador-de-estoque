package com.github.gustavosfer.services.impl;

import com.github.gustavosfer.dto.FornecedorRequestDTO;
import com.github.gustavosfer.entities.Fornecedor;
import com.github.gustavosfer.repository.FornecedorRepository;
import com.github.gustavosfer.services.FornecedorInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FornecedorService implements FornecedorInterface {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    @Override
    public Fornecedor criarFornecedor(FornecedorRequestDTO fornecedor) {
        Fornecedor adicionar = new Fornecedor();
        adicionar.setNome(fornecedor.nome());
        adicionar.setTelefone(fornecedor.telefone());
        adicionar.setEmail(fornecedor.email());
        adicionar.setEndereco(fornecedor.endereco());

        return fornecedorRepository.save(adicionar);
    }

    @Override
    public List<Fornecedor> listaFornecedores() {
        return List.of();
    }

    @Override
    public Fornecedor findByFornecedor(Long id) {
        return null;
    }

    @Override
    public Fornecedor atualizarFornecedor(Long id, FornecedorRequestDTO fornecedor) {
        return null;
    }

    @Override
    public Fornecedor deletarFornecedor(Long id) {
        return null;
    }
}
