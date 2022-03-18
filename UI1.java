package AWT;

import java.awt.*;
import java.awt.event.*;

public class UI1 extends Frame implements ActionListener{

	TextField tf1, tf2;
	Label l;
	Button b;
	
	UI1(){
		tf1 = new TextField();
		tf1.setBounds(50, 50, 100, 25);
		
		tf2 = new TextField();
		tf2.setBounds(50, 100, 200, 25);
		
		l = new Label();
		l.setBounds(50, 150, 200, 50);
		
		b = new Button("Divide");
		b.setBounds(50, 200, 100, 50);
		b.addActionListener(this);
		
		add(b);
		add(tf1);
		add(tf2);
		add(l);
		setSize(800, 800);
		setLayout(null);
		setVisible(true);
		addWindowListener(new MyWindowAdapter());
	}

	class MyWindowAdapter extends WindowAdapter {
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			String n1 = tf1.getText();
			String n2 = tf2.getText();
			l.setText("Quotient: "+(Integer.parseInt(n1))/(Integer.parseInt(n2)));
		}
		catch(NumberFormatException e1) {
			l.setText("Cannot divide non-numerical / non-integer values");
		}
		catch(ArithmeticException e2) {
			l.setText("Cannot divide by zero");
		}
		catch(Exception e3) {
			System.out.println("Some exception ocurred..");
		}
	}

	public static void main(String[] args) {
		new UI1();
	}

}
