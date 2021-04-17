// 리스트 항목 추가 변경(주의)

package Component;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class JListEx3 extends JFrame {

	JTextField tf = new JTextField(10);
	Vector<String> v = new Vector<>();
	JList<String> nameList = new JList<>(v);
	
	
	public JListEx3() {

	
		setTitle("리스트 항목 변경");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new Label("이름을 입력후 <Enter>키를 입력"));
		c.add(tf);
		
		v.add(" 홍예훈 ");
		v.add(" 김효진 ");
		v.add(" 박유정 ");
		
		nameList.setVisibleRowCount(5);			//5행까지 보여죵
		nameList.setFixedCellHeight(30);		//리스트 폭
		c.add(new JScrollPane(nameList));
		
		//익명클래수
		tf.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

				JTextField t = (JTextField)e.getSource();
				v.add(t.getText());
				nameList.setListData(v);
			}
		});
		
		
		setSize(300,300);
		setVisible(true);
		}
		
			
	
	public static void main(String[] args) {
		new JListEx3();
	}
}
