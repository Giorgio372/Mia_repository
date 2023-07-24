# I CONTROLLI DI FLUSSO

I controlli di flusso sono costrutti di programmazione che permettono di gestire l'esecuzione del codice in base a determinate condizioni. In Java, i controlli di flusso più comuni sono:
- i cicli (for, while, do-while)
- i costrutti di selezione (if-else, switch)
- i costrutti di controllo (break, continue). Vediamo ora con particolare enfasi l'utilizzo e i use case di ciascuno di essi.

**Cicli**

I cicli sono utilizzati quando si vuole ripetere un blocco di codice più volte. Esistono tre tipi di cicli in Java:

>Il ciclo for viene utilizzato quando si conosce il numero di iterazioni da eseguire

Il ciclo for è composto da tre parti: l'inizializzazione, la condizione di continuazione e l'aggiornamento
La parte di inizializzazione viene eseguita una sola volta all'inizio del ciclo.
La condizione di continuazione viene valutata all'inizio di ogni iterazione del ciclo.
L'aggiornamento viene eseguito alla fine di ogni iterazione del ciclo.

>Il ciclo while viene utilizzato quando si vuole ripetere un blocco di codice finché una determinata condizione è vera

La condizione viene valutata all'inizio di ogni iterazione del ciclo
Il ciclo do-while è simile al ciclo while, ma la condizione viene valutata alla fine di ogni iterazione del ciclo.
Ciò significa che il blocco di codice viene eseguito almeno una volta, anche se la condizione è falsa.

**Costrutti**

I costrutti di selezione vengono utilizzati per eseguire un blocco di codice diverso in base al valore di una determinata variabile.
Esistono due tipi di costrutti di selezione in Java:

>Il costrutto if-else viene utilizzato per eseguire un blocco di codice se una determinata condizione è vera, e un altro blocco di codice se la condizione è falsa

>Il costrutto switch viene utilizzato per eseguire un blocco di codice diverso in base al valore di una variabile.

**Costrutti di controllo**

I costrutti di controllo vengono utilizzati per gestire l'esecuzione del codice in modo diverso da quello previsto dal normale flusso di esecuzione.
Esistono due tipi di costrutti di controllo in Java:

>Il costrutto break viene utilizzato per interrompere l'esecuzione di un ciclo prematuramente, senza completare tutte le iterazioni.

>Il costrutto continue viene utilizzato per saltare l'iterazione corrente del ciclo e continuare con la successiva.

In generale, i controlli di flusso sono utilizzati per gestire situazioni in cui il flusso di esecuzione del codice può divergere dal normale percorso previsto. Ad esempio, i cicli possono essere utilizzati per eseguire un blocco di codice più volte, come nel caso di una procedura di calcolo iterativo. I costrutti di selezione possono essere utilizzati per eseguire un blocco di codice diverso in base al valore di una determinata variabile, come nel caso di una procedura di scelta. Infine, i costrutti di controllo possono essere utilizzati per interrompere o saltare l'esecuzione di un ciclo in modo anomalo, come nel caso di una procedura di gestione di errori o eccezioni.

# quando è meglio scegliere uno o l'altro

>Cicli
Il ciclo for viene utilizzato quando si conosce il numero di iterazioni da eseguire. Ad esempio, quando si deve eseguire un'operazione su tutti gli elementi di un array o di una lista
Il ciclo while viene utilizzato quando si ripete un'operazione finché una determinata condizione è vera, come ad esempio quando si leggono dati da un file o da una connessione di rete
Il ciclo do-while viene utilizzato quando si vuole eseguire un blocco di codice almeno una volta, come ad esempio quando si deve chiedere all'utente di inserire un valore finché non viene inserito un valore valido

