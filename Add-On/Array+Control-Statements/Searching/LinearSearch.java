import java.io.*;
// import java.util.*;

public class LinearSearch 
{
    public static int lsearch(int[] a,int k,int n)
    {
        for(int i=0;i<n;i++)
        {
            if(a[i] == k)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nEnter the size of array: ");
        int n = Integer.parseInt(br.readLine());
        System.out.print("Enter the elements: ");
        int[] a = new int[n];
        String[] inp = br.readLine().split(" ");
        for(int i=0;i<n;i++)
        {
            a[i] = Integer.parseInt(inp[i]);
        }
        System.out.print("Array Loaded: ");
      
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i] + " ");
        }
        while (true)
        {
            System.out.print("\nEnter key to search: ");
            int k = Integer.parseInt(br.readLine());

            int p = lsearch(a, k, n);
            if(p != -1)
            {
                System.out.print(k + " found at index " + (p+1));
            }
            else
            {
                System.out.print(k + " not found.");
            }    
        }
    }
}
