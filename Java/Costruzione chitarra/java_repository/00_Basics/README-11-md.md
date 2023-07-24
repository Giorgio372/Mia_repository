# UTILIZZO MD


# Titolo
## Sottotitolo
### Titolo paragrafo


> esempio di quote

esempio di __grassetto__ o **bold**

esempio di _italic_

esempio di elenco
---
- primo
    - sottoelenco
- secondo
    - sottoelenco
- terzo
- quarto
- quinto

esempio di check
- [x] sddsfsdsf
- [ ] primo

# Esempio di codice
```
git status
git add
git commit
```
```java
/*
Esercizio di test HelloWorld
serve a testare l'area di lavoro e se è tutto configurato stampa un messaggio di benvenuto
IMPORTANTE: Abbiamo rinunciato al suggerimento del tipo di variabile cambiando queste impostazioni:
Editor › Inlay Hints: Disabled
Disabilita i suggerimenti incorporati nell'Editor.
IMPORTANTE: è possibile formattare il documento in automatico attraverso tasto destro > Formatta documento
Un aspetto fondamentale della formattazione che ci permette di muoverci all'interno del codice senza perdere
la bussola riguarda la posizione delle parentesi graffe che dovrebbero essere allineate verticalmente quando riguardano uno stesso
blocco di codice (tipo la classe principale o il metodo main)
IMPORTANTE: A seconda della versione delle JDK installata potrebbe essere necessario specificare con il comando java (esegue il file)
anche l'estensione del file (come si fa con javac)
IMPORTANTE: alcune volte potrebbe capitare di voler uscire dal terminale ed è possibile farlo attraverso CONTROL+C
*/

public class HelloWorld // ricordarsi di cambiare il nome della classe
{
    public static void main(String[] args) // il metodo main è il punto di partenza dell'esecuzione del programma
    {

        System.out.print("Hello World"); // utilizzo l'oggetto che permette di stampare una scritta a video
    }
}

/*
note per i collaboratori
*/
```

This site was built using https://pages.github.com
This site was built using [GitHub Pages](https://pages.github.com/)

usate se possibile a capo con __INVIO+SHIFT__

**esempio di link relativo**

[link a pagina 2](02_link.md)

[link a pagina 3 dentro la sub](/Esercitazioni/02_md/subfolder/03_link.md)

![Screenshot of a comment on a GitHub issue showing an image, added in the Markdown, of an Octocat smiling and raising a tentacle.](/Immagini/photo-svgrepo-com.svg)

<!-- This content will not appear in the rendered Markdown -->

| Syntax | Description |
| ----------- | ----------- |
| Header | Title |
| Paragraph | ![esempio di SVG di svg repo]|



<font color="red">This text is red!</font>

<details>

<summary>Tips for collapsed sections</summary>

### You can add a header

You can add text within a collapsed section. 

You can add an image or a code block, too.

```ruby
   puts "Hello World"
```

</details>
Here is a simple flow chart:

<mark>gedfgdfg</mark>

<mark style=" background:red">gedfgdfg</mark>

```mermaid
graph TD;
    A-->B;
    A-->C;
    B-->D;
    C-->D;
```
fvfvfv
