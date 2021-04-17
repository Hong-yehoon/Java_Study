/*
	MouseListener
		- 리스너 종류
			. MouseListener : 5 가지
			. MouseMotionListener : 2가지
			. MouseWeelListener : 1가지
			
		- 메소드 
			. getX(), getY()
			. getClickCount() : 마우스 클릭 횟수 리턴
			. getButton()  	  : 마우스의 왼쪽이냐 ㅇ중앙이냐 오른쪽이냐
					-MouseEvent.BUTTON1/2/3 - 왼쪽버튼

*/
package Listener;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseListener3 extends JFrame{

	JPanel c = new JPanel();
	JLabel la;
	
	public MouseListener3() {

		setTitle("마우스이벤트학습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		setContentPane(c);
		c.addMouseListener(new MyMouseListener());
		c.addMouseMotionListener(new MyMouseListener());
		c.addMouseWheelListener(new MyMouseListener());
		
		la = new JLabel("Mouse Event");
		la.setFont(new Font("Arial",Font.BOLD,25));	//글자크기 설정
		c.add(la);
		
		
		
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MouseListener3();
	}
	
	class MyMouseListener implements MouseListener,MouseMotionListener, MouseWheelListener {

		@Override
		public void mouseClicked(MouseEvent e) {
		}

		@Override
		public void mouseEntered(MouseEvent e) {

			c.setBackground(Color.green);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			la.setBackground(Color.CYAN);
			
		}

		@Override
		public void mousePressed(MouseEvent e) {

			la.setText("MousePressed("+e.getX()+"',"+e.getY()+")");
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		//MouseMotion
		@Override
		public void mouseDragged(MouseEvent e) {

			la.setText("MouseDragged("+e.getX()+"',"+e.getY()+")");
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			la.setText("MouseMoved("+e.getX()+"',"+e.getY()+")");			
		}
		//MouseWeel
		@Override
		public void mouseWheelMoved(MouseWheelEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
