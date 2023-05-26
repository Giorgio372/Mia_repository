import java.util.*;
/* import java.util.Random; */

public class guessNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* int ranNum = (int)((Math.random() * 100) + 0); */
        // Math.random() genera un numero Double compreso tra 0 e 0,999999
        // lo moltiplico per il numero che sia il massimo del nostro range
        // ci aggiungo il valore che voglio sia il minimo del nostro range

        Double ranNum1 = Math.random(); // genera un numero Double compreso tra 0 e 0,999999
        System.out.println(ranNum1); 

        Double ranNum2 = Math.random() * 10; // genera un numero Double compreso tra 0 e 9,999999
        System.out.println(ranNum2);

        int min = 8;

        Double ranNum3 = (Math.random() * (10 - min)) + min;
        System.out.println(ranNum3); // genera un numero Double compreso tra min e 9,999999

        // se voglio generare i numeri tra 1 e 10
        // double ranNum4 = (Math.random() * (10 - 1)) + 1;

        int numToGuess = (int)((Math.random() * (100 - min)) + min);
        System.out.println(numToGuess);


        while (true) {
            System.out.println("Inserisci un numero da indovinare da 1 a 100:");
            int userGuess = input.nextInt();

            if (userGuess == numToGuess) {
                System.out.println("Bravo hai indovinato, il numero era proprio " + numToGuess);

                break;

            } else if (userGuess < numToGuess) {
                System.out.println("Il numero che hai inserito e' troppo piccolo. Riprova:");

            } else {
                System.out.println("Il numero che hai inserito e' troppo grande. Riprova:");
            }
        }
        


    }
    
}
