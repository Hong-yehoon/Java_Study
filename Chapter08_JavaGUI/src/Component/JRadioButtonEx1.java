/*
	JRadioButton
		; 기본적으로 JCheckBox와 생성자, 메소드, 이벤트 처리가 동일하다. 
		. 차이점 
			- checkbox는 독립적으로 일어나 선택/해제 가능
			- radiobutton은 여러개가 버튼 그룹으로 묶여 생성되어 하나만 선택 가능행
		
		. 생성방법
			1) ButtonGroup 객체 생성
			2) JRadioButton 들을 생성
			3) ButtonGroup 속에 JRadioButton 을 등록
			4) 컨탠트펜에 부착
			
		. 재선택되는 것은 Item 이벤트가 발생되지 않는다. 
			


*/

package Component;

import java.awt.Container;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class JRadioButtonEx1 extends JFrame {

	JLabel la;
	public JRadioButtonEx1() {

		setTitle("라디오");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel p = new JPanel();
		
		setContentPane(p);
		
		ImageIcon img = new ImageIcon(".\\img\\cherry.jpg");
		ImageIcon selectedimg = new ImageIcon(".\\img\\chcherry.jpg");
		
		//버튼그룹
		ButtonGroup br = new ButtonGroup();
		
		//라디오 버튼들 생성
		JRadioButton apple = new JRadioButton("사과");
		JRadioButton pear = new JRadioButton("배");
		JRadioButton cherry = new JRadioButton("체리",img);
		
		cherry.setSelectedIcon(selectedimg);
		cherry.setBorderPainted(true);
		
		//등록
		br.add(apple);
		br.add(pear);
		br.add(cherry);
		
		//각각 다해조야대
		p.add(apple);
		p.add(pear);
		p.add(cherry);
		
		setSize(500,500);
		setVisible(true);
		
		
		
	}
	public static void main(String[] args) {
		new JRadioButtonEx1();
	}
}
