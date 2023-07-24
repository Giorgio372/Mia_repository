# landing page

Si possono inserire i commenti oltre che mediante CTRL ù
anche con la sequenza
CTRL K CTRL C
## 1 parte

Il codice HTML utilizza sia Flexbox che Grid per il layout, ed è responsive, il che significa che si adatterà a diverse dimensioni del viewport.

```html
<!DOCTYPE html>
<html>
<head>
    <title>Full Stack Competenze</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
        }

        .container {
            display: flex;
            flex-wrap: wrap;
            justify-content: center;
            padding: 20px;
        }

        .section {
            display: grid;
            grid-template-columns: 1fr;
            gap: 20px;
            margin: 20px;
        }

        @media screen and (min-width: 600px) {
            .section {
                grid-template-columns: 1fr 1fr;
            }
        }

        @media screen and (min-width: 900px) {
            .section {
                grid-template-columns: 1fr 1fr 1fr;
            }
        }

        .card {
            border: 1px solid #ddd;
            border-radius: 5px;
            padding: 20px;
            text-align: center;
        }

        .card img {
            width: 100%;
            height: auto;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="section">
            <div class="card">
                <img src="backend.png" alt="Backend Development">
                <h2>Sviluppo Backend</h2>
                <p>Competenze in Node.js, Express.js, Python, Django, Ruby on Rails, ecc.</p>
            </div>
            <div class="card">
                <img src="frontend.png" alt="Frontend Development">
                <h2>Sviluppo Frontend</h2>
                <p>Competenze in HTML, CSS, JavaScript, React.js, Vue.js, Angular.js, ecc.</p>
            </div>
            <div class="card">
                <img src="database.png" alt="Database Management">
                <h2>Gestione Database</h2>
                <p>Competenze in MySQL, PostgreSQL, MongoDB, Firebase, ecc.</p>
            </div>
        </div>
    </div>
</body>
</html>
```

## 2 parte

Implementa il menu con i link alle sezioni

Per implementare un menu di navigazione con link alle sezioni, devi utilizzare gli ID univoci per ciascuna sezione e quindi linkare questi ID nel tuo menu.e:

```html

<!DOCTYPE html>
<html>
<head>
    <title>Full Stack Competenze</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
        }

        .menu {
            background-color: #333;
            overflow: hidden;
            display: flex;
            justify-content: space-around;
            padding: 20px 0;
        }

        .menu a {
            color: #fff;
            text-decoration: none;
        }

        .container {
            display: flex;
            flex-wrap: wrap;
            justify-content: center;
            padding: 20px;
        }

        .section {
            display: grid;
            grid-template-columns: 1fr;
            gap: 20px;
            margin: 20px;
        }

        @media screen and (min-width: 600px) {
            .section {
                grid-template-columns: 1fr 1fr;
            }
        }

        @media screen and (min-width: 900px) {
            .section {
                grid-template-columns: 1fr 1fr 1fr;
            }
        }

        .card {
            border: 1px solid #ddd;
            border-radius: 5px;
            padding: 20px;
            text-align: center;
        }

        .card img {
            width: 100%;
            height: auto;
        }
    </style>
</head>
<body>
    <div class="menu">
        <a href="#backend">Sviluppo Backend</a>
        <a href="#frontend">Sviluppo Frontend</a>
        <a href="#database">Gestione Database</a>
    </div>

    <div class="container">
        <div class="section" id="backend">
            <div class="card">
                <img src="backend.png" alt="Backend Development">
                <h2>Sviluppo Backend</h2>
                <p>Competenze in Node.js, Express.js, Python, Django, Ruby on Rails, ecc.</p>
            </div>
        </div>
        <div class="section" id="frontend">
            <div class="card">
                <img src="frontend.png" alt="Frontend Development">
                <h2>Sviluppo Frontend</h2>
                <p>Competenze in HTML, CSS, JavaScript, React.js, Vue.js, Angular.js, ecc.</p>
            </div>
        </div>
        <div class="section" id="database">
            <div class="card">
                <img src="database.png" alt="Database Management">
                <h2>Gestione Database</h2>
                <p>Competenze in MySQL, PostgreSQL, MongoDB, Firebase, ecc.</p>
            </div>
        </div>
    </div>
</body>
</html>
```

