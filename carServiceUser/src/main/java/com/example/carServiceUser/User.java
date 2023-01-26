package com.example.carServiceUser;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @PrimaryKeyJoinColumn
    private int id;

    private int idCar;
    private String nom;
    private String prenom;
    private String permis;

    public User() {
    }
    public User(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public User(int idCar, String nom, String prenom, String permis) {
        this.idCar = idCar;
        this.nom = nom;
        this.prenom = prenom;
        this.permis = permis;
    }

    public User(String nom, String prenom, String permis) {
        this.nom = nom;
        this.prenom = prenom;
        this.permis = permis;
    }
    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPermis() {
        return permis;
    }

    public void setPermis(String permis) {
        this.permis = permis;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "User{" +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", permis='" + permis + '\'' +
                '}';
    }
}
