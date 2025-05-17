
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

public class MethodOverriding
{
    public static void main(String[] args)
    {
       
        B o = new B();
        o.disp();
        A a = new A();
        a.disp();
    }
}