In questo esempio, abbiamo aggiunto un div con la classe "menu" che contiene i link alle sezioni. Questi link puntano agli ID delle sezioni "backend", "frontend" e "database".

Quando l'utente clicca su un link nel menu, la pagina scorre fino alla sezione corrispondente.


## 3 parte


crea un link per il file css

Creare un link per un file CSS esterno è un ottimo modo per organizzare meglio il tuo codice.

Devi semplicemente spostare tutte le regole CSS in un nuovo file con estensione .css (ad esempio, "styles.css") e poi linkarlo al tuo file HTML utilizzando il tag link all'interno del tag head.

```html

<!DOCTYPE html>
<html>
<head>
    <title>Full Stack Competenze</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <div class="menu">
        <a href="#backend">Sviluppo Backend</a>
        <a href="#frontend">Sviluppo Frontend</a>
        <a href="#database">Gestione Database</a>
    </div>

    <div class="container">
        <div class="section" id="backend">
            <div class="card">
                <img src="backend.png" alt="Backend Development">
                <h2>Sviluppo Backend</h2>
                <p>Competenze in Node.js, Express.js, Python, Django, Ruby on Rails, ecc.</p>
            </div>
        </div>
        <div class="section" id="frontend">
            <div class="card">
                <img src="frontend.png" alt="Frontend Development">
                <h2>Sviluppo Frontend</h2>
                <p>Competenze in HTML, CSS, JavaScript, React.js, Vue.js, Angular.js, ecc.</p>
            </div>
        </div>
        <div class="section" id="database">
            <div class="card">
                <img src="database.png" alt="Database Management">
                <h2>Gestione Database</h2>
                <p>Competenze in MySQL, PostgreSQL, MongoDB, Firebase, ecc.</p>
            </div>
        </div>
    </div>
</body>
</html>
```

File CSS (styles.css):

```css

body {
    margin: 0;
    padding: 0;
    font-family: Arial, sans-serif;
}

.menu {
    background-color: #333;
    overflow: hidden;
    display: flex;
    justify-content: space-around;
    padding: 20px 0;
}

.menu a {
    color: #fff;
    text-decoration: none;
}

.container {
    display: flex;
    flex-wrap: wrap;
    justify-content: center;
    padding: 20px;
}

.section {
    display: grid;
    grid-template-columns: 1fr;
    gap: 20px;
    margin: 20px;
}

@media screen and (min-width: 600px) {
    .section {
        grid-template-columns: 1fr 1fr;
    }
}

@media screen and (min-width: 900px) {
    .section {
        grid-template-columns: 1fr 1fr 1fr;
    }
}

.card {
    border: 1px solid #ddd;
    border-radius: 5px;
    padding: 20px;
    text-align: center;
}

.card img {
    width: 100%;
    height: auto;
}
```

Assicurati che il file CSS si trovi nella stessa directory del file HTML o aggiorna il percorso nel tag link di conseguenza.



## 4 parte

Un modo per migliorare ulteriormente la pagina potrebbe essere l'aggiunta di alcune animazioni o effetti al passaggio del mouse, utilizzando CSS.

File HTML (index.html):

```html

<!DOCTYPE html>
<html>
<head>
    <title>Full Stack Competenze</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <div class="menu">
        <a href="#backend">Sviluppo Backend</a>
        <a href="#frontend">Sviluppo Frontend</a>
        <a href="#database">Gestione Database</a>
    </div>

    <div class="container">
        <div class="section" id="backend">
            <div class="card">
                <img src="backend.png" alt="Backend Development">
                <h2>Sviluppo Backend</h2>
                <p>Competenze in Node.js, Express.js, Python, Django, Ruby on Rails, ecc.</p>
            </div>
        </div>
        <div class="section" id="frontend">
            <div class="card">
                <img src="frontend.png" alt="Frontend Development">
                <h2>Sviluppo Frontend</h2>
                <p>Competenze in HTML, CSS, JavaScript, React.js, Vue.js, Angular.js, ecc.</p>
            </div>
        </div>
        <div class="section" id="database">
            <div class="card">
                <img src="database.png" alt="Database Management">
                <h2>Gestione Database</h2>
                <p>Competenze in MySQL, PostgreSQL, MongoDB, Firebase, ecc.</p>
            </div>
        </div>
    </div>
</body>
</html>
```
File CSS (styles.css):

