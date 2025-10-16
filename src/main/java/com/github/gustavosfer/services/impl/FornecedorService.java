package com.github.gustavosfer.services.impl;

import com.github.gustavosfer.controllers.FornecedorController;
import com.github.gustavosfer.entities.Fornecedor;
import com.github.gustavosfer.exceptions.fornecedorException.FornecedorNotFoundException;
import com.github.gustavosfer.repository.FornecedorRepository;
import com.github.gustavosfer.services.FornecedorInterface;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Service
public class FornecedorService implements FornecedorInterface {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Fornecedor criarFornecedor(Fornecedor fornecedorDto) {

        Fornecedor fornecedor = modelMapper.map(fornecedorDto, Fornecedor.class);
        fornecedor.setEndereco("Rua padrao de teste");

        var dto = fornecedorRepository.save(fornecedor);
        addHateoasLinks(dto);

        return dto;
    }

    @Override
    public List<Fornecedor> listaFornecedores() {
        var fornecedores = fornecedorRepository.findAll();
        fornecedores.forEach(p -> addHateoasLinks(p));

        return fornecedores;
    }

    @Override
    public Fornecedor findByFornecedor(Long id) {
        Optional<Fornecedor> fornecedor = fornecedorRepository.findById(id);
        var dto = fornecedor.orElseThrow(() -> new FornecedorNotFoundException("Fornecedor não encontrado!"));
        addHateoasLinks(dto);

        return dto;
    }

    @Override
    public Fornecedor atualizarFornecedor(Fornecedor fornecedor) {
        Fornecedor fornecedorBanco = findByFornecedor(fornecedor.getId());

        fornecedorBanco.setNome(fornecedor.getNome());
        fornecedorBanco.setEmail(fornecedor.getEmail());
        fornecedorBanco.setEndereco(fornecedor.getEndereco());
        fornecedorBanco.setTelefone(fornecedor.getTelefone());

        var dto = fornecedorRepository.save(fornecedorBanco);
        addHateoasLinks(dto);

        return dto;
    }

    @Override
    public void deletarFornecedor(Long id) {
        Fornecedor fornecedor = findByFornecedor(id);

        fornecedorRepository.delete(fornecedor);
    }

    private static void addHateoasLinks(Fornecedor dto) {
        dto.add(linkTo(methodOn(FornecedorController.class).buscarFornecedorById(dto.getId())).withSelfRel().withType("GET"));
        dto.add(linkTo(methodOn(FornecedorController.class).listarFornecedor()).withRel("findAll").withType("GET"));
        dto.add(linkTo(methodOn(FornecedorController.class).cadastrarFornecedor(dto)).withRel("create").withType("POST"));
        dto.add(linkTo(methodOn(FornecedorController.class).atualizarFornecedor(dto)).withRel("update").withType("PUT"));
        dto.add(linkTo(methodOn(FornecedorController.class).deletarFornecedor(dto.getId())).withRel("delete").withType("DELETE"));
    }
}
