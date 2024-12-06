package org.example;

public class Pilote extends Employé {
    public int Licence;
    public int heuresVol;


    public void ObtenirRole(){
        System.out.println("Role = Pilote");
    }

    //Fonction AffecterVol()
    public void AffecterVol(Vol vol){
        vol.addpersonel(this);
    }
    
    //Fonction ObtenirVol()
    public Vol ObtenirVol() {
        for (Vol v; v instanceof Vol) {
            if (this in v.listepersonnel){
                return v;
            }
        }
        return void ;
    }