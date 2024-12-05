package org.example;

public class Personne {
    public int identifiant;
    public String nom;
    public String adresse;
    public int contact;

    public Personne(String adresse, int contact, int identifiant, String nom) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.contact = contact;
    }

    //GETTER
    public int getIdentifiant() {
        return identifiant;
    }
    public String getNom() {
        return nom;
    }
    public String getAdresse() {
        return adresse;
    }
    public int getContact() {
        return contact;
    }

    //SETTER
    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public void setContact(int contact) {
        this.contact = contact;
    }

    //Les méthodes CRUD (C:CREATE:ajouter, R:READ:chercher, U:UPDATE:modifier, D:DELETE:supprimer)
    //BDD de la classe Personne
    private List<Personne> personnes = new ArrayList<>();

    //CREATE
    public void ajouterPersonne(Personne personne) {
        personnes.add(personne);
        System.out.println("Personne ajoutée: " + personne);
    }

    //READ
    public List<Personne> lesPersonnes() {
        //On met toutes les personnes dans une même liste
        return personnes;
    }
    public Personne chercherPersonneAvecId(int identifiant) {
        for (Personne personne : personnes) {
            if (personne.getIdentifiant() == identifiant) {
                return personne;
            }
        }
        return null;
    }

    //UPDATE
    public boolean modifierPersonne(int identifiant, String nomModifie, String addresseModifie) {
        Personne personne = lirePersonne(identifiant);
        if (personne != null) {
            personne.setNom(nomModifie);
            personne.setAddresse(addresseModifie);
            System.out.println("Personne modifiée: " + personne);
            return true;
        }
        return false;
    }

     //DELETE
     public boolean supprPersonne(int identifiant) {
        Personne personne = lirePersonne(identifiant);
        if (personne != null) {
            personnes.remove(personne);
            System.out.println("Personne supprimée: " + personne);
            return true;
        }
        //Si echec fonction DELETE :
        return false;
    }
    //Fin des fonctions CRUD

    //fonction ObtenirInfos()
    public void ObtenirInfos() {
        System.out.println("personne {indentifant :" + identifiant + " nom :" + nom + " adresse :" + adresse + " contact :" + contact + "}");
    }
}
