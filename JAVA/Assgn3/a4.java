interface PrintNumber
{
          public void print(int num1);
}

public class a4
{
       public static void main(String args[])
       {
              PrintNumber p = n -> System.out.println("Cube : "+n*n*n);
              p.print(2);
       }
} 
