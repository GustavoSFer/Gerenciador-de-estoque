package com.github.gustavosfer.services.impl;

import com.github.gustavosfer.dto.FornecedorRequestDTO;
import com.github.gustavosfer.entities.Fornecedor;
import com.github.gustavosfer.mapper.FornecedorMapper;
import com.github.gustavosfer.repository.FornecedorRepository;
import com.github.gustavosfer.services.FornecedorInterface;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FornecedorService implements FornecedorInterface {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Fornecedor criarFornecedor(FornecedorRequestDTO fornecedorDto) {

        Fornecedor fornecedor = modelMapper.map(fornecedorDto, Fornecedor.class);
        fornecedor.setEndereco("Rua padrao de teste");

        return fornecedorRepository.save(fornecedor);
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
