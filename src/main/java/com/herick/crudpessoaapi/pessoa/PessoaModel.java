package com.herick.crudpessoaapi.pessoa;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Entity(name = "pessoas")
@Data
public class PessoaModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    private String nome;
    private String email;

    @Column(name = "data_de_nascimento")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy") // regra para adicionar a data de nascimento no padrão brasileiro dd-mm-aaaa
    private LocalDate nascimento;
}
