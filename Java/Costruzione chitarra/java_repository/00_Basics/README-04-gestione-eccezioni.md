# GESTIONE DELLE ECCEZIONI

I controlli delle eccezioni dell'input sono fondamentali per garantire la robustezza e l'affidabilità dei programmi Java. Questi controlli consentono di gestire gli errori di input dell'utente, come l'inserimento di valori non validi o la mancanza di file o risorse necessarie, evitando che il programma termini in modo anomalo o produca risultati errati.
Ecco alcuni esempi di controlli delle eccezioni dell'input e i relativi use case:

>InputMismatchException
Questa eccezione viene generata quando l'utente inserisce un input di tipo diverso da quello atteso. Ad esempio, se il programma richiede un intero e l'utente inserisce una stringa, viene generata un'eccezione InputMismatchException.
Use case: questo controllo è utile quando si richiede all'utente di inserire un valore numerico o di un determinato tipo e si vuole evitare che l'utente inserisca un valore non valido

>NumberFormatException
Questa eccezione viene generata quando si tenta di convertire una stringa in un numero, ma la stringa non ha un formato numerico valido. Ad esempio, se si tenta di convertire la stringa "abc" in un intero, viene generata un'eccezione NumberFormatException.
Use case: questo controllo è utile quando si richiede all'utente di inserire un valore numerico in formato stringa e si vuole evitare che il programma fallisca se l'utente inserisce una stringa non valida

>FileNotFoundException
Questa eccezione viene generata quando si tenta di accedere a un file o a una risorsa che non esiste. Ad esempio, se si tenta di leggere il contenuto di un file che non esiste, viene generata un'eccezione FileNotFoundException.
Use case: questo controllo è utile quando si lavora con file o risorse esterne e si vuole evitare che il programma fallisca se il file o la risorsa non sono disponibili

>DateTimeParseException
Questa eccezione viene generata quando si tenta di convertire una stringa in un oggetto LocalDate, LocalTime o LocalDateTime, ma la stringa non ha un formato data/ora valido. Ad esempio, se si tenta di convertire la stringa "abc" in un oggetto LocalDate, viene generata un'eccezione DateTimeParseException.
Use case: questo controllo è utile quando si richiede all'utente di inserire una data o un'ora in formato stringa e si vuole evitare che il programma fallisca se l'utente inserisce una stringa non valida

>ArrayIndexOutOfBoundsException
Questa eccezione viene generata quando si tenta di accedere a un elemento di un array con un indice non valido. Ad esempio, se si tenta di accedere all'elemento con indice -1 o maggiore della dimensione dell'array, viene generata un'eccezione ArrayIndexOutOfBoundsException.
Use case: questo controllo è utile quando si lavora con array e si vuole evitare che il programma fallisca se si tenta di accedere a un elemento che non esiste

In generale, è importante utilizzare i controlli delle eccezioni dell'input in modo appropriato per garantire la robustezza e l'affidabilità dei programmi Java. È anche importante fornire all'utente un feedback chiaro e comprensibile in caso di errore di input, in modo da facilitare la correzione dell'input errato

**input dell'intero**

>Scrivere un programma Java che legge un numero intero dall'input dell'utente e stampa il suo quadrato. Il programma deve gestire l'eccezione InputMismatchException se l'utente inserisce un valore non valido

```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); // crea un oggetto Scanner

    try {
      System.out.print("Inserisci un numero intero: "); // chiede all'utente di inserire un numero intero
      int numero = input.nextInt(); // legge il numero intero inserito dall'utente
      int quadrato = numero * numero; // calcola il quadrato del numero
      System.out.println("Il quadrato di " + numero + " è " + quadrato + "."); // stampa il quadrato del numero
    } catch (InputMismatchException e) {
      System.out.println("Errore: input non valido."); // stampa un messaggio di errore
    }

    input.close(); // chiude l'oggetto Scanner
  }
}
```

