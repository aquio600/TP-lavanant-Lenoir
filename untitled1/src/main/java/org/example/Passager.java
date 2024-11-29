package org.example;

public class Passager extends Personne {
    int passeport;

    public void reserverVol() {
        //...
    }
    public void annulerReservation() {
        //...
    }
    public void obtenirReservation() {
        //...
    }

    public static void main(String[] args) {
        Reservation.annulerReservation();
    }

    //constructeur
    public Passager(int passeport) {
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


}
