abstract class A
{
    abstract void disp();  
}

class B extends A
{
    void disp()  
    {
        System.out.println("Implementation of abstract method disp in class B");
    }
}

public class AbstractMethod
{
    public static void main(String[] args)
    {
        B obj = new B();
        obj.disp();
    }
}