>Costrutti di selezione
Il costrutto if-else viene utilizzato quando si vuole eseguire un blocco di codice se una determinata condizione è vera, e un altro blocco di codice se la condizione è falsa. Ad esempio, quando si deve controllare se un utente ha inserito un valore corretto in un form
Il costrutto switch viene utilizzato quando si vuole eseguire un blocco di codice diverso in base al valore di una variabile. Ad esempio, quando si deve selezionare un'operazione da eseguire in base all'input dell'utente

>Costrutti di controllo
Il costrutto break viene utilizzato quando si vuole interrompere l'esecuzione di un ciclo prematuramente, senza completare tutte le iterazioni. Ad esempio, quando si cerca un elemento in un array e si vuole uscire dal ciclo quando l'elemento viene trovato
Il costrutto continue viene utilizzato quando si vuole saltare l'iterazione corrente del ciclo e continuare con la successiva. Ad esempio, quando si deve saltare l'iterazione corrente se un determinato valore è presente in un array

>In generale, la scelta del controllo di flusso da utilizzare dipende dalle specifiche esigenze dell'applicazione e dal tipo di operazione che si deve eseguire. Ad esempio, se si deve eseguire un'operazione su tutti gli elementi di un array o di una lista, il ciclo for è la scelta migliore. Se si deve eseguire un'operazione finché una determinata condizione è vera, il ciclo while è la scelta migliore. Se si deve eseguire un blocco di codice almeno una volta, il ciclo do-while è la scelta migliore. Se si deve eseguire un blocco di codice diverso in base al valore di una variabile, il costrutto switch è la scelta migliore. Infine, se si deve interrompere o saltare l'esecuzione di un ciclo in modo anomalo, i costrutti break e continue sono la scelta migliore.

# esercizi specifici sul ciclo if

>Verifica se un numero è positivo o negativo: Scrivere un programma che chiede all'utente di inserire un numero intero e verifica se il numero è positivo o negativo
In questo esempio, viene utilizzato il costrutto if-else per verificare se il numero inserito dall'utente è positivo, negativo o zero. Se il numero è maggiore di zero, viene stampato il messaggio "Il numero inserito è positivo". Se il numero è minore di zero, viene stampato il messaggio "Il numero inserito è negativo". Se il numero è uguale a zero, viene stampato il messaggio "Il numero inserito è zero".

```java
import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci un numero intero: ");
        int num = input.nextInt();
        if (num > 0) {
            System.out.println("Il numero inserito è positivo");
        } else if (num < 0) {
            System.out.println("Il numero inserito è negativo");
        } else {
            System.out.println("Il numero inserito è zero");
        }
    }
}
```
>Verifica se un numero è pari o dispari: Scrivere un programma che chiede all'utente di inserire un numero intero e verifica se il numero è pari o dispari
In questo esempio, viene utilizzato l'operatore modulo % per verificare se il numero inserito dall'utente è pari o dispari. Se il resto della divisione del numero per 2 è uguale a zero, viene stampato il messaggio "Il numero inserito è pari". Altrimenti, viene stampato il messaggio "Il numero inserito è dispari".
    
```java
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci un numero intero: ");
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("Il numero inserito è pari");
        } else {
            System.out.println("Il numero inserito è dispari");
        }
    }
}
```

> Verifica se un anno è bisestile: Scrivere un programma che chiede all'utente di inserire un anno e verifica se l'anno è bisestile. Un anno è bisestile se è divisibile per 4, ma non è divisibile per 100. Tuttavia, se un anno è divisibile per 400, allora è bisestile.
In questo esempio, viene utilizzato il costrutto if-else e l'operatore logico || per verificare se l'anno inserito dall'utente è bisestile. Se l'anno è divisibile per 4 e non è divisibile per 100, oppure se l'anno è divisibile per 400, allora viene stampato il messaggio "L'anno inserito è bisestile". Altrimenti, viene stampato il messaggio "L'anno inserito non è bisestile"
        
```java
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci un anno: ");
        int year = input.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("L'anno inserito è bisestile");
        } else {
            System.out.println("L'anno inserito non è bisestile");
        }
    }
}
```

