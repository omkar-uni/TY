import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class b1 extends JFrame implements ActionListener {
	JLabel l1, l2, l3,l4,l5,l6;
	JButton b;
	JRadioButton r1, r2, r3;
	JCheckBox c1, c2, c3;
	JCheckBox d1,d2,d3;
	String[] font = new String[]{"Arial","Underlined"};
	//int[] size = new int[]{1,2};
	
	
	JTextField t1, t2;
	ButtonGroup b1;
	JPanel p1, p2;
	static int cnt;
	private StringBuffer s1 = new StringBuffer();

	b1() {

		b1 = new ButtonGroup();
		p1 = new JPanel();
		p2 = new JPanel();
		b = new JButton("Clear");
		b.addActionListener(this);
                JComboBox jcb = new JComboBox(font);
                //JComboBox siz = new JComboBox(size);
		r1 = new JRadioButton("FY");
		r2 = new JRadioButton("SY");
		r3 = new JRadioButton("TY");

		b1.add(r1);
		b1.add(r2);
		b1.add(r3);
		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);

		c1 = new JCheckBox("Music");
		c2 = new JCheckBox("Dance");
		c3 = new JCheckBox("Sports");

		c1.addActionListener(this);
		c2.addActionListener(this);
		c3.addActionListener(this);
              
		
                d1 = new JCheckBox("Bold");
		d2 = new JCheckBox("Italic");
		d3 = new JCheckBox("Underlined");
                
                jcb.setEditable(true);
             //   jcb.addItemListener(this);
                
                
		l1 = new JLabel("Your Name");
		l2 = new JLabel("Your Class");
		l3 = new JLabel("Your Hobbies");
		l4 = new JLabel("Style");
		l5 = new JLabel("Font");
		//l6 = new JLabel("Size");
		t1 = new JTextField(20);
		t2 = new JTextField(30);
		

		p1.setLayout(new GridLayout(7, 5));
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(l3);
		p1.add(l4);
		 
		
		p1.add(r1);
		p1.add(c1);
		
		p1.add(d1);
		p1.add(r2);
		p1.add(c2);
		
		p1.add(d2);
		p1.add(r3);
		p1.add(c3);
		p1.add(d3);
               
                p1.add(l5);
                p1.add(jcb);
		//p1.add(l6);
		
		
		p2.setLayout(new FlowLayout());
		p2.add(b);
		p2.add(t2);
		
		setLayout(new BorderLayout());
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.EAST);

		setSize(600, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == r1) {
			cnt++;
			if (cnt == 1) {
				String s = t1.getText();
				s1.append("Name = ");
				s1.append(s);
			}
			s1.append(" Class = FY");
		} else if (e.getSource() == r2) {
			cnt++;
			if (cnt == 1) {
				String s = t1.getText();
				s1.append("Name = ");
				s1.append(s);
			}
			s1.append(" Class = SY");
		} else if (e.getSource() == r3) {
			cnt++;
			if (cnt == 1) {
				String s = t1.getText();
				s1.append("Name = ");
				s1.append(s);
			}
			s1.append(" Class = TY");
		}


		else if (e.getSource() == c1) {
			s1.append(" Hobbies = Music");
		} else if (e.getSource() == c2) {
			s1.append(" Hobbies = Dance");
		} else if (e.getSource() == c3) {
			s1.append(" Hobbies = Sports");
		}
		
		else if (e.getSource() == d1) {
			s1.append(" Style = Bold");
		} else if (e.getSource() == d2) {
			s1.append(" Style = Italic");
		} else if (e.getSource() == d3) {
			s1.append(" Style = Underlined");
		}
		

		t2.setText(new String(s1));
		//              t2.setText(s2);

		if (e.getSource() == b) {
			t2.setText(" ");
			t1.setText(" ");
		}

	}

	public static void main(String arg[]) {
		b1 s = new b1();

	}
}
