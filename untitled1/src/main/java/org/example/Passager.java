package org.example;

import java.util.Date;
import java.util.List;

public class Passager extends Personne {
    public int passeport;

    //On stocke toutes les réservations dans une liste
    public List<Reservation> listDesVolsReserves;

    //CONSTRUCTEUR + prendre en compte la hiérarchie "extends Personne"
    public Passager(int passeport, String adresse, int contact, int identifiant, String nom) {
        //super(identifiant, nom, adresse);
        this.passeport = passeport;
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.contact = contact;
    }

    //GETTER
    public int getPasseport() {
        return passeport;
    }

    //SETTER
    public void setPasseport(int passeport) {
        this.passeport = passeport;
    }

    //Les méthodes CRUD (C:CREATE:ajouter, R:READ:chercher, U:UPDATE:modifier, D:DELETE:supprimer)
    //BDD de la classe Personne
    private List<Passager> passagers = new ArrayList<>();

    //CREATE
    public void ajouterPassager(Passager passager) {
        passagers.add(passager);
        System.out.println("Passager ajouté: " + passager);
    }

    //READ
    public List<Passager> lesPassagers() {
        //On met toutes les personnes dans une même liste
        return passagers;
    }
    public Passager chercherPassager(int passeport) {
        for (Passager passager : passagers) {
            if (passager.getPasseport() == passeport) {
                return passager;
            }
        }
        return null;
    }

    //UPDATE
    public boolean modifierPassager(int passeport, int newPasseport) {
        Passager passager = lirePassager(passeport);
        if (passager != null) {
            passager.setPasseport(newPasseport);
            System.out.println("Passeport du passager modifié: " + passager);
            return true;
        }
        return false;
    }

     //DELETE
     public boolean supprPassager(int passeport) {
        Passager passager = lirePassager(passeport);
        if (passager != null) {
            passagers.remove(passager);
            System.out.println("Passager supprimée: " + passager);
            return true;
        }
        //Si echec fonction DELETE :
        return false;
    }
    //Fin des fonctions CRUD

    //Fonction reserverVol()
    public void reserverVol(int passeport, Vol numvol) {
        Reservation reservation = new Reservation(numvol,new Date());
        this.listDeVolsReserves.add(reservation);
    }

    //Fonction annulerReservation() : appeler la fonction déjà existante, changer ???
    public void annulerReservation(Reservation resevation) {
        this.listDeVolsReserves.remove(resevation);
    }

    //Fonction obtenirReservation()
    //Revoir l'appel du passerport a la classe reservation !
    public void obtenirReservation(int passager, int passeport) {
        //int idreservation = 1;
        System.out.println("Pour ce passager : " + passager);
        System.out.println("Les infos de la résevation son les suivantes : ", reservation);
    }

//    public static void String() {
//        Reservation.annulerReservation();
//    }
}