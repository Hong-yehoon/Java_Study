package Listener;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MouseListener1 extends JFrame {

	public MouseListener1() {

		setTitle("마우스 리스너 학습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		setSize(500,500);
		setVisible(true);
		
		JButton btn = new JButton("마우스이벤트");
		btn.addMouseListener(new MyMouse());
		c.add(btn);
		
	}
	public static void main(String[] args) {
		
		new MouseListener1();
	}
}
class MyMouse implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {

		JButton btn = (JButton)e.getSource();
		btn.setBackground(new Color(0x00FF0000));
		
	}

	@Override
	public void mouseExited(MouseEvent e) {

		JButton btn = (JButton)e.getSource();
		btn.setBackground(new Color(255,288,0));
		
	}

	@Override
	public void mousePressed(MouseEvent e) {

		JButton btn = (JButton)e.getSource();
		btn.setBackground(Color.CYAN);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	}
	
