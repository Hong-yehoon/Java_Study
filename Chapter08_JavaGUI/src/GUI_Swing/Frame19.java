package GUI_Swing;

import java.awt.*;

import javax.swing.*;

/*class NPanel extends JPanel{
	
	public NPanel() {
		setLayout(new FlowLayout(FlowLayout.CENTER));	//배치위치를 중앙으로부터 설정
		setBackground(Color.GRAY);
		
		add(new JButton("Open"));
		add(new JButton("Read"));
		add(new JButton("Close"));
		
	}
}*/
class CPanel extends JPanel{
	
	public CPanel() {

		setLayout(null);		//내가 직접 하겟당
		setBackground(new Color(0x00FFEBFE));
		
		JLabel la1 = new JLabel("Hello");
			setOpaque(true);
			la1.setSize(60,50);
			la1.setLocation(100,30);
			add(la1);
			
		JLabel la2 = new JLabel("추석 명절 잘 쉬셨나요?");
			setOpaque(true);
			la2.setSize(150,50);
			la2.setLocation(50,300);
			add(la2);
			
		JLabel la3 = new JLabel("다시 열공");
			setOpaque(true);
			la3.setSize(150,50);
			la3.setLocation(15,250);
			add(la3);
	}
	
	
	
	
	
}


public class Frame19 extends JFrame {

	//멤버변수 (필드),전역 변수 
	
	
	public Frame19() {
		
		setTitle("배치관리 혼합응용");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout(5,5));
		
		
		NPanel np = new NPanel();
		c.add(np,BorderLayout.NORTH);
		
		
		CPanel cp = new CPanel();
		c.add(cp,BorderLayout.CENTER);
		
		
		setSize(500,500);
		setVisible(true);

	}
	//내부 클래스로 작성 - 메소드 위치로 클래스를 작성할 수 있다. 
	class NPanel extends JPanel{
		
		public NPanel() {
			setLayout(new FlowLayout(FlowLayout.CENTER));	//배치위치를 중앙으로부터 설정
			setBackground(Color.GRAY);
			
			add(new JButton("Open"));
			add(new JButton("Read"));
			add(new JButton("Close"));
			
		}
	}
	public static void main(String[] args) {
		
		new Frame19();
		
	}
}
