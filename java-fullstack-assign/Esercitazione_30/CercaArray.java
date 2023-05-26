import java.util.Scanner;

public class CercaArray
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // metodo di input
        System.out.print("Inserisci la dimensione dell'array: ");
        int dimensione = input.nextInt(); // dimensione specificata dall'utente
        int[] array = new int[dimensione]; // creazione di un array della dimensione dell'utente

        // System.out.println(array);

        System.out.println("Inserisci gli elementi dell'array:");

        for (int i = 0; i < dimensione; i++) // il ciclo for continua  finche il contatore raggiunge la dimensione inserita dall'utente
        {
        array[i] = input.nextInt(); // assegno  gli input dell'utente ad un array della dimensione del contatore
        }
        
        // System.out.println(array);

        System.out.print("Inserisci il numero da cercare: ");
        int numeroCercato = input.nextInt(); // definisco una variabile e la inizializzo  con valore pari all'input dell'utente
        // System.out.print(numeroCercato);
        int indice = -1; // creo una variabile a cui do il valore di -1 che rappresenta l'indice di un elemento che non esiste
        for (int i = 0; i < dimensione; i++)
        {
        if (array[i] == numeroCercato) // se  ad un determinato indice trovi il numero che ho scelto
            {
                indice = i;
                System.out.println(indice);
                break; // esci dal programma
                
            }
        }
        if (indice != -1)
        {
        System.out.println("Il numero si trova all'indice " + indice + " dell'array.");
        }
        else
        {
        System.out.println("Il numero non è presente nell'array.");
        }

        input.close();
    }
}