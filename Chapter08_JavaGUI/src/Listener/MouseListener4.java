package Listener;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseListener4 extends JFrame {
	JPanel c;
	public MouseListener4() {

		setTitle("더블클릭");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		c = new JPanel();
		setContentPane(c);
		
		c.addMouseListener(new MouseListener());
		
		setSize(800,600);
		setVisible(true);
	}
	
	class MouseListener extends MouseAdapter {

		public void mouseClicked(MouseEvent e) {
			int r = (int)(Math.random()*255+0);
			int g = (int)(Math.random()*255+0);
			int b = (int)(Math.random()*255+0);

			if(e.getClickCount()==2) {
				c.setBackground(new Color(r,g,b));
			}
		}
	}
	public static void main(String[] args) {
		
		new MouseListener4();
	}
}
