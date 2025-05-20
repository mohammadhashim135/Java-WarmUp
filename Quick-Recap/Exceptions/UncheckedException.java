class A
{
    void show()
    {
        try
        {
            throw new Error();
        }
        catch(Throwable e)
        {
            System.out.println("Exception Caught...");
        }
    }

    void disp()throws Exception
    {
        System.out.println("Display method...");
    }
}
public class UncheckedException 
{
    public static void main(String[] args)throws Exception
    {
        A o = new A();
        o.show();
        o.disp();
    }
}
