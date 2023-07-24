# OOP PLAYGROUND

**utilizzo e use case delle classi e degli oggetti ed i metodi e che van saggi ed svantaggi**

Le classi e gli oggetti sono fondamentali nella programmazione orientata agli oggetti (OOP).
Una classe è un modello che descrive il comportamento e le proprietà di una serie di oggetti simili.
Un oggetto è un'istanza di una classe, che contiene dati e comportamenti specifici.

Un esempio di classe è la classe Giocatore che descrive le proprietà e i comportamenti di un singolo giocatore, mentre gli oggetti giocatore1 e giocatore2 sono istanze di questa classe
Un vantaggio delle classi e degli oggetti è la loro capacità di organizzare e strutturare il codice in modo logico e riutilizzabile. Invece di scrivere lo stesso codice ripetutamente per gestire oggetti simili, una classe può essere definita una sola volta e le istanze di quella classe possono essere create per rappresentare oggetti simili. Questo può ridurre la quantità di codice necessaria e semplificare la manutenzione del codice.
Inoltre, le classi e gli oggetti possono essere usati per creare modelli di problemi complessi e astratti. Ad esempio, è possibile creare una classe Auto con proprietà come la marca, il modello e il numero di chilometri percorsi, e metodi come accelera() e frena(). Questo permette di creare un modello astratto di un'auto che può essere utilizzato in diversi contesti.
Tuttavia, ci sono anche degli svantaggi nel utilizzo di classi e oggetti. La definizione di classi e oggetti aggiunge complessità al codice e richiede una comprensione avanzata della programmazione orientata agli oggetti. Inoltre, l'uso eccessivo di classi e oggetti può portare a una struttura di codice troppo complicata e difficile da comprendere

**I metodi**

I metodi sono le funzioni definite all'interno di una classe, che definiscono il comportamento degli oggetti di quella classe.
Ad esempio, nella classe Giocatore, i metodi aggiungiPunto() e azzeraPunteggio() definiscono il comportamento per aggiungere un punto al punteggio del giocatore e azzerare il punteggio del giocatore, rispettivamente.

Un vantaggio dei metodi è che consentono di organizzare il codice in modo più modulare, suddividendo il comportamento in funzioni specifiche.
Inoltre, i metodi consentono di nascondere l'implementazione di un comportamento all'esterno della classe, rendendo il codice più sicuro e manutenibile

Tuttavia, l'uso eccessivo di metodi può portare a una classe troppo complessa e difficile da comprendere.
Inoltre, i metodi possono essere costosi in termini di prestazioni, specialmente se la classe ha molti metodi complessi o se vengono chiamati frequentemente

Le classi e gli oggetti sono particolarmente utili nel contesto dei giochi, dove gli oggetti del gioco possono essere modellati come istanze di una o più classi.
Ad esempio, un gioco di carte potrebbe avere una classe Carta che rappresenta una singola carta, con proprietà come il valore e il seme, e metodi come confronta() per confrontare due carte. Una classe Mazzo potrebbe contenere una serie di carte e avere metodi come mescola() e pesca() per mescolare le carte e pescare una carta dal mazzo. Un gioco come il blackjack potrebbe avere una classe Giocatore che rappresenta un giocatore, con proprietà come il nome e il punteggio, e metodi come tiraCarta() per aggiungere una carta alla mano del giocatore

In un gioco di ruolo (RPG), le classi e gli oggetti possono essere ancora più complessi. Ad esempio, una classe Personaggio potrebbe rappresentare un personaggio del gioco, con proprietà come la salute, la forza e l'esperienza, e metodi come attacca() e usaMagia() per attaccare i nemici e utilizzare la magia. Una classe Nemico potrebbe rappresentare un nemico del gioco, con proprietà come la salute e la forza, e metodi come attacca() per attaccare il personaggio del giocatore

L'utilizzo di classi e oggetti in un contesto di giochi consente di creare modelli astratti di oggetti del gioco e di organizzare il codice in modo modulare e riutilizzabile. Inoltre, l'uso di classi e oggetti consente di separare la logica del gioco dalla logica dell'interfaccia utente, semplificando la manutenzione del codice

