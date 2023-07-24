# CREAZIONE PROGETTO WEBAPP

La creazione di una web app con Java richiede la conoscenza di alcuni concetti fondamentali, tra cui

**Servlet**
>un oggetto Java che gestisce le richieste HTTP e le risposte per una web app

**JSP JavaServer Pages**
>una tecnologia utilizzata per creare pagine web dinamiche utilizzando Java

**Framework web**
>Spring ed una raccolta di librerie e strumenti per semplificare lo sviluppo di una web app

**Database**
>la gestione dei dati della web app può essere effettuata utilizzando un database. Java supporta diversi database, come MySQL, Oracle, e PostgreSQL

Una volta acquisite le conoscenze di base, la creazione di una web app con Java segue generalmente questi passaggi

- Definire i requisiti della web app e il suo design
- Creare il progetto Maven per la web app
- Configurazione del server web (ad esempio Tomcat)
- Creare le servlet e le JSP necessarie per la logica della web app
- Configurare il file web.xml per mappare le servlet e le JSP e gestire le richieste HTTP
- Utilizzare un framework web se necessario per semplificare lo sviluppo
- Integrare il database per memorizzare e recuperare i dati della web app
- Testare la web app e risolvere eventuali problemi
- Distribuire la web app su un server web renderla disponibile al pubblico

# Esercizio creazione di una semplice webapp per il testing

>In questo esercizio, creeremo una semplice applicazione web Java utilizzando Maven per la gestione delle dipendenze e l'esecuzione dei test
La webapp avrà una semplice pagina HTML e un servlet Java che risponderà alle richieste HTTP

Crea un nuovo progetto Maven utilizzando l'archetipo maven-archetype-webapp:

>mvn archetype:generate -DgroupId=com.example -DartifactId=simple-webapp -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false

Entra nella directory del nuovo progetto

>cd simple-webapp

Apri il file pom.xml e aggiungi le seguenti dipendenze per utilizzare Java Servlet e JUnit per i test

```xml
<dependencies>
    <dependency>
        <groupId>javax.servlet</groupId>
        <artifactId>javax.servlet-api</artifactId>
        <version>4.0.1</version>
        <scope>provided</scope>
    </dependency>
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.13.2</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```
Crea un nuovo file HelloServlet.java nella directory src/main/java/com/example e aggiungi il seguente codice
```java
package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().print("Hello, World!");
    }
}
```
Modifica il file src/main/webapp/WEB-INF/web.xml e aggiungi la configurazione per il servlet HelloServlet:
```xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee
                             http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd"
         version="4.0">

    <servlet>
        <servlet-name>HelloServlet</servlet-name>
        <servlet-class>com.example.HelloServlet</servlet-class>
    </servlet>

    <servlet-mapping>
        <servlet-name>HelloServlet</servlet-name>
        <url-pattern>/hello</url-pattern>
    </servlet-mapping>
</web-app>
```
Crea un nuovo file HelloServletTest.java nella directory src/test/java/com/example e aggiungi il seguente codice per testare il servlet
```java
package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloServletTest {

    @Test
    public void testDoGet() {
        HelloServlet servlet = new HelloServlet();
        assertEquals("Hello, World!", servlet.doGet());
    }
}
```
Esegui i test del progetto utilizzando il comando mvn test nella directory del progetto

>mvn test

Se tutto è stato configurato correttamente, i test dovrebbero essere eseguiti con successo

Ora hai una semplice webapp con un servlet Java e un test associato. 

**Ora, configuriamo un server web per eseguire l'applicazione e testarla nel browser**

Aggiungi la dipendenza e il plugin per il server web Jetty nel file pom.xml. Questo ti permetterà di eseguire la tua applicazione utilizzando il comando mvn jetty:run:
```xml
<dependencies>
    <!-- altre dipendenze... -->
    <dependency>
        <groupId>org.eclipse.jetty</groupId>
        <artifactId>jetty-servlet</artifactId>
        <version>9.4.43.v20210629</version>
        <scope>provided</scope>
    </dependency>
</dependencies>

<build>
    <plugins>
        <plugin>
            <groupId>org.eclipse.jetty</groupId>
            <artifactId>jetty-maven-plugin</artifactId>
            <version>9.4.43.v20210629</version>
        </plugin>
    </plugins>
</build>
```
Avvia il server Jetty e la tua applicazione web utilizzando il comando mvn jetty:run:

