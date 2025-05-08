public class StaticMethodViaObject 
{
    public static void main(String[] args) 
    {
        Disp();
        StaticMethodViaObject.Disp();
        StaticMethodViaObject o = new StaticMethodViaObject();
        o.Disp();
    }
    
    static void Disp()
    {
        System.out.println("mohammadhashim.exe");
    }
    
}
