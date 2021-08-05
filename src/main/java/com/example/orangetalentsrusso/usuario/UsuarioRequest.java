package com.example.orangetalentsrusso.usuario;

import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import java.time.LocalDate;

public class UsuarioRequest {

    @NotBlank
    private String nome;
    @NotNull @Email
    @ValidarCamposDuplicados
    private String email;
    @NotNull @PastOrPresent /*
    garante que nao pode entrar uma data do futuro
    NotNull pega data, NotBlank nao pega data, somente String
    */
    private LocalDate dataNascimento;
    @NotBlank @CPF //criar validador para cpf unicidade
    private String cpf;

    public UsuarioRequest(String nome, String email, LocalDate dataNascimento, String cpf) {
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public Usuario toUsuario(){
        return new Usuario(this.nome, this.email, this.dataNascimento, this.cpf);
    }
}
