package com.example.Hackthon.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table

public class Proposition {
    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String poste;
    @Column
    private String contrat;
    @Column
    private double remuneration;
    @Column
    private String typeContrat;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    public User getUser() {
        return user;
    }

    public Proposition() {
        // Constructeur vide requis pour Spring Boot
    }

    public Proposition(Long id, String poste, String contrat, double remuneration, String typeContrat) {
        this.id = id;
        this.poste = poste;
        this.contrat = contrat;
        this.remuneration = remuneration;
        this.typeContrat = typeContrat;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public String getContrat() {
        return contrat;
    }

    public void setContrat(String contrat) {
        this.contrat = contrat;
    }

    public double getRemuneration() {
        return remuneration;
    }

    public void setRemuneration(double remuneration) {
        this.remuneration = remuneration;
    }

    public String getTypeContrat() {
        return typeContrat;
    }

    public void setTypeContrat(String typeContrat) {
        this.typeContrat = typeContrat;
    }
}

