import java.util.*;
import java.io.*;
import java.util.Scanner;
class setA1
{
public static void main(String args[])
{
       /*a4 e1 =new a4();
       e1.display();*/
      
       Scanner sc=new Scanner(System.in);
       
       System.out.print("enter first name : ");
       String f1=sc.next();
      
       System.out.print("enter middle name : ");
       String m1=sc.next();
      
       System.out.print("enter last name : ");
       String l1=sc.next();
       int l =m1.length();
       String a=m1.substring(0,1);
       String b=m1.substring(1,l);
       a=a.toUpperCase();
       m1=a+b;
       System.out.println("Last First Middle ");
       System.out.println(l1+"\t"+f1+"\t"+m1);
       
}
}
