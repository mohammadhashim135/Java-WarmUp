class A
{
    void show()
    {
        try
        {
            throw new Exception();
        }
        catch(Exception e)
        {
            System.out.println("Exception Handled...");
        }
    }
}

public class CheckedException
{
    public static void main(String[] args)
    {
        A o = new A();
        o.show();
    }
}