/*Write information of n employees to a file. This information should be read from the keyboard. The 
data members of employee class are:  
a. name (string), age (int), GrossSalary (double), TakeHomeSalary(float), Grade (char). (Each 
record can be stored on a separate line with a blank separating every 2 fields). Transfer the 
records with grade ‘A’ to another file. Also display those    records on the screen. 
*/

import java.io.*;
import java.util.*;

class A
{
    String n;
    int a;
    double g;
    float t;
    char c;

    A(String n, int a, double g, float t, char c)
    {
        this.n = n;
        this.a = a;
        this.g = g;
        this.t = t;
        this.c = c;
    }

    String r()
    {
        return n + " " + a + " " + g + " " + t + " " + c;
    }
}

public class Employee
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        List<A> l = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int n = s.nextInt();
        s.nextLine();

        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter details for employee " + (i + 1) + " (name age grossSalary takeHomeSalary grade):");
            String n1 = s.next();
            int a1 = s.nextInt();
            double g1 = s.nextDouble();
            float t1 = s.nextFloat();
            char c1 = s.next().charAt(0);

            l.add(new A(n1, a1, g1, t1, c1));
        }

        try (BufferedWriter w = new BufferedWriter(new FileWriter("employees.txt")))
        {
            for (A e : l)
            {
                w.write(e.r());
                w.newLine();
            }
        }
        catch (IOException e)
        {
            System.out.println("Error writing to employees.txt: " + e.getMessage());
        }

        try (BufferedWriter wA = new BufferedWriter(new FileWriter("gradeA_employees.txt")))
        {
            System.out.println("\nEmployees with Grade 'A':");
            for (A e : l)
            {
                if (e.c == 'A' || e.c == 'a')
                {
                    wA.write(e.r());
                    wA.newLine();
                    System.out.println(e.r());
                }
            }
        }
        catch (IOException e)
        {
            System.out.println("Error writing to gradeA_employees.txt: " + e.getMessage());
        }

        s.close();
    }
}
