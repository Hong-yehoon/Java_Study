package Listener;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KeyListener3 extends JFrame {

	JPanel c = new JPanel();
	
	JLabel la, la1, la2;
	final int FLYING_UNIT = 10;
	
	public KeyListener3() {

		setTitle("상하좌우마우스로 조정하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(c);
		la = new JLabel(new ImageIcon(".\\img\\tiger.png"));		//ㅂㅐ경
		la.setSize(900,900);
		la.setLocation(5, 10);
		
		//상대이미지
		la1 = new JLabel(new ImageIcon(".\\img\\naver.png")); 
		la1.setSize(150,150);
		la1.setLocation(600,500);		//처음시작
		
		//이동시킬 이미지
		la2 = new JLabel(new ImageIcon(".\\img\\tiger1.png"));
		la2.setSize(150,150);
		la2.setLocation(60,90);
		
		//리스너
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		c.add(la1);
		c.add(la2);
		
		setSize(1400,800);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	class MyKeyListener extends KeyAdapter{
		
		@Override
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			
			switch(keyCode) {
				case KeyEvent.VK_UP:
					la2.setLocation(la2.getX(), la2.getY()-FLYING_UNIT); 
					
					if((la1.getY()>la.getY()) && (la1.getY()<la2.getHeight())){

						la1.setLocation((int)(Math.random()*500+100),(int)(Math.random()*500-100));

					}break;
			
				case KeyEvent.VK_DOWN:
					la2.setLocation(la2.getX(), la2.getY()+FLYING_UNIT);break;
					
				case KeyEvent.VK_LEFT:
					la2.setLocation(la2.getX()-FLYING_UNIT, la2.getY());break;
					
				case KeyEvent.VK_RIGHT:
					la2.setLocation(la2.getX()+FLYING_UNIT, la2.getY());break;
					
			}
			
			
		}
	}
	public static void main(String[] args) {

		new KeyListener3();
	}

}
