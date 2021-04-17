package Listener;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.temporal.JulianFields;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Action2 extends JFrame{

	public Action2() {

		setTitle("action");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		setSize(400,400);
		setVisible(true);
		
		JButton btn = new JButton("Start");
		MyActionListener2 m = new MyActionListener2();
		btn.addActionListener(m);
		c.add(btn);
	}
	public static void main(String[] args) {
	
		new Action2();
	
	}
}
//리스너
class MyActionListener2 implements ActionListener {
	
	//버튼글자를 읽어서 같으면 다른 글자로 변경하는 코드 작성
	//getText() setText() 이용
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton)e.getSource();		//다운캐스팅?
		if (btn.getText().equals("Start")) {
			btn.setText("End");
		}else{
			btn.setText("Start");
		}
		
	}
}