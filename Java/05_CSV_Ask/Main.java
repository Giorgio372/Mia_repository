import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String csvFile = "prodotto.csv";
        String line = "";
        String csvSplitBy = ";";
        Set<String> dateUniche = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            br.readLine();

            while ((line = br.readLine()) != null) {

                String[] prodotto = line.split(csvSplitBy);

                dateUniche.add(prodotto[5]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("DateDisponibili: ");
        for (String data : dateUniche) {
            System.out.println(data);
        }

        System.out.println("Inserisci una data tra quelle elencate sopra:");
        String dataInserita = scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            br.readLine();

            while ((line = br.readLine()) != null) {

                String[] prodotto = line.split(csvSplitBy);
                if (prodotto[2].equalsIgnoreCase(dataInserita)){
                System.out.println("Prodotto [ID=" + prodotto[0]
                    + ", Nome = " + prodotto[1]
                    + ", Categoria = " + prodotto[2]
                    + ", Prezzo = " + prodotto[3]
                    + ", Quantita' = " + prodotto[4]
                    + ", DataVendita = " + prodotto[5]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        scanner.close();
    }
}
