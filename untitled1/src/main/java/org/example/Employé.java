package org.example;

public class Employé extends Personne{
    public int numeroemployé;
    public String dateEmbauche;

    public Employé(String dateEmbauche, int numeroemployé) {
        this.dateEmbauche = dateEmbauche;
        this.numeroemployé = numeroemployé;

    }

    public void ObtenirRole(){
    System.out.println("Role = void");
}
}
