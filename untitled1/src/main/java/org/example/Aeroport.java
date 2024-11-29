package org.example;

public class Aeroport {
    String nom;
    String ville;
    String description;

    public void obtenirVol() {
        //...
    }

    public static void main(String[] args) {
        Avion.affecterVol();
    }

    //constructeur
    public Aeroport(String nom, String ville, String description) {
        this.nom = nom;
        this.ville = ville;
        this.description = description;
    }
    //Getter
    public String getNom() {
        return nom;
    }
    public String getVille() {
        return ville;
    }
    public String getDescription() {
        return description;
    }
    //Setter
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
    public void setDescription(String description) {
        this.description = description;
    }


}
