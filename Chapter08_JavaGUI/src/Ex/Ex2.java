package Ex;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Ex2 extends JFrame{

	JTextField tf = new JTextField(10);
	Vector<String> name = new Vector<>();
	JList<String> nameList = new JList<>(name);
	
	
	public Ex2() {
		
		setTitle("Ex2_");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel inname = new JLabel("이름을 입력후 <Enter>키를 입력");
		inname.setFont(new Font("고딕체",Font.BOLD,10));
		
		
		c.add(inname);
		
		
		c.add(tf);
		
		name.add("홍예훈");
		
		nameList.setVisibleRowCount(5);
		nameList.setFixedCellHeight(30);
		c.add(new JScrollPane(nameList));
		
		
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JTextField t = (JTextField)e.getSource();
				name.add(t.getText());
				nameList.setListData(name);
				t.setText(" ");
				
		}
		});
		
		setSize(500,500);
		setVisible(true);
	
	}
	

	public static void main(String[] args) {
		new Ex2();
	}
}
