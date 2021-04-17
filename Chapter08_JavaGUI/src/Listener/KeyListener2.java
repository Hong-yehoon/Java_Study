package Listener;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KeyListener2 extends JFrame{

	JPanel c;
	JLabel la;
	public KeyListener2() {
	
		setTitle("가상키학습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel c = new JPanel();
		setContentPane(c);
		c.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		//리스너
		c.addKeyListener(new MyKeyListener());
		
		la = new JLabel();
		la.setSize(50,30);
		c.add(la);
		
		setSize(900,700);
		setVisible(true);
		
		//focus
		c.setFocusable(true);
		c.requestFocus();
		
	}
class MyKeyListener extends KeyAdapter{

	@Override
	public void keyPressed(KeyEvent e) {

		if(e.getKeyChar()=='r') {
			c.setBackground(Color.RED);
		}else if (e.getKeyChar()=='y') {
			c.setBackground(Color.YELLOW);
			
		}else if (e.getKeyChar()=='t') {
			c.setBackground(new Color(188,250,90));
		
		}else if (e.getKeyCode()==KeyEvent.VK_F1) {
			c.setBackground(Color.BLUE);
		}
		
	}

	
	
}
	public static void main(String[] args) {

		new KeyListener2();
	}
}

