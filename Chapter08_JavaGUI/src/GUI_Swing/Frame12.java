package GUI_Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Frame12 extends JFrame {

	public Frame12() {

		setTitle("학생부 입력폼");
		setExtendedState(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setBackground(new Color(1,200,180));
		c.setLayout(new GridLayout(5,3,2,4));		//행,열,높이간격,너비간격
		
		c.add(new JLabel("이름"));
		c.add(new JTextField(""));
		c.add(new JLabel("학번"));
		c.add(new TextField(""));
		c.add(new JLabel("학과"));
		c.add(new JTextField(""));
		c.add(new JLabel("비밀번호"));
		c.add(new TextField(""));
		
		setSize(500,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Frame12();
	}
}
