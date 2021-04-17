/*
	이벤트: ActionEvent, ItemEvent 두 종류가 동시에 발생한다. 
			- ActionEvent는 아이템 선택할 때 무조건 한 개 발생..
			- ItemEvent는 새로운 아이템을 선택한 경우에만 발생
	메소드 
		. getSelectedIndex() : 선택한 상태인 아이템의 인덱스 번호
		. getSelectedItem() : 선택상태인 아이템의 객체리턴
		
*/
package Listener;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JComboBoxEx2 extends JFrame{

	Container c = getContentPane();
	String [] f = {"사과", "바나나", "키위", "체리"}; 	//4개
	ImageIcon []  img = {new ImageIcon(".\\img\\apple.jpg"),
						new ImageIcon(".\\img\\banana.jpg"),
						new ImageIcon(".\\img\\kiwii.jpg"),
						new ImageIcon(".\\img\\cherry.jpg")};
		JLabel la;

	public JComboBoxEx2() {
		setTitle("콤보 박스 리스너");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setLayout(new FlowLayout());
		
		JComboBox<String> strCombo = new JComboBox<String>();
		for(int i=0; i<f.length; i++) {
			strCombo.addItem(f[i]);
		}
		//리스너 등록
		strCombo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				JComboBox<String> b = (JComboBox)e.getSource();
				
				int index = b.getSelectedIndex();  //이미지 배열 인덱스 0번에 있ㄴ는거 가져오라규?
				la.setIcon(img[index]);
			}
		});
		//***********************************************
		
		la = new JLabel();
		la.setSize(150,150);
		
		c.add(strCombo);
		c.add(la);
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JComboBoxEx2();
	}
}
