import java.util.Random;
import java.util.Scanner;

public class Avventura3 {
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
                    cluesFound[room] = true;
                    System.out.println("Hai trovato un indizio! La cifra " + (room+1) + " del codice è " + secretCode[room] + ".");
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
        
        String code = (""+secretCode[0] + secretCode[1] + secretCode[2]);
        System.out.println(code);
        System.out.println("Inserisci Il codice");
        String codice = scanner.nextLine();
        if (codice == code)
        {
            System.out.println("Codice corretto");
        }
        System.out.println("Grazie per aver giocato!");
        scanner.close();
    }
}