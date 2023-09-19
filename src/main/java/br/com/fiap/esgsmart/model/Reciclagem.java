package br.com.fiap.esgsmart.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@SequenceGenerator(name = "reciclagem", sequenceName = "SQ_RECICLAGEM", allocationSize = 1)
public class Reciclagem {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "reciclagem")
    private Long id;
    private String tipoMaterial;
    private double quantidadeReciclada;
    private LocalDate dataReciclagem;

    @ManyToOne
    @JoinColumn(name = "cidadao_id")
    private Cidadao cidadao;

    public Reciclagem() {
    }

    public Reciclagem(Long id, String tipoMaterial, double quantidadeReciclada, LocalDate dataReciclagem) {
        this.id = id;
        this.tipoMaterial = tipoMaterial;
        this.quantidadeReciclada = quantidadeReciclada;
        this.dataReciclagem = dataReciclagem;
    }

    public Long getId() {
        return id;
    }

    public Reciclagem setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public Reciclagem setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
        return this;
    }

    public double getQuantidadeReciclada() {
        return quantidadeReciclada;
    }

    public Reciclagem setQuantidadeReciclada(double quantidadeReciclada) {
        this.quantidadeReciclada = quantidadeReciclada;
        return this;
    }

    public LocalDate getDataReciclagem() {
        return dataReciclagem;
    }

    public Reciclagem setDataReciclagem(LocalDate dataReciclagem) {
        this.dataReciclagem = dataReciclagem;
        return this;
    }

    public Cidadao getCidadao() {
        return cidadao;
    }

    public Reciclagem setCidadao(Cidadao cidadao) {
        this.cidadao = cidadao;
        return this;
    }
}
