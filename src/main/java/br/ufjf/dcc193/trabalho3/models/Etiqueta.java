package br.ufjf.dcc193.trabalho3.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Etiqueta {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long idEtiqueta;
    private String titulo;
    private String descricao;
    private String url;

    public Etiqueta() {
    }

    public Etiqueta(long idEtiqueta, String titulo, String descricao, String url) {
        this.idEtiqueta = idEtiqueta;
        this.titulo = titulo;
        this.descricao = descricao;
        this.url = url;
    }

    public long getIdEtiqueta() {
        return idEtiqueta;
    }

    public void setIdEtiqueta(long idEtiqueta) {
        this.idEtiqueta = idEtiqueta;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
}
