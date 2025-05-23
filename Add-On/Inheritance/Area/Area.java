import java.io.*;

abstract class Figure
{
    int d1, d2;
    Figure(int d1, int d2)
    {
        this.d1 = d1;
        this.d2 = d2;
    }
    abstract double area();
}

class Rectangle extends Figure
{
    Rectangle(int l, int b)
    {
        super(l, b);
    }
    double area()
    {
        return d1 * d2;
    }
}

class Triangle extends Figure
{
    Triangle(int b, int h)
    {
        super(b, h);
    }
    double area()
    {
        return 0.5 * d1 * d2;
    }
}

class Square extends Figure
{
    Square(int s)
    {
        super(s, s);
    }
    double area()
    {
        return d1 * d2;
    }
}

public class Area
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Figure f;
        int c;
        while(true)
        {
            System.out.println("\nMenu:");
            System.out.println("1. Rectangle");
            System.out.println("2. Triangle");
            System.out.println("3. Square");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            c = Integer.parseInt(br.readLine());

            switch(c)
            {
                case 1:
                {
                    System.out.print("Enter length: ");
                    int l = Integer.parseInt(br.readLine());
                    System.out.print("Enter breadth: ");
                    int b = Integer.parseInt(br.readLine());
                    f = new Rectangle(l, b);
                    System.out.println("Area of Rectangle: " + f.area());
                    break;
                }
                case 2:
                {
                    System.out.print("Enter base: ");
                    int base = Integer.parseInt(br.readLine());
                    System.out.print("Enter height: ");
                    int h = Integer.parseInt(br.readLine());
                    f = new Triangle(base, h);
                    System.out.println("Area of Triangle: " + f.area());
                    break;
                }
                case 3:
                {
                    System.out.print("Enter side: ");
                    int s = Integer.parseInt(br.readLine());
                    f = new Square(s);
                    System.out.println("Area of Square: " + f.area());
                    break;
                }
                case 4:
                {
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                }
                default:
                {
                    System.out.println("Invalid choice! Try again.");
                }
            }
        }
    }
}