Tuttavia, è importante notare che l'uso di classi e oggetti in un contesto di giochi può essere complesso e richiedere una comprensione avanzata della programmazione orientata agli oggetti
Inoltre, è importante bilanciare la complessità del codice con la facilità d'uso e l'esperienza del giocatore, in modo da creare un gioco divertente e coinvolgente

Questi esercizi possono aiutare a comprendere i concetti fondamentali di Java, come la generazione casuale di numeri, l'input e l'output, l'utilizzo di condizioni e cicli, e la creazione di classi e metodi

**Ecco un esempio di gioco Indovina il Numero in Java senza l'utilizzo di classi**

>Indovina il Numero senza l'utilizzo di classi
In questo esempio, il programma genera casualmente un numero tra 1 e 100 e chiede all'utente di indovinare il numero in 5 tentativi. Il programma utilizza un loop while per continuare a chiedere all'utente di inserire un tentativo fino a quando l'utente indovina il numero o esaurisce i tentativi. Il programma utilizza l'istruzione if-else per determinare se il tentativo dell'utente è troppo grande o troppo piccolo rispetto al numero generato casualmente, e fornisce all'utente un indizio per aiutare a indovinare il numero. Alla fine, il programma stampa un messaggio di vincita o di sconfitta a seconda dell'esito del gioco.
Indovina il Numero con l'utilizzo di classi

```java
import java.util.Random;
import java.util.Scanner;

public class IndovinaIlNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int numeroCasuale = rand.nextInt(100) + 1;
        int tentativi = 0;
        boolean indovinato = false;
        
        System.out.println("Indovina il numero tra 1 e 100!");
        
        while (!indovinato && tentativi < 5) {
            System.out.print("Inserisci il tuo tentativo: ");
            int tentativo = input.nextInt();
            tentativi++;
            
            if (tentativo == numeroCasuale) {
                System.out.println("Hai indovinato il numero in " + tentativi + " tentativi!");
                indovinato = true;
            } else if (tentativo < numeroCasuale) {
                System.out.println("Il numero è più grande del tuo tentativo.");
            } else {
                System.out.println("Il numero è più piccolo del tuo tentativo.");
            }
        }
        
        if (!indovinato) {
            System.out.println("Mi dispiace, hai esaurito i tentativi. Il numero era " + numeroCasuale + ".");
        }
        
        input.close();
    }
}
```
**Ecco un esempio di gioco Indovina il Numero in Java con l'utilizzo di classi**

>In questo esempio, il gioco del "Indovina il Numero" è diviso in due classi: la classe Giocatore che rappresenta il giocatore e la classe Gioco che rappresenta il gioco stesso. La classe Giocatore ha due attributi: nome e tentativi, mentre la classe Gioco ha due attributi: numeroCasuale e giocatore. La classe Gioco ha anche un metodo gioca() che esegue il gioco.
All'avvio, il programma genera casualmente un numero tra 1 e 100 e crea un nuovo oggetto Giocatore e un nuovo oggetto Gioco con il numero casuale e il giocatore. Il programma quindi chiama il metodo gioca() dell'oggetto Gioco per avviare il gioco.
Durante il gioco, il programma chiede all'utente di inserire il proprio nome e il tentativo. Il programma utilizza l'oggetto Giocatore per tenere traccia del nome del giocatore e del numero di tentativi. Il programma utilizza l'oggetto Gioco per tenere traccia del numero casuale.
Il gioco utilizza un loop while per continuare a chiedere all'utente di inserire un tentativo fino a quando l'utente indovina il numero o esaurisce i tentativi. Il gioco utilizza l'istruzione if-else per determinare se il tentativo dell'utente è troppo grande o troppo piccolo rispetto al numero generato casualmente, e fornisce all'utente un indizio per aiutare a indovinare il numero. Alla fine del gioco, il gioco stampa un messaggio di vincita o di sconfitta a seconda dell'esito del gioco

