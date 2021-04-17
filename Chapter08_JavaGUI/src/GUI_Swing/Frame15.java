package GUI_Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame15 extends JFrame {

	public Frame15 () {
		
		setTitle("컬러그리드프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();		//JFrame에 있는 메소드
		contentPane.setLayout(new GridLayout(1, 10));
		
		JButton [] btn = new JButton[10];
		Color [] color = {Color.RED, Color.ORANGE, Color.YELLOW,  Color.GREEN,Color.MAGENTA,
							 Color.CYAN ,Color.BLUE, Color.DARK_GRAY, Color.BLACK, Color.PINK};
		
	
	for(int i=0; i<10; i++) {
		
		btn[i] = new JButton(Integer.toString(i));		//<- 문자열이 들어가야함 그냥 i 넣으면 안댐 
		int index = (int)(Math.random()*9+1);
		btn[i].setBackground(color[index]);
		contentPane.add(btn[i]);
	
	}
		setSize(800,300);
		setVisible(true);
	
			
	}
	
	public static void main(String[] args) {
		new Frame15();
		
		
	
	}
}
