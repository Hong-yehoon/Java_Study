/*
		BorderLayout
							NORTH
					WEST   CENTER	EAST
							SOUTH
			. add() 활용시 반드시  위치를 명기해 주어야 한다. 
			
			. 생성자 : BorderLayout (int hGap, int VGap) //디폴트 gap 0

*/


package GUI_Swing;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame9 extends JFrame{

	public Frame9() {
		setTitle("BorderLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout(10,10));

		contentPane.add(new JButton("ADD"),BorderLayout.WEST);
		contentPane.add(new JButton("MUL"),BorderLayout.EAST);
		contentPane.add(new JButton("SUB"),BorderLayout.NORTH);
		contentPane.add(new JButton("DIV"),BorderLayout.SOUTH);
		contentPane.add(new JButton("CALCULATOR"),BorderLayout.CENTER);
		
		setVisible(true);
		setSize(800, 800);
	}
	public static void main(String[] args) {
		new Frame9();
	}
}
