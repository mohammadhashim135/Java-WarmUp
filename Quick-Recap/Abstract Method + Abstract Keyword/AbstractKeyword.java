abstract class A
{
    abstract void disp();  

    void show()
    {
        System.out.println("Concrete method in class A");
    }
}

class B extends A
{
    
    void disp()
    {
        System.out.println("Implementation of disp() in subclass B");
    }
}

public class AbstractKeyword
{
    public static void main(String[] args)
    {
        B obj = new B();
        obj.disp();
        obj.show();
    }
}
