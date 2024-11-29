package org.example;

public class Personne {
    public int identifiant;
    public String nom;
    public String adresse;
    public int contact;


    public void ObtenirInfos() {
        System.out.print("indentifant :" + identifiant + " nom :" + nom + " adresse :" + adresse + " contact :" + contact);
    }

}
