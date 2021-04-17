/*
		GridLayout
			. 컨테이너 공간을 격자 사각형의 격자(그리그)모양으로 분할한다. 
			. 각 셀에는 오직 하나의 컴포넌트를 배치한다. 
			. 셀보다 많은 컴포넌트가 추가되면 행, 수가 지켜지지 않고 적당히 변형된다. 
			
			. 생성자
				GridLayout (int row, int cols, int hGap, int vGap) 
				GridLayout (int row, int cols) gap = 0
				GridLayout() : default, 1,1,0, 0 와 같다. 
			

*/
package GUI_Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame11 extends JFrame {

	public Frame11() {
		
		setTitle("GridLayout1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(4,3));
		JButton btn = new JButton("1");
		btn.setBackground(Color.yellow);
		btn.setForeground(Color.BLUE);
		
		c.add(btn);
		
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JButton("4"));
		c.add(new JButton("5"));
		c.add(new JButton("6"));
		c.add(new JButton("7"));
		c.add(new JButton("8"));
		c.add(new JButton("9"));
		c.add(new JButton("+"));
		c.add(new JButton("-"));
		
		
		
		
		setSize(800,800);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Frame11();
	}
}
