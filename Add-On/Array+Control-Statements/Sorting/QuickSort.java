import java.io.*;


public class QuickSort 
{
    public static void swap(int[] a,int x,int y)
    {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    public static int partition(int[] a,int s,int e)
    {
        int pivot = a[e];
        int i = s - 1;
        for(int j=s;j<e;j++)
        {
            if(a[j] < pivot)
            {
                i++;
                swap(a,i,j);
            }
        }
        swap(a,i+1,e);
        return i+1;
    }

    public static void qsort(int[] a,int s,int e)
    {
        if(s<e)
        {
            int k = partition(a, s, e);
            qsort(a,s,k-1);
            qsort(a,k+1,e);
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
        
            qsort(a,0,n-1);
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
