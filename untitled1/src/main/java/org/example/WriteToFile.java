import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class WriteToFile {
    String content = "New passager 1";
    //Name and path of the file
    String cheminFichier1 = "fichiercsv/lespassagers.csv";
    try (BufferedReader br = new BufferedReader(new FileReader(cheminFichier1))) {
        String ligne;
        while ((ligne = br.readLine()) != null) {
            System.out.println(ligne);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }


    if(!file.exists()){
    file.createNewFile();
    }
    FileWriterfw= new FileWriter(file);
    BufferedWriterbw= new BufferedWriter(fw);
    bw.write(content);
    bw.close();
    
}
