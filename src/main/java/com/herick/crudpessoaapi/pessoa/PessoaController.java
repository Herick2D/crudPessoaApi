package com.herick.crudpessoaapi.pessoa;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/pessoa", "/pessoas"})
@AllArgsConstructor
public class PessoaController {

    private final PessoaService pessoaService;


    public String pessoaOlaMundo() {
        return pessoaService.olaMundo();
    }
}
