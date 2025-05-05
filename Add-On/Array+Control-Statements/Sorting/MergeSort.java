import java.io.*;


public class MergeSort 
{
    public static void merge(int[] a,int s,int e ,int m)
    {
        int i = s, j = m + 1,  k = 0;
        int[] temp = new int[e-s+1];


        while(i<=m && j<=e)
        {
            if(a[i] <= a[j])
            {
                temp[k++] = a[i++];
            }
            else
            {
                temp[k++] = a[j++];
            }
        }

        while(i<=m)
        {
            temp[k++] = a[i++];
        }

        while(j<=e)
        {
            temp[k++] = a[j++];
        }

        for(k = 0; k < temp.length; k++) {
            a[s + k] = temp[k];
        }
        
    }

    public static void msort(int[] a,int s,int e)
    {
        if(s<e)
        {
            int m = s + (e - s)/2;
            msort(a,s,m);
            msort(a,m+1,e);
            MergeSort.merge(a,s,e,m);
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
        
            msort(a,0,n-1);
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
