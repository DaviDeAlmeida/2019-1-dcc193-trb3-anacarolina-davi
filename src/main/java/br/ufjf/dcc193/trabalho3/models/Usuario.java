package br.ufjf.dcc193.trabalho3.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idUsuario;
    private String nomeCompleto;
    private String codAcesso;
    private String descricao;
    private String email;

    public Usuario() {
    }

    public Usuario(Long idUsuario, String nomeCompleto, String codAcesso, String descricao, String email) {
        this.idUsuario = idUsuario;
        this.nomeCompleto = nomeCompleto;
        this.codAcesso = codAcesso;
        this.descricao = descricao;
        this.email = email;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCodAcesso() {
        return codAcesso;
    }

    public void setCodAcesso(String codAcesso) {
        this.codAcesso = codAcesso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
