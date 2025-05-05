import java.io.*;

public class BubbleSort
{
    public static void bsort(int[] a,int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
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
        
            bsort(a, n);
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
