//Heyo!!!
import java.awt.*;

class FlowLayoutDemo extends Frame
{
      FlowLayoutDemo()
      {
            Button[] btn = new Button[10];
            setLayout(new FlowLayout());
            for (int i=0;i<btn.length;i++)
            {
                btn[i] = new Button("Button "+(i+1));
                add(btn[i]);
            }
      }
}
class FlowLayoutJavaDemo
{
      public static void main(String args[])
      {
             FlowLayoutDemo frame = new FlowLayoutDemo();
             frame.setTitle("FlowLayout in Java Example");
             frame.setSize(400,150);
             frame.setVisible(true); 
      }
}


