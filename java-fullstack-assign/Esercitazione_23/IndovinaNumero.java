import java.util.Scanner;
public class IndovinaNumero
{
    public static void main(String[] args)
    {
        int numeroDaIndovinare = 11;
        // int tentativi = 0;
        Scanner input = new Scanner(System.in);
        int tentativo;
        boolean vincita = false;
        while (vincita == false)
        {
            System.out.println("Indovina un numero tra 1 e 100:");
            tentativo = input.nextInt();
            // tentativi++;
            if (tentativo == numeroDaIndovinare) {
                vincita = true;
            } else if (tentativo < numeroDaIndovinare) {
                System.out.println("Troppo basso! Prova ancora!");
            } else if (tentativo > numeroDaIndovinare) {
                System.out.println("Troppo alto! Prova ancora!");
            }
        }
        System.out.println("Bravo! Hai indovinato il numero");
        // System.out.println("Bravo! Hai indovinato il numero dopo " + tentativi + " tentativi");
        input.close();
    }
}