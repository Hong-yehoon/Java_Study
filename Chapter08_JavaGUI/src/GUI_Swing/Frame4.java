package GUI_Swing;

import java.awt.Container;

import javax.naming.ContextNotEmptyException;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame4 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		frame.setTitle("홍예훈");
		frame.setSize(500, 300);
		frame.setLocation(100, 100);
		
		Container contentPene = frame.getContentPane();
		JButton btn1 = new JButton("Start");
		JButton btn2 = new JButton("End");
		
		btn1.setSize(100, 100);
		btn1.setLocation(10,10);
			contentPene.add(btn1);
		btn1.setSize(100, 100);
		btn1.setLocation(90, 90);
		
	
		contentPene.add(btn2);
		
		frame.setVisible(true);
		
				
		
	}
}