```java
import java.util.Random;
import java.util.Scanner;

public class GiocoIndovinaNumero {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int numeroCasuale = rand.nextInt(100) + 1;
        Giocatore giocatore = new Giocatore();
        Gioco gioco = new Gioco(numeroCasuale, giocatore);
        gioco.gioca();
        input.close();
    }
}

class Giocatore {
    private String nome;
    private int tentativi;

    public Giocatore() {
        this.nome = "";
        this.tentativi = 0;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTentativi(int tentativi) {
        this.tentativi = tentativi;
    }

    public int getTentativi() {
        return tentativi;
    }
}

class Gioco {
    private int numeroCasuale;
    private Giocatore giocatore;

    public Gioco(int numeroCasuale, Giocatore giocatore) {
        this.numeroCasuale = numeroCasuale;
        this.giocatore = giocatore;
    }

    public void gioca() {
        Scanner input = new Scanner(System.in);
        System.out.println("Indovina il numero tra 1 e 100!");
        System.out.print("Inserisci il tuo nome: ");
        String nome = input.nextLine();
        giocatore.setNome(nome);
        
        boolean indovinato = false;
        while (!indovinato && giocatore.getTentativi() < 5) {
            System.out.print("Inserisci il tuo tentativo: ");
            int tentativo = input.nextInt();
            giocatore.setTentativi(giocatore.getTentativi() + 1);
            
            if (tentativo == numeroCasuale) {
                System.out.println("Complimenti, " + giocatore.getNome() + "! Hai indovinato il numero in " + giocatore.getTentativi() + " tentativi!");
                indovinato = true;
            } else if (tentativo < numeroCasuale) {
                System.out.println("Il numero è più grande del tuo tentativo.");
            } else {
                System.out.println("Il numero è più piccolo del tuo tentativo.");
            }
        }
        
        if (!indovinato) {
            System.out.println("Mi dispiace, " + giocatore.getNome() + ". Hai esaurito i tentativi. Il numero era " + numeroCasuale + ".");
        }
        input.close();
    }
}
```
**Gioco del dadi senza l'utilizzo di classi**

>In questo esempio, il programma chiede all'utente di inserire il nome di due giocatori e poi esegue 3 turni di gioco. In ogni turno, il programma genera casualmente due numeri compresi tra 1 e 6, rappresentanti i due dadi. Il programma quindi confronta i due numeri e assegna un punto al giocatore che ha il numero più alto. Il programma stampa il risultato del turno.
Alla fine dei 3 turni, il programma confronta i punteggi totali dei due giocatori e dichiara il vincitore. Se i punteggi sono gli stessi, viene annunciato un pareggio.

```java
import java.util.Random;
import java.util.Scanner;

public class GiocoDeiDadi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Inserisci il nome del primo giocatore: ");
        String giocatore1 = input.nextLine();

        System.out.print("Inserisci il nome del secondo giocatore: ");
        String giocatore2 = input.nextLine();

        int punteggio1 = 0;
        int punteggio2 = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Turno " + i + ":");
            int dado1 = rand.nextInt(6) + 1;
            int dado2 = rand.nextInt(6) + 1;
            System.out.println(giocatore1 + " tira " + dado1 + ", " + giocatore2 + " tira " + dado2);
            if (dado1 > dado2) {
                punteggio1++;
                System.out.println(giocatore1 + " vince il turno!");
            } else if (dado2 > dado1) {
                punteggio2++;
                System.out.println(giocatore2 + " vince il turno!");
            } else {
                System.out.println("Pareggio!");
            }
        }

        if (punteggio1 > punteggio2) {
            System.out.println(giocatore1 + " vince il gioco con " + punteggio1 + " punti!");
        } else if (punteggio2 > punteggio1) {
            System.out.println(giocatore2 + " vince il gioco con " + punteggio2 + " punti!");
        } else {
            System.out.println("Pareggio!");
        }

        input.close();
    }
}
```
**Gioco del dadi con l'utilizzo di classi**

