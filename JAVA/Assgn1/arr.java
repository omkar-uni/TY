import java.util.*;
class arr
{
        public static void main(String args[])
        {
               int a[];
               System.out.println("enter size of array:");
               Scanner sc=new Scanner(System.in);
               int n=sc.nextInt();
               System.out.println("Enter element"+n+":");
               a=new int[n];
               for (int i=0;i<n;i++)
               {
                   a[i]=sc.nextInt();
               }
               System.out.println("Og Array : ");
               for (int i=0;i<n;i++)
               {
                  System.out.print(a[i]);
               }
                System.out.println(" reverse Array : ");
               for (int i=n-1;i>=0;i--)
               {   
                 
                   System.out.print(a[i]+" ");
               }
          }
}               
