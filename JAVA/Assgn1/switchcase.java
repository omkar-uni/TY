import java.util.*;
public class switchcase
{
      
      public static void main(String args[])
      {
             int op=1,r,h,fact=1,num,digit;
             float PI = 3.14f,v;
             Scanner sc=new Scanner(System.in);
             while(op>=1 && op<=4)
             {
                  System.out.println("operaions :");
                  System.out.println("1:Calculate VOlume of Cylinder");
                  System.out.println("2.Find factorial");
                  System.out.println("3:Check if number is Armstrong or not ");
                  System.out.println("4:Exit");
                  op=sc.nextInt();
                  switch(op)
                  {
                        case 1:
                              System.out.println("Enter height");
                              h=sc.nextInt();
                              System.out.println("Enter radius");
                              r=sc.nextInt();
                              v=PI*r*r*h;
                              System.out.println("Volume of Cylinder : "+v+"unit cube");
                              break;
                        case 2:
                              System.out.println("Enter Number to find factorial : ");
                              num=sc.nextInt();
                              for(int i=1;i<=num;i++)
                              {
                                 fact=fact*i;
                              }
                              System.out.println("Factorial :"+fact);
                              break;
                       case 3:
                             System.out.println("Enter number : ");
                             num=sc.nextInt();
                             int num1=num;
                             int sum=0;
                             while (num1!=0)
                             {
                                   digit=num1%10;
                                   sum=sum+(digit*digit*digit);
                                   num1/=10;
                             }           
                             if (num==sum)
                                System.out.println("number is armstrong");
                             else
                                System.out.println("number is not armstrong");
                             break;
                     case 4:
                             System.exit(0);                               
                  }
             }
      }
}