>In questo esempio, il gioco è suddiviso in due classi: Giocatore e Gioco. La classe Giocatore rappresenta un singolo giocatore e ha un nome e un punteggio. La classe Gioco rappresenta il gioco stesso e ha due giocatori e un numero di turni.
Il programma chiede all'utente di inserire il nome di due giocatori e crea due oggetti Giocatore con i nomi inseriti. Viene quindi creato un oggetto Gioco con i due giocatori.
Il metodo gioca() della classe Gioco esegue 3 turni di gioco. In ogni turno, il programma genera casualmente due numeri compresi tra 1 e 6, rappresentanti i due dadi. Il programma quindi confronta i due numeri e assegna un punto al giocatore che ha il numero più alto. Il programma stampa il risultato del turno.
Alla fine dei 3 turni, il programma confronta i punteggi totali dei due giocatori e dichiara il vincitore. Se i punteggi sono gli stessi, viene annunciato un pareggio.
Infine, i punteggi dei giocatori vengono azzerati in modo che il gioco possa essere eseguito nuovamente in futuro

```java
import java.util.Random;
import java.util.Scanner;

public class GiocoDeiDadi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il nome del primo giocatore: ");
        String nomeGiocatore1 = input.nextLine();

        System.out.print("Inserisci il nome del secondo giocatore: ");
        String nomeGiocatore2 = input.nextLine();

        Giocatore giocatore1 = new Giocatore(nomeGiocatore1);
        Giocatore giocatore2 = new Giocatore(nomeGiocatore2);

        Gioco gioco = new Gioco(giocatore1, giocatore2);
        gioco.gioca();

        input.close();
    }
}

class Giocatore {
    private String nome;
    private int punteggio;

    public Giocatore(String nome) {
        this.nome = nome;
        this.punteggio = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public void aggiungiPunto() {
        punteggio++;
    }

    public void azzeraPunteggio() {
        punteggio = 0;
    }
}

class Gioco {
    private Giocatore giocatore1;
    private Giocatore giocatore2;
    private int numTurni = 3;

    public Gioco(Giocatore giocatore1, Giocatore giocatore2) {
        this.giocatore1 = giocatore1;
        this.giocatore2 = giocatore2;
    }

    public void gioca() {
        Random rand = new Random();
        for (int i = 1; i <= numTurni; i++) {
            System.out.println("Turno " + i + ":");
            int dado1 = rand.nextInt(6) + 1;
            int dado2 = rand.nextInt(6) + 1;
            System.out.println(giocatore1.getNome() + " tira " + dado1 + ", " + giocatore2.getNome() + " tira " + dado2);
            if (dado1 > dado2) {
                giocatore1.aggiungiPunto();
                System.out.println(giocatore1.getNome() + " vince il turno!");
            } else if (dado2 > dado1) {
                giocatore2.aggiungiPunto();
                System.out.println(giocatore2.getNome() + " vince il turno!");
            } else {
                System.out.println("Pareggio!");
            }
        }

        if (giocatore1.getPunteggio() > giocatore2.getPunteggio()) {
            System.out.println(giocatore1.getNome() + " vince il gioco con " + giocatore1.getPunteggio() + " punti!");
        } else if (giocatore2.getPunteggio() > giocatore1.getPunteggio()) {
            System.out.println(giocatore2.getNome() + " vince il gioco con " + giocatore2.getPunteggio() + " punti!");
        } else {
            System.out.println("Pareggio!");
        }

        giocatore1.azzeraPunteggio();
        giocatore2.azzeraPunteggio();
    }
}
```
**Le espressioni regolari**

Le espressioni regolari sono utili per validare l'input del giocatore e per cercare pattern all'interno del testo

In questo codice, viene generato un numero casuale utilizzando Math.random() e viene salvato nella variabile numeroDaIndovinare. Il gioco viene eseguito in un ciclo while finché il giocatore non indovina il numero.
All'interno del ciclo while, viene chiesto al giocatore di inserire un numero utilizzando System.out.println() e scanner.next(). Viene utilizzata l'espressione regolare \\d+ per verificare se la risposta del giocatore è un numero valido.
Se la risposta del giocatore non è un numero valido, viene stampato un messaggio di errore utilizzando System.out.println() e il gioco continua utilizzando continue.
Se la risposta del giocatore è un numero valido, viene convertita in un numero utilizzando Integer.parseInt(). Viene utilizzata un'istruzione if per verificare se il numero indovinato dal giocatore è uguale al numero casuale generato dal computer.
Se il numero indovinato dal giocatore è uguale al numero casuale generato dal computer, viene stampato un messaggio di congratulazioni utilizzando System.out.println() e il gioco termina utilizzando break.
Se il numero indovinato dal giocatore non è uguale al numero casuale generato dal computer, viene stampato un messaggio di suggerimento utilizzando System.out.println() e il gioco continua utilizzando continue

