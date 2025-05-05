//Built-in Sort in Java
// This program demonstrates the use of the built-in sort function in Java.

import java.io.*;
import java.util.*;

public class BuiltInSort
{
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
        
            Arrays.sort(a);
            System.out.print("\nSorted Array: ");
            for(int i=0;i<n;i++)
            {
                System.out.print(a[i] + " ");
            }
    }
}
