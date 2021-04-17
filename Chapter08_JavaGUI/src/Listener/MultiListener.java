package Listener;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MultiListener extends JFrame{

	public MultiListener() {

		setTitle("멀티리스너학습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton btn = new JButton("Action");
		
		btn.addActionListener(new MyListener());
		btn.addActionListener(new MyListener2());
		btn.addMouseListener(new MyListener());
		btn.addFocusListener(new MyListener());
		
		c.add(btn);
		setSize(300, 200);
		setVisible(true);
		
		
		
	
	}
	
class MyListener2 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton btn = (JButton)e.getSource();
		btn.setText("또 다른 리스너");
		
	}
	
}
	public static void main(String[] args) {
		
		new MultiListener();
	}
}

//독립클래스 리스너
class MyListener implements ActionListener, KeyListener, FocusListener, MouseListener{

	//마우스리스너
	@Override
	public void mouseClicked(MouseEvent e) {
		JButton btn = (JButton)e.getSource();
		btn.setBackground(Color.YELLOW);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		JButton btn = (JButton)e.getSource();
		btn.setBackground(Color.GREEN);
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		JButton btn = (JButton)e.getSource();
		btn.setText("Mouse Event Test");
		btn.setBackground(Color.LIGHT_GRAY);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		JButton btn = (JButton)e.getSource();
		if (btn.getText().equals("Action")) {
			btn.setText("액션");
		}else {
			btn.setText("Action");
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
	
	//포커스리스너
	@Override
	public void focusGained(FocusEvent e) {
		JButton btn = (JButton)e.getSource();
		btn.setBackground(Color.pink);
	}

	@Override
	public void focusLost(FocusEvent e) {
		JButton btn = (JButton)e.getSource();
		btn.setBackground(Color.pink);
	}

	// 키 리스너
	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}
	
}
