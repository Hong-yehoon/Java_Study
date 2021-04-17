package Listener;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Action1 extends JFrame {

	public Action1() {
		
		setTitle("ActionListener");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
	
		setSize(300,200);
		setVisible(true);
		JButton btn = new JButton("Action");
		MyActionListener1 m = new MyActionListener1();
		btn.addActionListener(m);
		c.add(btn);
		
		
	}
	
	public static void main(String[] args) {

		new Action1();
	}
}

//리스너 생성  				interface
class MyActionListener1 implements ActionListener{

	public void actionPerformed (ActionEvent e) {

		JButton btn =(JButton)e.getSource();
		if(btn.getText().equals("Action")) {
			btn.setText("액션");
			btn.setBackground(Color.yellow);
		}else {
			btn.setText("Action");
			btn.setBackground(Color.black);
		}
	}
	
}


