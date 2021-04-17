package Listener;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MouseWheel extends JFrame {

	JLabel la;
	public Object JLabel;
	public MouseWheel() {

		setTitle("Wheel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p = new JPanel();
		setContentPane(p);
		
		p.setLayout(new BorderLayout());
		
		la = new JLabel("LOVE JAVA",SwingConstants.CENTER);
		la.setSize(100,50);
		la.setFont(new Font("TimeRoman",Font.PLAIN,50));
		
		la.addMouseWheelListener(new MyMouseWheel());
		p.add(la);
		
		
		setSize(800,800);
		setVisible(true);
		
		p.setFocusable(true);
		p.requestFocus();
		
	}
	class MyMouseWheel implements MouseWheelListener{

		public void mouseWheelMoved(MouseWheelEvent e) {
			
			int n = e.getWheelRotation();	//wheel값 가져옴
						
			if(n<0) {
				JLabel la = (JLabel)e.getSource();
				Font f = la.getFont();
				int size = f.getSize();
				la.setFont(new Font("TimeRoman",Font.PLAIN,size-5));
			}
			else {
				JLabel la = (JLabel)e.getSource();
				Font f = la.getFont();
				int size = f.getSize();
				la.setFont(new Font("TimeRoman",Font.PLAIN,size+5));
		}	
	}
}
	public static void main(String[] args) {
	
		new MouseWheel();
	}
}
