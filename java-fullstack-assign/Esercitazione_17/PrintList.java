import java.util.ArrayList;
import java.util.List;

public class PrintList
{
    public static void main(String[] args)
    {
        List<String> fruits = new ArrayList<String>();
        fruits.add("Mela"); // il metodo add della classe aggiunge un elemento
        fruits.add("Banana");
        fruits.add("Arancia");
        // fruits.clear(); // il metodo per pulire
        // fruits.remove(0); // il metodo per rimuovere un elento specifico
        // fruits.size();
        fruits.isEmpty();
        for (String fruit : fruits)
        {
            System.out.println(fruit);
            // System.out.println(fruits.size());
            // System.out.println(fruits.isEmpty());
        }
         System.out.println(fruits.isEmpty());
    }
}