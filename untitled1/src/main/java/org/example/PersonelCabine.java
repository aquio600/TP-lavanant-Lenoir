package org.example;

public class PersonelCabine extends Employé{
    public String qualifications;

    public PersonelCabine(String dateEmbauche, int numeroemployé,String qualifications,String adresse, int contact, int identifiant, String nom) {
        this.qualifications = qualifications;
        this.adresse = adresse;
        this.contact = contact;
        this.identifiant = identifiant;
        this.nom = nom;
        this.dateEmbauche = dateEmbauche;
        this.numeroemployé = numeroemployé;

    }

    public void ObtenirRole(){
        System.out.println("Role = personnel de cabine");
    }
    public void AffecterVol(){}
    public void ObtenirVol(){}
}
