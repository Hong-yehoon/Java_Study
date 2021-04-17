package Ex;


import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Ex1 extends JFrame {

	JCheckBox ch1,ch2;
	JButton btn1;
	public Ex1() {

		setTitle("버튼Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ch1 = new JCheckBox("버튼 비활성화");
		ch2 = new JCheckBox("버튼 사라짐");
		btn1 = new JButton("Test button");
		
		
				
		btn1.addItemListener(new ButtonEx());
		ch1.addItemListener(new ButtonEx());
		ch2.addItemListener(new ButtonEx());
		
		c.add(ch1);
		c.add(ch2);
		
		c.add(btn1);

		setSize(500,500);
		setVisible(true);
	}
	
	class ButtonEx implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {

			if(e.getItem() == ch1) {
				
				btn1.setEnabled(false);
			}else if(e.getItem() == ch2) {
				
				btn1.setVisible(false);
			} else {
				btn1.setEnabled(true);
				btn1.setVisible(true);
			}
				
		}
		
	}
	public static void main(String[] args) {
		new Ex1();
	}
}
