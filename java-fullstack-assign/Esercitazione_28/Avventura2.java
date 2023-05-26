import java.util.Scanner;
import java.util.Random;

public class Avventura2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean gameRunning = true;
        Random random = new Random();
        int secretRoom = random.nextInt(5) + 1; // Numero casuale tra 1 e 5

        while(gameRunning) {
            System.out.println("Ti trovi in una stanza oscura. Vedi una porta davanti a te. Cosa fai?");
            System.out.println("1. Apri la porta");
            System.out.println("2. Cerca un'altra via");
            System.out.println("3. Aspetta nell'oscurità");

            String input = scanner.nextLine();

            if (input.equals("1")) {
                System.out.println("La porta cigola mentre la apri. Davanti a te c'è un lungo corridoio. Continui a camminare e alla fine trovi l'uscita. Sei libero!");
                gameRunning = false;
            } else if (input.equals("2")) {
                System.out.println("Cerchi un'altra via. Trovi un passaggio segreto dietro un quadro. Seguendolo, raggiungi una stanza con 5 porte simili");
                System.out.println("Scegli una stanza (inserisci un numero da 1 a 5):");
                String sceltaPorta = scanner.nextLine();

                // System.out.println(Integer.toString(secretRoom));
                while (true) {
                if (sceltaPorta.equals(Integer.toString(secretRoom))) {
                    System.out.println("Hai trovato l'oggetto segreto! Hai vinto il gioco!");
                    gameRunning = false;
                    break;
                } else if (sceltaPorta.equals("1") || sceltaPorta.equals("2") || sceltaPorta.equals("3") || sceltaPorta.equals("4") || sceltaPorta.equals("5")) {
                    System.out.println("Questa stanza è vuota. Prova un'altra stanza.");
                    sceltaPorta = scanner.nextLine();
                } else {
                    System.out.println("Input non valido. Inserisci un numero da 1 a 5.");
                }
            }
                // gameRunning = false;
            } else if (input.equals("3")) {
                System.out.println("Aspetti nell'oscurità. Non succede nulla. Sembra che dovrai prendere una decisione.");
            } else {
                // System.out.println("Non capisco cosa stai cercando di fare. Game over.");
                // gameRunning = false;
                System.out.println("Non capisco cosa stai facendo");
                // gameRunning = false;
            }
        }

        System.out.println("Grazie per aver giocato!");
        scanner.close();
    }
}