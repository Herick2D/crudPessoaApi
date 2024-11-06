package com.herick.crudpessoaapi.pessoa;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping({"/pessoa", "/pessoas"})
@AllArgsConstructor
public class PessoaController {

    private final PessoaService pessoaService;


    @PostMapping
    public ResponseEntity<PessoaDTO> createPessoa(@RequestBody PessoaModel pessoa) {
        return pessoaService.createPessoa(pessoa);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PessoaModel> getPessoaById(@PathVariable UUID id) {
        return pessoaService.findPessoaById(id);
    }
}
