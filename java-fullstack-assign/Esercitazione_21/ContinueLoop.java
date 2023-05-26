public class ContinueLoop
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 10; i++)
        {
            if (i % 2 == 0) // % sta per modulo è cioè il resto di una divisione
            {
                continue;
            }
            System.out.println(i);
        }
        
    }
}