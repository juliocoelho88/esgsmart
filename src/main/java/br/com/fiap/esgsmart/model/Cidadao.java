package br.com.fiap.esgsmart.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@SequenceGenerator(name = "cidadao", sequenceName = "SQ_CIDADAO", allocationSize = 1)
public class Cidadao {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cidadao")
    private Long id;
    private String nome;
    private String email;
    private String senha;
    private String dataNascimento;
    private String endereco;
    private boolean novo;

    @OneToMany(mappedBy = "cidadao")
    private List<DispositivoIoT> dispositivosIoT;

    public Cidadao() {
    }


    public Cidadao(Long id, String nome, String email, String senha, String dataNascimento, String endereco, boolean novo, List<DispositivoIoT> dispositivosIoT) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.novo = novo;
        this.dispositivosIoT = dispositivosIoT;
    }

    public Long getId() {
        return id;
    }

    public Cidadao setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Cidadao setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Cidadao setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getSenha() {
        return senha;
    }

    public Cidadao setSenha(String senha) {
        this.senha = senha;
        return this;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public Cidadao setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
        return this;
    }

    public String getEndereco() {
        return endereco;
    }

    public Cidadao setEndereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public List<DispositivoIoT> getDispositivosIoT() {
        return dispositivosIoT;
    }

    public Cidadao setDispositivosIoT(List<DispositivoIoT> dispositivosIoT) {
        this.dispositivosIoT = dispositivosIoT;
        return this;
    }
    public boolean isNovo() {
        return novo;
    }

    public void setNovo(boolean novo) {
        this.novo = novo;
    }

}