```css

body {
    margin: 0;
    padding: 0;
    font-family: Arial, sans-serif;
}

.menu {
    background-color: #333;
    overflow: hidden;
    display: flex;
    justify-content: space-around;
    padding: 20px 0;
}

.menu a {
    color: #fff;
    text-decoration: none;
    transition: color 0.3s ease-in-out;
}

.menu a:hover {
    color: #f8f9fa;
}

.container {
    display: flex;
    flex-wrap: wrap;
    justify-content: center;
    padding: 20px;
}

.section {
    display: grid;
    grid-template-columns: 1fr;
    gap: 20px;
    margin: 20px;
}

@media screen and (min-width: 600px) {
    .section {
        grid-template-columns: 1fr 1fr;
    }
}

@media screen and (min-width: 900px) {
    .section {
        grid-template-columns: 1fr 1fr 1fr;
    }
}

.card {
    border: 1px solid #ddd;
    border-radius: 5px;
    padding: 20px;
    text-align: center;
    transition: transform 0.3s ease-in-out;
}

.card:hover {
    transform: scale(1.05);
}

.card img {
    width: 100%;
    height: auto;
}
```
In questo esempio, ho aggiunto una transizione al colore dei link del menu e un effetto di zoom quando il mouse passa sopra le card.
Quando l'utente pone il mouse sopra un link nel menu, il colore del link cambierà più fluidamente grazie alla proprietà transition.

Analogamente, quando l'utente pone il mouse sopra una card, la card aumenterà di dimensione (scale(1.05)), creando un effetto di zoom.

Questi piccoli dettagli possono migliorare l'esperienza utente e rendere il design più piacevole.



## 5 parte

In CSS, fr è un'unità di misura flessibile che rappresenta una frazione dello spazio disponibile nel layout del CSS Grid. Per esempio, se definisci grid-template-columns: 1fr 2fr;, stai dicendo al browser di dividere l'area del layout in tre parti, assegnandone una parte alla prima colonna e due parti alla seconda.

Per quanto riguarda px, em, sono entrambe unità di misura usate in CSS, ma hanno comportamenti diversi:

px (pixel): Un pixel è un'unità fissa che rappresenta un punto fisso sullo schermo. Quando si definisce qualcosa come 20px, si sta dicendo al browser di renderizzare l'elemento con una larghezza o altezza di 20 pixel. Questa misura non cambia a seconda della dimensione del testo dell'elemento genitore o delle impostazioni del browser dell'utente.

em: Un em è un'unità relativa che cambia in base alla dimensione del font dell'elemento genitore. Se la dimensione del font del genitore è di 16px, allora 1em equivale a 16px. Se cambi la dimensione del font del genitore a 20px, allora 1em sarà ora 20px. Questa unità è molto utile per creare design responsive che si adattano alle dimensioni del font.

utilizza google fonts

L'utilizzo di Google Fonts può migliorare significativamente l'aspetto del tuo sito web.

Google Fonts è un servizio gratuito che ti permette di incorporare facilmente font personalizzati nelle tue pagine web.

Ecco come potresti fare per utilizzare un font di Google Fonts (come ad esempio "Roboto") nel tuo codice:

File HTML (index.html):

