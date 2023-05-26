
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CostruzioneChitarra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> componenti = new ArrayList<String>();
        List<String> chitarra = new ArrayList<String>();
        componenti.add("Chiavette"); //il metodo add della classe aggiunge un elemento
        componenti.add("Ponte");
        componenti.add("Pickups");
        componenti.add("Potenziometri");
        componenti.add("Manico");
        componenti.add("Corde");
        while (true)
        {
            System.out.print("Inserisci il prossimo pezzo da assemblare partendo dal corpo: ");
            String input1 = input.next();
            if (input1 == "Chiavette"){
                System.out.print("Bravo hai scelto il pezzo giusto da assemblare");
                chitarra.add("Chiavette");
                break;
            } else {
                System.out.println("Peccato! Hai scelto il pezzo sbagliato da assemblare");
            }
        }
        while (true)
        {
            System.out.print("Inserisci il prossimo pezzo da assemblare: ");
            String input2 = input.next();
            if (input2 == "Ponte"){
            System.out.print("Bravo hai scelto il pezzo giusto da assemblare");
            chitarra.add("Ponte");
            break;
            } else {
            System.out.print("Peccato! Hai scelto il pezzo sbagliato da assemblare");
            }
            }
        while (true)
        {
            System.out.print("Inserisci il prossimo pezzo da assemblare: ");
            String input3 = input.next();
            if (input3 == "Pickups"){
            System.out.print("Bravo hai scelto il pezzo giusto da assemblare");
            chitarra.add("Pickups");
            break;
            } else {
            System.out.print("Peccato! Hai scelto il pezzo sbagliato da assemblare");
            }
        }
        while (true) 
        {
            System.out.print("Inserisci il prossimo pezzo da assemblare: ");
            String input4 = input.next();
            if (input4 == "Potenziometri"){
            System.out.print("Bravo hai scelto il pezzo giusto da assemblare");
            chitarra.add("Potenziometri");
            break;
            } else {
            System.out.print("Peccato! Hai scelto il pezzo sbagliato da assemblare");
            }
        }
        while (true) 
        {
            System.out.print("Inserisci il prossimo pezzo da assemblare: ");
            String input5 = input.next();
            if (input5 == "Manico"){
            System.out.print("Bravo hai scelto il pezzo giusto da assemblare");
            chitarra.add("Manico");
            } else {
            System.out.print("Peccato! Hai scelto il pezzo sbagliato da assemblare");
            }
        }
        while (true) 
        {
            System.out.print("Inserisci il prossimo pezzo da assemblare: ");
            String input5 = input.next();
            if (input5 == "Manico"){
            System.out.print("Bravo hai scelto il pezzo giusto da assemblare");
            chitarra.add("Manico");
            } else {
            System.out.print("Peccato! Hai scelto il pezzo sbagliato da assemblare");
            }
        }
        System.out.print("Hai completato la chitarra!");
                    input.close();
    }
}