>mvn jetty:run

Apri il browser e visita l'URL http://localhost:8080/simple-webapp/hello per vedere la tua applicazione in azione

Dovresti vedere il messaggio "Hello, World!" visualizzato nella pagina 

# Esercizio Creazione di una webapp con Spring Boot 

In questo esercizio, creeremo una semplice applicazione web utilizzando Spring Boot
Spring Boot è un framework che semplifica lo sviluppo di applicazioni basate su Spring, offrendo una configurazione predefinita e facilitando la gestione delle dipendenze.

Crea una nuova directory per il progetto e naviga nella directory:

>mkdir spring-boot-webapp
>cd spring-boot-webapp

Inizializza un progetto Maven nella directory del progetto:

>mvn archetype:generate -DgroupId=com.example -DartifactId=spring-boot-webapp -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

Apri il file pom.xml e aggiungi le seguenti dipendenze e plugin per utilizzare Spring Boot:
```xml
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>2.5.5</version>
    <relativePath/> <!-- lookup parent from repository -->
</parent>

<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
</dependencies>

<build>
    <plugins>
        <plugin>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-maven-plugin</artifactId>
        </plugin>
    </plugins>
</build>
```
Crea un nuovo file SpringBootWebappApplication.java nella directory src/main/java/com/example e aggiungi il seguente codice:
```java
package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWebappApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebappApplication.class, args);
    }
}
```
Crea un nuovo file HelloController.java nella directory src/main/java/com/example e aggiungi il seguente codice:
```java
package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}
```
Avvia l'applicazione Spring Boot utilizzando il comando mvn spring-boot:run:

>mvn spring-boot:run

Apri il browser e visita l'URL http://localhost:8080/hello per vedere la tua applicazione in azione

Dovresti vedere il messaggio "Hello, World!" visualizzato nella pagina

Ora hai una semplice applicazione web basata su Spring Boot. Puoi estendere ulteriormente l'applicazione aggiungendo altre funzionalità, come la gestione dei dati con Spring Data JPA, la sicurezza con Spring Security o l'utilizzo di template per creare pagine HTML dinamiche con Thymeleaf o altri motori di templating

# Esercizio Creazione di una webapp con Spring Boot per il testing

In questo esercizio, estenderemo l'applicazione web basata su Spring Boot creata nell'esercizio precedente per includere il testing con JUnit e Mockito.

Assicurati di avere l'applicazione Spring Boot creata nell'esercizio precedente.
Apri il file pom.xml e aggiungi le seguenti dipendenze per utilizzare JUnit e Mockito:
```xml
<dependencies>
    <!-- altre dipendenze... -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.mockito</groupId>
        <artifactId>mockito-core</artifactId>
        <version>4.2.0</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```
Crea un nuovo file HelloControllerTest.java nella directory src/test/java/com/example e aggiungi il seguente codice per testare il controller
```java
package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testHello() throws Exception {
        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello, World!"));
    }
}
```
Questo test utilizza il framework MockMvc di Spring per testare il comportamento del controller in modo isolato, senza la necessità di avviare un server web completo

Il test verifica che il controller risponda con un HTTP status 200 (OK) e che il contenuto della risposta sia "Hello, World!"

Esegui i test del progetto utilizzando il comando mvn test

>mvn test

Se tutto è stato configurato correttamente, i test dovrebbero essere eseguiti con successo

Ora hai una semplice applicazione web basata su Spring Boot con test

# Esercizio per creare pagine HTML dinamiche con Thymeleaf o altri motori di templating 

In questo esercizio, estenderemo l'applicazione web basata su Spring Boot creata negli esercizi precedenti per utilizzare Thymeleaf come motore di templating e creare pagine HTML dinamiche.

Assicurati di avere l'applicazione Spring Boot creata negli esercizi precedenti

