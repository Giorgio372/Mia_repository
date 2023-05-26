import java.util.Scanner;

public class DoWhileLoop
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num;
        do // viene eseguito almeno la prima volta
        {
            System.out.print("Inserisci un numero (inserisci 0 per uscire): ");
            num = input.nextInt();
            System.out.println("Hai inserito: " + num);
        }
        while (num != 0); // viene eseguito soltanto se la condizione è soddisfatta

        input.close();
    }
}