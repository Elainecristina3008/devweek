package com.dio_class.devweek.Entity;

import javax.persistence.*;

@Entity
public class FaixaEtaria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)

    private Long id;
    private Long faixaI;
    private Long faixaN;
    private String descricao;


    public FaixaEtaria(){}

    public FaixaEtaria(Long faixaI, Long faixaN, String descricao) {
        this.faixaI = faixaI;
        this.faixaN = faixaN;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public Long getFaixaI() {
        return faixaI;
    }

    public void setFaixaI(Long faixaI) {
        this.faixaI = faixaI;
    }

    public Long getFaixaN() {
        return faixaN;
    }

    public void setFaixa_n(Long faixaN) {
        this.faixaN = faixaN;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
