import java.util.Random;

public class GenerazioneCaso
{
    public static void main(String[] args) {
        // Creare un oggetto della classe Random
        Random rand = new Random();

        // Generare un numero intero casuale
        int randomInt = rand.nextInt(100); // Genera un numero intero casuale tra 0 (incluso) e 100 (escluso)
        System.out.println("Numero intero casuale: " + randomInt);

        // Generare un numero double casuale
        double randomDouble = rand.nextDouble(); // Genera un numero double casuale tra 0.0 (incluso) e 1.0 (escluso)
        System.out.println("Numero double casuale: " + randomDouble);

        // Generare un valore booleano casuale
        boolean randomBoolean = rand.nextBoolean(); // Genera un valore booleano casuale
        System.out.println("Valore booleano casuale: " + randomBoolean);
    }
}