import java.io.FileWriter; // la dipendenza che permette di leggere ed scrivere i files
import java.io.IOException; // la dipendenza che consente di gestire le eccezioni

public class Main {
    public static void main(String[] args) {
        String csvFile = "prodotto.csv"; // posizione del file csv che verrà creato
        String header = "ID_Prodotto,Nome_Prodotto,Categoria,Prezzo,Quantita,DataVendita\n"; // l'intestazione del file csv, cioè i nomi delle colonne
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

        FileWriter fileWriter = null; // creiamo un oggetto nullable cre rappresenterà il file csv

        try {
            fileWriter = new FileWriter(csvFile); // creiamo l'oggetto fileWriter tramite il costruttore della classe

            // Scrive l'intestazione del file CSV
            fileWriter.append(header); // il metodo append consente di aggiungere una riga in fondo al file

            // Scrive i dati nel file CSV
            for (String line : data) {
                fileWriter.append(line); // per ogni linea di data aggiungi il contenuto della linea e vai a capo (\n)
                fileWriter.append("\n");
            }

            System.out.println("File CSV creato con successo."); // stampa il messaggio di conferma di creazione del file csv
        } catch (Exception e) {
            System.out.println("Errore in CsvFileWriter."); // stampa il messaggio di errore con l'eccezione
            e.printStackTrace(); // teniamo traccia dell'errore
        } finally {
            try {
                fileWriter.flush(); // il metodo flush che svuota il contenuto della memoria del fileWriter
                fileWriter.close(); // il metodo close chiude il fileWriter
            } catch (IOException e) {
                System.out.println("Errore durante il flush/close del fileWriter.");
                e.printStackTrace();
            }
        }
    }
}