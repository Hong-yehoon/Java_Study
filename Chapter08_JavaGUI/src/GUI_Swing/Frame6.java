package GUI_Swing;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame6 extends JFrame {
	
	//JFrame을 상속받아서 컨텐트 ㅐㄴ을 생성하고 버튼하나를 추가해보세여
	public Frame6() {
		setTitle("여섯");
		Container contentPene = getContentPane();
		
		JButton btn = new JButton("시작");
		contentPene.add(btn);
		setSize(800, 600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new Frame6();
		
		
		
	}
}