Apri il file pom.xml e aggiungi la seguente dipendenza per utilizzare Thymeleaf
```xml
<dependencies>
    <!-- altre dipendenze... -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-thymeleaf</artifactId>
    </dependency>
</dependencies>
```
Modifica il file HelloController.java nella directory src/main/java/com/example e aggiungi il seguente codice per utilizzare Thymeleaf e un modello per creare una pagina HTML dinamica
```java
package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello, World!");
        return "hello";
    }
}
```
Nota che abbiamo sostituito l'annotazione @RestController con @Controller e abbiamo aggiunto un parametro Model al metodo hello. Il metodo ora restituisce il nome del template "hello" invece di una stringa direttamente.

Crea una nuova directory templates nella directory src/main/resources:

>mkdir -p src/main/resources/templates

Crea un nuovo file hello.html nella directory src/main/resources/templates e aggiungi il seguente codice:
```html
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Hello</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
</head>
<body>
    <h1 th:text="${message}">Hello, World!</h1>
</body>
</html>
```
Questo template utilizza Thymeleaf per visualizzare dinamicamente il messaggio fornito dal controller. L'attributo th:text viene utilizzato per inserire il valore della variabile message nel tag h1

Avvia l'applicazione Spring Boot utilizzando il comando mvn spring-boot:run:

>mvn spring-boot:run

Apri il browser e visita l'URL http://localhost:8080/hello per vedere la tua applicazione in azione.

Dovresti vedere il messaggio "Hello, World!" visualizzato nella pagina, generato dinamicamente dal template Thymeleaf

Ora hai una semplice applicazione web basata su Spring Boot che utilizza Thymeleaf per creare pagine HTML dinamiche. Puoi continuare ad aggiungere altre funzionalità

# esercizio aggiungi più pagine con un unico template

In questo esercizio, estenderemo l'applicazione web basata su Spring Boot creata negli esercizi precedenti per includere più pagine utilizzando un unico template e un semplice menu di navigazione

Assicurati di avere l'applicazione Spring Boot creata negli esercizi precedenti, con Thymeleaf configurato come motore di templating

Modifica il file HelloController.java nella directory src/main/java/com/example e aggiungi i seguenti metodi per gestire le richieste per le nuove pagine
```java
// ...

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello, World!");
        return "hello";
    }

    @GetMapping("/page1")
    public String page1() {
        return "page1";
    }

    @GetMapping("/page2")
    public String page2() {
        return "page2";
    }
}
```

Crea due nuovi file page1.html e page2.html nella directory src/main/resources/templates, con il seguente contenuto
```html
page1.html:

html
Copy code
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Page 1</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
</head>
<body>
    <h1>Page 1</h1>
    <p>This is page 1.</p>
</body>
</html>
```
page2.html
```html
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Page 2</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
</head>
<body>
    <h1>Page 2</h1>
    <p>This is page 2.</p>
</body>
</html>
```
Creare un nuovo file header.html nella directory src/main/resources/templates, con il seguente contenuto:
```html
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title th:fragment="title">Title</title>
</head>
<body>
    <nav th:fragment="menu">
        <ul>
            <li><a href="/hello">Hello</a></li>
            <li><a href="/page1">Page 1</a></li>
            <li><a href="/page2">Page 2</a></li>
        </ul>
    </nav>
</body>
</html>
```
Questo file contiene due frammenti Thymeleaf: uno per il titolo della pagina e uno per il menu di navigazione.

Modifica i file hello.html, page1.html e page2.html per includere i frammenti del titolo e del menu:
hello.html
```html
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head th:replace="header :: title">
    <title>Hello</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
</head>
<body>
    <nav th:replace="header :: menu"></nav>
    <h1 th:text="${message}">Hello, World!</h1>
</body>
</html>
```
page1.html
```html
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head th:replace="header :: title">
    <title>Page 1</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
</head>
<body>
    <nav th:replace="header :: menu"></nav>
    <h1>Page 1</h1>
    <p>This is page 1.</p>
</body>
</html>
```
page2.html
```html
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head th:replace="header :: title">
    <title>Page 2</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
</head>
<body>
    <nav th:replace="header :: menu"></nav>
    <h1>Page 2</h1>
    <p>This is page 2.</p>
</body>
</html>
```

