package Component;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JComponent2 extends JFrame{

	JButton b1, b2, b3, b4;
	
	public JComponent2() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		b1 = new JButton("위치와 크기정보");
		b2 = new JButton("모양 정보");
		b3 = new JButton("작동하지 않는 버튼");
		b4 = new JButton("숨기기 보이기");
		
		
		b1.addActionListener(new MyButton());
		b2.addActionListener(new MyButton());
		b3.addActionListener(new MyButton());
		b4.addActionListener(new MyButton());
		
		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(b4);
		
		setSize(205,200);
		setVisible(true);
		
	
		
	}	
	class MyButton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			Object source = e.getSource();
			
			if(source ==b1) {
				System.out.println("b1버튼의 위치와 크기");
				System.out.println("위치 : "+b1.getX()+","+b2.getY());
				System.out.println("크기 : "+b1.getHeight()+","+b1.getWidth());
			
				System.out.println("부모컨텐트펜의 위치와 크기");
				JPanel c = (JPanel)b1.getParent();
				
				System.out.println();
			}else if (source == b2) {
				System.out.println("폰트: "+b2.getFont());
				System.out.println("배경색: "+b2.getBackground());
				System.out.println("글자색: "+b2.getForeground());
				
				
				
			}
		}
		
	}
	public static void main(String[] args) {

		new JComponent2();
}
}
