
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CostruzioneChitarra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> componenti = new ArrayList<String>();
        List<String> pezzichitarra = new ArrayList<String>();
        componenti.add("Chiavette"); //il metodo add della classe aggiunge un elemento
        componenti.add("Ponte");
        componenti.add("Pickups");
        componenti.add("Potenziometri");
        componenti.add("Manico");
        componenti.add("Corde");
        System.out.println("Le componenti sono: ");
        for (String componente : componenti)
        {
            System.out.println(componente);
        }
        System.out.println("Inserisci il pezzo da assemblare dal corpo in poi. Hai 12 possibilita' per ogni pezzo "); //chiede all'utente di inserire un componente
        String input1 = input.nextLine(); //prende l'input
        int i;
        for (i = 0; i < 12; i++) { //si hanno 12 possibilità per azzeccare la parola corretta da inserire
            //confronta l'input per vedere se corrisponde
                    if (input1.equals("Chiavette")) //lo confronta con "Chiavette" e deve corrispondere
                    {
                    System.out.println("Bravo hai scelto il pezzo giusto da assemblare.");
                    pezzichitarra.add("Chiavette");
                    i = 12;
                    } else { //se l'input non è uguale all'oggetto risponde e fa ripetere il ciclo fino a quando non ci si azzecca
                    System.out.println("Peccato! Hai scelto il pezzo sbagliato da assemblare.");
                    System.out.println("Inserisci di nuovo qualcosa: ");
                    input1 = input.nextLine();
                    }
            }
        System.out.println("Inserisci un pezzo pezzo da assemblare: ");
        input1 = input.nextLine();
        for (i = 0; i < 12; i++) {
                if (input1.equals("Ponte")){
                    System.out.println("Bravo hai scelto il pezzo giusto da assemblare.");
                    pezzichitarra.add("Ponte");
                    i = 12;
                } else {
                    System.out.println("Peccato! Hai scelto il pezzo sbagliato da assemblare.");
                    System.out.println("Inserisci di nuovo qualcosa: ");
                    input1 = input.nextLine();
                }
            }
        System.out.println("Inserisci il prossimo pezzo da assemblare: ");
        input1 = input.nextLine();
        for (i = 0; i < 12; i++) {
                if (input1.equals("Pickups")){
                    System.out.println("Bravo hai scelto il pezzo giusto da assemblare.");
                    pezzichitarra.add("Pickups");
                    i = 12;
                } else {
                    System.out.println("Peccato! Hai scelto il pezzo sbagliato da assemblare.");
                    System.out.println("Inserisci di nuovo qualcosa: ");
                    input1 = input.nextLine();
                }
            }
        System.out.println("Inserisci il prossimo pezzo da assemblare: ");
        input1 = input.nextLine();
        for (i = 0; i < 12; i++) {
                if (input1.equals("Potenziometri")){
                    System.out.println("Bravo hai scelto il pezzo giusto da assemblare.");
                    pezzichitarra.add("Potenziometri");
                    i = 12;
                } else {
                System.out.println("Peccato! Hai scelto il pezzo sbagliato da assemblare.");
                System.out.println("Inserisci di nuovo qualcosa: ");
                input1 = input.nextLine();
                }
            }
        System.out.println("Inserisci il prossimo pezzo da assemblare: ");
        input1 = input.nextLine();
        for (i = 0; i < 12; i++) {
                if (input1.equals("Manico")){
                    System.out.println("Bravo hai scelto il pezzo giusto da assemblare.");
                    pezzichitarra.add("Manico");
                    i = 12;
                } else {
                System.out.println("Peccato! Hai scelto il pezzo sbagliato da assemblare.");
                System.out.println("Inserisci di nuovo qualcosa: ");
                input1 = input.nextLine();
                }
            }
        System.out.println("Inserisci il prossimo pezzo da assemblare: ");
        input1 = input.nextLine();
        for (i = 0; i < 12; i++) {
                if (input1.equals("Corde")){
                    System.out.println("Bravo hai scelto il pezzo giusto da assemblare.");
                    pezzichitarra.add("Corde");
                    i = 12;
                } else {
                    System.out.println("Peccato! Hai scelto il pezzo sbagliato da assemblare.");
                    System.out.println("Inserisci di nuovo qualcosa: ");
                    input1 = input.nextLine();
                }
            }
        System.out.print("Gli elementi della chitarra sono:\n");
        for (String pezzi : pezzichitarra)
        {
            System.out.println(pezzi);
        }
    input.close();
    }    
}
