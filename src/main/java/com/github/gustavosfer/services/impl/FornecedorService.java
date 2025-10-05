package com.github.gustavosfer.services.impl;

import com.github.gustavosfer.dto.FornecedorRequestDTO;
import com.github.gustavosfer.entities.Fornecedor;
import com.github.gustavosfer.exceptions.fornecedorException.FornecedorNotFoundException;
import com.github.gustavosfer.repository.FornecedorRepository;
import com.github.gustavosfer.services.FornecedorInterface;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        return fornecedorRepository.findAll();
    }

    @Override
    public Fornecedor findByFornecedor(Long id) {
        Optional<Fornecedor> fornecedor = fornecedorRepository.findById(id);
        return fornecedor.orElseThrow(() -> new FornecedorNotFoundException("Fornecedor não encontrado!"));
    }

    @Override
    public Fornecedor atualizarFornecedor(Long id, FornecedorRequestDTO fornecedor) {
        Fornecedor fornecedorBanco = findByFornecedor(id);

        fornecedorBanco.setNome(fornecedor.nome());
        fornecedorBanco.setEmail(fornecedor.email());
        fornecedorBanco.setEndereco(fornecedor.endereco());
        fornecedorBanco.setTelefone(fornecedor.telefone());

        return fornecedorRepository.save(fornecedorBanco);
    }

    @Override
    public void deletarFornecedor(Long id) {
        Fornecedor fornecedor = findByFornecedor(id);

        fornecedorRepository.delete(fornecedor);
    }
}
