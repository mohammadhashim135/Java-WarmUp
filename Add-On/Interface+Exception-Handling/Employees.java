/* 
Design a class which represents an employee. The data members are: 
name (string), age (int), grossSalary (double), takeHomeSalary(float), grade (char). Provide 
methods called input() and display() which reads all details of a record from the keyboard and 
displays them respectively. Handle IOException while reading from the keyboard. Provide a 
menu with the options:  Input, Display and Exit to read users choice. 
(Make use of Wrapper classes)  
*/

import java.io.*;


class Employee
{
    String Name;
    Integer age;
    Double grossSalary;
    Float takeHomeSalary;
    Character grade;

    public void input()
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try 
        {
            System.out.print("Enter Name: ");
            Name = br.readLine();

            System.out.print("Enter Age: ");
            age = Integer.parseInt(br.readLine());

            System.out.print("Enter Gross Salary: ");
            grossSalary = Double.parseDouble(br.readLine());

            System.out.print("Enter Take Home Salary: ");
            takeHomeSalary = Float.parseFloat(br.readLine());

            System.out.print("Enter Grade: ");
            grade = br.readLine().charAt(0);

        } 
        catch (IOException e) 
        {
            System.out.println("IOException occurred!!!");
        } 
        catch (NumberFormatException e) 
        {
            System.out.println("Invalid number format!!!");
        }
    }

    void display() 
    {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Name: " + Name);
        System.out.println("Age: " + age);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Take Home Salary: " + takeHomeSalary);
        System.out.println("Grade: " + grade);
    }
}

public class Employees
{
    public static void main(String[] args)
    {
        Employee e = new Employee();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int choice = 0;

        while (true) 
        {
            System.out.println("\n--- Employee Menu ---");
            System.out.println("1. Input");
            System.out.println("2. Display");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            try 
            {
                choice = Integer.parseInt(br.readLine());

                switch (choice) {
                    case 1:
                        e.input();
                        break;
                    case 2:
                        e.display();
                        break;
                    case 3:
                        System.out.println("Exiting program...");
                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            } 
            catch (IOException o) 
            {
                System.out.println("IOException occurred. Try again.");
            } 
            catch (NumberFormatException o) 
            {
                System.out.println("Invalid Choice!!!");
            }
        }
    }
}