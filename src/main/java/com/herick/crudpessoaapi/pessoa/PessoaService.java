package com.herick.crudpessoaapi.pessoa;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PessoaService {

    private PessoaRepository pessoaRepository;

    private PessoaDTO createDTO(PessoaModel pessoa) {
        return new PessoaDTO(
                pessoa.getId(),
                pessoa.getNome(),
                pessoa.getEmail(),
                pessoa.getNascimento()
        );
    }

    public ResponseEntity<PessoaDTO> createPessoa(PessoaModel pessoa) {
        PessoaModel savedPessoa = pessoaRepository.save(pessoa);
        PessoaDTO dto = createDTO(savedPessoa);
        return ResponseEntity.status(HttpStatus.CREATED).body(dto);
    }

}
