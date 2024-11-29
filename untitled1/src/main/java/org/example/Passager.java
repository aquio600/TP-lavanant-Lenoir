package org.example;

import java.util.List;

public class Passager extends Personne {
    int passeport;
    public List<Reservation> listDeVolsReserves;

    public static void main(String[] args) {
        Reservation.annulerReservation();
    }

    //constructeur
    public Passager(int passeport) {
        //super(identifiant, nom, adresse);
        this.passeport = passeport;
    }
    //getter
    public int getPasseport() {
        return passeport;
    }
    //setter
    public void setPasseport(int passeport) {
        this.passeport = passeport;
    }

    //Methodes
    public void reserverVol() {
        //Reservation newReservation = getPasseport();
    }
    public void annulerReservation() {

        //...
    }
    public void obtenirReservation() {
        //...
    }
}
