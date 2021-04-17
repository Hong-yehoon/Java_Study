package Component;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JTextFieldEx1 extends JFrame {

	public JTextFieldEx1() {

		setTitle("텍스트필드");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel name = new JLabel("이름: ");
		name.setOpaque(true);
		name.setBackground(Color.cyan);
		
		JTextField nameText = new JTextField("이름을 입력해주세요",10);
		
		JLabel hakgua = new JLabel("학과: ");
		hakgua.setOpaque(true);
		hakgua.setBackground(Color.pink);
		
		JTextField hgText = new JTextField("학과를 입력해주세요",20);
		
		JLabel address = new JLabel("주소: ");
		address.setOpaque(true);
		address.setBackground(Color.GREEN);
		
		JTextField adText = new JTextField("주소를 입력해주세요",40);
		
		c.add(name);
		c.add(nameText);
		c.add(hakgua);
		c.add(hgText);
		c.add(address);
		c.add(adText);
	
		setSize(600,600);
		setVisible(true);
	
	}
	public static void main(String[] args) {
		new JTextFieldEx1();
		
	}
}
