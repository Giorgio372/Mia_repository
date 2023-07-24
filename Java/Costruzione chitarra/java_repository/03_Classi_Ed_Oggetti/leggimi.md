# la fattoria degli animali in JAVA in modo da capire le classi ed gli oggetti

Per comprendere i concetti di classi e oggetti in Java, creeremo un esempio di una fattoria con diverse classi di animali.

Creeremo una classe base Animale, quindi estenderemo questa classe per creare le classi Mucca e Gallina.

Iniziamo creando la classe base Animale:

```java

public abstract class Animale {
    private String nome;

    public Animale(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract void faRumore();
}
```
Ora creiamo due classi che estendono Animale: Mucca e Gallina.

```java

public class Mucca extends Animale {
    public Mucca(String nome) {
        super(nome);
    }

    @Override
    public void faRumore() {
        System.out.println(getNome() + " dice: Mooo!");
    }
}

public class Gallina extends Animale {
    public Gallina(String nome) {
        super(nome);
    }

    @Override
    public void faRumore() {
        System.out.println(getNome() + " dice: Coccode!");
    }
}
```

Ora che abbiamo le nostre classi di animali, possiamo creare una Fattoria che conterrà una lista di animali:

```java

import java.util.ArrayList;
import java.util.List;

public class Fattoria {
    private List<Animale> animali;

    public Fattoria() {
        this.animali = new ArrayList<>();
    }

    public void aggiungiAnimale(Animale animale) {
        this.animali.add(animale);
    }

    public void faRumore() {
        for (Animale animale : animali) {
            animale.faRumore();
        }
    }
}
```
Infine, possiamo creare un main per testare tutto:

```java

public class Main {
    public static void main(String[] args) {
        Fattoria fattoria = new Fattoria();

        Animale mucca = new Mucca("Bianca");
        Animale gallina = new Gallina("Rosita");

        fattoria.aggiungiAnimale(mucca);
        fattoria.aggiungiAnimale(gallina);

        fattoria.faRumore();
    }
}
```
Se esegui il metodo main, vedrai in output le chiamate ai metodi faRumore() di ciascuna classe di animali, dimostrando l'uso del polimorfismo, uno dei principi fondamentali dell'OOP (Programmazione Orientata agli Oggetti).





# i dettagli

In Java, public e private sono parole chiave usate per definire il livello di accessibilità di una classe, un metodo o un membro dati.

public: Questo è il livello di accesso più permissivo. Un membro (campo, metodo o classe interna) dichiarato come public può essere accessibile da qualsiasi altra classe nel programma.

private: Questo è il livello di accesso meno permissivo. Un membro dichiarato come private può essere accessibile solo all'interno della classe in cui è definito.

Nel codice di esempio, il campo nome nell' Animale classe è dichiarato come private perché non vogliamo che sia accessibile direttamente da altre classi. Invece, forniamo un metodo public getNome() per permettere l'accesso al campo nome in modo controllato.

```java
Copy code
private String nome;

public String getNome() {
    return nome;
}
```
Nella classe Fattoria, il campo animali è anch'esso privato, con un metodo pubblico per aggiungere animali alla lista.

```java

private List<Animale> animali;

public void aggiungiAnimale(Animale animale) {
    this.animali.add(animale);
}
```
Utilizzo di this

La parola chiave this in Java è un riferimento alla stessa istanza dell'oggetto.

Può essere utilizzata per riferirsi ai campi di una classe, per invocare metodi dell'oggetto corrente e per passare l'oggetto corrente come parametro in un metodo o un costruttore.

Nel codice di esempio, this viene utilizzato nel costruttore delle classi Mucca e Gallina per fare riferimento al costruttore della classe madre Animale.

```java

public Mucca(String nome) {
    super(nome);
}

public Gallina(String nome) {
    super(nome);
}
```
this viene utilizzato anche nel metodo aggiungiAnimale() della classe Fattoria per fare riferimento alla lista animali dell'oggetto Fattoria corrente.

```java

public void aggiungiAnimale(Animale animale) {
    this.animali.add(animale);
}
```

In generale, this viene spesso utilizzato quando il nome del campo di una classe è lo stesso del parametro di un metodo o costruttore. In quei casi, this aiuta a distinguere tra il campo dell'oggetto e il parametro.

"super" è una parola chiave riservata in Java che può essere utilizzata per fare riferimento alla classe genitore di una classe, ovvero la classe da cui la classe figlia eredita le sue proprietà e metodi. Se vogliamo acceere ad una proprietà o ad un metodo della classe "Animale" possiamo utilizzare la parola chiave "super" seguita dal nome del campo o del metodo



# aggiungi altri animali


```java

public class Maiale extends Animale {
    public Maiale(String nome) {
        super(nome);
    }

    @Override
    public void faRumore() {
        System.out.println(getNome() + " dice: Grunt!");
    }
}
```
```java
public class Cavallo extends Animale {
    public Cavallo(String nome) {
        super(nome);
    }

    @Override
    public void faRumore() {
        System.out.println(getNome() + " dice: Neigh!");
    }
}
```

Ora che abbiamo queste classi, possiamo aggiungere istanze di esse alla nostra fattoria nel metodo main:

```java

public class Main {
    public static void main(String[] args) {
        Fattoria fattoria = new Fattoria();

        Animale mucca = new Mucca("Bianca");
        Animale gallina = new Gallina("Rosita");
        Animale maiale = new Maiale("Porky");
        Animale cavallo = new Cavallo("Epona");

        fattoria.aggiungiAnimale(mucca);
        fattoria.aggiungiAnimale(gallina);
        fattoria.aggiungiAnimale(maiale);
        fattoria.aggiungiAnimale(cavallo);

        fattoria.faRumore();
    }
}
```

Ora, quando esegui il metodo main, vedrai l'output dei suoni fatti da ciascuno degli animali nella fattoria. Questo è un esempio di polimorfismo, poiché stiamo chiamando lo stesso metodo (faRumore()) su oggetti di classi diverse, ma otteniamo comportamenti diversi