public class SProg8
{
      int num;
      public SProg8()
      {
         num=0;
      }
      public SProg8(int num)
      {
            this.num=num;
      }
      public static void main(String a[])
      {
            SProg8 m1=new SProg8();
            if(a.length>0)
            {
              int n=Integer.parseInt(a[0]);
              SProg8 m2 =new SProg8(n);
              System.out.println(m1.num);
              System.out.println(m2.num);
            }
            else
                System.out.println("Insufficient Arguments");
      }
}
