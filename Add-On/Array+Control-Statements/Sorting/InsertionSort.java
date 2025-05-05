import java.io.*;

public class InsertionSort
{
    public static void isort(int[] a,int n)
    {
        for(int i=1;i<n;i++)
        {
            int k = a[i];
            int j = i - 1;
            while(j>=0 && a[j]>=k)
            {
                a[j+1] = a[j];
                j = j - 1;
            }
            a[j+1] = k;
        }
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true)
        {

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
        
            isort(a, n);
            System.out.print("\nSorted Array: ");
        
            for(int i=0;i<n;i++)
            {
                System.out.print(a[i] + " ");
            }

            System.out.print("\nDo you want to continue? (yes/no): ");
            String choice = br.readLine();
            if (choice.equals("no") || choice.equals("No")) 
            {
                break;
            }
        }
    }
}
