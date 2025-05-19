import java.io.*;


interface A
{
   void show();
}

interface B extends A
{
   void disp();
}


class C implements B
{
   public void show()
   {
      System.out.println("I am Interface A.");
   }

   public void disp()
   {
      System.out.println("I am Interface B.");
   }

   public void oye()
   {
      System.out.println("I am C");
   }


}
public class Interfac 
{
   public static void main(String[] args)throws IOException
   {
      C o = new C();
      o.show();
      o.disp();
      o.oye();

      System.out.println("\nI am calling using object of A");
      A k = new C();
      k.show();
      ((B) k).disp();
      ((C) k).oye();
   }
}