```java
import java.util.Scanner;

public class IndovinaIlNumero {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int numeroDaIndovinare = (int) (Math.random() * 100);
      boolean indovinato = false;
      
      while (!indovinato) {
         System.out.println("Indovina il numero (da 1 a 100):");
         String risposta = scanner.next();
         
         if (!risposta.matches("\\d+")) {
            System.out.println("ERRORE: Inserisci un numero valido.");
            continue;
         }
         
         int numeroIndovinato = Integer.parseInt(risposta);
         
         if (numeroIndovinato == numeroDaIndovinare) {
            System.out.println("Hai indovinato il numero!");
            indovinato = true;
         } else if (numeroIndovinato < numeroDaIndovinare) {
            System.out.println("Il numero da indovinare è più grande.");
         } else {
            System.out.println("Il numero da indovinare è più piccolo.");
         }
      }
      
      scanner.close();
   }

}
```
**esercizi su come gestire le eccezioni usando regular expressions**

Le espressioni regolari sono utili per validare l'input dell'utente e aiutare a prevenire le eccezioni nel tuo codice. Ecco alcuni esercizi che ti permettono di gestire le eccezioni utilizzando le espressioni regolari

>Crea un programma che chiede all'utente di inserire il suo nome e verifica se l'input contiene solo lettere dell'alfabeto. Se l'input contiene caratteri non validi, stampa un messaggio di errore e ripeti la richiesta
In questo esercizio, viene utilizzata l'espressione regolare [a-zA-Z]+ per verificare se l'input dell'utente contiene solo lettere dell'alfabeto. Se l'input contiene caratteri non validi, viene stampato un messaggio di errore e il programma ripete la richiesta utilizzando continue

```java
Scanner scanner = new Scanner(System.in);
String nome;
while (true) {
   System.out.println("Inserisci il tuo nome:");
   nome = scanner.nextLine();
   if (nome.matches("[a-zA-Z]+")) {
      break;
   } else {
      System.out.println("ERRORE: Il nome deve contenere solo lettere dell'alfabeto.");
   }
}
```
>Crea un programma che chiede all'utente di inserire un numero intero positivo e verifica se l'input contiene solo cifre. Se l'input contiene caratteri non validi, stampa un messaggio di errore e ripeti la richiesta
In questo esercizio, viene utilizzata l'espressione regolare \\d+ per verificare se l'input dell'utente contiene solo cifre. Se l'input contiene caratteri non validi, viene stampato un messaggio di errore e il programma ripete la richiesta utilizzando continue. Viene utilizzato Integer.parseInt() per convertire la stringa in un numero intero
```java
Scanner scanner = new Scanner(System.in);
int numero;
while (true) {
   System.out.println("Inserisci un numero intero positivo:");
   String input = scanner.nextLine();
   if (input.matches("\\d+")) {
      numero = Integer.parseInt(input);
      break;
   } else {
      System.out.println("ERRORE: L'input deve contenere solo cifre.");
   }
}
```
>Crea un programma che chiede all'utente di inserire un indirizzo email e verifica se l'input è un indirizzo email valido. Se l'input non è valido, stampa un messaggio di errore e ripeti la richiesta
In questo esercizio, viene utilizzata l'espressione regolare [a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,} per verificare se l'input dell'utente è un indirizzo email valido. Se l'input non è valido, viene stampato un messaggio di errore e il programma ripete la richiesta utilizzando continue

