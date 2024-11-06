package com.herick.crudpessoaapi.pessoa;

import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping({"/pessoas"})
@AllArgsConstructor
public class PessoasController {

    private final PessoaService pessoaService;

    @Operation(description = "Endpoint responsável por retornar todas as pessoas do banco de dados")
    @GetMapping
    public ResponseEntity<List<PessoaModel>> getPessoas() {
        return pessoaService.findPessoas();
    }
}
