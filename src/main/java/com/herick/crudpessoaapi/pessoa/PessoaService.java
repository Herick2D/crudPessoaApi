package com.herick.crudpessoaapi.pessoa;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

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

    public ResponseEntity<PessoaModel> findPessoaById(UUID id) {
        Optional<PessoaModel> optionalPessoal = pessoaRepository.findById(id);
        if (optionalPessoal.isEmpty()) {
            throw new EntityNotFoundException("Pessoa com o ID " + id + " não encontrado.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(optionalPessoal.get());
    }

    public ResponseEntity<PessoaDTO> updatePessoa(UUID id, PessoaModel pessoa) {
        PessoaModel optionalPessoa = findPessoaById(id).getBody();

        optionalPessoa.setNome(pessoa.getNome());
        optionalPessoa.setEmail(pessoa.getEmail());
        optionalPessoa.setNascimento(pessoa.getNascimento());

        var toDTO = pessoaRepository.save(optionalPessoa);
        var result = createDTO(toDTO);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    public ResponseEntity<?> deletePessoa(UUID id) {
        Optional<PessoaModel> optionalPessoa = pessoaRepository.findById(id);
        if (optionalPessoa.isEmpty()) {
            throw new EntityNotFoundException("Pessoa com ID " + id + " não encontrado");
        }
        try {
            pessoaRepository.deleteById(id);
        } catch (Exception e) {
            throw new EntityNotFoundException(e);
        }
        return ResponseEntity.noContent().build();
    }

    public ResponseEntity<List<PessoaModel>> findPessoas() {
        List<PessoaModel> pessoas = pessoaRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(pessoas);
    }
}
