import SY.Sy;
import TY.Ty;
import java.util.Scanner;

public class student
{
       private int rno;
       private String name;
       private Sy sy;
       private Ty ty;
      
       public student(int rno,String name,Sy sy,Ty ty)
       {
              this.rno=rno;
              this.name=name;
              this.sy=sy;
              this.ty=ty;
       }
       
       public int calculateTotalMarks()
       {
               int syTotal=sy.getct() + sy.getmt() + sy.getet();
               int tyTotal=ty.gettm() + ty.getpm();
               return syTotal + tyTotal;
       }
       
       public char calculateGrade()
       {
              int totalMarks = calculateTotalMarks();
              double percentage =((double)totalMarks/500)*100;
              
              if(percentage>=70)
                 return 'A';
              else if(percentage>=60)
                 return 'B';
              else if(percentage>=50)
                 return 'C';
              else if(percentage>=40)
                 return 'P';
              else 
                 return 'F';            
       }
       
       public void displayResult()
       {
              System.out.println("Roll no. : "+rno);
              System.out.println("name : "+name);
              System.out.println("total Marks : "+calculateTotalMarks());
              System.out.println("percentage : "+((double)calculateTotalMarks()/500)*100+"%");
              System.out.println("grade : "+calculateGrade());
       }
       
       public static void main(String args[])
       {
              Scanner sc = new Scanner(System.in);
              System.out.println("enter the no. of students : ");
              int n=sc.nextInt();
              sc.nextLine();
              for(int i=0;i<n;i++)
              {
                 System.out.println("Enter rno. : ");
                 int rno=sc.nextInt();
                 sc.nextLine();
                 System.out.println("Enter name : ");
                 String name = sc.next();
                 System.out.println("Enter SY comp Total : ");
                 int com = sc.nextInt();
                 System.out.println("Enter SY maths Total : ");
                 int math = sc.nextInt();
                 System.out.println("Enter SY elec Total : ");
                 int elec = sc.nextInt();
                 System.out.println("Enter TY theory marks Total : ");
                 int they = sc.nextInt();
                 System.out.println("Enter TY prac Total : ");
                 int prac = sc.nextInt();
                 
                 Sy sy = new Sy(com,math,elec);
                 Ty ty = new Ty(they,prac);
                 student student= new student(rno,name,sy,ty);
                 student.displayResult(); 
                 }
                 sc.close();
       }
}
