/*

	List<E> 
		- 제네릭클래스
		- 사용자에게 여러개의 아이템을 리스트형식으로 보여주고 아이템을 선택하도록 하는 것
		- 문자와 이미지 모두가능하다.
		- JScrollPane 에 삽입해서 사용
		
		- 주의) 리스트항복을 만들어 생성한 후에 변경하고자 할 경우 변경된 것처럼  보일지라도 
				예측할 수 없는 일이 발생될 수 있으므로 주의
					- setListData() 활용
		
*/
package Component;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class JListEx1 extends JFrame{

	public JListEx1() {
		
		setTitle("리스트학습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		String [] fruits = {"Apple", "Banana", "Mango","Melon","Orange","무화과","참외",
							"Pear","WaterMelon","Mandarin","Blueberry","grape"};
		
		JList<String> list = new JList<>(fruits);
	
		JScrollPane scroll = new JScrollPane(list);
		
		c.add(scroll);
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JListEx1();
	}
}
