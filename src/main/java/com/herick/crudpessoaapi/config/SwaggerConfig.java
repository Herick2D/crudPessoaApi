package com.herick.crudpessoaapi.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @Info(
        title = "CRUD Pessoa API",
        version = "1.0",
        description = "API para gerenciamento de pessoas"
))
public class SwaggerConfig {
}
