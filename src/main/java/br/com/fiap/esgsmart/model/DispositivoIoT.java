package br.com.fiap.esgsmart.model;

import jakarta.persistence.*;


@Entity
@SequenceGenerator(name = "dispositivoIot", sequenceName = "SQ_DISPOSITIVOIOT", allocationSize = 1)
public class DispositivoIoT {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dispositivoIot")
    private Long id;

    private String tipo;
    private String localizacao;
    private String status;
    private String dataInstalacao;

    @ManyToOne
    @JoinColumn(name = "cidadao_id")
    private Cidadao cidadao;

    public DispositivoIoT() {
    }

    public DispositivoIoT(Long id, String tipo, String localizacao, String status, String dataInstalacao) {
        this.id = id;
        this.tipo = tipo;
        this.localizacao = localizacao;
        this.status = status;
        this.dataInstalacao = dataInstalacao;
    }

    public Long getId() {
        return id;
    }

    public DispositivoIoT setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTipo() {
        return tipo;
    }

    public DispositivoIoT setTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public DispositivoIoT setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public DispositivoIoT setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getDataInstalacao() {
        return dataInstalacao;
    }

    public DispositivoIoT setDataInstalacao(String dataInstalacao) {
        this.dataInstalacao = dataInstalacao;
        return this;
    }

    public Cidadao getCidadao() {
        return cidadao;
    }

    public DispositivoIoT setCidadao(Cidadao cidadao) {
        this.cidadao = cidadao;
        return this;
    }
}