```html

<!DOCTYPE html>
<html>
<head>
    <title>Full Stack Competenze</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
    <link href="https://fonts.googleapis.com/css?family=Roboto&display=swap" rel="stylesheet">
</head>
<body>
    <div class="menu">
        <a href="#backend">Sviluppo Backend</a>
        <a href="#frontend">Sviluppo Frontend</a>
        <a href="#database">Gestione Database</a>
    </div>

    <div class="container">
        <div class="section" id="backend">
            <div class="card">
                <img src="backend.png" alt="Backend Development">
                <h2>Sviluppo Backend</h2>
                <p>Competenze in Node.js, Express.js, Python, Django, Ruby on Rails, ecc.</p>
            </div>
        </div>
        <div class="section" id="frontend">
            <div class="card">
                <img src="frontend.png" alt="Frontend Development">
                <h2>Sviluppo Frontend</h2>
                <p>Competenze in HTML, CSS, JavaScript, React.js, Vue.js, Angular.js, ecc.</p>
            </div>
        </div>
        <div class="section" id="database">
            <div class="card">
                <img src="database.png" alt="Database Management">
                <h2>Gestione Database</h2>
                <p>Competenze in MySQL, PostgreSQL, MongoDB, Firebase, ecc.</p>
            </div>
        </div>
    </div>
</body>
</html>
```
File CSS (styles.css):

```css

body {
    margin: 0;
    padding: 0;
    font-family: 'Roboto', sans-serif;
}

.menu {
    background-color: #333;
    overflow: hidden;
    display: flex;
    justify-content: space-around;
    padding: 20px 0;
}

.menu a {
    color: #fff;
    text-decoration: none;
    transition: color 0.3s ease-in-out;
}

.menu a:hover {
    color: #f8f9fa;
}

.container {
    display: flex;
    flex-wrap: wrap;
    justify-content: center;
    padding: 20px;
}

.section {
    display: grid;
    grid-template-columns: 1fr;
    gap: 20px;
    margin: 20px;
}

@media screen and (min-width: 600px) {
    .section {
        grid-template-columns: 1fr 1fr;
    }
}

@media screen and (min-width: 900px) {
    .section {
        grid-template-columns: 1fr 1fr 1fr;
    }
}

.card {
    border: 1px solid #ddd;
    border-radius: 5px;
    padding: 20px;
    text-align: center;
    transition: transform 0.3s ease-in-out;
}

.card:hover {
    transform: scale(1.05);
}

.card img {
    width: 100%;
    height: auto;
}
```

In questo esempio, ho aggiunto un link a Google Fonts per il font "Roboto" nel tag head del file HTML. Poi, nel file CSS, ho cambiato il font del body a 'Roboto'. Ora, tutto il testo nel sito web userà il font 'Roboto'. Puoi personalizzare questo codice per utilizzare qualsiasi altro font disponibile su Google Fonts.



## 6 parte

crea una sezione hero con una scritta titolo del sit ed un claim con un gradiente css

Per creare una sezione "hero" con un titolo del sito, un sottotitolo (o claim) e un gradiente di sfondo con CSS, si può fare quanto segue:

File HTML (index.html):

```html

<!DOCTYPE html>
<html>
<head>
    <title>Full Stack Competenze</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
    <link href="https://fonts.googleapis.com/css?family=Roboto&display=swap" rel="stylesheet">
</head>
<body>
    <div class="hero">
        <h1>Il Mio Sito Full Stack</h1>
        <p>Scopri le mie competenze nello sviluppo full stack.</p>
    </div>
    <!-- Resto del codice HTML... -->
</body>
</html>
```
File CSS (styles.css):

```css

body {
    margin: 0;
    padding: 0;
    font-family: 'Roboto', sans-serif;
}

.hero {
    display: flex;
    justify-content: center;
    align-items: center;
    height: 70vh;
    color: #fff;
    background: linear-gradient(to right, #ff7e5f, #feb47b);
    text-align: center;
    flex-direction: column;
}

.hero h1 {
    font-size: 2.5em;
}

.hero p {
    font-size: 1.5em;
}

/* Resto del codice CSS... */
```
Nell'esempio, ho creato una sezione "hero" con un titolo del sito e un sottotitolo. Ho utilizzato flexbox per centrare il titolo e il sottotitolo all'interno del div "hero".

Ho poi applicato un gradiente di sfondo al div "hero" utilizzando la proprietà background di CSS e la funzione linear-gradient().

Il gradiente inizia con il colore #ff7e5f sulla sinistra e termina con il colore #feb47b sulla destra.

Il testo nel div "hero" è bianco per garantire un buon contrasto con il gradiente di sfondo. Ho anche aumentato la dimensione del font del titolo e del sottotitolo per renderli più visibili.


