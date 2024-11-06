package com.herick.crudpessoaapi.pessoa;

import java.time.LocalDate;
import java.util.UUID;

public record PessoaDTO(
        UUID id, // FIXME adicionado o id para tratativas em ambiente de desenvolvimento, retirar ao incluir produção
        String nome,
        String email,
        LocalDate nascimento
) {
}