Ora, i tre file HTML includono il titolo e il menu di navigazione dai frammenti definiti nel file header.html

Avvia l'applicazione Spring Boot utilizzando il comando mvn spring-boot:run:

>mvn spring-boot:run

Apri il browser e visita l'URL http://localhost:8080/hello per vedere la tua applicazione in azione

Dovresti vedere un menu di navigazione in cima a ciascuna pagina, che ti consente di passare tra le diverse pagine

Ora hai un'applicazione web basata su Spring Boot con più pagine e un menu di navigazione, utilizzando un unico template e frammenti Thymeleaf

# Esercizio aggiungi un controller che gestisce più viste

In questo esercizio, estenderemo l'applicazione web basata su Spring Boot creata negli esercizi precedenti per utilizzare un unico template e un controller che gestisce più viste

Assicurati di avere l'applicazione Spring Boot creata negli esercizi precedenti, con Thymeleaf configurato come motore di templating

Modifica il file HelloController.java nella directory src/main/java/com/example e aggiungi il seguente metodo per gestire le richieste per le nuove pagine
```java
// ...

@Controller
public class HelloController {

    @GetMapping({"/hello", "/page1", "/page2"})
    public String handleRequest(Model model, HttpServletRequest request) {
        String path = request.getServletPath();

        if (path.equals("/hello")) {
            model.addAttribute("title", "Hello");
            model.addAttribute("content", "Hello, World!");
        } else if (path.equals("/page1")) {
            model.addAttribute("title", "Page 1");
            model.addAttribute("content", "This is page 1.");
        } else if (path.equals("/page2")) {
            model.addAttribute("title", "Page 2");
            model.addAttribute("content", "This is page 2.");
        }

        return "template";
    }
}
```
Questo metodo gestisce tutte le richieste per /hello, /page1 e /page2 e utilizza il percorso della richiesta per determinare il titolo e il contenuto della pagina

Crea un nuovo file template.html nella directory src/main/resources/templates, con il seguente contenuto:

```html
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title th:text="${title}">Title</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
</head>
<body>
    <nav>
        <ul>
            <li><a href="/hello">Hello</a></li>
            <li><a href="/page1">Page 1</a></li>
            <li><a href="/page2">Page 2</a></li>
        </ul>
    </nav>
    <h1 th:text="${title}">Title</h1>
    <p th:text="${content}">Content</p>
</body>
</html>
```
Questo template utilizza Thymeleaf per visualizzare dinamicamente il titolo e il contenuto forniti dal controller

Avvia l'applicazione Spring Boot utilizzando il comando mvn spring-boot:run:

>mvn spring-boot:run

Apri il browser e visita l'URL http://localhost:8080/hello per vedere la tua applicazione in azione

Ora dovresti vedere un menu di navigazione in cima a ciascuna pagina

# Esercizio utilizza Spring Initializr

In questo esercizio, creeremo un'applicazione web che utilizza Spring MVC e Thymeleaf come motore di templating

Crea un nuovo progetto Spring Boot utilizzando Spring Initializr

https://start.spring.io

>selezionare "Web" e "Thymeleaf" nelle opzioni delle dipendenze.
Estrai il progetto generato e apri la cartella del progetto in Visual Studio Code

Apri il file pom.xml per assicurarti che le dipendenze per Spring MVC e Thymeleaf siano incluse
```xml
<dependencies>
    <!-- altre dipendenze... -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-thymeleaf</artifactId>
    </dependency>
</dependencies>
```
Crea un nuovo controller Java nella directory src/main/java/com/example chiamato MyController.java e aggiungi il seguente codice:
```java
package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Welcome to Spring MVC!");
        return "index";
    }
}
```
Crea una nuova directory templates nella directory src/main/resources:

>mkdir -p src/main/resources/templates

Crea un nuovo file index.html nella directory src/main/resources/templates e aggiungi il seguente codice:

