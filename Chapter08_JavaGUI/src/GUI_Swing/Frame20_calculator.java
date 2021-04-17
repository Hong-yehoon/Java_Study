package GUI_Swing;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Cal extends JPanel{
	
	public Cal() {
	
		setLayout(new GridLayout(1,1));
		
		JLabel la = new JLabel("수식입력",JLabel.CENTER);
		
		add(la);
		add(new JTextField(20));
		
		
	}
	
	
}
class Res extends JPanel{
	public Res() {

		setLayout(new GridLayout(1,1));
		
		JLabel la = new JLabel("결과",JLabel.LEFT);
		
		add(la);
		add(new JTextField(20));
		
	}
}

class MainCal extends JPanel{
	
	public MainCal() {
	
		setLayout(new GridLayout(4,4));
		
		
		
	}
}
public class Frame20_calculator extends JFrame {

	public Frame20_calculator() {
	
		setTitle("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(450,600);
		setVisible(true);
	}
	
	public static void main(String[] args) {

		new Frame20_calculator();
	}
}