## 7 parte


ggiungi una sezione oop ed un semplice modulo di contatti

Per aggiungere una sezione dedicata all'OOP (Object-Oriented Programming, o Programmazione Orientata agli Oggetti) e un modulo di contatto, potresti fare qualcosa del genere:

File HTML (index.html):

```html

<!DOCTYPE html>
<html>
<head>
    <title>Full Stack Competenze</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
    <link href="https://fonts.googleapis.com/css?family=Roboto&display=swap" rel="stylesheet">
</head>
<body>
    <!-- Inserire qui la sezione "hero" -->
    
    <div class="container">
        <!-- Inserire qui le sezioni "backend", "frontend", e "database" -->

        <div class="section" id="oop">
            <div class="card">
                <img src="oop.png" alt="Object-Oriented Programming">
                <h2>Programmazione Orientata agli Oggetti</h2>
                <p>Competenze in Java, C++, Python, ecc.</p>
            </div>
        </div>

        <div class="section" id="contact">
            <h2>Contattami</h2>
            <form action="/submit_form" method="POST">
                <label for="name">Nome:</label>
                <input type="text" id="name" name="name" required>
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" required>
                <label for="message">Messaggio:</label>
                <textarea id="message" name="message" required></textarea>
                <input type="submit" value="Invia">
            </form>
        </div>
    </div>
</body>
</html>
```
File CSS (styles.css):

```css

body {
    margin: 0;
    padding: 0;
    font-family: 'Roboto', sans-serif;
}

/* Inserire qui il CSS per la sezione "hero" e il menu */

.container {
    display: flex;
    flex-wrap: wrap;
    justify-content: center;
    padding: 20px;
}

.section {
    display: grid;
    grid-template-columns: 1fr;
    gap: 20px;
    margin: 20px;
}

/* CSS per le media queries... */

.card {
    border: 1px solid #ddd;
    border-radius: 5px;
    padding: 20px;
    text-align: center;
    transition: transform 0.3s ease-in-out;
}

.card:hover {
    transform: scale(1.05);
}

.card img {
    width: 100%;
    height: auto;
}

#contact {
    width: 100%;
}

#contact form {
    display: flex;
    flex-direction: column;
    gap: 10px;
}

#contact label {
    font-weight: bold;
}

#contact input, #contact textarea {
    padding: 10px;
    border: 1px solid #ddd;
    border-radius: 5px;
}

#contact input[type="submit"] {
    background-color: #333;
    color: #fff;
    cursor: pointer;
}

#contact input[type="submit"]:hover {
    background-color: #444;
}
```
Nel codice HTML, ho aggiunto una nuova sezione "OOP" e una sezione "contatto". Nella sezione "contatto", ho creato un semplice modulo di contatto con campi per il nome, l'email e il messaggio. Ho impostato l'attributo required per ciascun campo per assicurarmi che l'utente non possa inviare il modulo senza compilare tutti i campi.

Nel file CSS, ho aggiunto degli stili per il modulo di contatto. Ho utilizzato flexbox per allineare verticalmente i campi del modulo e ho aggiunto un po' di spazio tra di essi utilizzando la proprietà gap. Ho anche aggiunto degli stili per i campi di input e il pulsante di invio per renderli più attraenti.


## 8 parte


implementa le icone font awesome

Font Awesome è una libreria di icone molto popolare che può essere facilmente utilizzata in un sito web. Ecco come potresti includere le icone di Font Awesome nel tuo sito:

