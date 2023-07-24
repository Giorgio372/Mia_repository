import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main (String[] args) throws FileNotFoundException, IOException {
        String csvFile = "prodotto.csv";
        String line = "";
        String csvSplitBy = ";";
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            br.readLine();

            while ((line = br.readLine()) != null) {
                
                String[] prodotto = line.split(csvSplitBy);

                System.out.println("Prodotto [ID=" + prodotto[0]
                    + ", Nome = " + prodotto[1]
                    + ", Nome = " + prodotto[2]
                    + ", Nome = " + prodotto[3]
                    + ", Nome = " + prodotto[4]
                    + ", Nome = " + prodotto[5]);
                    
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}