public class BreakLoop
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 10; i++) // il ciclo si verifica per 10 volte
        {
            if (i == 5) // ma se i è uguale a 5 allora esce dal loop
            {
                break; // esci dal programma
            }
            System.out.println(i);
        }
    }
}