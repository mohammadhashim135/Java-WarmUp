import java.io.*;

class A
{
    int a[];
    int n;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void input() throws IOException
    {
        System.out.print("Enter size of array: ");
        n = Integer.parseInt(br.readLine());
        a = new int[n];
        System.out.println("Enter " + n + " integer elements:");
        for(int i = 0; i < n; i++)
        {
            System.out.print("Element " + (i+1) + ": ");
            a[i] = Integer.parseInt(br.readLine());
        }
    }

    public int mini()
    {
        int min = a[0];
        for(int i = 1; i < n; i++)
        {
            if(a[i] < min)
            {
                min = a[i];
            }
        }
        return min;
    }

    public int maxi()
    {
        int max = a[0];
        for(int i = 1; i < n; i++)
        {
            if(a[i] > max)
            {
                max = a[i];
            }
        }
        return max;
    }

    public void sort()
    {
        for(int i = 0; i < n - 1; i++)
        {
            for(int j = 0; j < n - i - 1; j++)
            {
                if(a[j] > a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    public void reverse()
    {
        int s = 0, e = n - 1;
        while(s < e)
        {
            int temp = a[s];
            a[s] = a[e];
            a[e] = temp;
            s++;
            e--;
        }
    }

    public void disp()
    {
        System.out.print("Integer array elements: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    String b[];
    int m;

    public void inputs() throws IOException
    {
        System.out.print("Enter number of elements: ");
        m = Integer.parseInt(br.readLine());
        b = new String[m];
        System.out.println("Enter " + m + " strings:");
        for(int i = 0; i < m; i++)
        {
            System.out.print("String " + (i+1) + ": ");
            b[i] = br.readLine();
        }
    }

    public void sorts()
    {
        for(int i = 0; i < m - 1; i++)
        {
            for(int j = 0; j < m - i - 1; j++)
            {
                if (b[j].compareToIgnoreCase(b[j+1]) > 0)
                {
                    String temp = b[j];
                    b[j] = b[j+1];
                    b[j+1] = temp;
                }
            }
        }
    }

    public void disps()
    {
        System.out.print("String array elements: ");
        for(int i = 0; i < m; i++)
        {
            System.out.print(b[i] + " ");
        }
        System.out.println();
    }
}

public class Arrays
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        A o = new A();
        int c;

        while(true)
        {
            System.out.println("\nMenu:");
            System.out.println("1. Input ");
            System.out.println("2. Display min and max ");
            System.out.println("3. Sort integer array");
            System.out.println("4. Reverse integer array");
            System.out.println("5. Display integer array");
            System.out.println("6. Input string array");
            System.out.println("7. Sort string array lexicographically");
            System.out.println("8. Display string array");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            c = Integer.parseInt(br.readLine());

            switch(c)
            {
                case 1:
                    o.input();
                    break;
                case 2:
                    if(o.a == null)
                    {
                        System.out.println("Please input integer array first.");
                    }
                    else
                    {
                        System.out.println("Minimum element: " + o.mini());
                        System.out.println("Maximum element: " + o.maxi());
                    }
                    break;
                case 3:
                    if(o.a == null)
                    {
                        System.out.println("Please input integer array first.");
                    }
                    else
                    {
                        o.sort();
                        System.out.println("Integer array sorted.");
                    }
                    break;
                case 4:
                    if(o.a == null)
                    {
                        System.out.println("Please input integer array first.");
                    }
                    else
                    {
                        o.reverse();
                        System.out.println("Integer array reversed.");
                    }
                    break;
                case 5:
                    if(o.a == null)
                    {
                        System.out.println("Please input integer array first.");
                    }
                    else
                    {
                        o.disp();
                    }
                    break;
                case 6:
                    o.inputs();
                    break;
                case 7:
                    if(o.b == null)
                    {
                        System.out.println("Please input string array first.");
                    }
                    else
                    {
                        o.sorts();
                        System.out.println("String array sorted lexicographically.");
                    }
                    break;
                case 8:
                    if(o.b == null)
                    {
                        System.out.println("Please input string array first.");
                    }
                    else
                    {
                        o.disps();
                    }
                    break;
                case 9:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
