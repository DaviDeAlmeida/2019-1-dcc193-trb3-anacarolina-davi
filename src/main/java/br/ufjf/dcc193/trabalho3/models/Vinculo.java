package br.ufjf.dcc193.trabalho3.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

public class Vinculo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idVinculo;
    private Item itemOrigem;
    private Item itemDestino;
    private List<Etiqueta> etiquetas;
    private List<Anotacao> anotacoes;

    public Vinculo() {
    }

    public Vinculo(Long idVinculo, Item itemOrigem, Item itemDestino, List<Etiqueta> etiquetas, List<Anotacao> anotacoes) {
        this.idVinculo = idVinculo;
        this.itemOrigem = itemOrigem;
        this.itemDestino = itemDestino;
        this.etiquetas = etiquetas;
        this.anotacoes = anotacoes;
    }

    public Long getIdVinculo() {
        return idVinculo;
    }

    public void setIdVinculo(Long idVinculo) {
        this.idVinculo = idVinculo;
    }

    public Item getItemOrigem() {
        return itemOrigem;
    }

    public void setItemOrigem(Item itemOrigem) {
        this.itemOrigem = itemOrigem;
    }

    public Item getItemDestino() {
        return itemDestino;
    }

    public void setItemDestino(Item itemDestino) {
        this.itemDestino = itemDestino;
    }

    public List<Etiqueta> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(List<Etiqueta> etiquetas) {
        this.etiquetas = etiquetas;
    }

    public List<Anotacao> getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(List<Anotacao> anotacoes) {
        this.anotacoes = anotacoes;
    }
}
