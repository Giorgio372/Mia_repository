package Mia_repository.Repository_Giorgio.esercizio_3;
import java.util.Scanner;

public class InputType {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // instanzio un oggetto di nome input di classe Scanner che riceve input dall'utente
        System.out.print("Inserisci un numero decimale: "); //Stampa "Inserisci un numero decimale: " nella console;
        double num1 = input.nextDouble(); //Creo una variabile di tipo double di nome num1 a cui assegno il valore del metodo nextDouble() dell'oggetto input
        System.out.print("inserisci una stringa: "); //Stampa "Inserisci una stringa: " nella console;
        String str = input.next(); // Creo una variabile di tipo stringa chiamata str a cui assegno il valore del metodo nextLine() dell'oggetto input
        System.out.print("Inserisci un carattere: ");  //Stampa "Inserisci un carattere: " nella console;
        char c = input.next().charAt(0); // Creo una variabile di tipo char di nome c a cui assegno il valore nell'indice [0] del metodo next() dell'oggetto input
        System.out.println("Il numero decimale inserito é: " + num1);
        System.out.println("La stringa inserita é: " + str);
        System.out.println("Il carattere inserito é: " + c);
    }
    
}
