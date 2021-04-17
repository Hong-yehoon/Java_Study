package Listener;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class 내부익명리스너 extends JFrame{
	
	JPanel c = new JPanel();
	JLabel la;
	
	public 내부익명리스너() {

		setTitle("익명클래스학습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(c);
		c.setLayout(null);
		c.setBackground(new Color(220,210,90));
		c.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {}
			
			@Override
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				
				la.setLocation(x,y);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		
		la = new JLabel(new ImageIcon(".\\img\\tiger1.png"));
		la.setSize(300,600);
		la.setLocation(50,50);
		c.add(la);
		
		setSize(750,800);
		setVisible(true);
		
	}
	
	

	public static void main(String[] args) {
		new 내부익명리스너();
	}

}
