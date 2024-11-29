package org.example;

import java.util.Date;

public class Vol {
    int numeroVol;
    String origine;
    String destination;
    Date dateHeureDepart = new Date();
    Date dateHeureArrivee = new Date();
    String etat;

    public void planifierVol() {
        //...
    }
    public void annulerVol() {
        //...
    }
    public void modifierVol() {
        //...
    }
    public void ListingPassager() {
        //...
    }

    //constructeur
    public Vol(int numeroVol, String origine, String destination, Date dateHeureDepart, Date dateHeureArrivee, String etat) {
        this.numeroVol = numeroVol;
        this.origine = origine;
        this.destination = destination;
        this.dateHeureDepart = dateHeureDepart;
        this.dateHeureArrivee = dateHeureArrivee;
        this.etat = etat;
    }
    //Getter
    public int getNumeroVol() {
        return numeroVol;
    }
    public String getOrigine() {
        return origine;
    }
    public String getDestination() {
        return destination;
    }
    public Date getDateHeureDepart() {
        return dateHeureDepart;
    }
    public Date getDateHeureArrivee() {
        return dateHeureArrivee;
    }
    public String getEtat() {
        return etat;
    }
    //Setter
    public void setNumeroVol(int numeroVol) {
        this.numeroVol = numeroVol;
    }
    public void setOrigine(String origine) {
        this.origine = origine;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public void setDateHeureDepart(Date dateHeureDepart) {
        this.dateHeureDepart = dateHeureDepart;
    }
    public void setDateHeureArrivee(Date dateHeureArrivee) {
        this.dateHeureArrivee = dateHeureArrivee;
    }
    public void setEtat(String etat) {
        this.etat = etat;
    }


}
