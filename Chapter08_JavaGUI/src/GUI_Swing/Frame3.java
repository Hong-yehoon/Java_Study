package GUI_Swing;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame3 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setTitle("세번째");
		
		Container contentPene = frame.getContentPane();
		
		JButton btn = new JButton("click");
		contentPene.add(btn);
		
		frame.setSize(500,300);
		frame.setVisible(true);
	}
	
}
