package com.github.gustavosfer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record FornecedorRequestDTO(
        @JsonProperty("nome")
        @Size(max = 30, min = 6, message = "O nome deve conter pelo menos {min} e maximo de {max} de caracteres")
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