Esempio di output:
Inserisci un numero intero: 5
Il quadrato di 5 è 25.
import java.util.Scanner;
import java.util.InputMismatchException;

**input della data**

>Scrivere un programma Java che legge una data dall'input dell'utente nel formato gg/mm/aaaa e stampa il giorno, il mese e l'anno separatamente. Il programma deve gestire l'eccezione DateTimeParseException se l'utente inserisce una data non valida.

```java
import java.time.LocalDate; // importa la classe LocalDate
import java.time.format.DateTimeParseException; // importa la classe DateTimeParseException
import java.util.Scanner; // importa la classe Scanner

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); // crea un oggetto Scanner

    try {
      System.out.print("Inserisci una data nel formato gg/mm/aaaa: "); // chiede all'utente di inserire una data
      String dataString = input.nextLine(); // legge la data inserita dall'utente
      LocalDate data = LocalDate.parse(dataString, java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy")); // converte la stringa in un oggetto LocalDate
      int giorno = data.getDayOfMonth(); // ottiene il giorno, il mese e l'anno dalla data inserita dall'utente e li stampa
      int mese = data.getMonthValue();
      int anno = data.getYear();
      System.out.println("Giorno: " + giorno); // stampa il giorno, il mese e l'anno
      System.out.println("Mese: " + mese); // stampa il giorno, il mese e l'anno
      System.out.println("Anno: " + anno); // stampa il giorno, il mese e l'anno
    } catch (DateTimeParseException e) {
      System.out.println("Errore: data non valida."); // stampa un messaggio di errore
    }

    input.close();
  }
}
```

Esempio di output:
Inserisci una data nel formato gg/mm/aaaa: 15/04/2023
Giorno: 15
Mese: 04
Anno: 2023

>In entrambi gli esercizi, viene utilizzata la clausola try-catch per gestire l'eccezione se l'utente inserisce un input non valido. In caso di eccezione, viene stampato un messaggio di errore appropriato.

**input del file**

>Scrivere un programma Java che legge il contenuto di un file specificato dall'utente e stampa il numero di righe del file. Il programma deve gestire l'eccezione FileNotFoundException se il file non esiste.

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    try {
      System.out.print("Inserisci il nome del file: ");
      String nomeFile = input.nextLine();
      File file = new File(nomeFile);
      Scanner fileInput = new Scanner(file);
      int numeroRighe = 0;
      while (fileInput.hasNextLine()) {
        fileInput.nextLine();
        numeroRighe++;
      }
      System.out.println("Il file " + nomeFile + " contiene " + numeroRighe + " righe.");
      fileInput.close();
    } catch (FileNotFoundException e) {
      System.out.println("Errore: il file " + e.getMessage() + " non esiste.");
    }

    input.close();
  }
}
```

Esempio di output:
Inserisci il nome del file: input.txt
Il file input.txt contiene 5 righe.

**input dell'array**

>Scrivere un programma Java che legge un array di interi dall'input dell'utente e stampa la somma degli elementi dell'array. Il programma deve gestire l'eccezione InputMismatchException se l'utente inserisce un valore non valido.
    
```java
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    try {
      System.out.print("Inserisci la dimensione dell'array: ");
      int dimensione = input.nextInt();
      int[] array = new int[dimensione];
      System.out.println("Inserisci gli elementi dell'array:");
      for (int i = 0; i < dimensione; i++) {
        array[i] = input.nextInt();
      }
      int somma = 0;
      for (int i = 0; i < dimensione; i++) {
        somma += array[i];
      }
      System.out.println("La somma degli elementi dell'array è " + somma + ".");
    } catch (InputMismatchException e) {
      System.out.println("Errore: input non valido.");
    }

    input.close();
  }
}
```

Esempio di output:
Inserisci la dimensione dell'array: 5
Inserisci gli elementi dell'array:
10
20
30
40
50
La somma degli elementi dell'array è 150