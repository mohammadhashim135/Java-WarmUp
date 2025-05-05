// Prime Number Code

import java.io. *;

public class PrimeNumber{

    public static boolean prime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        for(int i=2;i<Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException
    {
        
        // PrimeNumber p = new PrimeNumber(); ////if seted non static

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) 
        {
            System.out.print("Enter a Number: ");
            int m = Integer.parseInt(br.readLine());
            if(prime(m))
        {
            System.out.println(m + " is a prime number.");
        }
        else
        {
            System.out.println(m + " is not a prime number.");
        }
        }
    }
}