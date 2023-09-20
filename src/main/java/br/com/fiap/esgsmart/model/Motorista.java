package br.com.fiap.esgsmart.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@SequenceGenerator(name = "motorista", sequenceName = "SQ_MOTORISTA", allocationSize = 1)
public class Motorista {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "motorista")
    private Long id;
    private String nome;

    private boolean novo;
    @OneToMany(mappedBy = "motorista")
    private List<ColetaDeLixo> coletas;

    public Motorista() {
    }

    public Motorista(Long id, String nome, boolean novo) {
        this.id = id;
        this.nome = nome;
        this.novo = novo;
    }

    public boolean isNovo() {
        return novo;
    }

    public Motorista setNovo(boolean novo) {
        this.novo = novo;
        return this;
    }

    public Long getId() {
        return id;
    }

    public Motorista setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Motorista setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public List<ColetaDeLixo> getColetas() {
        return coletas;
    }

    public Motorista setColetas(List<ColetaDeLixo> coletas) {
        this.coletas = coletas;
        return this;
    }
}

