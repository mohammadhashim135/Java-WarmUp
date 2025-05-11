import java.io.*;

public class Queue
{
    int[] a;
    int m;
    int front;
    int rear;

    public Queue(int n)
    {
        m = n;
        a = new int[m];
        front = 0;
        rear = -1;
    }

    public boolean isempty()
    {
        return front > rear;
    }

    public boolean isfull()
    {
        return rear == m - 1;
    }

    public  void enqueue(int e)
    {
        if (isfull())
        {
            System.out.println("Overflow!");
            return;
        }
        a[++rear] = e;
        System.out.println("Enqueued: " + e);
    }

    public void dequeue()
    {
        if (isempty())
        {
            System.out.println("Underflow!");
            return;
        }

        int k = a[front];
        front++;

        System.out.println("Dequeued: " + k);
    }

    public void display()
    {
        if (isempty())
        {
            System.out.println("Underflow!");
            return;
        }

        System.out.print("Queued Elements: ");
        for(int i=front;i<=rear;i++)
        {
            System.out.print(a[i] + " ");
        }   
    }

    public void displayfront()
    {
        if (isempty())
        {
            System.out.println("Underflow!");
            return;
        }

        System.out.println("Element at Front: " + a[front]);
    }

    public void displayrear()
    {
        if (isempty())
        {
            System.out.println("Underflow!");
            return;
        }

        System.out.println("Element at Rear: " + a[rear]);
    }

    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nEnter the size of queue: ");
        int n = Integer.parseInt(br.readLine());

        Queue q = new Queue(n);
        while(true)
        {
            System.out.println("\n ---- Queue Menu ---- ");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display Front");
            System.out.println("4. Display Rear");
            System.out.println("5. Display (all)");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int c = Integer.parseInt(br.readLine());

            switch(c)
            {
                case 1:
                    System.out.print("\nEnter the Element to enqueue: ");
                    int e = Integer.parseInt(br.readLine());
                    q.enqueue(e);
                    break;
                
                case 2:
                    q.dequeue();
                    break;

                case 3:
                    q.displayfront();
                    break;

                case 4:
                    q.displayrear();
                    break;

                case 5:
                    q.display();
                    break;
                
                case 6:
                    System.out.print("Exiting....");
                    System.exit(0);
                
                default:
                    System.out.print("\nInvalid Choice!!!");
                    break;
            }
        }
    }
}