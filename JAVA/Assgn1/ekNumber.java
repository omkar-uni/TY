import java.util.*;
class ekNumber
{              
     
      void ispositive(int n)
      {
             if(n>0)
             {
                System.out.println(n+" is positive");
                if (n%2==0)
                    System.out.println(n+" is even");
                else
                    System.out.println(n+" is odd");    
             }
             else  if(n<0)
             {
                System.out.println(n+" is Negative");
                   
             }
             else
                System.out.println(n+" is Zero");
      }
      public static void main(String args[])
      { 
             Scanner sc=new Scanner(System.in);
             System.out.print("enter number: ");
             int n=sc.nextInt();
            
             //Scanner sc1=new Scanner(System.in);
             ekNumber a=new ekNumber();
             a.ispositive(n);
      }
}      
