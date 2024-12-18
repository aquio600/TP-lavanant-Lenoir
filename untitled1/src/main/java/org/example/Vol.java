package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Vol {
    int numeroVol;
    String origine;
    String destination;
    Date dateHeureDepart = new Date();
    Date dateHeureArrivee = new Date();
    String etat;
    List<Employé> listepersonnel;
    List<Passager> listedespassagers;

    //constructeur
    public Vol(int numeroVol, String origine, String destination, Date dateHeureDepart, Date dateHeureArrivee, String etat) {
        this.numeroVol = numeroVol;
        this.origine = origine;
        this.destination = destination;
        this.dateHeureDepart = dateHeureDepart;
        this.dateHeureArrivee = dateHeureArrivee;
        this.etat = etat;
        this.listepersonnel = new ArrayList<Employé>();
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

    //CRUD
    public List<Vol> vols = new ArrayList<>();

    //CREATE : Fonction planifierVol() demandée
    public void planifierVol(Vol vol) {
        vols.add(vol);
        System.out.println("Vol ajouté : " + vol);
    }

    //READ
    public List<Vol> listerVols() {
        return vols;
    }
    public Vol chercherVol(int numeroVol) {
        for (Vol vol : vols) {
            if (vol.getNumeroVol() == numeroVol) {
                return vol;
            }
        }
        return null;
    }

    //UPDATE : fonction modifieVol() demandée
    public boolean modifieVol(int numeroVol, String origineModifie, String destinationModifie, Date dateHeureDepartModifie, Date dateHeureArriveeModifie, String etatModifie) {
        Vol vol = prendVol(numeroVol);
        if (vol != null) {
            vol.setOrigine(origineModifie);
            vol.setDestination(destinationModifie);
            vol.setDateHeureDepart(dateHeureDepartModifie);
            vol.setDateHeureArrivee(dateHeureArriveeModifie);
            vol.setEtat(etatModifie);
            System.out.println("Modification des infos du vol : " + vol);
            return true;
        }
        return false;
    }

    //DELETE : fonction annulerVol() demandée
    public boolean annuleVol(int numeroVol) {
        Vol vol = prendVol(numeroVol);
        if (vol != null) {
            vols.remove(vol);
            System.out.println("Le vol suivant est supprimé : " + vol);
            return true;
        }
        return false;
    }
    //Fin CRDU

    //Fonction ListingPassager() 
    public void ListingPassager(int numeroVol) {
        //On affiche tous les passagers du vol
        Vol vol = chercherVol(numeroVol);
        if (vol != null) {
            System.out.println("Liste des passagers pour le vol numéro " + numeroVol + " :");
            for (Passager passager : vol.listedespassagers) {
                System.out.println(passager);
            }
        } else {
            System.out.println("Vol non trouvé.");
        }
    }

    private Vol prendVol(int num) {
        for (Vol v : vols) {
            if (v.getNumeroVol() == num) {
                return v;
            }
        }
        return null ;
    }

    public void addpersonel(Employé perso){
        listepersonnel.add(perso);
    }

    public void ajoutdepassager(Passager pass) {
        listedespassagers.add(pass);
    }  
}