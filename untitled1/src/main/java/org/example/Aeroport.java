package org.example;

public class Aeroport {
    String nom;
    String ville;
    String description;

    //constructeur
    public Aeroport(String nom, String ville, String description) {
        this.nom = nom;
        this.ville = ville;
        this.description = description;
    }

    //Getter
    public String getNom() {
        return nom;
    }
    public String getVille() {
        return ville;
    }
    public String getDescription() {
        return description;
    }

    //Setter
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    //Methode CRUD
    private List<Aeroport> aeroports = new ArrayList<>();

    //CREATE
    public void ajouterAeroport(Aeroport aeroport) {
        aeroports.add(aeroport);
        System.out.println("Aéroport ajouté : " + aeroport);
    }

    //READ
    public List<Aeroport> listerAeroports() {
        return aeroports;
    }
    public Aeroport chercherAeroport(String nom) {
        for (Aeroport aeroport : aeroports) {
            if (aeroport.getNom().equalsIgnoreCase(nom)) {
                return aeroport;
            }
        }
        return null;
    }

    //UPDATE
    public boolean modifieAeroport(String nom, String villeModifie, String descriptionModifie) {
        Aeroport aeroport = prendAeroport(nom);
        if (aeroport != null) {
            aeroport.setVille(villeModifie);
            aeroport.setDescription(descriptionModifie);
            System.out.println("L'aéroport est modifie : " + aeroport);
            return true;
        }
        return false;
    }

    //DELETE
    public boolean supprimeAeroport(String nom) {
        Aeroport aeroport = prendAeroport(nom);
        if (aeroport != null) {
            aeroports.remove(aeroport);
            System.out.println("L'aéroport suivant est supprimé : " + aeroport);
            return true;
        }
        return false;
    }
    //Fin méthode CRUD

    //Fonction affecterVol()
    public void affecterVol() {
        //appel de cette fonction normalement déjà définie dans la classe Vol
    }

    //Autre appel de la fonction... à revoir
    public static void String() {
            Avion.affecterVol();
        }
}
