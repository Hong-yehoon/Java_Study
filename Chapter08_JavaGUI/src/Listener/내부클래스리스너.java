package Listener;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class 내부클래스리스너 extends JFrame {

	JPanel p;
	public 내부클래스리스너() {
	
		setTitle("내부리스너학습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		Container c = getContentPane();
		c.setLayout(new BorderLayout(10,5));
		MyActionListener2 ma1 = new MyActionListener2();
		
		
		JButton btn = new JButton("Action");
		c.add(btn, BorderLayout.NORTH);
		btn.addActionListener(ma1);
		
		
		p = new JPanel();
		p.setBackground(new Color(0x00D4F4FA));
		c.add(p,BorderLayout.CENTER);
		
		
		
		setSize(500,400);
		setVisible(true);
	
	
	}
	//내부 클래스로 구현
class MyActionListener2 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton btn = (JButton)e.getSource();
		if(btn.getText().equals("Action")) {
			btn.setText("액션");
			JPanel p = new JPanel();
			p.setBackground(Color.gray);
		}else {
			btn.setText("Action");
			p.setBackground(Color.cyan);
		}
		
	}
	
}
	public static void main(String[] args) {
		
		new 내부클래스리스너();
	}
}
