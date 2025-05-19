/* 
Create and initialize a String and determine the following. (Built in String methods may be used): 
a) the length of the string. 
b) the number of a’s in the string. 
c) convert all lowercase to uppercase and vice versa. 
d) find if a sub string pattern “abc” is present; if so, display the first position of occurrence.
*/


import java.io.*;

public class MoreStringy
{
    public static void main(String[] a) throws IOException
    {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String s = "";

        while (true)
        {
            System.out.println("----  Menu ----");
            System.out.println("1. Enter the text");
            System.out.println("2. Length of the string");
            System.out.println("3. Count of 'a' in the string");
            System.out.println("4. Swap case of the string");
            System.out.println("5. Find 'abc' in the string");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int c = Integer.parseInt(b.readLine());

            switch (c)
            {
                case 1:
                {
                    System.out.print("Enter your text: ");
                    s = b.readLine();
                    System.out.println("Text updated.");
                    break;
                }

                case 2:
                {
                    int l = 0;
                    try
                    {
                        while (true)
                        {
                            s.charAt(l++);
                        }
                    }
                    catch (Exception e)
                    {
                        System.out.println("Length = " + l);
                    }
                    break;
                }

                case 3:
                {
                    int n = 0;
                    for (int i = 0; ; i++)
                    {
                        try
                        {
                            char ch = s.charAt(i);
                            if (ch == 'a' || ch == 'A')
                            {
                                n++;
                            }
                        }
                        catch (Exception e)
                        {
                            break;
                        }
                    }
                    System.out.println("Count of 'a' = " + n);
                    break;
                }

                case 4:
                {
                    String t = "";
                    for (int i = 0; ; i++)
                    {
                        try
                        {
                            char ch = s.charAt(i);
                            if (ch >= 'a' && ch <= 'z')
                            {
                                t += (char)(ch - 32);
                            }
                            else if (ch >= 'A' && ch <= 'Z')
                            {
                                t += (char)(ch + 32);
                            }
                            else
                            {
                                t += ch;
                            }
                        }
                        catch (Exception e)
                        {
                            break;
                        }
                    }
                    System.out.println("Swapped case = " + t);
                    break;
                }

                case 5:
                {
                    boolean f = false;
                    int p = -1;
                    for (int i = 0; ; i++)
                    {
                        try
                        {
                            if (s.charAt(i) == 'a' && s.charAt(i + 1) == 'b' && s.charAt(i + 2) == 'c')
                            {
                                f = true;
                                p = i;
                                break;
                            }
                        }
                        catch (Exception e)
                        {
                            break;
                        }
                    }
                    if (f)
                    {
                        System.out.println("'abc' found at index: " + p);
                    }
                    else
                    {
                        System.out.println("'abc' not found");
                    }
                    break;
                }

                case 6:
                {
                    System.out.println("Bye");
                    return;
                }

                default:
                {
                    System.out.println("Invalid choice!!!");
                    break;
                }
            }
        }
    }
}
