
public class InstanceCallsStatic 
{
    void show()
    {
        Disp();
        InstanceCallsStatic.Disp();
        InstanceCallsStatic o = new InstanceCallsStatic();
        o.Disp();
    }

    public static void main(String[] args)
    {
        InstanceCallsStatic o = new InstanceCallsStatic();
        o.show();
    }

    static void Disp()
    {
        System.out.println("mohammadhashim.exe");
    }

}
