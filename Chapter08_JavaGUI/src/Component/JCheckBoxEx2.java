package Component;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JCheckBoxEx2 extends JFrame {

	JCheckBox [] fruits;
	JLabel sumla;
	int sum= 0;
	public JCheckBoxEx2() {

		setTitle("CheckBox Listener");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.ORANGE);
		
		//안내문구라벨
		JLabel la = new JLabel("사과 1000원, 배 5000원, 체리 1500원 입니다. 골라주새여");
		c.add(la);
		
		//과일 이름 저장 배열
		String name [] = {"사과","배", "체리"};
	
		//체크박스 담아 놓은 배열
		fruits = new JCheckBox[3];
		
		//배열
		for(int i =0; i<fruits.length; i++) {
			fruits[i] = new JCheckBox(name[i]);		//체크박스생성
			fruits[i].addItemListener(new MyCheckBox()); //리스너 생성 **********************
			c.add(fruits[i]);		//컨텐트팬에 붙임
		}
		
		
		//구매합산액 출력라벨 생성
		sumla = new JLabel(" 현재 0원 입니다. ");
		c.add(sumla);
		
		setSize(500,500);
		setVisible(true);
		
	}
	
	class MyCheckBox implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {

			//선택과 해제시 +,- 부호값 설정
			int selected ;
			if(e.getStateChange() == ItemEvent.SELECTED) {
				selected = +1;
			}else {
				selected = -1;
			}
			
			//계산
			if(e.getItem() == fruits[0]) {	//사과가 선택되었다고 하면
				sum = sum+(1000*selected);
			}else if (e.getItem() == fruits[1]) {
				sum = sum+(5000*selected);
			}else {
				sum = sum+(1500*selected);
			}
				
			//결과값 출력
		 sumla.setText("현재 선택한 총 금액은 "+sum+" 입니다");
		}
		
	}
	public static void main(String[] args) {
		new JCheckBoxEx2();
	}
}
	