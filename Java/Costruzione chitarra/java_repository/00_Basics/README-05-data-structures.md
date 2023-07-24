# STRUTTURE DI DATI

In Java, le principali strutture di dati sono:

**Array**

>L'array è una collezione di elementi dello stesso tipo, che possono essere acceduti tramite un indice. L'array ha una dimensione fissa, che deve essere specificata al momento della creazione dell'array.
Use case: l'array è utile quando si deve gestire una collezione di elementi dello stesso tipo con una dimensione fissa

**ArrayList**

>L'ArrayList è una classe che implementa l'interfaccia List e rappresenta una lista ordinata di elementi. A differenza dell'array, l'ArrayList ha una dimensione dinamica e può essere espanso o ridotto a seconda delle esigenze
Use case: l'ArrayList è utile quando si deve gestire una collezione di elementi che può crescere o diminuire dinamicamente

**LinkedList**

>La LinkedList è una classe che implementa l'interfaccia List e rappresenta una lista collegata di elementi. Ogni elemento della lista è collegato al successivo attraverso un puntatore.
Use case: la LinkedList è utile quando si deve gestire una collezione di elementi che può crescere o diminuire dinamicamente e si prevede un numero elevato di operazioni di inserimento o rimozione in posizioni intermedie della lista

**Stack**

>Lo Stack è una classe che rappresenta una pila di elementi. Gli elementi vengono inseriti e rimossi dalla cima della pila.
Use case: lo Stack è utile quando si deve gestire una collezione di elementi in cui gli ultimi elementi inseriti sono i primi ad essere rimossi

**Queue**

>La Queue è una classe che rappresenta una coda di elementi. Gli elementi vengono inseriti in fondo alla coda e rimossi dalla testa della coda.
Use case: la Queue è utile quando si deve gestire una collezione di elementi in cui gli elementi vengono elaborati in ordine di arrivo

**Set**

>Il Set è un'interfaccia che rappresenta una collezione di elementi unici, senza ordinamento specifico
Use case: il Set è utile quando si deve gestire una collezione di elementi senza duplicati

**Map**

>La Map è un'interfaccia che rappresenta una mappa di coppie chiave-valore, in cui ogni chiave corrisponde a un valore
Use case: la Map è utile quando si deve gestire una collezione di elementi in cui ogni elemento ha un valore associato
In generale, la scelta della struttura di dati dipende dalla natura dei dati da gestire e dalle operazioni che si prevede di effettuare sulla collezione

È importante valutare attentamente le caratteristiche delle diverse strutture di dati per scegliere quella più adatta alle esigenze del proprio programma

# esercizi specifici su Array

>Esercizio sulla somma degli elementi
Scrivere un programma Java che legge un array di numeri interi dall'input dell'utente e calcola la somma degli elementi dell'array

Esempio di output:
Inserisci la dimensione dell'array: 5
Inserisci gli elementi dell'array:
10
20
30
40
50
La somma degli elementi dell'array è 150

```java
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.print("Inserisci la dimensione dell'array: ");
    int dimensione = input.nextInt();
    int[] array = new int[dimensione];
    System.out.println("Inserisci gli elementi dell'array:");
    for (int i = 0; i < dimensione; i++)
    {
      array[i] = input.nextInt();
    }
    int somma = 0;
    for (int i = 0; i < dimensione; i++)
    {
      somma += array[i];
    }
    System.out.println("La somma degli elementi dell'array è " + somma + ".");

    input.close();
  }
}
```

>Esercizio sulla ricerca di un elemento
Scrivere un programma Java che legge un array di numeri interi dall'input dell'utente e un numero intero da cercare nell'array. Il programma deve restituire l'indice dell'elemento se presente, altrimenti deve restituire -1

Esempio di output:
Inserisci la dimensione dell'array: 5
Inserisci gli elementi dell'array:
10
20
30
40
50
Inserisci il numero da cercare: 30
Il numero si trova all'indice 2 dell'array

