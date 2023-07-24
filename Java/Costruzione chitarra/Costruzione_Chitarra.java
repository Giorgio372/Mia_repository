import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Costruzione_Chitarra {

    public static void main(String[] args) {

        FileWriter filewriter = null;
        String csvFile = "./oggetti.csv";
        String heder = "Oggetto chitarra\n";
        String[] data = {
            "Chiavette",
            "Ponte",
            "Pickups",
            "Potenziometri",
            "Manico",
            "Corde",
        };
        try {
            filewriter = new FileWriter(csvFile);

            filewriter.append(heder);

            for (String line : data){
                filewriter.append(line);
                filewriter.append("\n");
            }

            System.out.println("File csv creato con successo");

            

        } catch (Exception e) {
            System.out.println("Errore");
            e.printStackTrace();
        } finally {
            try {
                filewriter.flush();
                filewriter.close();
            } catch (IOException e) {
                System.out.println("Errore durante il flush/ close csv");
                e.printStackTrace();
            }
        }
        String CSVFile = "oggetti.csv";
        String line = "";
        String csvSplitBy = ";";
        try (BufferedReader br = new BufferedReader(new FileReader(CSVFile))) {

            br.readLine();

            while ((line = br.readLine()) != null) {
                
                String[] oggetto = line.split(csvSplitBy);

                System.out.println("oggetto [ID=" + oggetto[0]
                    + ", Nome = " + oggetto[1]
                    + ", Nome = " + oggetto[2]
                    + ", Nome = " + oggetto[3]
                    + ", Nome = " + oggetto[4]
                    + ", Nome = " + oggetto[5]
                    + ", Nome = " + oggetto[6]);
                    
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}