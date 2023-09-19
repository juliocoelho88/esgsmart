package br.com.fiap.esgsmart.model;

import javax.persistence.*
        ;
import java.time.LocalDate;

@Entity
@SequenceGenerator(name = "coletaDeLixo", sequenceName = "SQ_COLETADELIXO", allocationSize = 1)
public class ColetaDeLixo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "coletaDeLixo")
    private Long id;

    private LocalDate dataColeta;
    private String localizacao;
    private String status;

    // Relacionamento com o Motorista de Coleta
    @ManyToOne
    @JoinColumn(name = "motorista_id")
    private Motorista motorista;

    // Relacionamento com o Veículo de Coleta
    @ManyToOne
    @JoinColumn(name = "veiculo_id")
    private VeiculoColeta veiculoColeta;

    public ColetaDeLixo() {
    }

    public ColetaDeLixo(Long id, LocalDate dataColeta, String localizacao, String status) {
        this.id = id;
        this.dataColeta = dataColeta;
        this.localizacao = localizacao;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public ColetaDeLixo setId(Long id) {
        this.id = id;
        return this;
    }

    public LocalDate getDataColeta() {
        return dataColeta;
    }

    public ColetaDeLixo setDataColeta(LocalDate dataColeta) {
        this.dataColeta = dataColeta;
        return this;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public ColetaDeLixo setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ColetaDeLixo setStatus(String status) {
        this.status = status;
        return this;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public ColetaDeLixo setMotorista(Motorista motorista) {
        this.motorista = motorista;
        return this;
    }

    public VeiculoColeta getVeiculoColeta() {
        return veiculoColeta;
    }

    public ColetaDeLixo setVeiculoColeta(VeiculoColeta veiculoColeta) {
        this.veiculoColeta = veiculoColeta;
        return this;
    }
}

