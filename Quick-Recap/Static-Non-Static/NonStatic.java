public class NonStatic 
{
    NonStatic()
    {
        System.out.println("Hiiii...");
    }    

    int x = 10;
    int y = 91;
    int z = x * y;

    {
        System.out.println(x + " * " + y + " = " + z);
    }

    public static void main(String[] args)
    {
        System.out.println("I am Main Block.");
        NonStatic a = new NonStatic();
    }

    
    
    {
        System.out.println("I am after Main Block.");
    }
}
