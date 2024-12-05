package org.example;

import java.util.Date;

public class Reservation {
    int numeroReservation;
    Date dateReservation = new Date();
    Vol vol;
    String statut;

    public Reservation(Date dateReservation, int numeroReservation) {
        this.dateReservation = dateReservation;
        this.numeroReservation= numeroReservation;
        this.statut = "enregistré";

    }


    public void confirmerReservation() {
        this.statut ="confirmé";
        //...
    }
    public static void annulerReservation() {
        //...

    }
    public void modifierReservation() {
        //...
    }

    //constructor
    public Reservation(int numeroReservation, Date dateReservation, String statut) {
        this.numeroReservation = numeroReservation;
        this.dateReservation = dateReservation;
        this.statut = statut;
    }
    //Getter
    public int getNumeroReservation() {
        return numeroReservation;
    }
    public Date getDateReservation() {
        return dateReservation;
    }
    public String getStatut() {
        return statut;
    }
    //setter
    public void setNumeroReservation(int numeroReservation) {
        this.numeroReservation = numeroReservation;
    }
    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }
    public void setStatut(String statut) {
        this.statut = statut;
    }


}