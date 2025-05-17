import java.io.*;

class A 
{
    int x,y;
    void setxy() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the value of x: ");
        x = Integer.parseInt(br.readLine());
        System.out.print("Enter the value of y: ");
        y = Integer.parseInt(br.readLine());
    }    

    void disp()
    {
        System.out.print("\nX : " + x + " Y: " + y);
    }
}

class B extends A
{
    int p,q;
    void setpq() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nEnter the value of p: ");
        p = Integer.parseInt(br.readLine());
        System.out.print("Enter the value of q: ");
        q = Integer.parseInt(br.readLine());
    }    

    void show()
    {
        System.out.print("\nP : " + p + " Q: " + q);
    }
}

public class SingleInheritance
{
    public static void main(String[] args) throws IOException
    {
        B o = new B();
        o.setpq();
        o.setxy();
        o.disp();
        o.show();
    }
}



