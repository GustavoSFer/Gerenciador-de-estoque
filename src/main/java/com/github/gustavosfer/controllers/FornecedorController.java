package com.github.gustavosfer.controllers;

import com.github.gustavosfer.dto.FornecedorRequestDTO;
import com.github.gustavosfer.entities.Fornecedor;
import com.github.gustavosfer.services.FornecedorInterface;
import com.github.gustavosfer.services.impl.FornecedorService;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {

    @Autowired
    private FornecedorInterface fornecedorService;

    @PostMapping
    public ResponseEntity<Fornecedor> cadastrarFornecedor(@Valid @RequestBody FornecedorRequestDTO fornecedorRequestDTO) {
        Fornecedor fornecedor = fornecedorService.criarFornecedor(fornecedorRequestDTO);

        return ResponseEntity.ok().body(fornecedor);
    }
}
