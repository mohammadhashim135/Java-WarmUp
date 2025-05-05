//To display all primes b/w given 2 limits. 


import java.io.*;

public class PrimeLimit 
{
    public static boolean prime(int n)
    {
        if(n <= 1)
        {
            return false;
        }

        for(int i=2;i<Math.sqrt(n);i++)
        {
            if(n%i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Limit 1: ");
        int m = Integer.parseInt(br.readLine());
        System.out.print("Enter Limit 2: ");
        int n = Integer.parseInt(br.readLine());
        
        for(int i=m;i<=n;i++)
        {
            if(prime(i))
            {
                System.out.print(i + " ");
            }
        }
   
    }    
}
