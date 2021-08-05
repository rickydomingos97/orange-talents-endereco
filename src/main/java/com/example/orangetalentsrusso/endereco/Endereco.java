package com.example.orangetalentsrusso.endereco;

import com.example.orangetalentsrusso.usuario.Usuario;

import javax.persistence.*;

public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String logradouro;
    @Column(nullable = false)
    private String numero;
    @Column(nullable = false)
    private String complemento;
    @Column(nullable = false)
    private String bairro;
    @Column(nullable = false)
    private String cidade;
    @Column(nullable = false)
    private String estado;
    @Column(nullable = false)
    private String cep;

    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario usuario;

    @Deprecated // APENAS PARA O HIBERNATE
    public Endereco() {
    }

    public Endereco(String logradouro, String numero, String complemento,
                    String bairro, String cidade, String estado,
                    String cep, Usuario usuario) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
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
}