```html
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Spring MVC</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
</head>
<body>
    <h1 th:text="${message}">Welcome to Spring MVC!</h1>
</body>
</html>
```
Avvia l'applicazione Spring Boot utilizzando il comando mvn spring-boot:run:

>mvn spring-boot:run

Apri il browser e visita l'URL http://localhost:8080/ per vedere la tua applicazione in azione
Dovresti vedere il messaggio "Welcome to Spring MVC!" visualizzato nella pagina
Ora hai creato un'applicazione web semplice utilizzando Spring MVC e Thymeleaf

# Esercizio aggiungi Spring Data

In questo esercizio, aggiungeremo Spring Data JPA e una semplice entità all'applicazione web Spring MVC creata nell'esercizio precedente.

Apri il file pom.xml e aggiungi le seguenti dipendenze per Spring Data JPA e H2, un database in-memory:
    
```xml
<dependencies>
    <!-- altre dipendenze... -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>com.h2database</groupId>
        <artifactId>h2</artifactId>
        <scope>runtime</scope>
    </dependency>
</dependencies>
```

Crea una nuova directory domain nella directory src/main/java/com/example:

mkdir -p src/main/java/com/example/domain

Crea una nuova classe Java Person.java nella directory src/main/java/com/example/domain e aggiungi il seguente codice
    
```java
package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;

    // Costruttori, getter e setter qui...
}
```

Crea una nuova directory repositories nella directory src/main/java/com/example:

mkdir -p src/main/java/com/example/repositories

Crea una nuova interfaccia Java PersonRepository.java nella directory src/main/java/com/example/repositories e aggiungi il seguente codice
    
```java
package com.example.repositories;

import com.example.domain.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
```
Modifica il controller MyController.java nella directory src/main/java/com/example per iniettare il PersonRepository e aggiungere alcuni dati al database
    
```java
package com.example;

import com.example.domain.Person;
import com.example.repositories.PersonRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    private final PersonRepository personRepository;

    public MyController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/")
    public String index(Model model) {
        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Doe");
        personRepository.save(person);

        model.addAttribute("message", "Welcome to Spring MVC with Spring Data!");
        return "index";
    }
}
```
Avvia l'applicazione Spring Boot utilizzando il comando mvn spring-boot:run:

>mvn spring-boot:run

Apri il browser e visita l'URL http://localhost:8080/ per vedere la tua applicazione in azione. Dovresti vedere il messaggio "Welcome to Spring MVC with Spring Data!" visualizzato nella pagina.
Ora hai aggiunto Spring Data JPA e un'entità al tuo progetto Spring MVC

# Esercizio aggiungi Spring Security 

In questo esercizio, aggiungeremo Spring Security all'applicazione web Spring MVC creata negli esercizi precedenti

Apri il file pom.xml e aggiungi la seguente dipendenza per Spring Security:
        
```xml
<dependencies>
    <!-- altre dipendenze... -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-security</artifactId>
    </dependency>
</dependencies>
```
Crea una nuova classe Java SecurityConfig.java nella directory src/main/java/com/example e aggiungi il seguente codice:
        
```java
package com.example;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .anyRequest().authenticated()
                .and()
            .formLogin()
                .permitAll()
                .and()
            .logout()
                .permitAll();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .inMemoryAuthentication()
                .withUser("user").password("{noop}password").roles("USER");
    }
}
```

Questa configurazione di sicurezza richiede l'autenticazione per tutte le richieste e abilita il modulo di accesso e logout predefinito di Spring Security. Utilizza anche un utente memorizzato nella memoria con username "user" e password "password".

Nota: l'uso di {noop} nella password indica a Spring Security di utilizzare una password in chiaro senza alcuna crittografia. Questo è solo per scopi dimostrativi e non dovrebbe essere utilizzato in un ambiente di produzione.

Modifica il file index.html nella directory src/main/resources/templates per mostrare il nome dell'utente autenticato:
            
