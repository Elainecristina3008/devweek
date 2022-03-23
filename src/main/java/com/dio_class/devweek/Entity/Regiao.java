package com.dio_class.devweek.Entity;

import javax.persistence.*;

@Entity
public class Regiao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;
    private String regiao;
    private Long qntExames;


    public Regiao(){

    }

    public Regiao(String regiao, Long qntExames) {
        this.regiao = regiao;
        this.qntExames = qntExames;
    }

    public Long getId() {
        return id;
    }

    /*public void setId(Long id) {
        this.id = id;
    }*/
    // o método setID quem fará é o Spring

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public Long getQntExames() {
        return qntExames;
    }

    public void setQnt_exames(Long qntExames) {
        this.qntExames = qntExames;
    }
}
