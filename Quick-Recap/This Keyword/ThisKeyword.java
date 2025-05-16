
public class ThisKeyword
{

    String name;
    int roll;

    ThisKeyword()
    {
        System.out.println("mohammadhashim135");
    }

    ThisKeyword(String a)
    {
        this();
        name = a;
        System.out.println("Name: " + name);
    }

    ThisKeyword(int x)
    {
        this("Mohammad Hashim.");
        roll = x;
        System.out.println("Roll.No: "+ roll);
    }

    public static void main(String[] args)
    {
        ThisKeyword o = new ThisKeyword(46);
    }
}