```java
Scanner scanner = new Scanner(System.in);
String email;
while (true) {
   System.out.println("Inserisci il tuo indirizzo email:");
   email = scanner.nextLine();
   if (email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
      break;
   } else {
      System.out.println("ERRORE: L'indirizzo email non è valido.");
   }
}
```
Questi esercizi mostrano come le espressioni regolari possono essere utili per gestire le eccezioni nel tuo codice. Utilizzando le espressioni regolari per validare l'input dell'utente, puoi prevenire eccezioni come NumberFormatException, InputMismatchException e altri errori di input.

**Gioco del tris**

Questo codice crea un gioco del tris in cui l'utente può inserire le coordinate della casella in cui vuole inserire il simbolo (X o O). Il gioco è implementato come una serie di funzioni che gestiscono la logica di gioco, la validazione dell'input dell'utente e la stampa del campo di gioco. In particolare, la funzione richiediCoordinate utilizza un'espressione regolare per verificare se l'input dell'utente è valido (ad esempio, se contiene solo due cifre separate da una virgola). Se l'input non è valido, la funzione stampa un messaggio di errore e richiede nuovamente le coordinate.
Il codice utilizza anche una serie di condizioni if per verificare se il giocatore corrente ha vinto o se la partita è finita in pareggio. Inoltre, il codice utilizza un ciclo while per continuare la partita fino a quando non viene raggiunto uno dei due esiti sopra citati.
Infine, il codice utilizza anche la classe Scanner per leggere l'input dell'utente dalla console e la funzione System.out.println per stampare i messaggi di output sulla console

```java
import java.util.Scanner;

public class Tris {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] campo = new String[3][3];
        String giocatoreCorrente = "X";
        boolean partitaFinita = false;

        inizializzaCampo(campo);

        while (!partitaFinita) {
            stampaCampo(campo);

            int[] coordinate = richiediCoordinate(scanner);

            if (campo[coordinate[0]][coordinate[1]] != null) {
                System.out.println("ERRORE: La casella è già occupata.");
                continue;
            }

            campo[coordinate[0]][coordinate[1]] = giocatoreCorrente;

            if (haVinto(campo, giocatoreCorrente)) {
                System.out.println("Il giocatore " + giocatoreCorrente + " ha vinto!");
                partitaFinita = true;
            } else if (haPareggiato(campo)) {
                System.out.println("La partita è finita in pareggio.");
                partitaFinita = true;
            } else {
                giocatoreCorrente = (giocatoreCorrente == "X") ? "O" : "X";
            }
        }

        scanner.close();
    }

    public static void inizializzaCampo(String[][] campo) {
        for (int i = 0; i < campo.length; i++) {
            for (int j = 0; j < campo[i].length; j++) {
                campo[i][j] = null;
            }
        }
    }

    public static void stampaCampo(String[][] campo) {
        System.out.println("  1 2 3");
        for (int i = 0; i < campo.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < campo[i].length; j++) {
                String valore = (campo[i][j] == null) ? " " : campo[i][j];
                System.out.print(valore + ((j == 2) ? "" : " | "));
            }
            System.out.println();
            if (i < 2) {
                System.out.println("  ------");
            }
        }
        System.out.println();
    }

    public static int[] richiediCoordinate(Scanner scanner) {
        int[] coordinate = new int[2];
        while (true) {
            System.out.println("Inserisci le coordinate (riga,colonna):");
            String input = scanner.nextLine();
            if (input.matches("\\d,\\d")) {
                String[] coordinateStr = input.split(",");
                coordinate[0] = Integer.parseInt(coordinateStr[0]) - 1;
                coordinate[1] = Integer.parseInt(coordinateStr[1]) - 1;
                break;
            } else {
                System.out.println("ERRORE: Le coordinate devono essere nel formato riga,colonna.");
            }
        }
        return coordinate;
    }

    public static boolean haVinto(String[][] campo, String simbolo) {
        for (int i = 0; i < campo.length; i++) {
            if (campo[i][0] == simbolo && campo[i][1] == simbolo && campo[i][2] == simbolo) {
                return true;
            }
            if (campo[0][i] == simbolo && campo[1][i] == simbolo && campo[2][i] == simbolo) {
                return true;
            }
        }
        if (campo[0][0] == simbolo && campo[1][1] == simbolo && campo[2][2] == simbolo) {
            return true;
        }
        if (campo[0][2] == simbolo && campo[1][1] == simbolo && campo[2][0] == simbolo) {
            return true;
        }
        return false;
    }

    public static boolean haPareggiato(String[][] campo) {
        for (int i = 0; i < campo.length; i++) {
            for (int j = 0; j < campo[i].length; j++) {
                if (campo[i][j] == null) {
                    return false;
                }
            }
        }
        return true;
    }

}
```

