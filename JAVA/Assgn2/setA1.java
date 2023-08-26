import java.util.*;
import java.io.*;
import java.util.Scanner;
class setA1
{
      static int id,cnt=0 ;
      static String name ;
      static String d;
      static float sal;
       

setA1 ()
{
    this.id=0;
    this.name=" ";
    this.d=" ";
    this.sal=0.0f;
    
}
setA1 (int i,String n2,String dep,float salary)
{
    this.id=i;
    this.name=n2;
    this.d=dep;
    this.sal=salary;
    cnt++;
    
}
void display ()
{
     System.out.println("ID : "+id);
     System.out.println("NAME : "+name);
     System.out.println("DEPARTMENT : "+d);
     System.out.println("SALARY : "+sal);
     System.out.println("OBJECT COUNT : "+cnt);
}
public static void main(String args[])
{
       /*setA1 e1 =new setA1();
       e1.display();*/
       int n=Integer.parseInt(args[0]);
       setA1 e2[]=new setA1[n];
       Scanner sc=new Scanner(System.in);
       
       for(int j=0;j<n;j++)
       {
       System.out.print("enter id : ");
       int idn=sc.nextInt();
       
       System.out.print("enter name : ");
       String nt=sc.next();
       
       System.out.print("enter department : ");
       String dt=sc.next();
       
       System.out.print("enter salary : ");
       float sa=sc.nextFloat();
       e2[j]=new setA1(idn,nt,dt,sa);
       e2[j].display();
       }
       /*setA1 e2=new setA1(2,"VARAD","CS",5000);
       e2.display();*/
       
}
}
