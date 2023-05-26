import java.util.Scanner;

public class Avventura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ti svegli in una stanza oscura. Non hai idea di come ci sei finito. Vedi una porta davanti a te. Cosa fai?");
        System.out.println("1. Apri la porta");
        System.out.println("2. Cerca un'altra via");

        String input = scanner.nextLine();

        if (input.equals("1")) {
            System.out.println("La porta cigola mentre la apri. Davanti a te c'è un lungo corridoio. Continui a camminare e alla fine trovi l'uscita. Sei libero!");
        } else if (input.equals("2")) {
            System.out.println("Cerchi un'altra via. Trovi un passaggio segreto dietro un quadro. Seguendolo, riesci a trovare l'uscita. Sei libero!");
        } else {
            System.out.println("Non capisco cosa stai cercando di fare. Game over.");
        }

        scanner.close();
    }
}