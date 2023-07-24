# LETTURA DEL CODICE

## Introduzione

Prima di iniziare a scrivere codice, è importante capire come funziona il codice scritto da altri. Questo è particolarmente importante quando si lavora in un team di sviluppo, dove è necessario capire il codice scritto da altri per poterlo modificare e migliorare

## Obiettivi

-   Capire come funziona il codice scritto da altri

## Sintassi di base di Java

Argomenti

- 1. la Console di Visual Studio Code
- 2. i commenti
- 3. i tipi di dati
- 4. le variabili
- 5. le costanti
- 6. gli operatori 
- 7. le conditioni 
- 8. i cicli di iterazione
- 9. le funzioni e i metodi
- 10. le classi e gli oggetti
- 11. i namespaces e i moduli

## i commenti

**i commenti sono utili per spiegare il codice**
i commenti su una sola riga si scrivono con //
i commenti su più righe si scrivono con /* e */

è possibile trovare altre informazioni su commenti su
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/comments.html


## la Console di Visual Studio Code

per interagire con la console si usano i metodi della classe System

i metodi di System:

```java
System.out.println("ciao"); // stampa "ciao" nella console e va a capo
System.in.read(); // legge un carattere dalla console e lo restituisce
System.out.flush(); // svuota il buffer della console e stampa tutto quello che è stato scritto
```

è possibile trovare altri metodi di System su
https://docs.oracle.com/javase/8/docs/api/java/lang/System.html

## le istruzioni

 **le istruzioni sono dei comandi che vengono eseguiti**

le istruzioni si scrivono in ordine, una per riga e terminano con;

```java
a = a + 1; // assegna alla variabile a il valore di a + 1
```
è possibile trovare altre informazioni su istruzioni su
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/expressions.html

## le variabili e le costanti

 **le variabili sono dei contenitori che possono contenere un valore**

le variabili si dichiarano con il tipo di dato seguito dal nome della variabile
le variabili si inizializzano con il tipo di dato seguito dal nome della variabile e il valore da assegnare
le variabili possono essere dichiarate e inizializzate in un'unica riga

```java
int a = 1; // dichiara una variabile di tipo int con nome a e valore 1
```

è possibile trovare altre informazioni su variabili su
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html


**le costanti sono simili alle variabili, ma non possono essere modificate**
le costanti si dichiarano con il tipo di dato seguito da final e dal nome della costante
le costanti si inizializzano con il tipo di dato seguito da final e dal nome della costante e il valore da assegnare
le costanti possono essere dichiarate e inizializzate in un'unica riga

esempio di costante dichiarata e inizializzata in un'unica riga
```java
final int a = 1; // dichiara una costante di tipo int con nome a e valore 1
```
è possibile trovare altre informazioni su costanti su
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html

## i tipi di dati

i principali tipi di dati semplici

numeri interi (int)
```java
int a = 1; // dichiara una variabile di tipo int con nome a e valore 1
int b = 2; // dichiara una variabile di tipo int con nome b e valore 2
int c = a + b; // dichiara una variabile di tipo int con nome c e valore a + b
```
numeri decimali (double)
```java
double d = 1.5; // dichiara una variabile di tipo double con nome d e valore 1.5
double e = 2.5; // dichiara una variabile di tipo double con nome e e valore 2.5
double f = d + e; // dichiara una variabile di tipo double con nome f e valore d + e
```
stringhe (string)
```java
string s = "Hello"; // dichiara una variabile di tipo string con nome s e valore "Hello"
string u = s + " " + t; // dichiara una variabile di tipo string con nome u e valore s + " " + t
```
booleani (bool)
```java
bool v = true; // dichiara una variabile di tipo bool con nome v e valore true
bool w = false; // dichiara una variabile di tipo bool con nome w e valore false
```
## le principali strutture dati:

array di numeri interi
```java
int[] y = new int[3]; // dichiara un array di numeri interi con nome x e dimensione 3
```
scegliere i valori dell'array

```java
int[] y = { 1, 2, 3 }; // dichiara un array di numeri interi con nome x e dimensione 3 e assegna i valori 1, 2, 3
```
```java
// dichiara un array di numeri interi con nome x e dimensione 3
int[] y = new int[3]; // int è il tipo di dato, [] indica che è un array, new indica che è un nuovo oggetto, 3 è la dimensione dell'array
y[0] = 1; // assegna il valore 1 alla prima posizione dell'array
y[1] = 2; // assegna il valore 2 alla seconda posizione dell'array
y[2] = 3; // assegna il valore 3 alla terza posizione dell'array
```
array di stringhe

```java
string[] z = new string[3]; // dichiara un array di stringhe con nome z e dimensione 3
z[0] = "ciao"; // assegna il valore "ciao" alla prima posizione dell'array
z[1] = "!"; // assegna il valore "!" alla seconda posizione dell'array
z[2] = "!"; // assegna il valore "!" alla terza posizione dell'array
```
liste di stringhe

