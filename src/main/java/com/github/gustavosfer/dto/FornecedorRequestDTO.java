package com.github.gustavosfer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;

public record FornecedorRequestDTO(
        @JsonProperty("nome")
        @NotNull(message = "O nome deve ser informado.")
        String nome,
        @JsonProperty("telefone")
        @NotNull(message = "O telefone deve ser informado.")
        String telefone,
        @JsonProperty("email")
        @NotNull(message = "O email deve ser informado.")
        String email
) {
}
