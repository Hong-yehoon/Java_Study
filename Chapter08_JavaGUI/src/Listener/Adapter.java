/*
		Adapter
			. 리스너 인터페이스의 불편함을 개선하기 위해 제공되는 클래스이다. 
			. 메소드가 하나뿐인 리스너 인터페이스는 제공되지 않는다. 
				- ActionListener, ItemListener, TextListener, AdjustListener에는 없다. 
			. XXXListener 대신에 XXXAdapter로 작성하면 된다. 

*/
package Listener;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Adapter extends JFrame{

	JPanel la;
	
	public Adapter() {
			setTitle("Adapter");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JPanel contentPane = new JPanel();
			setContentPane(contentPane);		//JFrame의 contentPane을 JPanel로 변경해서 세팅
			
			contentPane.setLayout(null);
			contentPane.setBackground(Color.ORANGE);
			//****************************************
			contentPane.addMouseListener(new MyMouseListener1());
			
			JLabel la = new JLabel("요기용");
			la.setSize(100,20);
			la.setLocation(30,30);
			contentPane.add(la);
			
			
			
			//**************************************
			setSize(500,300);
			setVisible(true);
			
	
	}
	class MyMouseListener1 extends MouseAdapter {

	
		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			
			la.setLocation(x,y);
		}


	}
	public static void main(String[] args) {
		new Adapter();
	}
}
