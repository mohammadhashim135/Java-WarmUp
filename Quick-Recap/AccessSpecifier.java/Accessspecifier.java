public class Accessspecifier 
{

    public int a = 100;
    protected int b = 200;
    int c = 300;
    private int d = 400;

    public void p() 
    {
        System.out.println("public");
    }

    protected void q() 
    {
        System.out.println("protected");
    }

    void r() 
    {
        System.out.println("default");
    }

    private void s() 
    {
        System.out.println("private");
    }

    public void show() 
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        p();
        q();
        r();
        s();
    }

    public static void main(String[] args) 
    {
        Accessspecifier obj = new Accessspecifier();
        obj.show();

        C.test();
        B.testsub();
    }
}

class C 
{
    public static void test() 
    {
        Accessspecifier obj = new Accessspecifier();
        System.out.println("\nsame package different class");

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        // System.out.println(obj.d); // error

        obj.p();
        obj.q();
        obj.r();
        // obj.s(); // error
    }
}

class B extends Accessspecifier 
{
    public static void testsub() 
    {
        B sub = new B();
        System.out.println("\nsubclass access");

        System.out.println(sub.a);
        System.out.println(sub.b);
        // System.out.println(sub.c); // error
        // System.out.println(sub.d); // error

        sub.p();
        sub.q();
        // sub.r(); // error
        // sub.s(); // error
    }
}
