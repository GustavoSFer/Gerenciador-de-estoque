package com.github.gustavosfer.repository;

import com.github.gustavosfer.entities.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FornecedorRepository extends JpaRepository<Long, Fornecedor> {
}