```java
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.print("Inserisci la dimensione dell'array: ");
    int dimensione = input.nextInt();
    int[] array = new int[dimensione];
    System.out.println("Inserisci gli elementi dell'array:");
    for (int i = 0; i < dimensione; i++)
    {
      array[i] = input.nextInt();
    }
    System.out.print("Inserisci il numero da cercare: ");
    int numeroCercato = input.nextInt();
    int indice = -1;
    for (int i = 0; i < dimensione; i++) {
      if (array[i] == numeroCercato)
      {
        indice = i;
        break;
      }
    }
    if (indice != -1) {
      System.out.println("Il numero si trova all'indice " + indice + " dell'array.");
    } else {
      System.out.println("Il numero non è presente nell'array.");
    }

    input.close();
  }
}
```

>Esercizio sulla copia di un array
Scrivere un programma Java che legge un array di numeri interi dall'input dell'utente e crea una copia dell'array

Esempio di output:
Inserisci la dimensione dell'array: 5
Inserisci gli elementi dell'array:
10
20
30
40
50
L'array originale è: [10, 20, 30, 40, 50]
L'array copiato è: [10, 20, 30, 40, 50]
```java
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.print("Inserisci la dimensione dell'array: ");
    int dimensione = input.nextInt();
    int[] array = new int[dimensione];
    System.out.println("Inserisci gli elementi dell'array:");
    for (int i = 0; i < dimensione; i++)
    {
      array[i] = input.nextInt();
    }
    int[] arrayCopia = new int[dimensione];
    for (int i = 0; i < dimensione; i++)
    {
      arrayCopia[i] = array[i];
    }
    System.out.println("L'array originale è: " + Arrays.toString(array));
    System.out.println("L'array copiato è: " + Arrays.toString(arrayCopia));

    input.close();
  }
}
```
Questi sono solo alcuni esempi di esercizi sugli array in Java. Ci sono molte altre attività che si possono fare per esercitarsi sull'uso degli array, come la ricerca del massimo o del minimo, la rimozione di elementi duplicati, l'inversione degli elementi dell'array, e così via.
altri

# esercizi specifici su ArrayList

>Scrivere un programma Java che legge una lista di numeri interi dall'input dell'utente e calcola la somma degli elementi della lista

Esempio di output:
Inserisci gli elementi della lista (inserisci 0 per terminare l'inserimento):
10
20
30
0
La somma degli elementi della lista è 60

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    List<Integer> lista = new ArrayList<Integer>();
    System.out.println("Inserisci gli elementi della lista (inserisci 0 per terminare l'inserimento):");
    int elemento = input.nextInt();
    while (elemento != 0)
    {
      lista.add(elemento);
      elemento = input.nextInt();
    }
    int somma = 0;
    for (Integer numero : lista)
    {
      somma += numero;
    }
    System.out.println("La somma degli elementi della lista è " + somma + ".");

    input.close();
  }
}
```

>Esercizio sulla ricerca di un elemento in una lista
Scrivere un programma Java che legge una lista di stringhe dall'input dell'utente e una stringa da cercare nella lista. Il programma deve restituire l'indice dell'elemento se presente, altrimenti deve restituire -1

Esempio di output:
Inserisci gli elementi della lista (inserisci "fine" per terminare l'inserimento):
mela
banana
arancia
fragola
fine
Inserisci l'elemento da cercare: arancia
L'elemento si trova all'indice 2 della lista

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    List<String> lista = new ArrayList<String>();
    System.out.println("Inserisci gli elementi della lista (inserisci \"fine\" per terminare l'inserimento):");
    String elemento = input.nextLine();
    while (!elemento.equals("fine"))
    {
      lista.add(elemento);
      elemento = input.nextLine();
    }
    System.out.print("Inserisci l'elemento da cercare: ");
    String elementoCercato = input.nextLine();
    int indice = lista.indexOf(elementoCercato);
    if (indice != -1)
    {
      System.out.println("L'elemento si trova all'indice " + indice + " della lista.");
    } else {
      System.out.println("L'elemento non è presente nella lista.");
    }

    input.close();
  }
}
```

>Esercizio sulla creazione di una matrice
Scrivere un programma Java che legge due numeri interi dall'input dell'utente e crea una matrice di dimensioni corrispondenti ai due numeri. Il programma deve poi riempire la matrice con numeri casuali compresi tra 0 e 99 e stampare la matrice a video

