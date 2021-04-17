package Listener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class MouseListener2 extends JFrame{

	JPanel c = new JPanel();
	JLabel la; //= new JLabel();
	
	public MouseListener2() {

		setTitle("마우스이벤트활용");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		setContentPane(c);		//JPanel을 컨테이너로 교체
		c.setLayout(null);
		
		c.addMouseListener(new MyMouseListener2());
		
		la = new JLabel("안녕~");
		la.setSize(50,20);
		la.setLocation(30,30);
		c.add(la);
		
		setSize(900,800);
		setVisible(true);
		
	}
	
class MyMouseListener2 implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		
		la.setLocation(x,y);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}
	
}
	public static void main(String[] args) {
		new MouseListener2();


	}
}
