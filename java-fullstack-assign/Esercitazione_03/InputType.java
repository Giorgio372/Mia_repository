/*
titolo dell'esercitazione e relativa spiegazione
*/

import java.util.Scanner;

public class InputType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci un numero decimale: ");
        double num1 = input.nextDouble();
        System.out.println("Il numero decimale inserito è: " + num1);
        // System.out.println("Il numero decimale inserito è: " + num1);
        System.out.print("Inserisci una stringa: ");
        String str = input.next(); // legge anche il carattere di a capo dopo il numero decimale
        System.out.println("La stringa inserita è: " + str);
        // String str = input.nextLine(); // legge anche il carattere di a capo dopo il numero decimale
        System.out.print("Inserisci un carattere: ");
        char c = input.next().charAt(0);
        System.out.println("Il carattere inserito è: " + c);
    }
}
