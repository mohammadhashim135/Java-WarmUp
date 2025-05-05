//Factorial Number Code
import java.io.*;

public class Factorial 
{
    //Recursive Factorial
    public static int facto(int n)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }

        return facto(n-1) *n;
    }

    //Non Recursive Factorial
    public static int facto2(int n)
    {
        int fact = 1;
        for (int i = 1; i <= n; i++)
        {
            fact *= i;
        }
        return fact;
    }



    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        int m = Integer.parseInt(br.readLine());
        System.out.print("Factorial of " + m + " is: " +  facto(m));
        System.out.print("\nFactorial of " + m + " without recursion: " + facto2(m));
    }
}
