import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main (String[] args) throws FileNotFoundException, IOException {
        String csvFile = "prodotto.csv";
        String line = "";
        String csvSplitBy = ";";
        int contatoreFrutta = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            br.readLine();

            while ((line = br.readLine()) != null) {
                
                String[] prodotto = line.split(csvSplitBy);

                if (prodotto[2].equalsIgnoreCase("Frutta")){
                    contatoreFrutta++;
                }
            }
            System.out.println("Il numero totale di frutta nel csv e':" + contatoreFrutta);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}