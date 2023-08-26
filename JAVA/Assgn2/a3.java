import java.util.*;
import java.io.*;
import java.util.Scanner;
class a3
{
public static void main(String args[])
{
      
       int a[]=new int[args.length];
     
   
       
       for(int j=0;j<args.length;j++)
       {
       a[j]=Integer.parseInt(args[j]);
       
       }
       System.out.println("\n");
       for(int j=0;j<args.length-1;j++)
          for(int k=j+1;k<args.length;k++)
             if(a[j]<a[k])
             {
               int t=a[j];
               a[j]=a[k];
               a[k]=t;
             }   
       System.out.println("Sorted array is \n");
       for(int i=0;i<args.length;i++)
           System.out.println("\t"+a[i]);
          
       /*a3 e2=new a3(2,"VARAD","CS",5000);
       e2.display();*/
       
}
}