# esercizi specifici sul ciclo for

>Stampa dei numeri da 1 a 10: Scrivere un programma che stampa i numeri da 1 a 10 utilizzando un ciclo for
In questo esempio, viene utilizzato un ciclo for per stampare i numeri da 1 a 10. La variabile i viene inizializzata a 1, la condizione di continuazione del ciclo è i <= 10, e l'incremento della variabile i è di 1 ad ogni iterazione. All'interno del ciclo, viene utilizzato il metodo println per stampare il valore della variabile i.

```java
public class PrintNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
```

>Calcolo della somma dei primi N numeri interi: Scrivere un programma che chiede all'utente di inserire un numero intero N e calcola la somma dei primi N numeri interi utilizzando un ciclo for.
In questo esempio, viene utilizzato un ciclo for per calcolare la somma dei primi N numeri interi inseriti dall'utente. La variabile sum viene inizializzata a 0, e ad ogni iterazione del ciclo viene sommato il valore della variabile i alla variabile sum. La variabile i viene inizializzata a 1, la condizione di continuazione del ciclo è i <= n, e l'incremento della variabile i è di 1 ad ogni iterazione. Infine, viene utilizzato il metodo println per stampare il risultato del calcolo
    
```java
import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci un numero intero: ");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("La somma dei primi " + n + " numeri interi è: " + sum);
    }
}
```

>Stampa di una tabella di moltiplicazione: Scrivere un programma che stampa la tabella di moltiplicazione di un numero N da 1 a 10 utilizzando un ciclo for
In questo esempio, viene utilizzato un ciclo for per stampare la tabella di moltiplicazione di un numero N da 1 a 10. La variabile i viene inizializzata a 1, la condizione di continuazione del ciclo è i <= 10, e l'incremento della variabile i è di 1 ad ogni iterazione. All'interno del ciclo, viene utilizzato il metodo println per stampare la moltiplicazione tra il numero N e la variabile i
    
```java
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci un numero intero: ");
        int n = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}
```

# esercizi specifici sul foreach

>Stampa degli elementi di un array: Scrivere un programma che stampa gli elementi di un array utilizzando un ciclo foreach.
In questo esempio, viene utilizzato un ciclo foreach per stampare gli elementi dell'array numbers. La variabile num assume il valore di ogni elemento dell'array ad ogni iterazione del ciclo, e viene utilizzata per stampare il valore dell'elemento utilizzando il metodo println

```java
public class PrintArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
```

>Calcolo della somma degli elementi di un array: Scrivere un programma che calcola la somma degli elementi di un array di numeri interi utilizzando un ciclo foreach
In questo esempio, viene utilizzato un ciclo foreach per calcolare la somma degli elementi dell'array numbers. La variabile num assume il valore di ogni elemento dell'array ad ogni iterazione del ciclo, e viene utilizzata per sommare il valore dell'elemento alla variabile sum. Infine, viene utilizzato il metodo println per stampare il risultato del calcolo
    
```java
public class SumArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("La somma degli elementi dell'array è: " + sum);
    }
}
```

>Stampa degli elementi di una lista: Scrivere un programma che stampa gli elementi di una lista di stringhe utilizzando un ciclo foreach.
In questo esempio, viene utilizzato un ciclo foreach per stampare gli elementi della lista di stringhe fruits. La variabile fruit assume il valore di ogni elemento della lista ad ogni iterazione del ciclo, e viene utilizzata per stampare il valore dell'elemento utilizzando il metodo println

```java
import java.util.ArrayList;
import java.util.List;

public class PrintList {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<String>();
        fruits.add("Mela");
        fruits.add("Banana");
        fruits.add("Arancia");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
```

# altri cicli

