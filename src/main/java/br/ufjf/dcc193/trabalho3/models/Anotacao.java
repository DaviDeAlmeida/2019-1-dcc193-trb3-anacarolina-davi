package br.ufjf.dcc193.trabalho3.models;

import javax.persistence.*;

@Entity
public class Anotacao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAnotacao;
    private String descricao;
    private String url;

    @OneToOne(fetch = FetchType.EAGER)
    private Usuario usuario;

    private String dataInclusao;
    private String dataAlteracao;

    public Anotacao() {
    }

    public Anotacao(Long idAnotacao, String descricao, String url, Usuario usuario, String dataInclusao, String dataAlteracao) {
        this.idAnotacao = idAnotacao;
        this.descricao = descricao;
        this.url = url;
        this.usuario = usuario;
        this.dataInclusao = dataInclusao;
        this.dataAlteracao = dataAlteracao;
    }

    public Long getIdAnotacao() {
        return idAnotacao;
    }

    public void setIdAnotacao(Long idAnotacao) {
        this.idAnotacao = idAnotacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDataInclusao() {
        return dataInclusao;
    }

    public void setDataInclusao(String dataInclusao) {
        this.dataInclusao = dataInclusao;
    }

    public String getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(String dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }
}
