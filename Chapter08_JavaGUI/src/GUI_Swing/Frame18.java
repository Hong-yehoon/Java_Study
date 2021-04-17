package GUI_Swing;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


class North extends JPanel {	//JPanel은 부품이면서 컨테이너, FlowLayout이 Default
	
	public North() {

			setLayout(new GridLayout(1, 1));
			
			JLabel la = new JLabel("내가 만든 별자리",JLabel.CENTER);	//글자 위치 지정학습
			
			add(la);
			add(new JTextField(30));  //30글자
			setVisible(true);
	}
}
class Center extends JPanel{
	
	public Center() {

		setBackground(new Color(0x00F95A567));
		setLayout(null);		//배치관리자가 없는 레이아웃
		
		int r = (int)(Math.random()*20+1);
		
		for(int i = 0; i<r; i++) {
			int x = (int)(Math.random()*500+1);
			int y = (int)(Math.random()*300+1);
			
			JLabel la = new JLabel("*");
				la.setSize(10,10);
				la.setLocation(x, y);
				la.setOpaque(true);
				la.setForeground(Color.yellow);		//글자색
				la.setBackground(Color.BLACK);
			add(la);
			
				
		}
	
	}
}

public class Frame18 extends JFrame{

	public Frame18() {		//생성자, 초기화
		
		setTitle("반짝반짝 작은별");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout(2,5));
		c.setBackground(new Color(0x00D5D5D0));
		
		//********************

		North no = new North();
		no.setBackground(new Color(0x005CD1E5));
		c.add(no,BorderLayout.NORTH);		//북쪽에 North 객체를 붙임
		
		Center ce = new Center();
		ce.setBackground(Color.black);
		c.add(ce,BorderLayout.CENTER);
		
		//********************
		
		
		setSize(600,500);
		setLocation(300,300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Frame18();
	}
}
