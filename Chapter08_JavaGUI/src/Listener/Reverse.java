package Listener;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Reverse extends JFrame {

	
	
	public Reverse() {
		setTitle("로꾸꺼");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel c = new JPanel();
		setContentPane(c);
		c.setLayout(new BorderLayout());
		
		JLabel la = new JLabel("LOVE JAVA", SwingConstants.CENTER);
		la.setFont(new Font("Arial",Font.BOLD,40));
		la.setSize(50,50);
		la.addKeyListener(new KeyAdapter() {
		 
			public void keyPressed(KeyEvent e) {
				//좌측으로 돈다
				if(e.getKeyCode()==KeyEvent.VK_LEFT) {
					JLabel la = (JLabel)e.getSource();
					String s = la.getText();
					String a = s.substring(0,1);	//첫글자
					String b = s.substring(1);		//나머지
					
					la.setText(b.concat(a));
					
				}
				else if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
					
					JLabel la = (JLabel)e.getSource();
					String s = la.getText();
					String a = s.substring(8,9);	//첫글자
					String b = s.substring(0,8);		//나머지
					
					la.setText(a.concat(b));
				}
			}
		});
		c.add(la);
		
		setSize(500, 500);
		setVisible(true);
		
		la.setFocusable(true);
		la.requestFocus();
	}
	public static void main(String[] args) {
	 new Reverse();	
	}
}
