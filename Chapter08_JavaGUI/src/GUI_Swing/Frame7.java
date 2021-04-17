package GUI_Swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame7 extends JFrame {

	public Frame7() {
		setTitle("일곱");
		
		Container contp = getContentPane();
		contp.setBackground(Color.yellow);
		
		JButton btn = new JButton("OK");
		
		contp.add(btn,BorderLayout.NORTH);
		contp.add(new JButton("Ignore"),BorderLayout.EAST);
		contp.add(new JButton("Cancel"),BorderLayout.SOUTH);
		contp.add(new JButton("Don't Click"),BorderLayout.WEST);
		contp.add(new JButton("What"),BorderLayout.CENTER);
		
		setSize(600, 400);
		setVisible(true);
				
	}
	public static void main(String[] args) {
		new Frame7();
	}
}
