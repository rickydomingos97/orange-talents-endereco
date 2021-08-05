package com.example.orangetalentsrusso.endereco;

import com.example.orangetalentsrusso.usuario.Usuario;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class EnderecoRequest {
    @NotBlank
    private final String logradouro;
    @NotBlank
    private final String numero;
    @NotBlank
    private final String complemento;
    @NotBlank
    private final String bairro;
    @NotBlank
    private final String cidade;
    @NotBlank
    private final String estado;
    @NotBlank
    private final String cep;
    @NotNull
    private final Usuario usuario;

    public EnderecoRequest(String logradouro, String numero, String complemento,
                           String bairro, String cidade, String estado, String cep,
                           Usuario usuario) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.usuario = usuario;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Endereco toEndereco() {
        return new Endereco(this.logradouro, this.numero, this.complemento,
                this.bairro, this.cidade, this.estado, this.cep, this.usuario);
    }
}
