import java.util.*;
public class Rectangle
{              
     
      void ap(int l,int b)
      {
             int A=l*b;
             int P=2*(l+b);
             System.out.println("Area ="+A);
             System.out.println("Perimeter ="+P);
      }
      public static void main(String args[])
      { 
             Scanner sc=new Scanner(System.in);
             System.out.print("enter length : ");
             int ln=sc.nextInt();
             System.out.print("enter Breadth : ");
             int br=sc.nextInt();
             //Scanner sc1=new Scanner(System.in);
             Rectangle a=new Rectangle();
             a.ap(ln,br);
      }
}              
