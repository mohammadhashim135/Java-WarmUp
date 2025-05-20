class Exp extends Exception
{
    Exp(String m)
    {
        super(m);
    }

    Exp(String m, Throwable cause)
    {
        super(m, cause);
    }
}

public class ChainedException 
{
    public static void main(String[] args)
    {
        try
        {
            try
            {
                int p = 10 / 0;
            }
            catch (ArithmeticException e)
            {
                throw new Exp("Chained Arithmetic Exception...", e);
            }
        }
        catch (Exp e)
        {
            System.out.println("Caught custom exception: " + e.getMessage());
            System.out.println("Cause: " + e.getCause());
        }
    }    
}
