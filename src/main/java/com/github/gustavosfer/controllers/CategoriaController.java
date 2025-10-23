package com.github.gustavosfer.controllers;

import com.github.gustavosfer.entities.Categoria;
import com.github.gustavosfer.services.impl.CategoriaService;
import org.apache.coyote.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    private final Logger logger = LoggerFactory.getLogger(CategoriaController.class);


    @PostMapping
    public ResponseEntity<Categoria> criarCategoria(@RequestBody Categoria categoria) {
        logger.info("Iniciando a criação de categoria");
        Categoria categoriaCriado = categoriaService.criarCategoria(categoria);

        logger.info("Finalizando a criação de categoria");
        return ResponseEntity.ok().body(categoriaCriado);
    }
}
