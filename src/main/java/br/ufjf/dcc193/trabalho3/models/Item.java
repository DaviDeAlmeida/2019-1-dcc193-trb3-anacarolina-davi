package br.ufjf.dcc193.trabalho3.models;

import java.util.ArrayList;
import javax.persistence.*;
import java.util.List;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idItem;
    private String titulo;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Anotacao> anotacoes;

    @ManyToMany
    private List<Etiqueta> etiquetas;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Vinculo> vinculos;

    public Item() {
        etiquetas = new ArrayList<>();
    }

    public Item(Long idItem, String titulo, List<Anotacao> anotacoes, List<Etiqueta> etiquetas, List<Vinculo> vinculos) {
        this.idItem = idItem;
        this.titulo = titulo;
        this.anotacoes = anotacoes;
        this.etiquetas = etiquetas;
        this.vinculos = vinculos;
    }

    public Long getIdItem() {
        return idItem;
    }

    public void setIdItem(Long idItem) {
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
