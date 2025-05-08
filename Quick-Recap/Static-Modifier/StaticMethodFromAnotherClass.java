class B 
{
    static void show() 
    {
        System.out.println("Hello from class B");
    }
}


public class StaticMethodFromAnotherClass 
{
    public static void main(String[] args) 
    {
        Disp();
    }
    
    static void Disp()
    {
        System.out.println("mohammadhashim.exe");
        B.show();
        B o = new B();
        o.show();
    }
}
