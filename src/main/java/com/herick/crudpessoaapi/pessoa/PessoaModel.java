package com.herick.crudpessoaapi.pessoa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Entity(name = "pessoas")
@Data
public class PessoaModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
}