>Ciclo while: Il ciclo while viene utilizzato quando si vuole ripetere un blocco di codice finché una determinata condizione è vera. La condizione viene valutata all'inizio di ogni iterazione del ciclo.
In questo esempio, viene utilizzato un ciclo while per stampare i numeri da 1 a 10. La variabile i viene inizializzata a 1, e la condizione di continuazione del ciclo è i <= 10. All'interno del ciclo, viene utilizzato il metodo println per stampare il valore della variabile i, e viene incrementata di 1 ad ogni iterazione
        
```java
public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }
}
```

>Ciclo do-while: Il ciclo do-while è simile al ciclo while, ma la condizione viene valutata alla fine di ogni iterazione del ciclo. Ciò significa che il blocco di codice viene eseguito almeno una volta, anche se la condizione è falsa.
In questo esempio, viene utilizzato un ciclo do-while per chiedere all'utente di inserire un numero finché non inserisce 0. Il blocco di codice viene eseguito almeno una volta, anche se l'utente inserisce 0 alla prima iterazione. La variabile num assume il valore del numero inserito dall'utente ad ogni iterazione del ciclo, e viene utilizzata per stampare il valore utilizzando il metodo println

```java
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        do {
            System.out.print("Inserisci un numero (inserisci 0 per uscire): ");
            num = input.nextInt();
            System.out.println("Hai inserito: " + num);
        } while (num != 0);
    }
}
```

>Ciclo for-each con array multidimensionali: Il ciclo for-each può essere utilizzato anche con array multidimensionali. In questo caso, il ciclo viene annidato all'interno di un altro ciclo per scandire tutti gli elementi dell'array.
In questo esempio, viene utilizzato un ciclo for-each per stampare gli elementi di un array bidimensionale matrix. Il primo ciclo for-each scorre le righe dell'array, e il secondo ciclo for-each scorre gli elementi di ogni riga. Il metodo print viene utilizzato per stampare il valore di ogni elemento, mentre il metodo println viene utilizzato per passare alla riga successiva dopo aver stampato tutti gli elementi della riga corrente.

```java
public class MultiArray {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
```

>Ciclo break: Il ciclo break viene utilizzato per interrompere l'esecuzione di un ciclo prematuramente, senza completare tutte le iterazioni
In questo esempio, viene utilizzato un ciclo for per stampare i numeri da 1 a 10, ma il ciclo viene interrotto quando la variabile i assume il valore 5 grazie all'uso del costrutto if e break

```java
public class BreakLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}
```

>Ciclo continue: Il ciclo continue viene utilizzato per saltare l'iterazione corrente del ciclo e continuare con la successiva.
In questo esempio, viene utilizzato un ciclo for per stampare i numeri dispari da 1 a 10 utilizzando il costrutto if e continue. Quando la variabile i assume un valore pari, l'iterazione corrente viene saltata e si passa alla successiva

```java
public class ContinueLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
```

>Costrutto switch: Il costrutto switch viene utilizzato per eseguire un blocco di codice diverso in base al valore di una variabile

```java
import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci un numero da 1 a 3: ");
        int num = input.nextInt();
        switch (num) {
            case 1:
                System.out.println("Hai inserito 1");
                break;
            case 2:
                System.out.println("Hai inserito 2");
                break;
            case 3:
                System.out.println("Hai inserito 3");
                break;
            default:
                System.out.println("Il numero inserito non è valido");
                break;
        }
    }
}
```
>In questo esempio, viene utilizzato il costrutto switch per stampare un messaggio diverso in base al valore della variabile num. Se num è uguale a 1, viene stampato il messaggio "Hai inserito 1"; se num è uguale a 2, viene stampato il messaggio "Hai inserito 2"; se num è uguale a 3, viene stampato il messaggio "Hai inserito 3". Se num non corrisponde a nessuno di questi valori, viene stampato il messaggio "Il numero inserito non è valido". L'istruzione break viene utilizzata per uscire dal costrutto switch dopo aver eseguito il blocco di codice corrispondente al valore della variabile num
