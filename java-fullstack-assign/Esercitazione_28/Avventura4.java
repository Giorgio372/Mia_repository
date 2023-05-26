import java.util.Random;
import java.util.Scanner;

public class Avventura4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] secretCode = {random.nextInt(9) + 1, random.nextInt(9) + 1, random.nextInt(9) + 1};

        Scanner scanner = new Scanner(System.in);

        boolean[] cluesFound = {false, false, false};
        boolean boxOpened = false;

        while(!boxOpened) {
            System.out.println("In quale stanza vuoi cercare un indizio? (1, 2 o 3)");

            String input = scanner.nextLine();

            if (input.equals("1") || input.equals("2") || input.equals("3")) {
                int room = Integer.parseInt(input) - 1;
                if (!cluesFound[room]) {
                    System.out.println("Hai incontrato un mostro! Devi vincere a dadi per ottenere l'indizio.");
                    int playerRoll = random.nextInt(6) + 1;
                    int monsterRoll = random.nextInt(6) + 1;
                    System.out.println("Hai tirato un " + playerRoll);
                    System.out.println("Il mostro ha tirato un " + monsterRoll);
                    if (playerRoll >= monsterRoll) {
                        cluesFound[room] = true;
                        System.out.println("Hai vinto! L'indizio è: la cifra " + (room+1) + " del codice è " + secretCode[room] + ".");
                    } else {
                        System.out.println("Hai perso. Prova di nuovo.");
                    }
                } else {
                    System.out.println("Hai già trovato l'indizio in questa stanza.");
                }
            } else {
                System.out.println("Input non valido. Scegli una stanza tra 1, 2 e 3.");
                continue;
            }

            if (cluesFound[0] && cluesFound[1] && cluesFound[2]) {
                System.out.println("Hai trovato tutti gli indizi! Il codice segreto è " + secretCode[0] + secretCode[1] + secretCode[2] + ". Apri il box e vinci il gioco!");
                boxOpened = true;
            }
        }

        System.out.println("Grazie per aver giocato!");
        scanner.close();
    }
}