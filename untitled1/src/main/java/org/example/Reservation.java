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

    //Fonctions CRUD
    private List<Reservation> reservations = new ArrayList<>();

    //CREATE
    public void ajouterReservation(Reservation reservation) {
        reservation.add(reservation);
        System.out.println("Réservation ajoutée : ", reservation);
    }

    //READ
    public List<Reservation> listerReservation() {
        return reservations;
    }
    public Reservation chercherReservation(int numeroReservation) {
        for (Reservation reservation : reservations) {
            if (reservation.getNumeroReservation() == numeroReservation) {
                return reservation;
            }
        }
        return null;
    }

    //UPDATE : Fonction modifierReservation() demandée
    public boolean modifierReservation(int numeroReservation, Date dateReservation, String statut) {
        Reservation reservation = prendReservation(numeroReservation);
        if (reservation != null) {
            reservation.setDateReservation(dateReservation);
            reservation.setStatut(statut);
            System.out.println("Modification de la réservation : " + reservation);
            return true;
        }
        return false;
    }

    //DELETE : fonction annulerReservation() demandée
    public boolean annulerReservation(int numeroReservation) {
        Reservation reservation = prendReservation(numeroReservation);
        if (reservation != null) {
            reservations.remove(reservation);
            System.out.println("La réservation est bien supprimée : " + reservation);
            return true;
        }
        return false;
    }
    //Fin CRDU

    //Fonction confirmerReservation()
    public void confirmerReservation(int numeroReservation, int statut) {
        this.statut ="confirmé";
    }
}