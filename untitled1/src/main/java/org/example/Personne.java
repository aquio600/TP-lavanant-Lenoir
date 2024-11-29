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
        System.out.print("indentifant :" + identifiant + " nom :" + nom + " adresse :" + adresse + " contact :" + contact);
    }

}
