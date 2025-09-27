package com.github.gustavosfer.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper mapper = new ModelMapper();

        // ESSA É A LINHA CHAVE:
        // Configura o ModelMapper para usar os métodos de acesso de campo (field accessors)
        // do Java Record para a busca dos valores de origem.
        mapper.getConfiguration()
                .setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE) // Acessa campos privados
                .setFieldMatchingEnabled(true);           // Habilita a correspondência por campos (útil para Records)

        return mapper;
    }
}
