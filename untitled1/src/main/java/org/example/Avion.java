package org.example;

public class Avion {
    int immatriculation;
    String modele;
    int capacite;

    public static void affecterVol() {
        //...
    }
    public void verifierDisponibilite() {
        //...
    }

    //constructor
    public Avion(int immatriculation, String modele, int capacite) {
        this.immatriculation = immatriculation;
        this.modele = modele;
        this.capacite = capacite;
    }
    //Getter
    public int getImmatriculation() {
        return immatriculation;
    }
    public String getModele() {
        return modele;
    }
    public int getCapacite() {
        return capacite;
    }
    //Setter
    public void setImmatriculation(int immatriculation) {
        this.immatriculation = immatriculation;
    }
    public void setModele(String modele) {
        this.modele = modele;
    }
    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }




}
