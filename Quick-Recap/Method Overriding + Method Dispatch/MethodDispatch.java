import java.io.*;

class A
{
    void disp()
    {
        System.out.println("Method of class A");
    }
}

class B extends A
{ 
    void disp()
    {
        System.out.println("Method of class A using B: ");
        super.disp();
        System.out.println("Method of class B");
    }
}

public class MethodDispatch
{
    public static void main(String[] args) throws IOException
    {
        A a;
        B o = new B();
        a = o;
        a.disp();
    }
}
