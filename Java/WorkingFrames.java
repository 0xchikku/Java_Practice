package WorkingFrames;

import java.awt.*;
import java.awt.event.*;
public class FrameWork{
	public static void main(String[] args) {
		new MyFrame();
	}
}

class MyFrame extends Frame implements ActionListener{
	Label l1,l2,l3,l4;
	Button b1;
	TextField tf1,tf2;
	String s1,s2,s3;
	Choice c1,c2,c3;
	public MyFrame() {
		setLayout(new FlowLayout());
		
		l1 = new Label("Agarsen College ");
		tf1 = new TextField("Welcome!");
		
		
		l2 = new Label("Font Style: ");
		c1 = new Choice();
		c1.add("Times New Roman");
		c1.add("Comic Sans");
		c1.add("Courier");
		
		l3 = new Label("Font Size: ");
		c2 = new Choice();
		c2.add("10");
		c2.add("12");
		c2.add("18");
		
		l4 = new Label("Font Color: ");
		c3 = new Choice();
		c3.add("Red");
		c3.add("Blue");
		c3.add("Green");
		
		add(l1);
		add(tf1);
		
		add(l2);
		add(c1);
		
		add(l3);
		add(c2);
		
		add(l4);
		add(c3);
		
		b1 = new Button("Change");
		tf2 = new TextField("Thank You!");
		
		b1.addActionListener(this);	
		add(b1);
		add(tf2);
		
		setVisible(true);
		setSize(500,500);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Changed!");
		
	}
}
