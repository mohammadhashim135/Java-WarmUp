// To perform the following operations on strings through interactive input.  
// a. Sort given strings in alphabetical order.  
// b. Check whether one string is sub string of another string or not.  
// c. Convert the strings to uppercase.

import java.io.*;


public class PlayWithString 
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = null;
        while(true)
        {
            

            System.out.println("\n ---- Play With Strings ----");
            System.out.println(" 1. Create Strings ");
            System.out.println(" 2. Sort Alphabeticaly ");
            System.out.println(" 3. Check for SubString ");
            System.out.println(" 4. UpperCase ");
            System.out.println(" 5. LowerCase ");
            System.out.println(" 6. isequal vs == ");
            System.out.println(" 7. Exit ");
            System.out.print(" Enter your choice: ");
            int c = Integer.parseInt(br.readLine());

            switch (c) 
            {
                case 1:
                    s = creation(br);
                    break;
                case 2:
                    sort(s);
                    break;
                case 3:
                    substring(br);
                    break;
                case 4:
                    upcase(s);
                    break;
                case 5:
                    lcase(s);
                    break;
                case 6:
                    compares(br);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }    

    public static String[] creation(BufferedReader br) throws IOException
    {
        System.out.print("No. of Strings to Enter: ");
        int n = Integer.parseInt(br.readLine());
        String[] s = new String[n];
        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter the string " + (i+1) + ": ");
            s[i] = br.readLine();
        }
        return s;
    }

    public static void sort(String[] s)
    {
        if (s == null)
        {
            System.out.println("\nNo strings found.");
            return;
        }

        int n = s.length;
        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = 0; j < n - i - 1; j++) 
            {
                if (s[j].compareTo(s[j + 1]) > 0) 
                {
                    String temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted Strings: ");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(s[i] + " ");
        }
    }

    public static void substring(BufferedReader br) throws IOException
    {
        System.out.print("\nEnter first string: ");
        String a = br.readLine();
        System.out.print("Enter second string: ");
        String b = br.readLine();

        if (a.toLowerCase().contains(b.toLowerCase()))
            System.out.println(b + " is a substring of " + a);
        else
            System.out.println(b + " is NOT a substring of " + a);
    }

    public static void upcase(String[] s)
    {
        if (s == null) 
        {
            System.out.println("No strings found.");
            return;
        }
        System.out.print("Uppercase Strings: ");
        for (int i = 0; i < s.length; i++) 
        {
            System.out.print(s[i].toUpperCase() + " ");
        }
    }

    public static void lcase(String[] s)
    {
        if (s == null) 
        {
            System.out.println("No strings found.");
            return;
        }
        System.out.print("Lowercase Strings: ");
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i].toLowerCase() + " ");
        }
    }

    public static void compares(BufferedReader br) throws IOException
    {
        System.out.print("\nEnter first string: ");
        String a = br.readLine();
        System.out.print("Enter second string: ");
        String b = br.readLine();

        if (a == b)
        {
            System.out.println("== : Strings are same.");
        }  
        else
        {
            System.out.println("== : Strings are different.");
        }
        if (a.equals(b))
        {
             System.out.println("equals() : Strings are equal.");
        }
        else
        {
            System.out.println("equals() : Strings are NOT equal.");
        }
            
    }
}
