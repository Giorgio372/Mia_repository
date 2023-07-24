# MAVEN

Apache Maven è uno strumento di gestione dei progetti che fornisce diversi archetipi per aiutarti a iniziare rapidamente con vari tipi di progetti Java. Un archetype è un modello di progetto predefinito che ti consente di creare un progetto con una struttura di cartelle e file appropriati per un determinato tipo di applicazione. Esistono molti archetipi Maven disponibili, sia ufficiali che forniti dalla comunità.

Di seguito sono elencati alcuni degli archetipi Maven più comuni:

**maven-archetype-quickstart**
>Questo è l'archetipo più semplice e serve come punto di partenza per un progetto Java generico. Crea una struttura di cartelle e file minimale, compresi un semplice file pom.xml e una classe principale "Hello, World!"

**maven-archetype-webapp**
>Questo archetipo crea un progetto Java basato su servlet con una struttura di cartelle adatta per un'applicazione web. Include un file pom.xml preconfigurato per le dipendenze del server web e un semplice file web.xml

**maven-archetype-j2ee-simple**
>Questo archetipo fornisce una base per un'applicazione Java EE semplificata, compresa la configurazione delle dipendenze Java EE e una struttura di cartelle adeguata per gli standard Java EE

**maven-archetype-spring-boot**
>Questo archetipo genera un progetto Spring Boot con una struttura di cartelle adeguata e un file pom.xml preconfigurato per le dipendenze di Spring Boot. Spring Boot è un framework molto popolare per lo sviluppo di applicazioni Java moderne e scalabili

**maven-archetype-java-library**
>Questo archetipo crea un progetto per lo sviluppo di una libreria Java generica, fornendo una struttura di cartelle appropriata e un file pom.xml preconfigurato per la distribuzione della libreria

**maven-archetype-mojo**
>Questo archetipo è utile quando si desidera creare un nuovo plugin Maven. Genera una struttura di cartelle e un file pom.xml configurati per lo sviluppo e la distribuzione di plugin Maven

**maven-archetype-archetype**
>Questo archetipo è destinato alla creazione di nuovi archetipi Maven personalizzati. Genera una struttura di cartelle e un file pom.xml configurati per creare e distribuire archetipi Maven

# I PRINCIPALI COMANDI MAVEN

**mvn compile**
>Questo comando compila il codice sorgente del progetto nella directory target/classes

**mvn test**
>Esegue i test del progetto. Maven utilizzerà automaticamente una libreria di test (come JUnit) se è configurata come dipendenza nel pom.xml

**mvn package**
>Compila il codice sorgente, esegue i test e crea un file JAR o WAR nella directory target in base alla configurazione del progetto

