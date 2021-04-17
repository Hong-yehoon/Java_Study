package Ex;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex3 extends JFrame{

	JTextField tf = new JTextField(15);
	JLabel money;
	JButton cal;	
	JCheckBox [] moneyUnit;
	Container c = getContentPane();
	public Ex3() {

		setTitle("Ex3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		c.setLayout(new FlowLayout());
		c.setBackground(new Color(0x00ff9999));
		
		money = new JLabel("금액");
		cal = new JButton("계산");
		
		
		c.add(money);
		c.add(tf);
		c.add(cal);
		
		
		setSize(500,500);
		setVisible(true);
	
		
	}
class CalculationEx3 extends JPanel{
		
		public CalculationEx3() {
			setLayout(new FlowLayout());
			
			
			String [] unit = {"오만원", "만원", "오천원","천원","오백원","백원"};
			moneyUnit = new JCheckBox[6];
			
			for(int i =0; i<moneyUnit.length; i++) {
				moneyUnit[i] = new JCheckBox(unit[i]);
				c.add(moneyUnit[i]);
			}
			
			
		}
		
		
	}
	public static void main(String[] args) {
	
		new Ex3();
	
	}
}


/*JLabel fifty = new JLabel("오만원");
tf = new JTextField(10);
JLabel ten = new JLabel("만원");
tf = new JTextField(10);
JLabel five = new JLabel("오천원");
tf = new JTextField(10);
JLabel tent = new JLabel("천원");
tf = new JTextField(10);
JLabel fiveh = new JLabel("오백원");
tf = new JTextField(10);
JLabel hun = new JLabel("백원");
tf = new JTextField(10);*/