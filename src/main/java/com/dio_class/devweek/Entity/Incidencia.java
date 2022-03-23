package com.dio_class.devweek.Entity;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
public class Incidencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)

    private Long id;
    private Integer regiaoId;
    private Integer mes;
    private Long faixaId;
    private Integer quantidadeExames;

    public Incidencia(){}

    public Incidencia(Integer regiaoId, Integer mes, Long faixaId, Integer quantidadeExames) {
        this.regiaoId = regiaoId;
        this.mes = mes;
        this.faixaId = faixaId;
        this.quantidadeExames = quantidadeExames;
    }

    public Long getId() {
        return id;
    }


    public Integer getRegiaoId() {
        return regiaoId;
    }

    public void setRegiaoId(Integer regiaoId) {
        this.regiaoId = regiaoId;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Long getFaixaId() {
        return faixaId;
    }

    public void setFaixaId(Long faixaId) {
        this.faixaId = faixaId;
    }

    public Integer getQuantidadeExames() {
        return quantidadeExames;
    }

    public void setQuantidadeExames(Integer quantidadeExames) {
        this.quantidadeExames = quantidadeExames;
    }
}
