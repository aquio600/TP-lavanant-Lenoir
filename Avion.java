package org.example;

public class Avion {
    int immatriculation;
    String modele;
    int capacite;
    Vol affectation;

    public static void affecterVol(Vol vol) {
        this.affectation = vol;
        //...
    }
    public void verifierDisponibilite() {
        if(this.affectation==null){
            System.out.println("dispnible");

        }
        else {System.out.println("occupé par"+ affectation);}
        //...
    }

    //constructor
    public Avion(int immatriculation, String modele, int capacite) {
        this.immatriculation = immatriculation;
        this.modele = modele;
        this.capacite = capacite;
        this.affectation = null;
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