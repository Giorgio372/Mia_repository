
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Lista_e_carrello {
    public static void main(String[] args)
    {
        List<String> lista = new ArrayList<String>();
        List<String> carrello = new ArrayList<String>();
        lista.add("Mela"); //il metodo add della classe aggiunge un elemento
        lista.add("Banana");
        lista.add("Arancia");
        lista.add("Popcorn");
        lista.add("Pasta");
        lista.add("Birra");
        lista.add("Latte");
        lista.add("Prosciutto");
        //fruits.clear(); //il metodo per pulire
        //fruits.size();
        Scanner daSpostare = new Scanner(System.in);
        System.out.println("Quanti sono gli elementi da mettere nella lista della spesa?");
        Scanner input;
        int numero = input.nextInt();
        System.out.println("Quali sono?");
        for (int num = numero){
            System.out.println("Digita i nomi da mettere nella lista del carrello:");
            int daSpostare = input.next();
        }
        for (String carello : carrello){
            System.out.println(carrello);
        }
    }
    
}
