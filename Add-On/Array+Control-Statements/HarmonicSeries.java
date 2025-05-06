// Calculate the sum of the harmonic series:
// 1+1/2+1/3+. . . 1/n 

import java.io.*;

public class HarmonicSeries 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the value of n: ");
        int n = Integer.parseInt(br.readLine());

        double s = 0.0;

        for(int i=1;i<=n;i++)
        {
            s += 1.0/i;
        }

        System.out.print("Harmonic Sum of " + n + " is: " + s);
    }
}