```html
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Spring MVC with Spring Security</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
</head>
<body>
    <h1 th:text="${message}">Welcome to Spring MVC with Spring Security!</h1>
    <p th:text="${#authentication.name}">Username</p>
    <form th:action="@{/logout}" method="post">
        <input type="submit" value="Logout"/>
    </form>
</body>
</html>
```

Avvia l'applicazione Spring Boot utilizzando il comando mvn spring-boot:run:

mvn spring-boot:run

Apri il browser e visita l'URL http://localhost:8080/. Verrai reindirizzato alla pagina di accesso di Spring Security. Utilizza le credenziali dell'utente memorizzato nella memoria (username: "user", password: "password") per accedere.

Dovresti vedere il messaggio "Welcome to Spring MVC with Spring Security!" e il nome dell'utente autenticato visualizzato nella pagina.

Ora hai aggiunto Spring Security al tuo progetto Spring MVC. Puoi continuare a estendere la tua applicazione aggiungendo ulteriori configurazioni di sicurezza, autorizzazioni basate sui ruoli e funzionalità

Ecco alcuni esempi di come estendere la tua configurazione di sicurezza:

# Autorizzazione basata sui ruoli

Modifica la classe SecurityConfig.java per aggiungere autorizzazioni basate sui ruoli:

```java
@Override
protected void configure(HttpSecurity http) throws Exception {
    http
        .authorizeRequests()
            .antMatchers("/admin/**").hasRole("ADMIN")
            .anyRequest().authenticated()
            .and()
        .formLogin()
            .permitAll()
            .and()
        .logout()
            .permitAll();
}
```
In questo esempio, tutte le richieste all'URL /admin/** richiederanno il ruolo "ADMIN". Puoi aggiungere ulteriori regole di autorizzazione per altre aree della tua applicazione.

Aggiunta di più utenti e ruoli:
Modifica il metodo configure nella classe SecurityConfig.java per aggiungere più utenti e ruoli:

```java
@Override
protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth
        .inMemoryAuthentication()
            .withUser("user").password("{noop}password").roles("USER")
            .and()
            .withUser("admin").password("{noop}adminpassword").roles("ADMIN");
}
```
In questo esempio, abbiamo aggiunto un nuovo utente con username "admin" e password "adminpassword" con il ruolo "ADMIN".

Personalizzazione del modulo di accesso

Crea un nuovo file login.html nella directory src/main/resources/templates e aggiungi il seguente codice:

```html
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Login</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
</head>
<body>
    <h1>Login</h1>
    <form th:action="@{/login}" method="post">
        <p>Username: <input type="text" name="username"/></p>
        <p>Password: <input type="password" name="password"/></p>
        <p><input type="submit" value="Login"/></p>
    </form>
</body>
</html>
```

Modifica il metodo configure nella classe SecurityConfig.java per utilizzare il modulo di accesso personalizzato:

```java
@Override
protected void configure(HttpSecurity http) throws Exception {
    http
        .authorizeRequests()
            .antMatchers("/admin/**").hasRole("ADMIN")
            .anyRequest().authenticated()
            .and()
        .formLogin()
            .loginPage("/login")
            .permitAll()
            .and()
        .logout()
            .permitAll();
}
```
In questo esempio, abbiamo indicato a Spring Security di utilizzare il nostro modulo di accesso personalizzato.

Ora hai alcune idee su come estendere la tua applicazione con Spring Security

# Esercizio aggiungi una semplice gestione utenti per l'admin 

In questo esercizio, aggiungeremo una semplice gestione degli utenti per gli utenti con ruolo "ADMIN". Supponiamo che tu abbia già completato gli esercizi precedenti e abbia configurato Spring Security con autorizzazioni basate sui ruoli.

Crea una nuova directory admin nella directory src/main/java/com/example:

>mkdir -p src/main/java/com/example/admin

Crea una nuova classe Java AdminController.java nella directory src/main/java/com/example/admin e aggiungi il seguente codice:
```java
package com.example.admin;

import com.example.domain.Person;
import com.example.repositories.PersonRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    private final PersonRepository personRepository;

    public AdminController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/admin/users")
    public String getUsers(Model model) {
        Iterable<Person> users = personRepository.findAll();
        model.addAttribute("users", users);
        return "admin/users";
    }
}
```

