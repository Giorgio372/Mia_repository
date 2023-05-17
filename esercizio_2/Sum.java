package Mia_repository.Repository_Giorgio.esercizio_2;
import java.util.Scanner;

public class Sum {

    public static void main (String[] args)
    {
        
        Scanner input = new Scanner(System.in);
        System.out.print ("Inserisci il tuo nome: ");
        String nome = input.nextLine();
        System.out.print ("Inserisci il primo numero: ");
        int num1 = input.nextInt();
        System.out.print ("Inserisci un altro numero: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println(nome + "\nLa somma dei numeri e': " + sum);

    }
