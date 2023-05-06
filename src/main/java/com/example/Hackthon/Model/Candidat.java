package com.example.Hackthon.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@Getter
@Setter
public class Candidat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String password;
    @Column
    private String cin;
    @Column
    private String adresse;
    @Column
    private byte[] photo;

    public Candidat() {
        // Constructeur vide requis pour Spring Boot
    }

    public Candidat(Long id, String password, String cin, String adresse, byte[] photo) {
        this.
                id = id;
        this.password = password;
        this.cin = cin;
        this.adresse = adresse;
        this.photo = photo;
    }

    // Getters et Setters pour chaque attribut
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
}
