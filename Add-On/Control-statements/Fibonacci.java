//To generate the first n Fibonacci numbers using recursion.

import java.io.*;

public class Fibonacci 
{
    //Recursive Fibonacci
    public static int fibo(int n)
    {

        if(n <= 1)
        {
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    } 

    //Non Recursive Fibonacci
    public static void fibo2(int n)
    {
        int a = 0, b = 1;

        for (int i = 0; i < n; i++)
        {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
    
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        int m = Integer.parseInt(br.readLine());

        System.out.print("Fibonacci Series of " + m + " is: ");
        for(int i=0;i<m;i++)
        {
            System.out.print(fibo(i) + " ");
        }

        System.out.print("\nFibonacci Series of " + m + " is(Non-Recursive): ");
        fibo2(m);
    }
}


