package Component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class JRadioButtonEx2 extends JFrame {

	//멤버변수 필드, 전역변수
	Container c = getContentPane();
	JRadioButton fruits [] = new JRadioButton[3];
	String [] name = {"사과","배", "체리"};
	ImageIcon [] img = {new ImageIcon(".\\img\\apple.jpg"),
						new ImageIcon(".\\img\\pear.jpg"),
						new ImageIcon(".\\img\\cherry.jpg")};
	JLabel la = new JLabel();
	//생성자
	public JRadioButtonEx2() {

		setTitle("체크박스");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p = new JPanel();
		p.setBackground(Color.GRAY);
		
		ButtonGroup b = new ButtonGroup();
		
		for(int i =0; i<fruits.length; i++) {
			fruits[i] = new JRadioButton(name[i]);
			b.add(fruits[i]);
			p.add(fruits[i]);
			fruits[i].addItemListener(new MyRadioButton());
		}
		fruits[0].setSelected(true);		//선택설정은 반드시 JRadioButtonq 버튼이 만들어 진다음 설정해야함
		
		//이미지를 붙일 라벨생성
		la.setBackground(Color.MAGENTA);
		la.setHorizontalAlignment(SwingConstants.CENTER);
		la.setVerticalAlignment(SwingConstants.CENTER);
	
		//화면구성
		c.add(p,BorderLayout.NORTH);
		c.add(la,BorderLayout.CENTER);
		
		
		setSize(600,600);
		setVisible(true);
		
	}
	class MyRadioButton implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			
			if(e.getItem()==fruits[0]) {
				la.setIcon(img[0]);
			}else if (fruits[1].isSelected()) {
				la.setIcon(img[1]);
			}else {
				la.setIcon(img[2]);
			}
		}
		
	}
	public static void main(String[] args) {
		new JRadioButtonEx2();
	}
}
