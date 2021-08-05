package com.example.orangetalentsrusso.endereco;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    private final EnderecoRepositorio repository;

    public EnderecoController(EnderecoRepositorio repository) {

        this.repository = repository;
    }

    @PostMapping
    public void metodo(@RequestBody @Valid EnderecoRequest enderecoRequest) {

        repository.save(enderecoRequest.toEndereco());

    }
}