# le espressioni regolari

>Le espressioni regolari sono molto potenti e possono essere usate per fare molte cose.

**usare le espressioni regolari per**

trovare i caratteri speciali in una stringa
trovare i numeri in una stringa
trovare le parole in una stringa
trovare le parole in una stringa che iniziano con una lettera specifica
trovare le parole in una stringa che terminano con una lettera specifica
trovare le parole in una stringa che iniziano e terminano con una lettera specifica
trovare le parole in una stringa che contengono una lettera specifica
trovare le email in una stringa
trovare i numeri di telefono in una stringa
trovare tutti i testi in una stringa che sono compresi tra due stringhe specifiche ed escludere le stringhe specifiche
trovare tutti i testi in una stringa che sono compresi tra due stringhe specifiche ed altre due stringhe specifiche ed escludere le stringhe specifiche salvando i risultati in un txt

**trovare i caratteri speciali in una stringa**

```java
 import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{
	public static void main(String[] args)
	{
		String str = "Ciao, come stai?";

		// Cerchiamo i caratteri speciali in str usando una espressione regolare
		// "[^\\w\\s]" è una espressione regolare che cerca tutti i caratteri speciali
		// [^\\w\\s] significa: cerca tutti i caratteri che non sono lettere, numeri o spazi
		Pattern pattern = Pattern.compile("[^\\w\\s]");
		Matcher matcher = pattern.matcher(str);

		// Stampa i risultati trovati
		while (matcher.find())
		{
			System.out.println(matcher.group());
		}
	}
}
```


