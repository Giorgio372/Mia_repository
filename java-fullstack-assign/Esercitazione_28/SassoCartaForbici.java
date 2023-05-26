import java.util.Random;
import java.util.Scanner;

public class SassoCartaForbici {
    public static void main(String[] args) {
        String[] options = {"sasso", "carta", "forbici"}; // array con le opzioni

        Random random = new Random(); // creato lì'oggetto random
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci la tua mossa (sasso, carta, forbici):");
        String utenteMpossa = scanner.nextLine().toLowerCase(); // l'input dell'utente viene assegnato alla variabile utenteMossa

        String computerMossa = options[random.nextInt(options.length)]; // scelta del computer

        System.out.println("Il computer ha scelto: " + computerMossa);

        if (utenteMpossa.equals(computerMossa)) {
            System.out.println("Pareggio!");
        } else if (
            (utenteMpossa.equals("sasso") && computerMossa.equals("forbici")) ||
            (utenteMpossa.equals("carta") && computerMossa.equals("sasso")) ||
            (utenteMpossa.equals("forbici") && computerMossa.equals("carta"))
        ) {
            System.out.println("Hai vinto!");
        } else {
            System.out.println("Hai perso!");
        }

        scanner.close();
    }
}