
// creare un programma che chieda all'utente di inserire la lunghezza del
// lato e restituisca in output
// l'area ed il perimetro di un quadrato
// utilizzando la variabile lato
import java.util.Scanner;

public class calcolaPerimetroArea {

    // qui devo inserire il metodo main
    public static void main(String[] args) {

        // devo dichiarare una variabile lato
        int lato;
        // devo far si che il computer mi chieda di inserire un dato
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci la lunghezza del lato: "); // stampa "Inserisci il tuo nome: " nella console
        lato = input.nextInt(); // legge il prossimointero dall'input
        // devo inserire l'input e l'inpute deve essere instrpretato come la variabile
        // lato
        // devo utilizzare la variabile lato per effettuare 2 calcoli:

        // se l'input dell'utente è maggiore di 400 o minore di 1 stampa: "il numero è troppo grosso" e non calcola
        if (lato>400 || lato<1)
        {
       System.out.println("il numero non è valido");

        }
        else {        // se invece è minore o uguale effettua il calcolo
            // 1 - calcolare ilperimetro
            System.out.println("Perimetro =" + lato * 4);
            // 2 - calcolare l'area
            System.out.println("Area =" + lato * lato);
            // devo stampare i risultati se voglio su due righe separate}
        }
    }
}
