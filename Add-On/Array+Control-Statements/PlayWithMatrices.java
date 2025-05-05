// Java Code to demonstrate and play with matrices
// Add, Subtract, multiply, & transpose of matrices

import java.io.*;

public class PlayWithMatrices
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of rows: ");
        int r = Integer.parseInt(br.readLine());
        System.out.print("Enter the number of columns: ");
        int c = Integer.parseInt(br.readLine());
        
        int[][] m = new int[r][c]; 
        int[][] n = new int[r][c]; 

        System.out.println("Enter Elements for Matrix 1: ");
        creation(m,br);
        System.out.println("Enter Elements for Matrix 2: ");
        creation(n,br);

        while(true)
        {
            System.out.println("----- Matrix Operation Menu -----");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Transpose");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1:
                    System.out.println("Addition of Matrices: ");
                    display(addition(m,n));
                    break;
                case 2:
                    System.out.println("Subtraction of Matrices: ");
                    display(subtraction(m,n));
                    break;
                case 3:
                    System.out.println("Multiplication of Matrices: ");
                    display(multiplication(m,n));
                    break;
                case 4:
                    System.out.println("Transpose of Matrix 1: ");
                    display(transpose(m));
                    System.out.println("Transpose of Matrix 2: ");
                    display(transpose(n));
                    break;
                case 5:
                    System.out.println("Matrix 1:");
                    display(m);
                    System.out.println("Matrix 2:");
                    display(n);
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    public static void creation(int[][] m , BufferedReader br)throws IOException
    {
        int r = m.length;
        int c = m[0].length;
    
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print("Element [" + i + "][" + j + "]: ");
                m[i][j] = Integer.parseInt(br.readLine());
            }
        }  
    }

    public static int[][] addition(int[][] a,int[][] b)
    {
        int r = a.length;
        int c = a[0].length;

        int[][] re = new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                re[i][j] = a[i][j] + b[i][j];
            }
        }
        return re;
    }

    public static int[][] subtraction(int[][] a,int[][] b)
    {
        int r = a.length;
        int c = a[0].length;

        int[][] re = new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                re[i][j] = a[i][j] - b[i][j];
            }
        }
        return re;
    }

    public static int[][] multiplication(int[][] a, int[][] b) 
    {
        int r = a.length;
        int c = b[0].length;
        int common = b.length;

        int[][] re = new int[r][c];
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                for (int k = 0; k < common; k++)
                {
                    re[i][j] += a[i][k] * b[k][j];
                }  
            }    
        }
        return re;
    }

    public static int[][] transpose(int[][] m) 
    {
        int r = m.length;
        int c = m[0].length;
        int[][] t = new int[c][r];
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                t[j][i] = m[i][j];
            }
        }   
        return t;
    }

    public static void display(int[][] m) 
    {
        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m[i].length; j++) 
            {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
}