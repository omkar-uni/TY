import java.io.*;
public class CricBuzz
{
       String nm;
       public int ing, tofnotout, totalruns;
       public float batavg;
       public CricBuzz()
       {
              nm=null;
              ing=0;
              tofnotout=0;
              totalruns=0;
              batavg=0;
  
       }
       public void get() throws IOException
       {
              BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
              System.out.println("Enter the nm, no of ings, no of times not out, total runs: ");
              nm=br.readLine();
              ing=Integer.parseInt(br.readLine());
              tofnotout=Integer.parseInt(br.readLine());
              totalruns=Integer.parseInt(br.readLine());
       }
       public void put()
       {
              System.out.println("nm="+nm);
              System.out.println("no of ings="+ing);
              System.out.println("no times notout="+tofnotout);
              System.out.println("total runs="+totalruns);
              System.out.println("bat avg="+batavg);
  
       }
       static void avg(int n, CricBuzz c[])
       {
              try
              {
                 for(int i=0;i<n;i++)
                 {
                    c[i].batavg=c[i].totalruns/c[i].ing;
                 }
              }catch(ArithmeticException e)
              {
                System.out.println("Invalid arg");
              }
       }
       static void sort(int n, CricBuzz c[])
       {
              String temp1;
              int temp2,temp3,temp4;
              float temp5;
              for(int i=0;i<n;i++)
              {
                  for(int j=i+1;j<n;j++)
                  {
                     if(c[i].batavg<c[j].batavg)
                     {
                        temp1=c[i].nm;
                        c[i].nm=c[j].nm;
                        c[j].nm=temp1;
                        temp2=c[i].ing;
                        c[i].ing=c[j].ing;
                        c[j].ing=temp2;
                        temp3=c[i].tofnotout;
                        c[i].tofnotout=c[j].tofnotout;
                        c[j].tofnotout=temp3;
                        temp4=c[i].totalruns;
                        c[i].totalruns=c[j].totalruns;
                        c[j].totalruns=temp4;
                        temp5=c[i].batavg;
                        c[i].batavg=c[j].batavg;
                        c[j].batavg=temp5;
                     }
                   }
              } 
        }


         public static void main(String args[])throws IOException
         {
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the limit:");
                int n=Integer.parseInt(br.readLine());
                CricBuzz c[]=new CricBuzz[n];
                for(int i=0;i<n;i++)
                {
                    c[i]=new CricBuzz();
                    c[i].get();
                }
                CricBuzz.avg(n,c);
                CricBuzz.sort(n, c);
                for(int i=0;i<n;i++)
                {
                   c[i].put();
                }
 
         }
}
