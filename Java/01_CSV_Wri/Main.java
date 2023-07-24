import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        FileWriter filewriter = null;
        String csvFile = "./prodotto.csv";
        String heder = "ID_Prdotto,Nome_Prodotto.Categoria,Prezzo,Quantita,DataVendita\n";
        String[] data = {
            "1,Mela,Frutta,0.50,100,2023-06-10",
            "2,Panino,Pane,1.00,50,2023-06-11",
            "3,Latte,Latticini,1.50,30,2023-06-12",
            "4,Cereali,Colazione,2.50,20,2023-06-13",
            "5,Pasta,Pasta,0.75,80,2023-06-14",
            "6,Arancia,Frutta,0.60,70,2023-06-15",
            "7,Burro,Latticini,1.25,40,2023-06-16",
            "8,Pane,Pane,1.00,60,2023-06-17",
            "9,Riso,Pasta,1.10,40,2023-06-18",
            "10,Yogurt,Latticini,1.50,30,2023-06-19"
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
    }
}
