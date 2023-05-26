import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintList2
{
    public static void main(String[] args)
    {
        List<String> fruits = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        fruits.add("Mela"); // il metodo add della classe aggiunge un elemento
        fruits.add("Banana");
        fruits.add("Arancia");
        
        for (String fruit : fruits)
        {
            System.out.println(fruit);
            // System.out.println(fruits.size());
            // System.out.println(fruits.isEmpty());
        }

        System.out.println("Scegli 0 per aggiungere un elemento. Scegli 1 per eliminare.");
        int scelta = input.nextInt();

        int valorezero = 0;
        if (scelta == valorezero) { //in caso di 0 l'utente inserisce un nuovo elemento
            System.out.println("scrivi il frutto che vuoi inserire: ");
            String daAggiung = input.next();
            fruits.add(daAggiung);
            System.out.println(fruits);
            // System.out.println(fruits.size());
            // System.out.println(fruits.isEmpty());
        } 
        else if (scelta == 1) { //in caso di 1 l'utente sceglie cosa eliminare
            System.out.println("Quale elemento vuoi eliminare?");
            String daEliminare = input.next();
             
            fruits.remove(daEliminare);
            System.out.println(fruits);
        }
            System.out.println("Non hai scelto cosa fare");

        
        // fruits.isEmpty();
        /*for (String fruit : fruits)
        {
            System.out.println(fruit);
            // System.out.println(fruits.size());
            // System.out.println(fruits.isEmpty());
        }*/
        
        System.out.println("Nuova lista: ");
        for (String fruit : fruits)
        {
            System.out.println(fruit);
            // System.out.println(fruits.size());
            // System.out.println(fruits.isEmpty());
        }
        input.close();
    }
}