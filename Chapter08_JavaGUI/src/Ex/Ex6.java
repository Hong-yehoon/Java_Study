package Ex;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ex6 extends JFrame {

	public Ex6() {

	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	Container c = getContentPane();
	Ex6Panel ep = new Ex6Panel();
	c.add(ep);
	
	
	setSize(500,500);
	setVisible(true);
	
		
	}
	class Ex6Panel extends JPanel{
		
		public Ex6Panel() {
			JTextField tf = new JTextField(20); 
			JButton btn = new JButton("Save");
			
			btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			
			
			JTextArea ta = new JTextArea(7,20);
			
			add(tf);
			add(btn);
			add(ta);
			
			
		}
				
		
	}
	
	public static void main(String[] args) {
	 new Ex6();	
	}
}
