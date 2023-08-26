import java.util.Date;
import java.text.SimpleDateFormat;
class DT
{
     public static void main(String args[])
     {
            Date date =new Date();
            SimpleDateFormat df = new SimpleDateFormat();
            
            SimpleDateFormat df1 = new SimpleDateFormat("dd/MM/yy");
            System.out.println("current date is "+df1.format(date)); 
            
            SimpleDateFormat df2 = new SimpleDateFormat("MM-dd-yyyy");
            System.out.println("current date is "+df2.format(date)); 
            
            SimpleDateFormat df3 = new SimpleDateFormat("EEEEEE MMMMM dd yyyy");
            System.out.println("current date is "+df3.format(date)); 
            
            SimpleDateFormat df4 = new SimpleDateFormat("E MMMMM dd hh:mm:ss z yyyy");
            System.out.println("current date and time is "+df4.format(date));
            
            SimpleDateFormat df5 = new SimpleDateFormat("dd/mm/yy hh:mm:ss a Z");
            System.out.println("current date and time is "+df5.format(date));
            
            SimpleDateFormat df6 = new SimpleDateFormat("hh:mm:ss");
            System.out.println("current time is "+df6.format(date));
            
            SimpleDateFormat df7 = new SimpleDateFormat("w");
            System.out.println("current week of the year is "+df7.format(date));
            
            SimpleDateFormat df8 = new SimpleDateFormat("W");
            System.out.println("current week of month is "+df8.format(date));
            
            SimpleDateFormat df9 = new SimpleDateFormat("D");
            System.out.println("current day of month is "+df9.format(date));
     } 
}
