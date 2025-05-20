/*
FinalKey.java:9: error: cannot inherit from final A
class B extends A 
                ^
1 error
*/



final class A
{
    void disp()
    {
        System.out.print("\nmohammadhashim.exe");
    }
}

class B extends A 
{
    void show()
    {
        System.out.print("\nOye");
    }
}


public class FinalKey 
{
    public static void main(String[] args)
    {
        B o = new B();
        o.show();
        o.disp();
    }
}