Esempio di output:
Inserisci il numero di righe: 3
Inserisci il numero di colonne: 4
La matrice generata è:

  34  63  98   5
  92  55  74  63
  20  27  41  28

```java
import java.util.Random;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    Random random = new Random();

    System.out.print("Inserisci il numero di righe: ");
    int righe = input.nextInt();
    System.out.print("Inserisci il numero di colonne: ");
    int colonne = input.nextInt();
    int[][] matrice = new int[righe][colonne];
    for (int i = 0; i < righe; i++)
    {
      for (int j = 0; j < colonne; j++)
      {
        matrice[i][j] = random.nextInt(100);
      }
    }
    System.out.println("La matrice generata è:\n");
    for (int i = 0; i < righe; i++)
    {
      for (int j = 0; j < colonne; j++)
      {
        System.out.printf("%3d ", matrice[i][j]);
      }
      System.out.println();
    }

    input.close();
  }
}
```

# esercizi specifici su LinkedList

>Esercizio sulla somma degli elementi
Scrivere un programma Java che legge una LinkedList di numeri interi dall'input dell'utente e calcola la somma degli elementi della LinkedList

Esempio di output:
Inserisci gli elementi della LinkedList (inserisci 0 per terminare l'inserimento):
10
20
30
0
La somma degli elementi della LinkedList è 60

```java
import java.util.LinkedList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args
  {
    Scanner input = new Scanner(System.in);

    LinkedList<Integer> lista = new LinkedList<Integer>();
    System.out.println("Inserisci gli elementi della LinkedList (inserisci 0 per terminare l'inserimento):");
    int elemento = input.nextInt();
    while (elemento != 0)
    {
      lista.add(elemento);
      elemento = input.nextInt();
    }
    int somma = 0;
    for (Integer numero : lista)
    {
      somma += numero;
    }
    System.out.println("La somma degli elementi della LinkedList è " + somma + ".");

    input.close();
  }
}
```
>Esercizio sulla ricerca di un elemento
Scrivere un programma Java che legge una LinkedList di stringhe dall'input dell'utente e una stringa da cercare nella LinkedList. Il programma deve restituire l'indice dell'elemento se presente, altrimenti deve restituire -1

Esempio di output:
Inserisci gli elementi della LinkedList (inserisci "fine" per terminare l'inserimento):
mela
banana
arancia
fragola
fine
Inserisci l'elemento da cercare: arancia
L'elemento si trova all'indice 2 della LinkedList

```java
import java.util.LinkedList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    LinkedList<String> lista = new LinkedList<String>();
    System.out.println("Inserisci gli elementi della LinkedList (inserisci \"fine\" per terminare l'inserimento):");
    String elemento = input.nextLine();
    while (!elemento.equals("fine"))
    {
      lista.add(elemento);
      elemento = input.nextLine();
    }
    System.out.print("Inserisci l'elemento da cercare: ");
    String elementoCercato = input.nextLine();
    int indice = lista.indexOf(elementoCercato);
    if (indice != -1)
    {
      System.out.println("L'elemento si trova all'indice " + indice + " della LinkedList.");
    } else
    {
      System.out.println("L'elemento non è presente nella LinkedList.");
    }

    input.close();
  }
}
```
>Esercizio sulla rimozione di elementi
Scrivere un programma Java che legge una LinkedList di numeri interi dall'input dell'utente e rimuove tutti gli elementi pari dalla LinkedList

Esempio di output:
Inserisci gli elementi della LinkedList (inserisci 0 per terminare l'inserimento):
1
2
3
4
5
6
7
8
9
0
La LinkedList senza elementi pari è: [1, 3, 5, 7, 9]

```java
import java.util.LinkedList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    LinkedList<Integer> lista = new LinkedList<Integer>();
    System.out.println("Inserisci gli elementi della LinkedList (inserisci 0 per terminare l'inserimento):");
    int elemento = input.nextInt();
    while (elemento != 0)
    {
      lista.add(elemento);
      elemento = input.nextInt();
    }
    LinkedList<Integer> listaSenzaPari = new LinkedList<Integer>();
    for (Integer numero : lista)
    {
      if (numero % 2 != 0)
      {
        listaSenzaPari.add(numero);
      }
    }
    System.out.println("La LinkedList senza elementi pari è: " + listaSenzaPari);

    input.close();
  }
}
```

# Ecco alcuni esercizi specifici sull'uso dello Stack in Java:

>Esercizio sulla verifica di parentesi
Scrivere un programma Java che legge una stringa dall'input dell'utente e verifica se le parentesi presenti nella stringa sono bilanciate. Il programma utilizza uno Stack per implementare la verifica

Esempio di output:
Inserisci una stringa con parentesi:
((1+2)*3)
Le parentesi sono bilanciate

```java
import java.util.Scanner;
import java.util.Stack;

public class Main
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Inserisci una stringa con parentesi:");
    String espressione = input.nextLine();
    Stack<Character> stack = new Stack<Character>();
    boolean parentesiBilanciate = true;
    for (int i = 0; i < espressione.length(); i++) {
      char carattere = espressione.charAt(i);
      if (carattere == '(')
      {
        stack.push(carattere);
      } else if (carattere == ')')
      {
        if (stack.isEmpty()) {
          parentesiBilanciate = false;
          break;
        } else
        {
          stack.pop();
        }
      }
    }
    if (!stack.isEmpty())
    {
      parentesiBilanciate = false;
    }
    if (parentesiBilanciate)
    {
      System.out.println("Le parentesi sono bilanciate.");
    } else {
      System.out.println("Le parentesi non sono bilanciate.");
    }

    input.close();
  }
}
```

>Esercizio sull'inversione di una stringa
Scrivere un programma Java che legge una stringa dall'input dell'utente e stampa la stringa invertita utilizzando uno Stack

Esempio di output:
Inserisci una stringa:
ciao mondo
La stringa invertita è: odnom oaic

```java
import java.util.Scanner;
import java.util.Stack;

public class Main
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Inserisci una stringa:");
    String stringa = input.nextLine();
    Stack<Character> stack = new Stack<Character>();
    for (int i = 0; i < stringa.length(); i++)
    {
      stack.push(stringa.charAt(i));
    }
    System.out.print("La stringa invertita è: ");
    while (!stack.isEmpty())
    {
      System.out.print(stack.pop());
    }

    input.close();
  }
}
```

# esercizi specifici su Queue

>Esercizio sulla stampa degli elementi
Scrivere un programma Java che legge una Queue di stringhe dall'input dell'utente e stampa gli elementi della Queue uno per uno

Esempio di output:
Inserisci gli elementi della Queue (inserisci "fine" per terminare l'inserimento):
ciao
come
stai
?
fine
Gli elementi della Queue sono:
ciao
come
stai
?

```java
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    Queue<String> coda = new LinkedList<String>();
    System.out.println("Inserisci gli elementi della Queue (inserisci \"fine\" per terminare l'inserimento):");
    String elemento = input.nextLine();
    while (!elemento.equals("fine"))
    {
      coda.add(elemento);
      elemento = input.nextLine();
    }
    System.out.println("Gli elementi della Queue sono:");
    while (!coda.isEmpty())
    {
      System.out.println(coda.remove());
    }

    input.close();
  }
}
```
>Esercizio sulla rimozione di elementi
Scrivere un programma Java che legge una Queue di interi dall'input dell'utente e rimuove tutti gli elementi negativi

Esempio di output:
Inserisci gli elementi della Queue (inserisci 0 per terminare l'inserimento):
4
-3
2
-1
3
-2
0
La Queue senza elementi negativi è:
4
2
3

```java
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    Queue<Integer> coda = new LinkedList<Integer>();
    System.out.println("Inserisci gli elementi della Queue (inserisci 0 per terminare l'inserimento):");
    int elemento = input.nextInt();
    while (elemento != 0)
    {
      coda.add(elemento);
      elemento = input.nextInt();
    }
    Queue<Integer> codaSenzaNegativi = new LinkedList<Integer>();
    while (!coda.isEmpty())
    {
      int elementoCorrente = coda.remove();
      if (elementoCorrente >= 0)
      {
        codaSenzaNegativi.add(elementoCorrente);
      }
    }
    System.out.println("La Queue senza elementi negativi è:");
    while (!codaSenzaNegativi.isEmpty()) {
      System.out.println(codaSenzaNegativi.remove());
    }

    input.close();
  }
}
```
>Esercizio sulla gestione di una coda di clienti
Scrivere un programma Java che simula il lavoro di una banca, dove i clienti arrivano in coda e vengono serviti uno alla volta in ordine di arrivo. Il programma legge il numero di clienti e il tempo di servizio per ogni cliente e stampa il tempo totale di attesa per tutti i clienti

Esempio di output:
Inserisci il numero di clienti:
3
Inserisci il tempo di servizio per il cliente 1:
5
Inserisci il tempo di servizio per il cliente 2:
3
Inserisci il tempo di servizio per il cliente 3:
8
Il tempo totale di attesa per tutti i clienti è 16

```java
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Queue<Integer> codaClienti = new LinkedList<Integer>();
    Queue<Integer> codaTempoServizio = new LinkedList<Integer>();
    System.out.println("Inserisci il numero di clienti:");
    int numeroClienti = input.nextInt();
    for (int i = 1; i <= numeroClienti; i++) {
      System.out.println("Inserisci il tempo di servizio per il cliente " + i + ":");
      int tempoServizio = input.nextInt();
      codaClienti.add(i);
      codaTempoServizio.add(tempoServizio);
    }
    int tempoTotale = 0;
    int tempoTrascorso = 0;
    while (!codaClienti.isEmpty()) {
      int clienteCorrente = codaClienti.remove();
      int tempoServizioCorrente = codaTempoServizio.remove();
      tempoTotale += tempoTrascorso + tempoServizioCorrente;
      tempoTrascorso += tempoServizioCorrente;
    }
    System.out.println("Il tempo totale di attesa per tutti i clienti è " + tempoTotale + ".");

    input.close();
  }
}
```

# esercizi specifici su Set

>Esercizio sull'eliminazione dei duplicati
Scrivere un programma Java che legge una lista di interi dall'input dell'utente e crea un Set contenente gli interi senza duplicati. Stampare il Set risultante

Esempio di output:
Inserisci gli interi separati da uno spazio:
1 2 2 3 4 4 4 5
Il Set senza duplicati è:
1 2 3 4 5

```java
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Set<Integer> setNumeri = new HashSet<Integer>();
    System.out.println("Inserisci gli interi separati da uno spazio:");
    String[] numeri = input.nextLine().split(" ");
    for (String numero : numeri) {
      setNumeri.add(Integer.parseInt(numero));
    }
    System.out.println("Il Set senza duplicati è:");
    for (int numero : setNumeri) {
      System.out.print(numero + " ");
    }

    input.close();
  }
}
```
>Esercizio sull'unione di due Set
Scrivere un programma Java che crea due Set di stringhe dall'input dell'utente, li unisce e stampa il Set risultante

Esempio di output:
Inserisci gli elementi del primo Set (inserisci "fine" per terminare l'inserimento):
ciao
come
stai
?
fine
Inserisci gli elementi del secondo Set (inserisci "fine" per terminare l'inserimento):
bene
grazie
e
tu
fine
L'unione dei due Set è:
bene
ciao
come
e
grazie
stai
tu
?
```java
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Set<String> setPrimo = new HashSet<String>();
    System.out.println("Inserisci gli elementi del primo Set (inserisci \"fine\" per terminare l'inserimento):");
    String elemento = input.nextLine();
    while (!elemento.equals("fine")) {
      setPrimo.add(elemento);
      elemento = input.nextLine();
    }
    Set<String> setSecondo = new HashSet<String>();
    System.out.println("Inserisci gli elementi del secondo Set (inserisci \"fine\" per terminare l'inserimento):");
    elemento = input.nextLine();
    while (!elemento.equals("fine")) {
      setSecondo.add(elemento);
      elemento = input.nextLine();
    }
    Set<String> setUnione = new HashSet<String>();
    setUnione.addAll(setPrimo);
    setUnione.addAll(setSecondo);
    System.out.println("L'unione dei due Set è:");
    for (String elementoCorrente : setUnione) {
      System.out.println(elementoCorrente);
    }

    input.close();
  }
}
```
>Esercizio sul calcolo dell'intersezione di due Set
Scrivere un programma Java che crea due Set di interi dall'input dell'utente, calcola l'intersezione dei due Set e stampa il Set risultante

Esempio di output:
Inserisci gli elementi del primo Set (inserisci 0 per terminare l'inserimento):
2
3
5
7
0
Inserisci gli elementi del secondo Set (inserisci 0 per terminare l'inserimento):
1
3
5
7
0
L'intersezione dei due Set è:
3
5
7
```java
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Set<Integer> setPrimo = new HashSet<Integer>();
    System.out.println("Inserisci gli elementi del primo Set (inserisci 0 per terminare l'inserimento):");
    int elemento = input.nextInt();
    while (elemento != 0) {
      setPrimo.add(elemento);
      elemento = input.nextInt();
    }
    Set<Integer> setSecondo = new HashSet<Integer>();
    System.out.println("Inserisci gli elementi del secondo Set (inserisci 0 per terminare l'inserimento):");
    elemento = input.nextInt();
    while (elemento != 0) {
      setSecondo.add(elemento);
      elemento = input.nextInt();
    }
    Set<Integer> setIntersezione = new HashSet<Integer>(setPrimo);
    setIntersezione.retainAll(setSecondo);
    System.out.println("L'intersezione dei due Set è:");
    for (int elementoCorrente : setIntersezione) {
      System.out.println(elementoCorrente);
    }

    input.close();
  }
}
```

# esercizi specifici su Map

>Esercizio sulla ricerca di parole in un testo
Scrivere un programma Java che legge un testo dall'input dell'utente e conta quante volte ogni parola compare nel testo. Stampare la lista delle parole e il loro conteggio

Esempio di output:
Inserisci il testo:
La mia casa è grande e la tua casa è piccola, ma la tua casa è molto accogliente.
La lista delle parole e il loro conteggio è:
accogliente: 1
casa: 3
grande: 1
la: 2
ma: 1
mia: 1
molto: 1
piccola,: 1
tua: 2
è: 2
```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Map<String, Integer> mappaParole = new HashMap<String, Integer>();
    System.out.println("Inserisci il testo:");
    String testo = input.nextLine();
    String[] parole = testo.split(" ");
    for (String parola : parole) {
      if (mappaParole.containsKey(parola)) {
        mappaParole.put(parola, mappaParole.get(parola) + 1);
      } else {
        mappaParole.put(parola, 1);
      }
    }
    System.out.println("La lista delle parole e il loro conteggio è:");
    for (Map.Entry<String, Integer> entry : mappaParole.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }

    input.close();
  }
}
```
>Esercizio sul calcolo del punteggio di un gioco
Scrivere un programma Java che legge il punteggio di un gioco dall'input dell'utente e assegna un valore a ogni punteggio in base a una tabella di conversione. Stampare il punteggio totale

Esempio di output:
Inserisci il punteggio:
350
Il punteggio totale è: 7

```java
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Corrisp {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Map<Integer, Integer> tabellaConversione = new LinkedHashMap<Integer, Integer>();
    tabellaConversione.put(0, 0);
    tabellaConversione.put(50, 5);
    tabellaConversione.put(100, 10);
    tabellaConversione.put(150, 15);
    tabellaConversione.put(200, 20);
    tabellaConversione.put(250, 25);
    tabellaConversione.put(300, 30);
    tabellaConversione.put(350, 35);
    tabellaConversione.put(400, 40);
    tabellaConversione.put(450, 45);
    tabellaConversione.put(500, 50);
    System.out.println("Inserisci il punteggio:");
    int punteggio = input.nextInt();
    int punteggioTotale = 0;
    for (Map.Entry<Integer, Integer> entry : tabellaConversione.entrySet()) {
    if (punteggio >= entry.getKey()) {
        punteggioTotale = entry.getValue();
        System.out.println(entry);
    }
    else
    {
        break;
    }
    }
    System.out.println("Il punteggio totale �: " + punteggioTotale);
    
    input.close();
}
}
```
>Esercizio sulla gestione di un registro di voti
Scrivere un programma Java che legge il nome e il voto di ogni studente dall'input dell'utente e li inserisce in una mappa con il nome come chiave e il voto come valore. Stampare la media dei voti

Esempio di output:
Quanti studenti vuoi registrare?
3
Inserisci il nome dello studente n. 1:
Mario Rossi
Inserisci il voto di Mario Rossi:
7
Inserisci il nome dello studente n. 2:
Luigi Verdi
Inserisci il voto di Luigi Verdi:
8
Inserisci il nome dello studente n. 3:
Anna Bianchi
Inserisci il voto di Anna Bianchi:
9
La media dei voti è: 8.0

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Map<String, Integer> registroVoti = new HashMap<String, Integer>();
    System.out.println("Quanti studenti vuoi registrare?");
    int numStudenti = input.nextInt();
    input.nextLine();
    for (int i = 1; i <= numStudenti; i++) {
      System.out.println("Inserisci il nome dello studente n. " + i + ":");
      String nome = input.nextLine();
      System.out.println("Inserisci il voto di " + nome + ":");
      int voto = input.nextInt();
      input.nextLine();
      registroVoti.put(nome, voto);
    }
    double sommaVoti = 0.0;
    for (int voto : registroVoti.values()) {
      sommaVoti += voto;
    }
    double media = sommaVoti / registroVoti.size();
    System.out.println("La media dei voti è: " + media);

    input.close();
  }
}
```

>In Java, ci sono diverse strutture dati disponibili, ognuna delle quali ha le proprie caratteristiche, vantaggi e svantaggi

Array
>Un array è una collezione di elementi dello stesso tipo. Gli elementi sono memorizzati in una sequenza contigua di posizioni di memoria, con accesso tramite un indice numerico
L'array è utile quando è necessario accedere agli elementi in modo casuale e quando il numero degli elementi non cambia frequentemente. L'uso di un array è consigliato quando si devono gestire grandi quantità di dati e la memoria è limitata

ArrayList
>L'ArrayList è una classe che implementa l'interfaccia List. Al contrario dell'array, l'ArrayList può essere ridimensionato dinamicamente. L'ArrayList è utile quando si devono gestire collezioni di oggetti la cui dimensione può variare.
L'ArrayList è più flessibile dell'array, ma richiede più memoria in quanto ogni elemento dell'ArrayList è un oggetto che contiene il valore dell'elemento e altri metadati.

LinkedList
>La LinkedList è una classe che implementa l'interfaccia List. A differenza dell'ArrayList, gli elementi della LinkedList sono memorizzati in nodi collegati tra loro. Ogni nodo contiene un valore e un riferimento al nodo successivo.
La LinkedList è utile quando si devono effettuare molte operazioni di inserimento o rimozione di elementi, in quanto queste operazioni sono efficienti. Tuttavia, l'accesso casuale agli elementi è meno efficiente rispetto all'ArrayList, in quanto è necessario scorrere la lista per trovare l'elemento desiderato.

HashSet
>L'HashSet è una classe che implementa l'interfaccia Set. Gli elementi dell'HashSet non sono ordinati e non possono contenere elementi duplicati. L'HashSet è utile quando è necessario verificare rapidamente se un elemento è presente nella collezione.
L'HashSet è meno efficiente dell'ArrayList o dell'LinkedList quando si devono effettuare operazioni di accesso casuale agli elementi.

HashMap
>L'HashMap è una classe che implementa l'interfaccia Map. L'HashMap associa una chiave a un valore. Le chiavi sono univoche e i valori possono essere duplicati. L'HashMap è utile quando si deve associare un valore a una chiave e quando è necessario accedere alle coppie chiave-valore in modo efficiente.
L'HashMap è meno efficiente dell'ArrayList o dell'LinkedList quando si devono effettuare operazioni di accesso casuale agli elementi