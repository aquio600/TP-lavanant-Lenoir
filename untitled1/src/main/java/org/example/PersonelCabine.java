package org.example;

public class PersonelCabine extends Employé{
    public String qualifications;

    public PersonelCabine(String dateEmbauche, int numeroemployé, String qualifications, String adresse, int contact, int identifiant, String nom) {
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
    
    //Fonction AffecterVol()
    public void AffecterVol(Vol vol){
        vol.addpersonel(this);
    }

    //Fonction ObtenirVol()
    public Vol ObtenirVol(){
        public Vol ObtenirVol() {
            for (Vol v; v instanceof Vol) {
                if (v.listepersonnel.contains(this)  ){
                    return v;
                }
            }
            return null ;
        }
    }
}