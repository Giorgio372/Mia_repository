import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) throws FileNotFoundException, IOException {
        String csvFile = "prodotto.csv";
        String line = "";
        String csvSplitBy = ";";
        int contatoreFrutta = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una data nel formato YYYY-MM-DD");
        String dataInserita = scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            br.readLine();

            while ((line = br.readLine()) != null) {
                
                String[] prodotto = line.split(csvSplitBy);

                if (prodotto[2].equals(dataInserita)){
                    System.out.println("Prodotto [ID=" + prodotto[0]
                    + ", Nome = " + prodotto[1]
                    + ", Nome = " + prodotto[2]
                    + ", Nome = " + prodotto[3]
                    + ", Nome = " + prodotto[4]
                    + ", Nome = " + prodotto[5]);
                }
            }
            System.out.println("Il numero totale di frutta nel csv e':" + contatoreFrutta);
        } catch (IOException e){
            e.printStackTrace();
        }
        scanner.close();
    }
}
