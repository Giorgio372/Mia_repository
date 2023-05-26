import java.util.Random;
import java.util.Scanner;

public class Cavalli {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        // int puntata =  10;
        int winningHorse = random.nextInt(5) + 1;
        System.out.println(winningHorse);
        System.out.println("Benvenuto alla corsa dei cavalli! Abbiamo 5 cavalli in gara oggi.");
        System.out.println("Su quale cavallo vuoi scommettere? (inserisci un numero da 1 a 5)");
        int bet = scanner.nextInt();
        System.out.println("Inserisci la tua puntata");
        int puntata = scanner.nextInt();

        if (bet < 1 || bet > 5) {
            System.out.println("Scelta non valida. Devi scommettere su un numero tra 1 e 5.");
            scanner.close();
            return;
        }

        System.out.println("Hai scommesso sul cavallo numero " + bet + ". Inizia la gara!");

        

        System.out.println("Il cavallo numero " + winningHorse + " ha vinto la gara!");

        if (bet == winningHorse) {
            System.out.println("Complimenti! Hai vinto la scommessa! Hai guadagnato "+puntata*5+ "(cinque volte la tua puntata)");
        } else {
            System.out.println("Peccato! Hai perso la scommessa. Prova ancora la prossima volta.");
        }

        scanner.close();
    }
}