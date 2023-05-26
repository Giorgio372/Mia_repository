import java.util.Scanner;

public class SwitchStatement
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci un numero da 1 a 3: ");
        int num = input.nextInt();
        switch (num)
        {
            case 1:
                System.out.println("Hai inserito 1");
                break;
            case 2:
                System.out.println("Hai inserito 2");
                break;
            case 3:
                System.out.println("Hai inserito 3");
                break;
            default:
                System.out.println("Il numero inserito non è valido");
                break;
        }
        
        input.close();
    }
}