**Gioco del labirinto**

Questo codice crea un semplice gioco del labirinto in cui il giocatore deve muovere un personaggio attraverso un labirinto rappresentato da una matrice di stringhe. Il labirinto è costituito da blocchi di pareti "#" e un blocco di uscita "U". Il giocatore può muoversi in quattro direzioni (nord, sud, est, ovest) e deve evitare di colpire le pareti del labirinto. Se raggiunge l'uscita, vince il gioco, altrimenti perde se colpisce una parete.
Il codice utilizza una serie di funzioni per gestire le diverse parti del gioco, come la stampa del labirinto, la richiesta della direzione del giocatore, il calcolo della nuova posizione, la determinazione se il giocatore ha vinto o perso. Il codice è anche dotato di un ciclo principale del gioco che controlla continuamente lo stato della partita e si interrompe solo quando il gioco è terminato

```java
import java.util.Scanner;

public class Labirinto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] labirinto = {
                {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#"},
                {"#", " ", " ", " ", "#", " ", " ", " ", " ", "#"},
                {"#", " ", "#", " ", "#", " ", "#", "#", " ", "#"},
                {"#", " ", "#", " ", " ", " ", " ", " ", " ", "#"},
                {"#", " ", "#", "#", "#", "#", "#", "#", " ", "#"},
                {"#", " ", " ", " ", " ", " ", " ", " ", " ", "#"},
                {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#"}
        };
        int[] posizione = {1, 1};
        boolean partitaFinita = false;

        while (!partitaFinita) {
            stampaLabirinto(labirinto, posizione);

            String direzione = richiediDirezione(scanner);

            int[] nuovaPosizione = calcolaNuovaPosizione(posizione, direzione);

            if (haVinto(nuovaPosizione, labirinto)) {
                System.out.println("Hai vinto!");
                partitaFinita = true;
            } else if (haPerso(nuovaPosizione, labirinto)) {
                System.out.println("Hai perso!");
                partitaFinita = true;
            } else {
                posizione = nuovaPosizione;
            }
        }

        scanner.close();
    }

    public static void stampaLabirinto(String[][] labirinto, int[] posizione) {
        for (int i = 0; i < labirinto.length; i++) {
            for (int j = 0; j < labirinto[i].length; j++) {
                if (i == posizione[0] && j == posizione[1]) {
                    System.out.print("P");
                } else {
                    System.out.print(labirinto[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static String richiediDirezione(Scanner scanner) {
        while (true) {
            System.out.println("Inserisci la direzione (n/s/e/o):");
            String input = scanner.nextLine();
            if (input.matches("[nseo]")) {
                return input;
            } else {
                System.out.println("ERRORE: La direzione deve essere n, s, e o.");
            }
        }
    }

    public static int[] calcolaNuovaPosizione(int[] posizione, String direzione) {
        int[] nuovaPosizione = posizione.clone();
        switch (direzione) {
            case "n":
                nuovaPosizione[0]--;
                break;
            case "s":
                nuovaPosizione[0]++;
                break;
            case "e":
                nuovaPosizione[1]++;
                break;
            case "o":
                nuovaPosizione[1]--;
                break;
        }
        return nuovaPosizione;
    }

    public static boolean haVinto(int[] posizione, String[][] labirinto) {
        return labirinto[posizione[0]][posizione[1]].equals("U");
    }

    public static boolean haPerso(int[] posizione, String[][] labirinto) {
        return labirinto[posizione[0]][posizione[1]].equals("#");
    }
}
```