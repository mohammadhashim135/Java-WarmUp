import java.io.*;
import java.util.*;

public class BinarySearch 
{
    public static int bsearch(int[] a,int k,int n)
    {
        int s = 0;
        int e = n - 1;
        while(s<=e)
        {
            int m = s + (e - s) / 2;
            if(a[m] == k)
            {
                return m;
            }
            if(a[m]<k)
            {
                s = m + 1;
            }
            else
            {
                e = m - 1;
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
        System.out.print("\nEntered Array(Sorted): ");
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.print("\nEnter key to search: ");
        int k = Integer.parseInt(br.readLine());

        int p = bsearch(a, k, n);
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