```java
List<string> bb = new List<string>(); // dichiara una lista di stringhe con nome bb
bb.Add("ciao"); // aggiunge il valore "ciao" alla lista bb
bb.Add("!"); // aggiunge il valore "!" alla lista bb
```

è possibile trovare altre informazioni su dati su
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

## gli operatori

**gli operatori sono simboli che permettono di eseguire delle operazioni**

gli operatori aritmetici sono: + - * / % (somma, sottrazione, moltiplicazione, divisione, resto)
esempio di operatore aritmetico

```java
int a = 1; // dichiara una variabile di tipo int con nome a e valore 1
int b = 2; // dichiara una variabile di tipo int con nome b e valore 2
int c = a + b; // dichiara una variabile di tipo int con nome c e valore a + b
```

gli operatori di confronto sono:

    == != > < >= <= (uguale, diverso, maggiore, minore, maggiore o uguale, minore o uguale)
    == è un operatore di confronto che significa "uguale"
    != è un operatore di confronto che significa "diverso"
    > è un operatore di confronto che significa "maggiore"
    < è un operatore di confronto che significa "minore"
    >= è un operatore di confronto che significa "maggiore o uguale"

esempio di operatore di confronto

```java
int a = 1; // dichiara una variabile di tipo int con nome a e valore 1
int b = 2; // dichiara una variabile di tipo int con nome b e valore 2
boolean c = a == b; // dichiara una variabile di tipo bool con nome c e valore a == b
```

gli operatori logici sono: && || ! (e, o, non)

esempio di operatore logico

```java
boolean a = true; // dichiara una variabile di tipo bool con nome a e valore true
boolean b = false; // dichiara una variabile di tipo bool con nome b e valore false
boolean c = a && b; // dichiara una variabile di tipo bool con nome c e valore a && b
```

|| è un operatore logico che significa "o"&& è un operatore logico che significa "e"! è un operatore logico che significa "non"
gli operatori logici hanno precedenza su quelli aritmeticiesempio di operatore logico con precedenza su operatore aritmetico

```java
int a = 1; // dichiara una variabile di tipo int con nome a e valore 1
int b = 2; // dichiara una variabile di tipo int con nome b e valore 2
boolean c = a == 1 && b == 2; // dichiara una variabile di tipo bool con nome c e valore a == 1 && b == 2
```

è possibile trovare altre informazioni su operatori su
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html

## le condizioni

**le conditioni sono composte da istruzioni di controllo**

le istruzioni di controllo sono dei comandi che permettono di eseguire delle operazioni in base a delle condizioni

i controlli di flusso

if (se)

```java
if (a == 1) // se a è uguale a 1
{
	System.out.println("a è uguale a 1"); // stampa a è uguale a 1
}
```

if-else (se no)

```java
if (a == 1) // se a è uguale a 1
{
	System.out.println("a è uguale a 1"); // stampa a è uguale a 1
}
else // se no
{
	System.out.println("a non è uguale a 1"); // stampa a non è uguale a 1
}
```

if-else if-else (se no se no)

```java
if (a == 1) // se a è uguale a 1
{
	System.out.println("a è uguale a 1"); // stampa a è uguale a 1
}
else if (a == 2) // se no se a è uguale a 2
{
	System.out.println("a è uguale a 2"); // stampa a è uguale a 2
}
else // se no
{
	System.out.println("a non è uguale a 1 e a 2"); // stampa a non è uguale a 1 e a 2
}
```

switch (seleziona)

```java
switch (a) // seleziona a
{
	case 1: // se a è uguale a 1
		System.out.println("a è uguale a 1"); // stampa a è uguale a 1
		break; // interrompe il codice
	case 2: // se a è uguale a 2
		System.out.println("a è uguale a 2"); // stampa a è uguale a 2
		break; // interrompe il codice
	default: // se no
		System.out.println("a non è uguale a 1 e a 2"); // stampa a non è uguale a 1 e a 2
		break; // interrompe il codice
}
```

while (mentre)

```java
while (a < 10) // mentre a è minore di 10
{
	System.out.println(a); // stampa a
	a++; // incrementa a di 1
}
```
do-while (fai mentre)
    
```java
do
{
	System.out.println(a);
	a++;
} while (a < 10);

```

la differenza fra while e do-while è che il primo viene eseguito almeno una voltamentre il secondo viene eseguito almeno una volta e poi viene eseguito fino a quando la condizione è vera

for (per)

```java
for (int i = 0; i < 10; i++)
{
	System.out.println(i);
}
```

foreach (per ogni)

```java
for (int i : y)
{
	System.out.println(i);
}
```

è possibile trovare altre informazioni su controlli di flusso su
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html

## i metodi

**i metodi sono le funzioni delle classi si utilizzano per eseguire delle azioni e ritornano un valore**

i metodi si chiamano con il nome del metodo seguito dai parametri tra parentesi tondei metodi possono avere parametri di input e parametri di outputi parametri di input sono quelli che vengono passati al metodoi parametri di output sono quelli che il metodo ritorna

