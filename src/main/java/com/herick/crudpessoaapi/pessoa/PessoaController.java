package com.herick.crudpessoaapi.pessoa;

import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping({"/pessoa"})
@AllArgsConstructor
public class PessoaController {

    private final PessoaService pessoaService;


    @Operation(description = "Endpoint responsável por criar uma pessoa no banco de dados")
    @PostMapping
    public ResponseEntity<PessoaDTO> createPessoa(@RequestBody PessoaModel pessoa) {
        return pessoaService.createPessoa(pessoa);
    }

    @Operation(description = "Endpoint responsável por retornar a busca de uma pessoa do banco de dados pelo seu ID")
    @GetMapping("/{id}")
    public ResponseEntity<PessoaModel> getPessoaById(@PathVariable UUID id) {
        return pessoaService.findPessoaById(id);
    }

    @Operation(description = "Endpoint responsável por alterar uma pessoa do banco de dados, a busca é feita pelo seu ID")
    @PutMapping("/{id}")
    public ResponseEntity<PessoaDTO> updatePessoa(@PathVariable UUID id, @RequestBody PessoaModel pessoa) {
        return pessoaService.updatePessoa(id, pessoa);
    }

    @Operation(description = "Endpoint responsável por deletar uma pessoa do banco de dados, a busca é feita pelo seu ID")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePessoa(@PathVariable UUID id) {
        return pessoaService.deletePessoa(id);
    }
}
