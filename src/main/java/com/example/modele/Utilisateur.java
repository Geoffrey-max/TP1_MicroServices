package com.example.modele;



public class Utilisateur {
    private int id;
    private String nom;
    private String prenom;
    private String password;

    public Utilisateur(int id, String nom, String prenom, String password){
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNom() {
        return nom;
    }

    public String getPassword() {
        return password;
    }

    public String getPrenom() {
        return prenom;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
