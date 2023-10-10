//Heyo!!!

import java.awt.*;

class myFrame extends Frame
{
      TextField name,pass;
      Button E,W,S,N,C;
      BorderLayout B1;
      myFrame (String s)
      {
              super(s);
              setVisible(true);
              setSize(500,300);
              B1 = new BorderLayout();
              setLayout(B1);
              E = new Button("EAST");
              W = new Button("WEST");
              S = new Button("SOUTH");
              N = new Button("NORTH");
              C = new Button("CENTER");
              add(E,BorderLayout.EAST);
              add(W,BorderLayout.WEST);
              add(S,BorderLayout.SOUTH);
              add(N,BorderLayout.NORTH);
              add(C,BorderLayout.CENTER);
      }
      public static void main(String[] args)
      {
             myFrame f = new myFrame("Demonstrating Frame");
      }
}
