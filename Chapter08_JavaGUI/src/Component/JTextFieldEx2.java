package Component;

import java.awt.Container;

import javax.swing.JFrame;

public class JTextFieldEx2 extends JFrame {

	public JTextFieldEx2() {

	
		setTitle("로그인화면");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
	}
	public static void main(String[] args) {
		new JTextFieldEx2();
	}
}
