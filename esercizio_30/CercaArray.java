import java.util.Scanner;
import java.util.Arrays;
public class CercaArray {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci la dimensione dell'array: ");
        int dimensione = input.nextInt();
        int[] array = new int[dimensione];
        System.out.println("Inserisci gli elementi dell'arrray: ");
        for (int i = 0; i < dimensione; i++){
            array[i] = input.nextInt();
        }
        System.out.print("Inserisci il numero da cercare: ");
        int numeroCercato = input.nextInt();
        int indice = -1;
        for (int i = 0; i < dimensione; i++)
        {
        if (array[i] == numeroCercato)
            {
                indice = i;
                break;
            }    
        }
        if (indice != -1)
        {
        System.out.println("Il numero si trova all'indice " + indice + " dell'array");
        } else 
        {
        System.out.println("Il numero non si trova nell'array");
        }
    }
    
}
