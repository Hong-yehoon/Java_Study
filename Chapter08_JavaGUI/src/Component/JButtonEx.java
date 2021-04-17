/*
	JButton
	
		- 생성자
		- 이미지버튼 
			. setIcon()				; 디폴트 이미지
			. setrolloverIcon()		; 버튼위로 마우스가 올라갈 때 출력되는 이미지
			. setpressedIcon()		; 버튼이 눌러져 있는 동안 출력되는 이미지

		- 버튼/레이블 정렬
			. 수평정렬 : setHorizontalAlignment(SwingConstants.LEFT/RIGHT/CENTER)
			. 수직정렬 : setVerticalAlignment(SwingConstants.TOP?BOTTOM/CENTER)
			
*/
package Component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class JButtonEx extends JFrame{

	public JButtonEx() {

		setTitle("ImageButton");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.setBackground(new Color(0x00D5D5D5));
		
		ImageIcon normal = new ImageIcon(".\\img\\call.gif");
		ImageIcon rollover = new ImageIcon(".\\img\\banana.jpg");
		ImageIcon pressed = new ImageIcon(".\\img\\callb.gif");
		
		JButton btn = new JButton("call");
		btn.setBackground(Color.YELLOW);
		btn.setOpaque(true);
		btn.setSize(500,500);
		
		btn.setIcon(normal);
		btn.setRolloverIcon(rollover);
		btn.setPressedIcon(pressed);
		
		btn.setHorizontalAlignment(SwingConstants.LEFT);
		btn.setVerticalAlignment(SwingConstants.TOP);
		
		JLabel la = new JLabel("어디게");
		la.setHorizontalAlignment(SwingConstants.RIGHT);
		la.setVerticalAlignment(SwingConstants.TOP);
		c.add(la);
		
		//c.add(btn);
		
		setSize(600,600);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new JButtonEx();
	}
}
