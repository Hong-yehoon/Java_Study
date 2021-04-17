/*

		- 생성자 
			. JLable(String text, Icon image, etc
		- 정렬(hAlignement)
			. SwingContants.Left/Right/Center
		
		- JLable에 담을 수 있는 이미지는 png, gif, jpg 세가지이다.			

*/

package Component;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class JLableEx extends JFrame{

	Container c ;
	JLabel imagelabel;
	JLabel la;
	public JLableEx() {

		setTitle("레이블 학습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel textLabel = new JLabel("자바기반 안드로이드 개발과정");
		textLabel.setFont(new Font("굴림체",Font.BOLD,16));
		
		//이미지 레이블
		ImageIcon heart = new ImageIcon(".\\img\\heart.jpg");
		imagelabel = new JLabel(heart);		//사이즈는 그림에 맞춘다.
		
		//문자열 +이미지 레이블
		ImageIcon call = new ImageIcon(".\\img\\call.gif");
		JLabel label = new JLabel("궁금한게 있으면 전화주세요",call,SwingConstants.CENTER);
		
		label.addMouseListener(new MyMouse());
		
		//숨겨진 이미지 레이블 생성
		la = new JLabel(new ImageIcon(".\\img\\tiger1.png"));
		la.setVisible(false);		//처음에 보이지 않게
		
		c.add(textLabel);
		c.add(imagelabel);
		c.add(la);
		c.add(label);
		
		setSize(800,800);
		setVisible(true);
	}
	
	class MyMouse extends MouseAdapter{
		
		@Override
		public void mouseClicked(MouseEvent e) {

			if(imagelabel.isVisible()) {
				imagelabel.setVisible(false);
				la.setVisible(true);
			}
			else {
				imagelabel.setVisible(true);
				la.setVisible(false);
			}
		}
	}
	public static void main(String[] args) {
		new JLableEx();
	}
}