Crea una nuova directory admin nella directory src/main/resources/templates:

>mkdir -p src/main/resources/templates/admin

Crea un nuovo file users.html nella directory src/main/resources/templates/admin e aggiungi il seguente codice:
    
```html
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Admin - User Management</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
</head>
<body>
    <h1>User Management</h1>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>First Name</th>
                <th>Last Name</th>
            </tr>
        </thead>
        <tbody>
            <tr th:each="user : ${users}">
                <td th:text="${user.id}">1</td>
                <td th:text="${user.firstName}">John</td>
                <td th:text="${user.lastName}">Doe</td>
            </tr>
        </tbody>
    </table>
    <a th:href="@{/}">Back to Home</a>
</body>
</html>
```

Assicurati che il tuo file SecurityConfig.java abbia la seguente configurazione per consentire l'accesso alla pagina di gestione degli utenti solo agli utenti con ruolo "ADMIN"
    
```java
@Override
protected void configure(HttpSecurity http) throws Exception {
    http
        .authorizeRequests()
            .antMatchers("/admin/**").hasRole("ADMIN")
            .anyRequest().authenticated()
            .and()
        .formLogin()
            .permitAll()
            .and()
        .logout()
            .permitAll();
}
```
Avvia l'applicazione Spring Boot utilizzando il comando mvn spring-boot:run:

>mvn spring-boot:run

Apri il browser e visita l'URL http://localhost:8080/

Effettua il login con un utente che ha il ruolo "ADMIN" e visita l'URL http://localhost:8080/admin/users

Dovresti vedere la lista degli utenti nella tua applicazione.

Ora hai aggiunto una semplice gestione degli utenti per gli utenti con ruolo "ADMIN" nella tua applicazione Spring MVC con Spring Security

Puoi continuare a sviluppare questa funzionalità aggiungendo, ad esempio, la possibilità di aggiungere, modificare ed eliminare utenti

# Creazione di nuovi utenti

Aggiungi un form HTML nella pagina users.html per consentire l'aggiunta di nuovi utenti

```html
<form th:action="@{/admin/users}" method="post">
    <p>First Name: <input type="text" name="firstName" required/></p>
    <p>Last Name: <input type="text" name="lastName" required/></p>
    <p><input type="submit" value="Add User"/></p>
</form>
```

Nella classe AdminController, aggiungi un nuovo metodo per gestire la richiesta POST per creare nuovi utenti:
    
```java
@PostMapping("/admin/users")
public String addUser(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
    Person person = new Person(firstName, lastName);
    personRepository.save(person);
    return "redirect:/admin/users";
}
```

# Modifica degli utenti

Per consentire la modifica degli utenti, è possibile aggiungere un link "Modifica" accanto a ciascun utente nella pagina users.html e creare una nuova pagina edit-user.html con un form per modificare i dettagli dell'utente. Nella classe AdminController, aggiungi nuovi metodi per gestire le richieste GET e POST per la modifica degli utenti

# Eliminazione degli utenti

Per consentire l'eliminazione degli utenti, è possibile aggiungere un link "Elimina" accanto a ciascun utente nella pagina users.html. Nella classe AdminController, aggiungi un nuovo metodo per gestire la richiesta POST per eliminare un utente. Potresti voler aggiungere una conferma di eliminazione per evitare eliminazioni accidentali.

# Gestione delle credenziali di accesso

Per gestire le credenziali di accesso degli utenti, potresti dover modificare la tua configurazione di sicurezza per utilizzare un'autenticazione basata su database. Inoltre, potresti voler aggiungere campi aggiuntivi nel form di creazione e modifica degli utenti per gestire username, password e ruoli.

Ricorda di testare attentamente le nuove funzionalità e di verificare che la sicurezza sia adeguata per proteggere le informazioni sensibili degli utenti.

In conclusione, con questi suggerimenti e gli esercizi precedenti, hai ora una solida base per continuare a sviluppare la tua applicazione web Spring MVC con Spring Security e una gestione degli utenti personalizzata per gli utenti