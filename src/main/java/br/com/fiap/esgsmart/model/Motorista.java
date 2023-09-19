package br.com.fiap.esgsmart.model;

import javax.persistence.*;
import java.util.List;

@Entity
@SequenceGenerator(name = "motorista", sequenceName = "SQ_MOTORISTA", allocationSize = 1)
public class Motorista {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "motorista")
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "motorista")
    private List<ColetaDeLixo> coletas;

    public Motorista() {
    }

    public Motorista(Long id, String nome) {
        this.id = id;
        this.nome = nome;
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