Prima di tutto, dovresti includere Font Awesome nel tuo progetto. Puoi farlo aggiungendo il seguente link nel tag head del tuo file HTML:
```html

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
```
Ora puoi utilizzare le icone di Font Awesome nel tuo HTML. Ad esempio, potresti voler aggiungere icone relative alle tue competenze in ciascuna delle sezioni del tuo sito. Ecco come potrebbe apparire il tuo HTML:
```html

<div class="section" id="backend">
    <div class="card">
        <i class="fas fa-server"></i>
        <h2>Sviluppo Backend</h2>
        <p>Competenze in Node.js, Express.js, Python, Django, Ruby on Rails, ecc.</p>
    </div>
</div>
<div class="section" id="frontend">
    <div class="card">
        <i class="fas fa-laptop-code"></i>
        <h2>Sviluppo Frontend</h2>
        <p>Competenze in HTML, CSS, JavaScript, React.js, Vue.js, Angular.js, ecc.</p>
    </div>
</div>
<div class="section" id="database">
    <div class="card">
        <i class="fas fa-database"></i>
        <h2>Gestione Database</h2>
        <p>Competenze in MySQL, PostgreSQL, MongoDB, Firebase, ecc.</p>
    </div>
</div>
<div class="section" id="oop">
    <div class="card">
        <i class="fas fa-project-diagram"></i>
        <h2>Programmazione Orientata agli Oggetti</h2>
        <p>Competenze in Java, C++, Python, ecc.</p>
    </div>
</div>
```
Nell'esempio sopra, ho utilizzato l'icona fa-server per la sezione di sviluppo backend, fa-laptop-code per la sezione di sviluppo frontend, fa-database per la sezione di gestione database e fa-project-diagram per la sezione di programmazione orientata agli oggetti.

Infine, potrebbe essere necessario aggiungere alcuni stili CSS per le icone. Ecco un esempio di come potresti farlo:
```css

.card i {
    font-size: 2em;
    margin-bottom: 20px;
}
```
Nell'esempio sopra, ho aumentato la dimensione delle icone a 2em e ho aggiunto un margine inferiore di 20px per separare le icone dagli header sottostanti.Puoi personalizzare questi stili come preferisci.

## 9 parte

visualizza le competenze con delle bars colored

Per visualizzare le competenze con delle barre colorate, è possibile utilizzare le barre di avanzamento HTML progress o creare le proprie barre di avanzamento personalizzate utilizzando divs e CSS. Ecco un esempio di come si potrebbe fare utilizzando divs e CSS:

File HTML (index.html):

```html

<div class="section" id="skills">
    <h2>Le mie competenze</h2>
    <div class="skill">
        <p>HTML</p>
        <div class="progress">
            <div class="progress-bar" style="width: 90%"></div>
        </div>
    </div>
    <div class="skill">
        <p>CSS</p>
        <div class="progress">
            <div class="progress-bar" style="width: 85%"></div>
        </div>
    </div>
    <div class="skill">
        <p>JavaScript</p>
        <div class="progress">
            <div class="progress-bar" style="width: 80%"></div>
        </div>
    </div>
    <!-- Aggiungi altre competenze qui... -->
</div>
```
File CSS (styles.css):

```css

.skill {
    margin: 20px 0;
}

.progress {
    width: 100%;
    background-color: #ddd;
    border-radius: 5px;
}

.progress-bar {
    height: 20px;
    background-color: #4caf50;
    border-radius: 5px;
}
```
In questo esempio, ciascuna competenza è rappresentata da un div con la classe "skill", che contiene un paragrafo con il nome della competenza e un altro div con la classe "progress". All'interno del div "progress" c'è un altro div con la classe "progress-bar", la cui larghezza viene impostata inline in base al livello di competenza.

Nel file CSS, ho aggiunto degli stili per i div "progress" e "progress-bar". Ho impostato la larghezza del div "progress" al 100% del suo contenitore e ho dato al div "progress-bar" un'altezza di 20px. Ho anche dato a entrambi i div un bordo arrotondato per un aspetto più piacevole.


## 10 parte




Di seguito, un esempio di come potrebbe essere migliorata l'esperienza utente:

File HTML (index.html):

```html

<div class="section" id="skills">
    <h2>Le mie competenze</h2>
    <div class="skill">
        <p>HTML</p>
        <div class="progress">
            <div class="progress-bar" style="width: 90%;">
                <span>90%</span>
            </div>
        </div>
    </div>
    <div class="skill">
        <p>CSS</p>
        <div class="progress">
            <div class="progress-bar" style="width: 85%;">
                <span>85%</span>
            </div>
        </div>
    </div>
    <div class="skill">
        <p>JavaScript</p>
        <div class="progress">
            <div class="progress-bar" style="width: 80%;">
                <span>80%</span>
            </div>
        </div>
    </div>
    <!-- Aggiungi altre competenze qui... -->
</div>
```
File CSS (styles.css):

