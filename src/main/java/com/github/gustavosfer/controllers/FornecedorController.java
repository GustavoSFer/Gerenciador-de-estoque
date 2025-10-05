package com.github.gustavosfer.controllers;

import com.github.gustavosfer.dto.FornecedorRequestDTO;
import com.github.gustavosfer.entities.Fornecedor;
import com.github.gustavosfer.services.FornecedorInterface;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.github.gustavosfer.Constantes.*;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {

    private final Logger logger = LoggerFactory.getLogger(FornecedorController.class);

    @Autowired
    private FornecedorInterface fornecedorService;

    @PostMapping
    public ResponseEntity<Fornecedor> cadastrarFornecedor(@Valid @RequestBody FornecedorRequestDTO fornecedorRequestDTO) {
        logger.info("[Controller] - " + INICIO_CADASTR0_FORNECEDOR);
        Fornecedor fornecedor = fornecedorService.criarFornecedor(fornecedorRequestDTO);

        logger.info("[Controller] - " + FIM_CADASTR0_FORNECEDOR);
        return ResponseEntity.ok().body(fornecedor);
    }


    @GetMapping
    public ResponseEntity<List<Fornecedor>> listarFornecedor() {
        logger.info("[Controller] - " + INICIO_LISTAR_FORNECEDOR);
        List<Fornecedor> fornecedores = fornecedorService.listaFornecedores();

        logger.info("[Controller] - " + FIM_LISTAR_FORNECEDOR);
        return ResponseEntity.ok().body(fornecedores);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Fornecedor> buscarFornecedorById(@PathVariable Long id) {
        logger.info("[Controller] - " + INICIO_BUSCAR_FORNECEDOR);
        Fornecedor fornecedor = fornecedorService.findByFornecedor(id);

        logger.info("[Controller] - " + FIM_BUSCAR_FORNECEDOR);
        return ResponseEntity.ok().body(fornecedor);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Fornecedor> atualizarFornecedor(@PathVariable Long id, @RequestBody FornecedorRequestDTO fornecedorRequestDTO) {
        logger.info("[Controller] - " + INICIO_ATUALIZAR_FORNECEDOR);
        Fornecedor fornecedor = fornecedorService.atualizarFornecedor(id, fornecedorRequestDTO);

        logger.info("[Controller] - " + FIM_ATUALIZAR_FORNECEDOR);
        return ResponseEntity.ok().body(fornecedor);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletarFornecedor( @PathVariable Long id) {
        fornecedorService.deletarFornecedor(id);

        return ResponseEntity.noContent().build();
    }
}
