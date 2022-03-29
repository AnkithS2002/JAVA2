import java.awt.*;
import java.awt.event.*;


public class AWTDemo extends WindowAdapter{

	Frame f;
	AWTDemo(){
		
		f = new Frame();
		TextField tf1, tf2;
		Button b2, b3, b4, b5;
		Label l1, l2;
		Font font1;
		
		f.setTitle("Ankith's Adda");
		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);
		f.addWindowListener(this);
		
		font1 = new Font("DejaVu", Font.BOLD, 23);
	
		
		l1 = new Label();
		l1.setText("Welcome to Ankith's Maths Adda!");
		l1.setFont(font1);
		l1.setBounds(20, 20, 450, 50);
		
		l2 = new Label();
		l2.setText("Result: ");
		l2.setBounds(20, 260, 100, 50);
		l2.setFont(font1);
		
		tf1 = new TextField("Enter number 1 here");
		tf1.setBounds(20, 80, 460, 50);
		
		tf2 = new TextField("Enter number 2 here");
		tf2.setBounds(20, 140, 460, 50);
		 
		
		b2 = new Button("Add");
		b2.setBounds(20, 200, 80, 50);
		b2.setBackground(Color.RED);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Integer res = Integer.parseInt(tf1.getText()) * Integer.parseInt(tf2.getText());
					l2.setText("Result: "+res);
				}
				catch(Exception e1) {
					System.out.println(""+e1);
				}
			}
		});
		
		b3 = new Button("Subtract");
		b3.setBounds(110, 200, 80, 50);
		b3.setBackground(Color.YELLOW);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Integer res = Integer.parseInt(tf1.getText()) * Integer.parseInt(tf2.getText());
					l2.setText("Result: "+res);
				}
				catch(Exception e1) {
					System.out.println(""+e1);
				}
			}
		});
		
		b4 = new Button("Multiply");
		b4.setBounds(200, 200, 80, 50);
		b4.setBackground(Color.GREEN);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Integer res = Integer.parseInt(tf1.getText()) * Integer.parseInt(tf2.getText());
					l2.setText("Result: "+res);
				}
				catch(Exception e1) {
					System.out.println(""+e1);
				}
			}
		});
		
		b5 = new Button("Divide");
		b5.setBounds(290, 200, 80, 50);
		b5.setBackground(Color.BLUE);
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Integer res = Integer.parseInt(tf1.getText()) * Integer.parseInt(tf2.getText());
					l2.setText("Result: "+res);
				}
				catch(Exception e1) {
					System.out.println(""+e1);
				}
			}
		});
		
		f.add(l1);
		f.add(l2);
		f.add(tf1);
		f.add(tf2);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		
	}
	
	public void windowClosing(WindowEvent e) {
		f.dispose();
	}
	
	public static void main(String[] args) {
		
		new AWTDemo();
	}

}
