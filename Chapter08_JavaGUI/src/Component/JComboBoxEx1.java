
/*
		ComboBox<E>
			. JTextField + JButton + JList 합쳐진 기능
			
			. 주요 메소드 
			 	- addItem() ; 아이템을 리스트와 다르게 직접 ComboBox에 추가할 수 있다. 
			 	- remove() ; 삭제
			 	- removeAT() ; 지정한 해당 인덱스 번호에 해당하는 아이템을 삭제
			 	- removeAll()
			 	- getSelectedIndex();
			 	


*/
package Component;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboBoxEx1 extends JFrame {

	//멤버변수
	Container c = getContentPane();
	String [] fruits = {"사과", "바나나", "망고", "배","체리"};
	
	
	public JComboBoxEx1() {

		setTitle("콤보박스");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c.setLayout(new FlowLayout());
		
		// 방법 1. 생성자 이용
		JComboBox <String> strCombo1 = new JComboBox<>(fruits);
		
		// 방법 2. addItem() 이용
		JComboBox<String> strCombo2	= new JComboBox<>();
		strCombo2.addItem(fruits[0]);
		strCombo2.addItem(fruits[1]);
		strCombo2.addItem(fruits[2]);
		strCombo2.addItem(fruits[3]);
		strCombo2.addItem(fruits[4]);
		
		strCombo1.removeAllItems();
		
		c.add(strCombo1);
		c.add(strCombo2);
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JComboBoxEx1();
	}
}
