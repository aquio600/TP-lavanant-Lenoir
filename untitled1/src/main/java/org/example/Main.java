package org.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Aeroport A1 =new Aeroport("cdg","Paris","arp");
        Aeroport A2 =new Aeroport("dgc","LYON","ora");
        Avion vrom =new Avion(1,"rapide",240);
        Avion vrom2 =new Avion(2,"meh",280);
        Passager P1 =new Passager(1234);
        String filePath = "fichiercsv/lespassagers.csv";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) // `true` pour ajouter à la fin
        {
            writer.write(P1.toString());
            writer.newLine(); // Ajoute une nouvelle ligne
        }catch (IOException e) {
            System.err.println("Erreur lors de l'écriture dans le fichier : " +
                    e.getMessage());}
        Passager P2 =new Passager(4321);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) // `true` pour ajouter à la fin
        {
            writer.write(P2.toString());
            writer.newLine(); // Ajoute une nouvelle ligne
        }catch (IOException A) {
            System.err.println("Erreur lors de l'écriture dans le fichier : " +
                    A.getMessage());}
        Pilote ch =new Pilote();


    }
    public class ExempleLectureFichier {
        public static void main(String[] args) {
            String pathFile = "cheminPath/fichier.txt";
            try (BufferedReader reader = new BufferedReader(new FileReader(pathFile))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.err.println("Erreur lors de la lecture du fichier : " +
                        e.getMessage());
            }
        }
    }
    public class ExempleEcritureFichier {
        public static void main(String[] args) {
            String filePath = "cheminPath/fichier.txt";
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) // `true` pour ajouter à la fin
            {
                writer.write("Ceci est un exemple de texte.");
                writer.newLine(); // Ajoute une nouvelle ligne
                writer.write("Une autre ligne de texte.");
            } catch (IOException e) {
                System.err.println("Erreur lors de l'écriture dans le fichier : " +
                        e.getMessage());
            }
        }
    }
}