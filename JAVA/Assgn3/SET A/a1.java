import java.util.*;
import java.io.*;

class continent
{
      String cname;
      continent(String cname)
      {
        this.cname=cname;
      }
      void displayContinent()
      {
           System.out.println("\nContinent : "+cname);
      }
}

class Country extends continent
{
      String countryName ;
      Country(String cname , String countryName)
      {
              super(cname);
              this.countryName = countryName; 
      }
       void displayCountry()
      {    
           displayContinent();
           System.out.println("\nCountry : "+countryName);
      }
}

class State extends Country
{
      String sname,place;
      State(String cname ,String countryName ,String sname,String place)
      {
           super(cname,countryName);
           this.sname=sname;
           this.place = place;
           
      }
      void displayState()
      {
           displayCountry();
           System.out.println("\nState : "+sname);
           System.out.println("\nplace : "+place);
      }  
}

class a1
{
      public static void main(String args[])
      {
             State loc = new State("ASIA","BHARAT","MAHARASHTRA","NASHIK");
             loc.displayState();
      }
}
