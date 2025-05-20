class A extends Thread 
{
    public void run() 
    {
        for (int i = 2; i <= 10; i += 2) 
        {
            System.out.println(getName() + " - Even Number: " + i);
            try 
            {
                Thread.sleep(300);
            } 
            catch (InterruptedException e) 
            {

            }
        }
    }
}

class B implements Runnable 
{
    public void run() 
    {
        Thread t = Thread.currentThread();
        for (int i = 1; i < 10; i += 2) 
        {
            System.out.println(t.getName() + " - Odd Number: " + i);
            try 
            {
                Thread.sleep(400);
            } 
            catch (InterruptedException e) 
            {

            }
        }
    }
}

public class MultipleThread 
{
    public static void main(String[] args) throws InterruptedException 
    {
        A a = new A();
        a.setName("Thread-A");
        a.setPriority(Thread.MAX_PRIORITY);

        B b = new B();
        Thread t = new Thread(b);
        t.setName("Thread-B");
        t.setPriority(Thread.MIN_PRIORITY);

        a.start();
        t.start();

        a.join();
        t.join();

        System.out.println(a.getName() + " Priority: " + a.getPriority());
        System.out.println(t.getName() + " Priority: " + t.getPriority());
    }
}
