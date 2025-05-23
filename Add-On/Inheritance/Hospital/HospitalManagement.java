/*
Design a class, which represents a patient. Fields of this class are name, age and hospital number. 
Provide methods to input and display all fields. Next design a class called Inpatient, which inherits 
from patient class. Provide fields to represent department name, admission date and room type. Provide 
methods to input and display these fields. Next design a class called Billing, which inherits from 
Inpatient class. Provide a field to represent the discharge date. Provide methods to input this field value 
as well as to display the total amount. The total amount is calculated based on room type and doctor 
charges as shown below: 
RoomType Consultancy Charges/day Room Rent /day 
Special Rs. 1000.00 Rs. 200 
SemiSpecial Rs. 500.00 Rs. 100 
General Rs. 100.00 Rs. 50
*/

import java.io.*;

class Patient
{
    String name;
    int age;
    int hno;
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void inputs()throws IOException
    {
        System.out.print("\nEnter Patient Name: ");
        name = br.readLine();
        System.out.print("Enter age: ");
        age = Integer.parseInt(br.readLine());
        System.out.print("Enter Hospital Number: ");
        hno = Integer.parseInt(br.readLine());
    }

    public void disp()
    {
        System.out.print("\nName: "+name);
        System.out.print("\nAge: "+age);
        System.out.print("\nHospital Number: "+hno);
    }
}

class Inpatient extends Patient
{
    String dept;
    int date;
    String room;

    public void inputs()throws IOException
    {
        super.inputs();
        System.out.print("Enter Department Name: ");
        dept = br.readLine();
        System.out.print("Enter date of admit: ");
        date = Integer.parseInt(br.readLine());
        System.out.print("Enter Room Type: ");
        room = br.readLine();
    }

    public void disp()
    {   
        super.disp();
        System.out.print("\nDepartment Name: "+dept);
        System.out.print("\nDate of Admit: "+date);
        System.out.print("\nRoom Type: "+room);
    }
}

class Billing extends Inpatient
{
    int dis;

    public void input()throws IOException
    {
        super.inputs();
        System.out.print("Enter date of discharge: ");
        dis = Integer.parseInt(br.readLine());
    }

    public void disp()
    {
        super.disp();
        System.out.print("\nDate of Discharge: "+dis);

        int days = dis - date;
        if (days <= 0) 
        {
            System.out.print("\nInvalid discharge date!");
            return;
        }

        double charge = 0, rent = 0;

        switch (room.toLowerCase()) 
        {
            case "special":
            {
                charge = 1000;
                rent = 200;
                break;
            }
            case "semispecial":
            {
                charge = 500;
                rent = 100;
                break;
            }  
            case "general":
            {
                charge = 100;
                rent = 50;
                break;
            }
            default:
            {
                System.out.println("\nInvalid Room Type!");
                return;
            }      
        }
        double total = days * (charge + rent);
        System.out.printf("\nTotal Amount (for %d days): Rs. %.2f ", days, total);
    }
}


public class HospitalManagement
{
    public static void main(String[] args)throws IOException 
    {
        Billing o = new Billing();
        o.input();
        o.disp();
    }
}