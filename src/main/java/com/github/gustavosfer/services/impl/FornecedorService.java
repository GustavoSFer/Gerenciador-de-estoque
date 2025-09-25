package com.github.gustavosfer.services.impl;

import com.github.gustavosfer.entities.Fornecedor;
import com.github.gustavosfer.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;

}