```css

.skill {
    margin: 20px 0;
}

.progress {
    width: 100%;
    background-color: #ddd;
    border-radius: 5px;
    position: relative;
}

.progress-bar {
    height: 20px;
    background-color: #4caf50;
    border-radius: 5px;
    display: flex;
    align-items: center;
    justify-content: center;
    color: #fff;
    font-size: 0.8em;
    font-weight: bold;
    position: relative;
    overflow: hidden;
}

.progress-bar span {
    position: absolute;
    right: 10px;
}
```
In questo esempio, ho aggiunto un elemento span all'interno di ciascun div "progress-bar" per visualizzare la percentuale di competenza. Nel file CSS, ho aggiunto stili per allineare l'elemento <span> al centro del div "progress-bar" e per cambiare il colore del testo in bianco. Ho anche ridotto la dimensione del font e ho impostato l'attributo font-weight su "bold" per rendere il testo più visibile.

Inoltre, ho aggiunto il codice CSS position: relative; alla classe "progress" e position: absolute; con right: 10px; alla classe "span". Ciò consente di posizionare la percentuale di competenza alla destra della barra di progresso.

## 11 parte





er continuare a migliorare il design, possiamo aggiungere alcune animazioni alle barre di avanzamento per renderle più interattive. Inoltre, possiamo migliorare l'aspetto delle barre di avanzamento aggiungendo delle ombre per dare un effetto tridimensionale.

File HTML (index.html):

```html

<div class="section" id="skills">
    <h2>Le mie competenze</h2>
    <div class="skill">
        <p>HTML</p>
        <div class="progress" data-value="90%">
            <div class="progress-bar">
                <span>90%</span>
            </div>
        </div>
    </div>
    <div class="skill">
        <p>CSS</p>
        <div class="progress" data-value="85%">
            <div class="progress-bar">
                <span>85%</span>
            </div>
        </div>
    </div>
    <div class="skill">
        <p>JavaScript</p>
        <div class="progress" data-value="80%">
            <div class="progress-bar">
                <span>80%</span>
            </div>
        </div>
    </div>
    <!-- Aggiungi altre competenze qui... -->
</div>
```
File CSS (styles.css):

```css

.skill {
    margin: 20px 0;
}

.progress {
    width: 100%;
    background-color: #ddd;
    border-radius: 5px;
    position: relative;
    box-shadow: 0 2px 4px 0 rgba(0,0,0,0.2);
}

.progress-bar {
    width: 0; /* valore di partenza */
    height: 20px;
    background-color: #4caf50;
    border-radius: 5px;
    display: flex;
    align-items: center;
    justify-content: center;
    color: #fff;
    font-size: 0.8em;
    font-weight: bold;
    position: relative;
    overflow: hidden;
    transition: width 2s ease-in-out; /* durata dell'animazione */
}

.progress-bar span {
    position: absolute;
    right: 10px;
}

```
File JavaScript (scripts.js):

```javascript

window.addEventListener('DOMContentLoaded', (event) => {
    document.querySelectorAll('.progress').forEach((item) => {
        let value = item.getAttribute('data-value');
        let bar = item.querySelector('.progress-bar');
        setTimeout(function() {
            bar.style.width = value;
        }, 500); /* ritardo dell'animazione */
    });
});

```
In questo esempio, ho aggiunto un attributo data-value a ciascun div "progress" nel file HTML per memorizzare il valore di competenza. Nel file CSS, ho impostato la proprietà transition del div "progress-bar" per creare un'animazione quando la larghezza viene modificata.

Infine, nel file JavaScript, ho aggiunto un listener dell'evento 'DOMContentLoaded' che cambia la larghezza di ciascun div "progress-bar" al valore memorizzato nell'attributo data-value quando il documento viene caricato. Ciò crea un effetto di animazione in cui la barra di avanzamento si riempie gradualmente al caricamento della pagina.