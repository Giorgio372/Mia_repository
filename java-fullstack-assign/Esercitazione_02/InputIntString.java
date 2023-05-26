/*
Utilizzo di classe Scanner e variabili di testo e numeriche + condizione if
Questo programma pur non presentando errori di compilazione presenta alcune eccezioni non gestite (InputMismatchException)
*/

import java.util.Scanner; // importa la classe Scanner dal package java.util

public class InputIntString
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // crea un oggetto Scanner che legge l'input dalla console (System.in)

        System.out.print("Inserisci il tuo nome: "); // stampa "Inserisci il tuo nome: " nella console
        String nome = input.next(); // legge la prossima stringa dall'input

        System.out.print("Inserisci la tua età: "); // stampa "Inserisci la tua età: " nella console
        int eta = input.nextInt(); // legge il prossimo intero dall'input

        // imposto il valore di treshold
        int soglia = 18;

        // inserisco una condizione che verifica l'età dell'utente
        if (eta < soglia)
        {
            // se l'input è <18 l'utente riceve un messaggio d'errore ed esce dal ciclo if
            System.out.println("non hai 18 anni");
        }

            // se l'input è >=18 l'utente è autorizzato e riceve un messaggio di benvenuto
            System.out.println("Ciao, " + nome + "! Hai " + eta + " anni."); // stampa "Ciao, <nome>! Hai <eta> anni" nella console

        input.close(); // chiude lo Scanner (non è obbligatorio)

    }
}

/*
note per i collaboratori
*/
