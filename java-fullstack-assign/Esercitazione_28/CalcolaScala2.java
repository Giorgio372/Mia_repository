import java.util.Scanner;

public class CalcolaScala2 {
    public static void main(String[] args) {
        // array delle note
        String[] notes = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"}; // scala cromatica

        // array degli intervalli per scale maggiore e minore
        int[] IntervalliScalMaggiore = {2, 2, 1, 2, 2, 2, 1}; // scala maggiore
        int[] IntervalliScalaMinore = {2, 1, 2, 2, 1, 2, 2}; // scala minorte

        // creazione dello scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Scegli una scala (maggiore o minore):");
        String scalaScelta = scanner.nextLine().toLowerCase();

        // seleziona gli intervalli appropriati in base alla scelta dell'utente
        int[] IntervalloSelezionato;
        if (scalaScelta.equals("maggiore")) {
            IntervalloSelezionato = IntervalliScalMaggiore; // faccio corrispondere la scelta dell'utente alla scala
        } else if (scalaScelta.equals("minore")) {
            IntervalloSelezionato = IntervalliScalaMinore; // faccio corrispondere la scelta dell'utente alla scala
        } else {
            System.out.println("Scelta non valida.");
            scanner.close();
            return;
        }

        // calcola e stampa le note della scala
        int currentNote = 0; // la nota di partenza dell'array con 0 perte da C e così via
        for (int interval : IntervalloSelezionato) // per ogni numero dell'array dell'intervallo
        {

            System.out.println(notes[currentNote]); // stampa la nota  della cromatica che corrisponde alla nota dell'array
            currentNote = (currentNote + interval);
            // currentNote = (currentNote + interval) % notes.length;
            //  La parte (currentNote + interval) aggiunge l'intervallo.questo potrebbe produrre un indice che supera la lunghezza dell'array delle note (che va da 0 a notes.length - 1), quindi avremmo bisogno di tornare all'inizio dell'array una volta raggiunta la fine. Questo è quello che fa l'operatore %.
    // Se currentNote + interval è minore di notes.length, allora currentNote + interval viene assegnato a currentNote.
    // Se currentNote + interval è uguale o superiore a notes.length, allora l'indice torna all'inizio dell'array.

// Per esempio, se abbiamo 12 note nell'array e currentNote è 11 (l'ultimo indice valido), l'aggiunta di un intervallo di 1 produrrebbe 12, che è fuori dai limiti dell'array. Ma (11 + 1) % 12 è uguale a 0, quindi currentNote viene impostato a 0, che è l'inizio dell'array, permettendo così di rappresentare l'idea di note cicliche in musica
            // System.out.println(currentNote);
            // 
        }

        scanner.close();
    }
}