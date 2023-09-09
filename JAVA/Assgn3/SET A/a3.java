import java.util.*;
import java.io.*;

interface operation
{
          float PI = 3.14f;
          void area();
          void volume();
}

class cylinder implements operation
{
      float r,h;
      void input()
      {
           Scanner sc = new Scanner(System.in);
           System.out.println("\nEnter Radius : ");
           r = sc.nextFloat();
           System.out.println("\nEnter Height : ");
           h = sc.nextFloat();
      }
      public void area()
      {
             float a = 2*PI*r*(r+h);
             System.out.println("\nArea : "+a);
      }
      public void volume()
      {
             float v = (PI*r*r*h);
             System.out.println("\nVolume : "+v);
      }
}

class a3
{
      public static void main(String args[])
      {
             cylinder c = new cylinder();
             c.input();
             c.area();
             c.volume();
      }
}
