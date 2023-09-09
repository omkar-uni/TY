import java.util.*;
import java.io.*;

abstract class order
{
         protected int id;
         protected String name,des;
         order(int id,String name ,String des)
         {
               this.id=id;
               this.name=name;
               this.des=des;
         }
}

class purchase extends order
{
      void input()
      {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter ID : ");
           id = sc.Int();
           System.out.println("Enter Name of the Seller : ");
           name = sc.next();
           System.out.println("Enter Description : ");
           des = sc.next();
      }
      void display()
      {
           System.out.println("\nID : "+id);
           System.out.println("\nNAME : "+name);
           System.out.println("\nDEARTMENT : "+des);
      }
}

class sales extends order
{
      void input()
      {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter ID : ");
           id = sc.Int();
           System.out.println("Enter Name of the buyer : ");
           name = sc.next();
           System.out.println("Enter Description : ");
           des = sc.next();
      }
      void display()
      {
           System.out.println("\nID : "+id);
           System.out.println("\nNAME : "+name);
           System.out.println("\nDEARTMENT : "+des);
      }
}

class b1
{
      public static void main(String args[])
      {
             Scanner sc = new Scanner(System.in);
             System.out.println("\nEnter no. of Orders : ");
             int n = sc.nextInt();
             order o[] = new order[n];
            
             for (int i=0;i<n;i++)
             {
                 o[i]=new order;
                 
             }
             System.out.println("\n!------Details of Staff Members------!");
             for (int i=0;i<n;i++)
                 os[i].displayDetails();
      } 
}
