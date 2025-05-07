import java.io.*;

public class Stacks
{
    int[] a;
    int m;
    int t;

    public Stacks(int n)
    {
        m = n;
        a = new int[m];
        t = -1;
    }

    public boolean isempty()
    {
        return t == -1;
    }

    public boolean isfull()
    {
        return t == m - 1;
    }

    public  void push(int e)
    {
        if (isfull())
        {
            System.out.println("Overflow!");
            return;
        }
        a[++t] = e;
        System.out.println("Pushed: " + e);
    }

    public void pop()
    {
        if (isempty())
        {
            System.out.println("Underflow!");
            return;
        }

        int k = a[t];
        t--;

        System.out.println("Popped: " + k);
    }

    public void display()
    {
        if (isempty())
        {
            System.out.println("Underflow!");
            return;
        }

        System.out.print("Stacked Elements: ");
        for(int i=t;i>=0;i--)
        {
            System.out.print(a[i] + " ");
        }
    }

    public void displaytop()
    {
        if (isempty())
        {
            System.out.println("Underflow!");
            return;
        }

        System.out.println("Element at Top: " + a[t]);
        
    }

    public void displaybot()
    {
        if (isempty())
        {
            System.out.println("Underflow!");
            return;
        }

        System.out.println("Element at Bottom: " + a[0]);
        
    }

    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nEnter the size of stack: ");
        int n = Integer.parseInt(br.readLine());

        Stacks s = new Stacks(n);
        while(true)
        {
            System.out.println("\n ---- Stack Menu ---- ");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display Top");
            System.out.println("4. Display Bottom");
            System.out.println("5. Display (all)");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int c = Integer.parseInt(br.readLine());

            switch(c)
            {
                case 1:
                    System.out.print("\nEnter the Element to push: ");
                    int e = Integer.parseInt(br.readLine());
                    s.push(e);
                    break;
                
                case 2:
                    s.pop();
                    break;
                
                case 3:
                    s.displaytop();
                    break;

                case 4:
                    s.displaybot();
                    break;

                case 5:
                    s.display();
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