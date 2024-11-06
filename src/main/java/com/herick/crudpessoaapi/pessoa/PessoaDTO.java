package com.herick.crudpessoaapi.pessoa;

import java.time.LocalDate;

public record PessoaDTO(String nome, String email, LocalDate nascimento) {
}
