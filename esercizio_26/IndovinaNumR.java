import java.util.Scanner;
import java.util.Random;

public class IndovinaNumR {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        Random casuale = new Random();
        int casual = casual.nextInt(100) +1;
        int numeroUtente; // dichiaro solamente la variabile utente
        do
        {
            System.out.println("Indovina un numero da 1 a 100: ");
            numeroUtente = input.nextInt();
            if (numeroUtente<casual){
                System.out.println("Il numero che hai scelto e' troppo basso");
            } else if (numeroUtente>casual){
                System.out.println("Il numero che hai scelto e' troppo basso");
            }
        }
        while (numeroUtente != casual)
        System.out.println("Il numero che hai inserito non e' uguale")

    }
    
}
