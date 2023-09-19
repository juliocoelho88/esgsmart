package br.com.fiap.esgsmart.model;

import javax.persistence.*;
import java.util.List;

@Entity
@SequenceGenerator(name = "veiculoColeta", sequenceName = "SQ_VEICULOCOLETA", allocationSize = 1)
public class VeiculoColeta {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "veiculoColeta")
    private Long id;

    private String modelo;
    private String placa;

    @OneToMany(mappedBy = "veiculoColeta")
    private List<ColetaDeLixo> coletas;

    public VeiculoColeta() {
    }

    public VeiculoColeta(Long id, String modelo, String placa) {
        this.id = id;
        this.modelo = modelo;
        this.placa = placa;
    }

    public Long getId() {
        return id;
    }

    public VeiculoColeta setId(Long id) {
        this.id = id;
        return this;
    }

    public String getModelo() {
        return modelo;
    }

    public VeiculoColeta setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public String getPlaca() {
        return placa;
    }

    public VeiculoColeta setPlaca(String placa) {
        this.placa = placa;
        return this;
    }

    public List<ColetaDeLixo> getColetas() {
        return coletas;
    }

    public VeiculoColeta setColetas(List<ColetaDeLixo> coletas) {
        this.coletas = coletas;
        return this;
    }
}
