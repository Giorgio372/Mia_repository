import java.util.Scanner;

public class CalcolaScala {
    public static void main(String[] args) {
        // array delle note
        String[] notes = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};

        // creazione dello scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci gli intervalli della scala (come numeri interi separati da spazi):");
        String[] intervalsInput = scanner.nextLine().split(" ");

        int[] intervals = new int[intervalsInput.length];
        for (int i = 0; i < intervals.length; i++) {
            intervals[i] = Integer.parseInt(intervalsInput[i]);
        }

        // calcola e stampa le note della scala
        int currentNote = 0;
        for (int interval : intervals) {
            System.out.println(notes[currentNote]);
            currentNote = (currentNote + interval) % notes.length;
        }

        scanner.close();
    }
}