package gui_layout;

import java.awt.*;

import javax.swing.*;

public class DLayout {
	void makeFrame() {
		JFrame frame = new JFrame();
		frame.setTitle("My Frame");
		frame.setSize(450, 350);
		frame.setLocation(70, 50);
		JLabel label = new JLabel("Enter Text: ");
		JTextField tf = new JTextField("This is text field");
		JButton bn = new JButton("OK");
		JButton bn1 = new JButton("Hello");
		JButton bn2 = new JButton("Hi");
		frame.add(label,BorderLayout.NORTH);
		frame.add(tf,BorderLayout.CENTER);
		frame.add(bn,BorderLayout.SOUTH);
		frame.add(bn1,BorderLayout.EAST);
		frame.add(bn2,BorderLayout.WEST);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		DLayout tfdl = new DLayout();
		tfdl.makeFrame();
	}

}
