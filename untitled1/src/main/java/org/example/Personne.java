package org.example;

public class Personne {
    public int identifiant;
    public String nom;
    public String adresse;
    public int contact;

    public Personne(String adresse, int contact, int identifiant, String nom) {
        this.adresse = adresse;
        this.contact = contact;
        this.identifiant = identifiant;
        this.nom = nom;
    }

    public void ObtenirInfos() {
        return "personne {indentifant :" + identifiant + " nom :" + nom + " adresse :" + adresse + " contact :" + contact + "}";
    }

    //Les méthodes CRUD (C:CREATE:ajouter, R:READ:chercher, U:UPDATE:modifier, D:DELETE:supprimer)
    //BDD de la classe Personne
    private List<Personne> personnes = new ArrayList<>();

    //CREATE
    public void creerPersonne(Personne personne) {
        personnes.add(personne);
        System.out.println("Personne ajoutée: " + personne);
    }

     //DELETE
     public boolean supprPersonne(int identifiant) {
        Personne personne = lirePersonne(identifiant);
        if (personne != null) {
            personnes.remove(personne);
            System.out.println("Personne supprimée: " + personne);
            return true;
        }
        //Echec fonction DELETE
        return false;
    }
}
