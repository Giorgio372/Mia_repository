# Tavola Kanban - 1 settimana

## - Ho imparato che alcuni rudimenti valgono indipendentemente dal linguaggio di programmazione utilizzato
> Ad esempio in tutti  i linguaggi esistono le variabili e le costanti
Posso dichiarare una variabile specificando il tipo (ad esempio int) ed impostando un nome
int a
Posso anche assegnare un valore specifico ad una variabile così:
int a = 1
## - Ho imparato che ci sono diversi tipi di variabili ed alcune volte capita che java non capisca quale variabile vorrei utilizzare
> Ad esempio l'input dell'utente viene sempre interpretato come una stringa e quindi se voglio effettuare delle operazioni devo specificare alcune cose aggiuntive tipo
.nextInt che si utilizza con variabili intere altrimenti genera un errore
## - Ho imparato che ogni linguaggio di programmazione però ha una sua sintassi specifica
> Ad esempio in java le istruzioni terminano con il segno ; oppure ad esempio il nome della classe in java deve corrispondere al nome del file .java tipo cosi:
```
public class calcolaPerimetroArea {   
}
```
## - Ho imparato che i blocchi di codice sono raggruppati all'interno di parentesi graffe
> Ad esempio un programma java vuoto tipo il nostro layout ha comunque due parti fisse che sono la classe ed il metodo main
```
public class calcolaPerimetroArea 
{
    public static void main(String[] args) {
    }
    }
} 
```   
## - Ho imparato che è importantissimo gestire la formattazione del documento in modo che le parentesi graffe siano allineate verticalmente (apertura chiusura)
    
```    
> Ad esempio
public class calcolaPerimetroArea
{
    public static void main(String[] args)
    {

    }
}
```
## - Ho imparato che per inaerire il codice in un documento md come questo è meglio includere il codice in una sezione che inizia e finisca con 3 backticks (ho imparato che si fanno con ALT+96)
> Ad esempio
```
public class calcolaPerimetroArea
{
    public static void main(String[] args)
    {

    }
}
```
## - Ho imparato che c'è un formato creato apposta per fare i files readme di documentazione del codice
> Ad esempio è possibile formattare il testo impostando alcuni attributi come il grassetto oppure il corsivo o il colore della scritta o dello sfondo della scritta così:
**questo testo è in grassetto**
_questo testo è italic_
ho consultato informazioni aggiuntive riguardanti il formato md qui:
https://docs.github.com/en/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax
https://www.markdownguide.org/
https://www.markdownguide.org/cheat-sheet/
## - Ho imparato che gli altri programmatori e sviluppatori più pratici di me hanno reso disponibile la loro esperienza lavorativa sul sito jetbrains.com
> Ad esempio su questo sito ho potuto confrontare i vari linguaggi di programmazione per potermi fare un'idea di quali sono al momento i più utilizzati, oppure quali sono i piu apprezzati. Inoltre su questo sito ho anche visto i grafici dei linguaggi più promettenti basandomi sul confronto con gli anni precedenti (**parte dal 2017**)
## - Ho imparato che i programatori, i web designer o gli sviluppatori di contenuti in genere utilizzano un sistema di versionamento del codice che permette di avere un ambiente di lavoro più sicuro in quanto posso sempre tornare indietro a delle modifiche effettuate in precedenza ed in più attraverso i branch (**che non ho ancora utilizzato**) che permettono di lavorare al codice in un ambiente condiviso tra più collaboratori
> Ad esempio ho creato un nuovo repository e tramite una sequenza ben precisa di comandi ho caricato alcuni files che ho creato e li ho aggiunti ad un ' area di versionamento (**staging area**)
## - Ho anche imparato che questi comandi devono essere riprodotti in un'ordine specifico
- Ad esempio i comandi per effettuare un aggiornamento di un contenuto sono:
    - git add <nomefile> (aggiunge il contenuto alla staging area)
    - git commit -m "messaggio" (mi permette di fare un commit e cioè un salvataggio di questa versione specifica ed assegn un nome a questo commit specifico al fine di essere richiamato in un secondo tempo)
    - git push -u origin main (mi permette di caricare il contenuto che ho agggiunto in precedenza)
- Ci sono anche altri comandi che invece servono per verificare lo stato della nostra origine o del nostro reposito remoto
> Ad esempio i comandi
- git status
- git log

## - Ho imparato che il codice java deve essere compilato per poster essere eseguito successivamente con questi due comandi
javac <nome files ed estensione>
java <nome file>
## - Ho imparato che però no nposso eseguire o compuilare un codice od files che non sono nella stessa rotta del comando, cioè i comandi vanno eseguiti proprio nella rotta dove hio salvato il file che voglio eseguire o compilare
## - Ho imparato che per poterlo fare ci sono alcuni comando che mi permettono di nuovermi tra le vìcvarie cartelle
> Ad esempio il comando cd <nome cartella> che mi fa accedere a quella cartella specifica oppure cd.. che mi fa ritornare indietro di un livello
>invece il comando mkdir <nome cartella> mi permette di creare nuove cartelle ed il comando code <nome cartella> mi permette di creare nuovi files

Altri comandi utili che hpo utilizzato son il comando **ls** che mi pernmette di vedere il contenuto della cartella nella quale mi trovo

**IMPORTANTE** ho imparato che è più semplice utilizzare il comando cd e trascinare l'icona della cartella invece di scrivere la rotta dei files


## Ho imparato a configurare la mia area di lavoro e cioè ho installato le JDK (le librerie che servono per poter utilizzare il linguaggio java) ed il IDE Visual Studio Code
> Ma ho subito scoperto che da solo npon è in grado di gestire un linguaggio specifico come java, quindi ho dovuto installare anche altre estensioni aggiuntive
A questo punto anche se sembrava tutto a posto in realtà ci sono stati alcuni problemi di configurazione che hanno riguardato più che altro alcune differenze tra il mio computer e quello dei miei colleghi
> Ad esempio ad alcune persone non funzionavano alcuni highlight sintax ed abbiamo messo a posto questo ed altri problemi che si sono verificati utilizzando:
- Il sito stackoverflow
- I consigli di ChatGpt
- Alcune intuizioni dei miei compagni di corso

- Ho imparato che ci dono diversi comandi utili per eseguire diverse operazioni
> Ad esempio: 

- Ctrl + z = torna indietro di una modifica nel file 
- Alt + 123 = parentesi graffe(aprire)
- Alt + 125 = parentesi graffe(chiudere) oppure AltGr + shift + tasto con immagine delle parentesi graffe(per entrambe)
- Ctrl + s = salva il file
- Ctrl + c = fa uscire dal terminale quando il prompt si blocca
- q = fa uscire dal terminale dopo il comando git status/git login  
<br>


- Ho imparato che in java bisogna creare degli oggetti per poter usare delle funzioni di una classe per eseguire certe azioni
> Ad esempio per ricevere input dall'utente bisogna creare un oggetto di classe Scanner attraverso il metodo costruttore new e attraverso
quell'oggetto possiamo richiamare il metodo nextInt() o nextLine o nextDouble o next() che servono a raccogliere l' input(vedi sotto)
```
public class calcolaPerimetroArea
{
    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);
      System.out.print("Inserisci il tuo nome: ");
      String nome = input.nextLine();

    }
}
```
<br>

- Ho imparato che i linguaggio di markdown è integrato con HTML e che quindi accetta certi comandi di questo linguaggio
> Ad esempio: il tag **br** per saltare una riga o il tag **src** per l'url delle immagini
 