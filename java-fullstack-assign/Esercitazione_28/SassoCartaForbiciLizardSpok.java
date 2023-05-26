import java.util.Random;
import java.util.Scanner;

public class SassoCartaForbiciLizardSpok {
    public static void main(String[] args) {
        String[] options = {"sasso", "carta", "forbici", "lucertola", "spok" };

        System.out.println("sasso batte forbici\tsasso schhiaccia lucertola\ncarta batte sasso\tcarta taglia spok\nforbici decapitano lucertola\tforbici batte carta\nlucertola mangia carta\tlucertola AVVELENA SPOK\nSPOK rompe forbici\tspok vaporizza sasso");

        // sasso carta forbici lizard  spok

        // sasso batte forbici
        // sasso schhiaccia lucertola
        // carta batte sasso
        // carta taglia spok
        // forbici decapitano lucertola
        // forbici batte carta
        // lucertola mangia carta
        // lucertola AVVELENA SPOK
        // SPOK rompe forbici
        // spok vaporizza sasso

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci la tua mossa (sasso, carta, forbici, lucertola, spok):");
        String utenteMpossa = scanner.nextLine().toLowerCase();

        String computerMossa = options[random.nextInt(options.length)];

        System.out.println("Il computer ha scelto: " + computerMossa);

        if (utenteMpossa.equals(computerMossa)) {
            System.out.println("Pareggio!");
        } else if (
            (utenteMpossa.equals("sasso") && computerMossa.equals("forbici")) ||
            (utenteMpossa.equals("carta") && computerMossa.equals("sasso")) ||
            (utenteMpossa.equals("forbici") && computerMossa.equals("carta")) ||
            (utenteMpossa.equals("lucertola") && computerMossa.equals("spok")) ||
            (utenteMpossa.equals("spok") && computerMossa.equals("forbici")) ||
            (utenteMpossa.equals("spok") && computerMossa.equals("sasso")) ||
            (utenteMpossa.equals("lucertola") && computerMossa.equals("carta")) ||
            (utenteMpossa.equals("forbici") && computerMossa.equals("lucertola")) ||
            (utenteMpossa.equals("carta") && computerMossa.equals("spok")) ||
            (utenteMpossa.equals("sasso") && computerMossa.equals("lucertola"))
        ) {
            System.out.println("Hai vinto!");
        } else {
            System.out.println("Hai perso!");
        }

        scanner.close();
    }
}