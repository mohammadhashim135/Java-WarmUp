class A {
    private int balance = 1000;

    public synchronized void withdraw(int amount, String name) 
    {
        System.out.println(name + " is trying to withdraw Rs." + amount);
        if (balance >= amount) 
        {
            System.out.println(name + " is about to withdraw...");
            balance -= amount;
            System.out.println(name + " completed the withdrawal. Remaining balance: Rs." + balance);
        } 
        else 
        {
            System.out.println("Sorry, not enough balance for " + name);
        }
    }
}

class B extends Thread 
{
    private A acc;
    private int amt;
    private String user;

    public B(A acc, int amt, String user) 
    {
        this.acc = acc;
        this.amt = amt;
        this.user = user;
    }

    public void run() {
        acc.withdraw(amt, user);
    }
}

public class Threads 
{
    public static void main(String[] args) 
    {
        A a = new A();
        B b = new B(a, 700, "User1");
        B c = new B(a, 500, "User2");

        b.start();
        c.start();
    }
}