**mvn install**
>Esegue il comando package e poi installa il pacchetto nel repository locale Maven (in genere nella directory .m2 nella home dell'utente). Questo rende il pacchetto disponibile per essere utilizzato come dipendenza in altri progetti Maven locali

**mvn clean**
>Pulisce la directory target, rimuovendo i file generati dai comandi precedenti

**mvn dependency:tree**
>Mostra l'albero delle dipendenze del progetto, che è utile per comprendere quali dipendenze vengono utilizzate e per risolvere eventuali conflitti di versione

**mvn archetype:generate**
>Crea un nuovo progetto basato su un archetype Maven predefinito o personalizzato. Questo comando richiede di specificare groupId, artifactId e altre informazioni del progetto

**mvn site**
>Genera un sito di documentazione per il progetto, basato sulle informazioni nel file pom.xml e sui file di documentazione nella directory src/site

**mvn deploy**
>Esegue il comando install e poi distribuisce il pacchetto in un repository remoto configurato nel file pom.xml. Questo è utile per condividere il pacchetto con altri sviluppatori o per distribuirlo su un server di build

**mvn release:prepare** e **mvn release:perform**

>Questi due comandi vengono utilizzati insieme per creare e distribuire una nuova versione del progetto
Il comando release:prepare aggiorna il file pom.xml con la nuova versione e crea un tag nel sistema di controllo delle versioni
Il comando release:perform esegue una build della versione e la distribuisce nel repository configurato 

Molti altri plugin Maven forniscono comandi aggiuntivi per eseguire compiti specifici.
Puoi trovare questi plugin nel repository Maven e configurarli nel tuo file pom.xml per utilizzare i comandi associati qui:

https://mvnrepository.com/

# MAVEN CREAZIONE PROGETTO

Il comando mvn archetype:generate crea un nuovo progetto basato su un archetype Maven predefinito o personalizzato. Durante la creazione del progetto, ti verranno chieste alcune informazioni per configurare il tuo progetto.

Ecco una spiegazione dettagliata di queste informazioni

**groupId**
>Il groupId è un identificativo univoco per il tuo progetto all'interno dell'organizzazione o della società. Di solito è un identificativo Java package-style, come com.mycompany. Il groupId viene utilizzato per distinguere i tuoi progetti dagli altri progetti nel repository Maven e per evitare conflitti di nomi

**artifactId**
>L'artifactId è un identificativo univoco per il tuo progetto all'interno del groupId. Di solito è un nome semplice e descrittivo del tuo progetto, come my-webapp o my-library. L'artifactId viene utilizzato insieme al groupId per identificare in modo univoco il tuo progetto nel repository Maven e per creare il nome del file JAR o WAR generato

**version**
>La versione è un numero di versione per il tuo progetto, che segue le convenzioni di versionamento semantico (ad esempio, 1.0.0, 1.1.0, ecc.). La versione viene utilizzata per distinguere diverse versioni dello stesso progetto nel repository Maven e per gestire le dipendenze tra i progetti

**package**
>Il package è il package Java predefinito in cui verranno create le classi Java del tuo progetto. Di solito è lo stesso del groupId, ma può essere diverso se preferisci organizzare le tue classi in un package diverso. Se non viene specificato un package, Maven utilizzerà il groupId come package predefinito

**archetypeGroupId, archetypeArtifactId, archetypeVersion**
>Queste informazioni identificano l'archetype Maven su cui si basa il tuo nuovo progetto
Puoi scegliere un archetype predefinito o personalizzato specificando il groupId, l'artifactId e la versione dell'archetype

>Se utilizzi il comando mvn archetype:generate senza specificare queste informazioni, Maven ti mostrerà un elenco di archetipi disponibili tra cui scegliere.

Durante la creazione del progetto, Maven utilizzerà queste informazioni per generare una struttura di cartelle e file appropriata per il tipo di progetto selezionato e per creare un file pom.xml preconfigurato. Il file pom.xml conterrà le informazioni sul groupId, artifactId, version e package, nonché eventuali dipendenze e plugin necessari per il tipo di progetto selezionato

# MAVEN DEPENDENCIES

Maven è uno strumento di gestione delle dipendenze molto potente che ti consente di gestire facilmente le librerie di cui il tuo progetto ha bisogno. Ecco alcuni esempi di scenari comuni per la gestione delle dipendenze con Maven:

**Aggiungere una dipendenza**
>Supponiamo che tu stia creando un'applicazione web e abbia bisogno di utilizzare la libreria Spring MVC. Per aggiungere Spring MVC come dipendenza, apri il file pom.xml del tuo progetto e aggiungi il seguente blocco di codice nel tag <dependencies>

```xml 
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-webmvc</artifactId>
    <version>5.3.10</version>
</dependency>
```
Maven scaricherà automaticamente la libreria Spring MVC e le sue dipendenze nel repository locale e le includerà nel classpath del tuo progetto.

**Aggiornare una dipendenza**
Se vuoi aggiornare la versione di una dipendenza nel tuo progetto, basta modificare il tag <version> della dipendenza nel file pom.xml. Ad esempio, per aggiornare la versione di Spring MVC a 5.3.12, modifica il tag <version> come segue

```xml 
<version>5.3.12</version>
Maven scaricherà automaticamente la nuova versione della libreria e aggiornerà il classpath del tuo progetto.
```
Rimuovere una dipendenza:
Per rimuovere una dipendenza dal tuo progetto, basta eliminare il blocco di codice corrispondente nel tag <dependencies> del file pom.xml. Ad esempio, per rimuovere la dipendenza di Spring MVC, elimina il seguente blocco di codice:

```xml 
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-webmvc</artifactId>
    <version>5.3.10</version>
</dependency>
```
Maven rimuoverà automaticamente la libreria e le sue dipendenze dal classpath del tuo progetto.

Risolvere i conflitti di versione:
Supponiamo che tu abbia due dipendenze nel tuo progetto, A e B, che a loro volta dipendono da diverse versioni della stessa libreria C. Maven utilizzerà una strategia di risoluzione dei conflitti basata sulla versione più vicina per selezionare la versione di C da includere nel classpath.

Se vuoi forzare l'utilizzo di una specifica versione di C, puoi aggiungere una dipendenza esplicita per C nel file pom.xml. Ad esempio, per utilizzare la versione 1.5.0 di C, aggiungi il seguente blocco di codice nel tag <dependencies>:

```xml 
<dependency>
    <groupId>com.example</groupId>
    <artifactId>library-c</artifactId>
    <version>1.5.0</version>
</dependency>
```
