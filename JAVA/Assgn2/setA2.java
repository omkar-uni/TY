import java.util.*;
import java.io.*;
import java.util.Scanner;
class setA2
{
      static int rno,cnt=0 ;
      static String name ;
   
      static float per;
       

setA2 ()
{
    this.rno=0;
    this.name=" ";
    
    this.per=0.0f;
    
}
setA2 (int i,String n2,float percentage)
{
    this.rno=i;
    this.name=n2;
   
    this.per=percentage;
    cnt++;
    
}
void display ()
{
     System.out.println("rno : "+rno);
     System.out.println("NAME : "+name);
   
     System.out.println("PERCENTAGE : "+per);
     System.out.println("OBJECT COUNT : "+cnt);
}
public static void main(String args[])
{
       /*setA2 e1 =new setA2();
       e1.display();*/
       int n=Integer.parseInt(args[0]);
       float a[]=new float[n];
       setA2 e2[]=new setA2[n];
       Scanner sc=new Scanner(System.in);
       
       for(int j=0;j<n;j++)
       {
       System.out.print("enter rno : ");
       int rn=sc.nextInt();
       
       System.out.print("enter name : ");
       String nt=sc.next();
       
       
       
       System.out.print("enter Percentage : ");
       a[j]=sc.nextFloat();
       e2[j]=new setA2(rn,nt,a[j]);
       e2[j].display();
       }
       System.out.println("\n");
       for(int j=0;j<n-1;j++)
          for(int k=j+1;k<n;k++)
             if(a[j]<a[k])
             {
               float t=a[j];
               a[j]=a[k];
               a[k]=t;
             }   
       System.out.println("Sorted array is \n");
       for(int i=0;i<n;i++)
           System.out.println("\t"+a[i]);
          
       /*setA2 e2=new setA2(2,"VARAD","CS",5000);
       e2.display();*/
       
}
}

