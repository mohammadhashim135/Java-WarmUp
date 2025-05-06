public class Constructors 
{
    int x, y;
    String m;  

    public Constructors() 
    {
        x = 10;
        y = 20;
        m = "\nDefault Constructor : x=" + x + ", y=" + y;
    }

    public Constructors(int a) 
    {
        x = y = a;
        m = "\nConstructor with one parameter : x=" + x + ", y=" + y;
    }

    public Constructors(int a, int b) 
    {
        x = a;
        y = b;
        m = "\nConstructor with double parameter : x=" + x + ", y=" + y;
    }

    public Constructors(Constructors c) 
    {
        x = c.x;
        y = c.y;
        m = "\nCopy Constructor : x=" + x + ", y=" + y;
    }

    public void disp() {
        System.out.println(m);
    }

    public static void main(String[] args) 
    {
        Constructors a = new Constructors();
        Constructors b = new Constructors(10);
        Constructors c = new Constructors(5, 15);
        Constructors d = new Constructors(b); 

        a.disp();
        b.disp();
        c.disp();
        d.disp();
    }
}
