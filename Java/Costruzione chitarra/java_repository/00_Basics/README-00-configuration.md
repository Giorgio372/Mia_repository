# CONFIGURAZIONE AMBIENTE DI LAVORO PER JAVA  

https://www.freecodecamp.org/italian/news/il-manuale-java-programmazione-in-java-per-principianti/

Per configurare l'ambiente di lavoro per utilizzare Java con Visual Studio Code, è necessario seguire i seguenti passaggi:

Installare Java Development Kit (JDK) sul proprio computer.
È possibile scaricare l'ultima versione di JDK qui:

https://www.oracle.com/technetwork/java/javase/downloads/index.html

Installare Visual Studio Code sul proprio computer.

https://code.visualstudio.com/

Installare l'estensione "Java Extension Pack" di Visual Studio Code.
Installare l'estensione "Debugger for Java" di Visual Studio Code.

Per farlo, aprire Visual Studio Code e selezionare il menu "Estensioni" (Ctrl+Shift+X), cercare "Java Extension Pack" e installarlo

# Aggiungere il percorso di installazione di JDK alla variabile di ambiente "PATH" 

Per farlo, aprire le "Impostazioni di sistema" (Windows + R, digitare "sysdm.cpl" e premere Invio),
selezionare la scheda "Avanzate", fare clic sul pulsante "Variabili d'ambiente", 
rovare la variabile "PATH" nella sezione "Variabili di sistema",
fare clic su "Modifica",
aggiungere il percorso di installazione di JDK (ad esempio "C:\Program Files\Java\jdk1.8.0_281\bin") e fare clic su "OK"

oppure con uno script batch:

Creare un file batch con il seguente contenuto e eseguirlo per aggiungere il percorso di installazione di JDK alla variabile di ambiente "PATH"

```batch
@echo off
setlocal
set "JDK_PATH=C:\Program Files\Java\jdk1.8.0_281\bin"
set "PATH=%PATH%;%JDK_PATH%"
echo %PATH%
pause
```

# Verificare la corretta configurazione di Visual Studio Code per Java 


**i files JAVA sono salvati con l'estensione .java**

**digitare il comando "java -version" per verificare che il framework Java sia installato**

Aprire Visual Studio Code e creare un nuovo file Java, digitare il seguente codice

```java
import java.util.Scanner; // importa la classe Scanner dal package java.util

public class HelloWorld // il nome della classe deve essere uguale al nome del file Java (HelloWorld.java)
{
    public static void main(String[] args) // il metodo main è il punto di partenza dell'esecuzione del programma
    {
        System.out.println("Hello, world!"); // stampa "Hello, world!" nella console
    }
}
```

Solitamente un file Java contiene una sola classe pubblica, il cui nome deve essere uguale al nome del file Java.
Però non è necessario specificare la classe pubblica nel file Java se il file contiene una sola classe

public static void main (String[] args) è il metodo principale che viene eseguito quando si avvia il programma Java.
Il metodo main è il punto di partenza dell'esecuzione del programma.
Però non è necessario specificare il metodo main nel file Java se il file contiene una sola classe

Salvare il file con il nome "HelloWorld.java" in una cartella a scelta. 

Aprire il terminale integrato di Visual Studio Code (Ctrl+Shift+`) e digitare il seguente comando per compilare il file Java:

**javac HelloWorld.java**

Se non ci sono errori di compilazione, digitare il seguente comando per eseguire il file Java:

**java HelloWorld**

Dovrebbe essere visualizzato il messaggio "Hello, world!"

Con questi passaggi, l'ambiente di lavoro per Java con Visual Studio Code è configurato correttamente


# Accorgimenti

Iniziare a scrivere codice può essere un po' intimidatorio, ma con alcuni accorgimenti è possibile rendere il processo più
facile e piacevole.

Buone pratiche di programmazione

- Codice pulito e ben strutturato
- Documentazione del codice
- Versionamento del codice
- Testing e debugging

Ecco alcuni suggerimenti per iniziare a scrivere codice:

**Sii organizzato**
>utilizza una cartella di progetto separata per ogni progetto e organizza i file e le cartelle in modo logico.
Ciò può aiutare a mantenere il progetto organizzato e a trovare rapidamente i file necessari.

**Scrivi commenti**
>inserisci commenti nel codice per descrivere cosa fa ogni riga di codice.
Ciò può aiutare a mantenere il codice organizzato e facile da leggere.

**Utilizza nomi descrittivi per le variabili**
>utilizza nomi descrittivi per le variabili, in modo da rendere il codice più leggibile e comprensibile.

**Trattamento delle eccezioni**
>tratta le eccezioni in modo coerente e prevedibile, ad esempio utilizzando la clausola try-catch

**Lunghezza delle righe di codice**
>evita di scrivere righe di codice troppo lunghe, in modo da evitare la complessità e la difficoltà di lettura.
In genere, si consiglia di non superare i 80 caratteri per riga

**Testa il codice**
>testa il codice man mano che lo scrivi, per individuare eventuali errori o problemi prima di passare a una nuova parte del progetto.

**Sii paziente e persistente**
>la programmazione richiede tempo e pratica per diventare abile. Sii paziente e persistente e continua a lavorare sui progetti,
anche quando incontri difficoltà

**Sii creativo**
>non aver paura di sperimentare e di trovare modi creativi per risolvere i problemi.
La programmazione è un'attività che richiede creatività e pensiero fuori dagli schemi

 **La formattazione del codice**
>La formattazione del codice è importante perché rende il codice più facile da leggere, da comprendere e da mantenere.
Esistono diversi strumenti di formattazione del codice disponibili che consentono di formattare automaticamente il codice in
base a uno stile di codifica specifico.

Ecco alcuni vantaggi della formattazione del codice:

**Leggibilità**
>la formattazione del codice rende il codice più facile da leggere e da comprendere.
Una formattazione coerente può rendere il codice più chiaro e organizzato.

**Manutenibilità**
>la formattazione del codice rende il codice più facile da mantenere.
Una formattazione coerente può aiutare a individuare eventuali problemi o bug nel codice.

**Compatibilità**
>la formattazione del codice può rendere il codice più compatibile con altri strumenti e librerie di programmazione.

**Efficienza**
>la formattazione automatica del codice può risparmiare tempo e sforzi, poiché non è necessario formattare manualmente il codice.

Alcuni degli strumenti di formattazione del codice disponibili includono Prettier, ReSharper.
Questi strumenti consentono di personalizzare lo stile di formattazione del codice e di formattare automaticamente il codice in base a uno stile di codifica specifico

