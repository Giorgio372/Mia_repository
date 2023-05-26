import java.util.Arrays;
import java.util.Scanner;

public class CopiaArray
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci la dimensione dell'array: ");
        int dimensione = input.nextInt();
        int[] array = new int[dimensione];
        System.out.println("Inserisci gli elementi dell'array:");
        for (int i = 0; i < dimensione; i++)
        {
            array[i] = input.nextInt();
        }
        int[] arrayCopia = new int[dimensione];
        for (int i = 0; i < dimensione; i++)
        {
            arrayCopia[i] = array[i];
        }
        System.out.println("L'array originale è: " + Arrays.toString(array));
        System.out.println("L'array copiato è: " + Arrays.toString(arrayCopia));
        // System.out.println("L'array originale è: " + array.toString());
        // System.out.println("L'array copiato è: " + arrayCopia.toString());

        input.close();
    }
}