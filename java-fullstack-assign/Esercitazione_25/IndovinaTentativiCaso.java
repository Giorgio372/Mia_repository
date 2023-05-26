import java.util.Random;
import java.util.Scanner;

public class IndovinaTentativiCaso
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        int numeroDaIndovinare = rand.nextInt(100) + 1; // random è un'intervallo semi aperto
        System.out.println(numeroDaIndovinare);
        int numeroDiTentativi = 0;
        Scanner input = new Scanner(System.in);
        int tentativo;
        boolean vincita = false;

        while (vincita == false)
        {
            System.out.println("Indovina un numero tra 1 e 100:");
            tentativo = input.nextInt();
            numeroDiTentativi++;

            if (tentativo == numeroDaIndovinare)
            {
                vincita = true;
            } else if (tentativo < numeroDaIndovinare)
            {
                System.out.println("Troppo basso! Prova ancora!");
            } else if (tentativo > numeroDaIndovinare)
            {
                System.out.println("Troppo alto! Prova ancora!");
            }
        }

        System.out.println("Bravo! Hai indovinato il numero dopo " + numeroDiTentativi + " tentativi.");
        input.close();
    }
}