```java
public class Program
{
	public static int Sum(int a, int b)
	{
		return a + b;
	}

}
```

è possibile trovare altre informazioni su metodi su
https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html

## le classi

**le classi sono dei contenitori che contengono metodi, variabili e costanti**

le classi si dichiarano con il tipo di accesso seguito da class e dal nome della classele classi si inizializzano con il tipo di accesso seguito da class e dal nome della classele classi possono essere dichiarate e inizializzate in un'unica riga

```java
public class Program
{

}
```

i tipi di accesso sono: public, private, protected, default

public: il tipo di accesso public permette di accedere al contenuto da qualsiasi parte del programma
private: il tipo di accesso private permette di accedere al contenuto solo all'interno della classe
protected: permette di accedere al contenuto solo all'interno della classe e delle classi che ereditano dalla classe
default: il tipo di accesso default permette di accedere al contenuto solo all'interno del package

è possibile trovare altre informazioni su classi su
https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html

## gli oggetti

**gli oggetti sono delle istanze delle classi**

gli oggetti si dichiarano con il tipo di accesso seguito dal nome della classe e dal nome dell'oggettogli oggetti si inizializzano con il tipo di accesso seguito dal nome della classe e dal nome dell'oggettogli oggetti possono essere dichiarati e inizializzati in un'unica riga

esempio di oggetto randon

Random random = new Random();

Random è una classe che permette di generare numeri casualirandom è un oggetto di tipo Randomnew è un operatore che permette di creare un oggettonew Random() è un'espressione che permette di creare un oggetto di tipo Random

è possibile trovare altre informazioni su oggetti su
https://docs.oracle.com/javase/tutorial/java/javaOO/objectcreation.html

Questi esercizi possono essere utilizzati per acquisire familiarità con la sintassi di base di Java e le strutture di controllo del flusso, come l'if, il for e lo switch. Inoltre, alcuni di questi esercizi richiedono l'utilizzo di input da parte dell'utente e di output sulla console.

# alcuni esercizi di lettura del codice per in Java

## esercizio 1

>Somma di due numeri: Scrivere un programma che chiede all'utente due numeri interi e stampa la somma dei due numeri.

```java
import java.util.Scanner; // importa la classe Scanner dal package java.util

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // crea un oggetto Scanner per leggere i dati inseriti dall'utente
        System.out.print("Inserisci il primo numero: "); // stampa "Inserisci il primo numero: " nella console
        int num1 = input.nextInt(); // legge il prossimo numero intero inserito dall'utente
        System.out.print("Inserisci il secondo numero: "); // stampa "Inserisci il secondo numero: " nella console
        int num2 = input.nextInt(); // legge il prossimo numero intero inserito dall'utente
        int sum = num1 + num2; // calcola la somma dei due numeri
        System.out.println("La somma dei due numeri è: " + sum); // stampa "La somma dei due numeri è: " + sum nella console
    }
}
```

>Calcolatrice: Scrivere un programma che chiede all'utente due numeri e un'operazione da eseguire (+, -, *, /) e stampa il risultato dell'operazione.
    
```java
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci il primo numero: ");
        double num1 = input.nextDouble(); // legge il prossimo numero inserito dall'utente
        System.out.print("Inserisci il secondo numero: "); // stampa "Inserisci il secondo numero: " nella console
        double num2 = input.nextDouble(); // legge il prossimo numero inserito dall'utente
        System.out.print("Inserisci l'operazione (+, -, *, /): "); // stampa "Inserisci l'operazione (+, -, *, /): " nella console
        char op = input.next().charAt(0); // legge il prossimo carattere inserito dall'utente
        double result;  // dichiara una variabile di tipo double
        switch(op) {
            case '+': // se op è uguale a '+'
                result = num1 + num2; // esegue la somma dei due numeri
                break;
            case '-': // se op è uguale a '-'
                result = num1 - num2; // esegue la sottrazione dei due numeri
                break;
            case '*': // se op è uguale a '*'
                result = num1 * num2; // esegue il prodotto dei due numeri
                break;
            case '/': // se op è uguale a '/'
                result = num1 / num2; // esegue la divisione dei due numeri
                break;
            default: // se op è diverso da '+', '-', '*' e '/'
                System.out.println("Operazione non valida."); // stampa "Operazione non valida." nella console
                return; 
        }
        System.out.println(num1 + " " + op + " " + num2 + " = " + result); // stampa num1 + " " + op + " " + num2 + " = " + result nella console
    }
}
```
>Fattoriale: Scrivere un programma che chiede all'utente un numero intero e stampa il fattoriale del numero.
>Il fattoriale di un numero n è dato dal prodotto di tutti i numeri interi da 1 a n.

```java
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci un numero intero: ");
        int n = input.nextInt();
        int factorial = 1; // inizializza la variabile factorial a 1
        for (int i = 1; i <= n; i++) {
            factorial *= i; // moltiplica factorial per i
        }
        System.out.println(n + "! = " + factorial); // stampa n + "! = " + factorial nella console
    }
}
```


