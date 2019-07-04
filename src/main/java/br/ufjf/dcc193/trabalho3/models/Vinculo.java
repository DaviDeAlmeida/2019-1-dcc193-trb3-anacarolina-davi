package br.ufjf.dcc193.trabalho3.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Vinculo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idVinculo;

    @OneToOne(fetch = FetchType.EAGER)
    private Item itemOrigem;

    @OneToOne(fetch = FetchType.EAGER)
    private Item itemDestino;

    @ManyToMany()
    private List<Etiqueta> etiquetas;


    public Vinculo() {
    }

    public Vinculo(Long idVinculo, Item itemOrigem, Item itemDestino, List<Etiqueta> etiquetas) {
        this.idVinculo = idVinculo;
        this.itemOrigem = itemOrigem;
        this.itemDestino = itemDestino;
        this.etiquetas = etiquetas;
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
}
