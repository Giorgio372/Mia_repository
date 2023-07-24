# GESTIONE INPUT/OUTPUT

Per gestire l'input dell'utente in console, è possibile utilizzare la classe Scanner di Java.
Questa classe consente di leggere i dati di input dalla console e di convertirli in variabili di diversi tipi

**metodi principali della classe Scanner in Java**

- next(): legge la prossima stringa dall'input.
- nextInt(): legge il prossimo intero dall'input.
- nextDouble(): legge il prossimo valore double dall'input.
- nextLine(): legge la prossima riga dall'input.
- hasNext(): ritorna true se c'è ancora input da leggere, false altrimenti.
- hasNextInt(): ritorna true se c'è ancora un intero da leggere, false altrimenti.
- hasNextDouble(): ritorna true se c'è ancora un valore double da leggere, false altrimenti.
- useDelimiter(String pattern): imposta il delimitatore di token. Il delimitatore di default è lo spazio bianco

>Esempio di utilizzo
    
```java
import java.util.Scanner; // importa la classe Scanner dal package java.util

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); // crea un oggetto Scanner che legge l'input dalla console (System.in)

    System.out.print("Inserisci il tuo nome: "); // stampa "Inserisci il tuo nome: " nella console
    String nome = input.next(); // legge la prossima stringa dall'input

    System.out.print("Inserisci la tua età: "); // stampa "Inserisci la tua età: " nella console
    int eta = input.nextInt(); // legge il prossimo intero dall'input

    System.out.println("Ciao, " + nome + "! Hai " + eta + " anni."); // stampa "Ciao, <nome>! Hai <eta> anni." nella console

    input.close(); // chiude lo Scanner (non è obbligatorio)
  }
}

```

**Ecco un esempio di utilizzo della classe Scanner per leggere un numero intero dalla console e stamparlo:**

```java
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci un numero intero: ");
        int num = input.nextInt();
        System.out.println("Il numero inserito è: " + num);
    }
}
```
>In questo esempio, prima viene creato un oggetto Scanner che legge l'input dalla console (System.in).
Successivamente, viene richiesto all'utente di inserire un numero intero tramite il messaggio stampato sulla console.
Il numero inserito viene letto dalla console tramite il metodo nextInt() dell'oggetto Scanner e assegnato alla variabile num.
Infine, viene stampato il numero inserito sulla console.

>È importante notare che il metodo nextInt() legge solo il primo intero presente nell'input dell'utente.
Se l'utente inserisce più di un intero, solo il primo verrà letto e gli altri verranno ignorati.
Inoltre, se l'utente inserisce un valore non valido per il tipo di dato richiesto (ad esempio una stringa invece di un intero),
il programma genererà un'eccezione di tipo InputMismatchException.

**Per leggere altri tipi di dati, come numeri decimali, stringhe o caratteri**

>è possibile utilizzare i metodi nextDouble(), nextLine() e next() dell'oggetto Scanner, rispettivamente. Ecco un esempio di utilizzo di questi metodi:
In questo esempio, vengono utilizzati i metodi nextDouble(), nextLine() e next() dell'oggetto Scanner per leggere un numero decimale, una stringa e un carattere, rispettivamente.
La stringa viene letta tramite il metodo nextLine() perché può contenere spazi, mentre il carattere viene letto tramite il metodo next() e successivamente convertito in un carattere tramite il metodo charAt(0)
    
```java
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci un numero decimale: ");
        double num1 = input.nextDouble();
        System.out.print("Inserisci una stringa: ");
        String str = input.nextLine(); // legge anche il carattere di a capo dopo il numero decimale
        System.out.print("Inserisci un carattere: ");
        char c = input.next().charAt(0);
        System.out.println("Il numero decimale inserito è: " + num1);
        System.out.println("La stringa inserita è: " + str);
        System.out.println("Il carattere inserito è: " + c);
    }
}
```

# esercizi specifici sull'utilizzo delle variabili

>Somma di due numeri: Scrivere un programma che chiede all'utente due numeri interi e stampa la somma dei due numeri.
In questo esempio, vengono utilizzate tre variabili: num1, num2 e sum. Le prime due variabili vengono utilizzate per memorizzare i numeri inseriti dall'utente, mentre la terza variabile viene utilizzata per memorizzare la somma dei due numeri

```java
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci il primo numero: ");
        int num1 = input.nextInt();
        System.out.print("Inserisci il secondo numero: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("La somma dei due numeri è: " + sum);
    }
}
```

>Convertitore di temperature: Scrivere un programma che chiede all'utente di inserire una temperatura in gradi Celsius e la converte in gradi Fahrenheit. La formula per la conversione è: F = C * 9/5 + 32.
In questo esempio, vengono utilizzate due variabili: celsius e fahrenheit. La prima variabile viene utilizzata per memorizzare la temperatura in gradi Celsius inserita dall'utente, mentre la seconda variabile viene utilizzata per memorizzare la temperatura convertita in gradi Fahrenheit

```java
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci la temperatura in gradi Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = celsius * 9/5 + 32;
        System.out.println("La temperatura in gradi Fahrenheit è: " + fahrenheit);
    }
}
```

>Calcolo dell'area di un rettangolo: Scrivere un programma che chiede all'utente di inserire la lunghezza e la larghezza di un rettangolo e calcola l'area del rettangolo. La formula per il calcolo dell'area è: area = lunghezza * larghezza.
In questo esempio, vengono utilizzate tre variabili: length, width e area. Le prime due variabili vengono utilizzate per memorizzare la lunghezza e la larghezza del rettangolo inserite dall'utente, mentre la terza variabile viene utilizzata per memorizzare l'area del rettangolo calcolata tramite la formula area = lunghezza * larghezza
```java
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci la lunghezza del rettangolo: ");
        double length = input.nextDouble();
        System.out.print("Inserisci la larghezza del rettangolo: ");
        double width = input.nextDouble();
        double area = length * width;
        System.out.println("L'area del rettangolo è: " + area);
    }
}
```