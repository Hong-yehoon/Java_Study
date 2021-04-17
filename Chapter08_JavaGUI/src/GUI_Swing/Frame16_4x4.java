package GUI_Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame16_4x4 extends JFrame{

	public Frame16_4x4() {
	
		setTitle("컬러그리드프레임4by4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(600,600);
		setVisible(true);
		
		Container c = getContentPane();		//JFrame에 있는 메소드
		c.setLayout(new GridLayout(4, 4));
		
		JLabel [] lb = new JLabel[16];
		Color [] color = {Color.RED, Color.ORANGE, Color.YELLOW,  Color.GREEN,Color.MAGENTA,
				 Color.CYAN ,Color.BLUE, Color.DARK_GRAY, Color.BLACK, Color.PINK, Color.WHITE,
				 	Color.LIGHT_GRAY, Color.BLUE,Color.YELLOW, Color.GREEN,Color.MAGENTA};
		
		for(int i=0; i<lb.length; i++) {
			lb[i] = new JLabel(Integer.toString(i));		
			int index = (int)(Math.random()*15+1);
			lb[i].setOpaque(true);		//t:투명 f:불투명+-
			
			lb[i].setBackground(color[i]);
			c.add(lb[i]);
			
		}
		
	}
	public static void main(String[] args) {
		new Frame16_4x4();
	}
}
