import java.util.Random;
import java.util.Scanner;

public class OCA {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int posizioneGiocatore = 0;

        System.out.println("Inizia il Gioco dell'Oca! Il primo giocatore che raggiunge o supera la casella 63 vince!");

        while (posizioneGiocatore < 63) {
            System.out.println("Premi invio per tirare i dadi");
            scanner.nextLine();
            int roll = random.nextInt(6) + 1 + random.nextInt(6) + 1;
            posizioneGiocatore += roll;
            System.out.println("Hai tirato " + roll + ". Ora sei sulla casella " + posizioneGiocatore + ".");
            
            // Regole speciali del gioco dell'oca
            if (posizioneGiocatore == 6) {
                System.out.println("Hai trovato un tunnel! Vai avanti fino alla casella 12.");
                posizioneGiocatore = 12;
            } else if (posizioneGiocatore == 19) {
                System.out.println("Sei inpìciampato! Perdi un turno.");
                // qui dovresti implementare la logica per gestire il "perdere un turno"
            } else if (posizioneGiocatore == 31) {
                System.out.println("Sei caduto nel pozzo! Aspetta qui finché non arriva un altro giocatore a salvarti.");
                // qui dovresti implementare la logica per gestire l'aspetto dell'attesa di un altro giocatore
            } else if (posizioneGiocatore == 42) {
                System.out.println("Ti sei prso nel labirinto! Torna alla casella 39.");
                posizioneGiocatore = 39;
            } else if (posizioneGiocatore == 52) {
                System.out.println("Sei finito in prigione! Aspetta qui finché non tiri un doppio.");
                // qui dovresti implementare la logica per gestire l'aspetto dell'attesa di un doppio
            } else if (posizioneGiocatore == 58) {
                System.out.println("Sei stato trovato e riportato! Torna alla casella iniziale.");
                posizioneGiocatore = 0;
            }
        }

        System.out.println("Hai raggiunto la casella 63! Hai vinto il gioco!");
        scanner.close();
    }
}