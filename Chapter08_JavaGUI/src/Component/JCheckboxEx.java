/*
		JCheckBox
			; 선택 (selected) , 해제(deselected) 두 상태만 존재한다. 
			; 복수체크가능
			; itemEvent가 주로 발생한다. 
			
		- 생성자
		- 메소드 
			. setSelectedIcon()		: 선택되었을 때 변경될 이미지 등록
			. setBorderPainted() 	: 체크박스에 외곽선이 보이게
			. setSelected() 		: 체크박스에 체크처리
			. isSelected() 			
			. setIcon() 
			

*/
package Component;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class JCheckboxEx extends JFrame {

	public JCheckboxEx() {

		setTitle("체크박스");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JCheckBox apple = new JCheckBox("사과",true);
		JCheckBox pear = new  JCheckBox("배");
		
		JCheckBox kiwii = new JCheckBox("키위");
		
		ImageIcon img = new ImageIcon(".\\img\\cherry.jpg");
		ImageIcon selectedImg = new ImageIcon(".\\img\\chcherry.jpg");
		
		JCheckBox cherry = new JCheckBox("체리",img);
		cherry.setSelectedIcon(selectedImg);
		cherry.setBorderPainted(true);
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		c.add(kiwii);
				
		setSize(800,800);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new JCheckboxEx();
	}
}
