package org.example;

import java.util.ArrayList;
import java.util.List;

public class Avion {
    int immatriculation;
    String modele;
    int capacite;

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

    //CRUD
    private List<Avion> avions = new ArrayList<>();

    //CREATE
    public void ajouterAvion(Avion avion) {
        avions.add(avion);
        System.out.println("Avion ajouté : " + avion);
    }

    //READ
    public List<Avion> listerAvions() {
        return avions;
    }
    public Avion chercherAvion(int immatriculation) {
        for (Avion avion : avions) {
            if (avion.getImmatriculation() == immatriculation) {
                return avion;
            }
        }
        return null;
    }

    //UPDATE
    public boolean modifieAvion(int immatriculation, String modeleModifie, int capaciteModifie) {
        Avion avion = prendAvion(immatriculation);
        if (avion != null) {
            avion.setModele(modeleModifie);
            avion.setCapacite(capaciteModifie);
            System.out.println("Modification de l'avion : " + avion);
            return true;
        }
        return false;
    }

    //DELETE
    public boolean supprimeAvion(int immatriculation) {
        Avion avion = prendAvion(immatriculation);
        if (avion != null) {
            avions.remove(avion);
            System.out.println("L'avion supprimé : " + avion);
            return true;
        }
        return false;
    }
    //Fin CRDU

    //Fonction affecterVol()
    public static void affecterVol() {
        //...
    }

    //Fonction verifierDisponibilite()
    public void verifierDisponibilite() {
        //...
    }
}
