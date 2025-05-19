/* 
Design a class which represents an inpatient. Every inpatient record is made up of the following fields: 
i. name (String) 
ii. age (integer) 
iii. hospital number (integer) 
iv. Date of admission (class called Date form java.util) OR (user defined separate inner 
class) 
v. Room rent (double) 
Test the class by writing suitable main method. 
a) Provide default, copy constructor and parameterized constructors to this class. Make suitable 
change in main to incorporate these changes and test the same. 
b) The hospital number is incremented as obtained from a static variable. 
c) Make suitable change and run the program. 
d) Also   provide methods to input a record, to display it, to determine if the date of admission is 
the todays date. Display suitable message by demonstrating the above class by making suitable 
change in main. 
e) Create an array of inpatient records and store a minimum of 3 records in it. Assign the data to 
each of the fields through assignment statement (using constructors) and Display all of them. 
(No change with respect to class defined earlier. Only change main method) 
f) Check if two patients have the same information except for hospital number. Also determine 
the number of records who are admitted today. 
*/

import java.io.*;
import java.util.*;

public class Inpatient
{
    String n;
    int a;
    int h;
    double r;
    Admd d;
    static int hn=1000;

    static class Admd
    {
        int d, m, y;

        Admd()
        {
            Calendar c=Calendar.getInstance();
            d=c.get(Calendar.DAY_OF_MONTH);
            m=c.get(Calendar.MONTH)+1;
            y=c.get(Calendar.YEAR);
        }

        Admd(int d,int m,int y)
        {
            this.d=d; this.m=m; this.y=y;
        }

        boolean oye()
        {
            Calendar c=Calendar.getInstance();
            return d==c.get(Calendar.DAY_OF_MONTH) && m==c.get(Calendar.MONTH)+1 && y==c.get(Calendar.YEAR);
        }

        public String toString()
        {
            return d+"-"+m+"-"+y;
        }

        public boolean equals(Object o)
        {
            if(this==o)
            {
                return true;
            }
            if(!(o instanceof Admd))
            {
                return false;
            }
            Admd x=(Admd)o;
            return d==x.d && m==x.m && y==x.y;
        }
    }

    Inpatient()
    {
        n="Unknown";
        a=0;
        r=0;
        d=new Admd();
        h=++hn;
    }

    Inpatient(String n,int a,double r,Admd d)
    {
        this.n=n;
        this.a=a;
        this.r=r;
        this.d=d;
        h=++hn;
    }

    Inpatient(Inpatient x)
    {
        n=x.n;
        a=x.a;
        r=x.r;
        d=x.d;
        h=++hn;
    }

    void input(BufferedReader br)throws IOException
    {
        System.out.print("Enter name: ");
        n=br.readLine();
        System.out.print("Enter age: ");
        a=Integer.parseInt(br.readLine());
        System.out.println("Select room type:\n1.General Ward(500)\n2.Semi-Private(1000)\n3.Private(2000)");
        System.out.print("Enter choice: ");
        int c=Integer.parseInt(br.readLine());
        if(c==1)
        {
            r=500;
        }
        else if(c==2)
        {
            r=1000;
        }
        else if(c==3)
        {
            r=2000;
        }
        else
        {
            System.out.println("Invalid, default General Ward");
            r=500;
        }
        d=new Admd();
        h=++hn;
    }

    void display()
    {
        System.out.println("Hospital Number: "+h);
        System.out.println("Name: "+n);
        System.out.println("Age: "+a);
        System.out.println("Room Rent: "+r);
        System.out.println("Date of Admission: "+d);
        System.out.println("----------------------");
    }

    boolean sames(Inpatient x)
    {
        return n.equals(x.n) && a==x.a && r==x.r && d.equals(x.d);
    }

    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Inpatient> p=new ArrayList<>();
        while(true)
        {
            System.out.println("\nMenu:");
            System.out.println("1. Add Patients");
            System.out.println("2. Display Patients");
            System.out.println("3. Check Duplicates");
            System.out.println("4. Count Admitted Today");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int ch=Integer.parseInt(br.readLine());
            switch(ch)
            {
                case 1:
                {
                    System.out.print("Number of patients: ");
                    int n=Integer.parseInt(br.readLine());
                    for(int i=0; i<n; i++)
                    {
                        System.out.println("Patient "+(p.size()+1));
                        Inpatient ip=new Inpatient();
                        ip.input(br);
                        p.add(ip);
                    }
                    break;
                }
                case 2:
                {
                    if(p.size()==0)
                    {
                        System.out.println("No records");
                    }
                    else
                    {
                        for(Inpatient ip : p)
                        {
                            ip.display();
                        }
                    }
                    break;
                }
                case 3:
                {
                    boolean found=false;
                    for(int i=0; i<p.size(); i++)
                    {
                        for(int j=i+1; j<p.size(); j++)
                        {
                            if(p.get(i).sames(p.get(j)))
                            {
                                System.out.println("Patient "+(i+1)+" and "+(j+1)+" same except hospital number");
                                found=true;
                            }
                        }
                    }
                    if(!found)
                    {
                        System.out.println("No duplicates");
                    }
                    break;
                }
                case 4:
                {
                    int c=0;
                    for(Inpatient ip : p)
                    {
                        if(ip.d.oye())
                        {
                            c++;
                        }
                    }
                    System.out.println("Admitted today: "+c);
                    break;
                }
                case 5:
                {
                    System.out.println("Exit");
                    return;
                }
                default:
                {
                    System.out.println("Invalid choice");
                }
            }
        }
    }
}

