package com.github.gustavosfer.mapper;

import com.github.gustavosfer.dto.FornecedorRequestDTO;
import com.github.gustavosfer.entities.Fornecedor;

public class FornecedorMapper {

    public static Fornecedor fornecedorDtoToFornecedor(FornecedorRequestDTO fornecedorRequestDTO) {
        Fornecedor adicionar = new Fornecedor();
        adicionar.setNome(fornecedorRequestDTO.nome());
        adicionar.setTelefone(fornecedorRequestDTO.telefone());
        adicionar.setEmail(fornecedorRequestDTO.email());
        adicionar.setEndereco(fornecedorRequestDTO.endereco());

        return adicionar;
    }
}
