package br.ufjf.dcc193.trabalho3.models;

import java.util.List;

public class Item {

    private long idItem;
    private String titulo;
    private List<Anotacao> anotacoes;
    private List<Etiqueta> etiquetas;
    private List<Vinculo> vinculos;

    public Item() {
    }

    public Item(long idItem, String titulo, List<Anotacao> anotacoes, List<Etiqueta> etiquetas, List<Vinculo> vinculos) {
        this.idItem = idItem;
        this.titulo = titulo;
        this.anotacoes = anotacoes;
        this.etiquetas = etiquetas;
        this.vinculos = vinculos;
    }

    public long getIdItem() {
        return idItem;
    }

    public void setIdItem(long idItem) {
        this.idItem = idItem;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Anotacao> getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(List<Anotacao> anotacoes) {
        this.anotacoes = anotacoes;
    }

    public List<Etiqueta> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(List<Etiqueta> etiquetas) {
        this.etiquetas = etiquetas;
    }

    public List<Vinculo> getVinculos() {
        return vinculos;
    }

    public void setVinculos(List<Vinculo> vinculos) {
        this.vinculos = vinculos;
    }
}
