package Ex;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.SliderUI;

public class Ex4 extends JFrame{

	JLabel la ;
	Container c = getContentPane();
	JSlider slider;
	public Ex4() {

		setTitle("Ex4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setBackground(Color.lightGray);
		c.setLayout(new BorderLayout());
		
		
		
		
		//1. 슬라이드를 붙일 판델
		Sliderpane sp = new Sliderpane();
		
		//2. 기본 슬라이드
		JSlider slider = new JSlider(0,100,20);		//최소 ,최대, 간격
		slider.setPaintTrack(true);
		slider.setBackground(Color.GRAY);
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(5); 
		slider.setMajorTickSpacing(20);
		slider.setPaintLabels(true);
		
		sp.add(slider);
		
		slider.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				
				int s = slider.getValue();
				la.setFont(new Font("고딕체",Font.BOLD,s));
			}
		});
		
		la = new JLabel("I LOVE JAVA",SwingConstants.CENTER);
		la.setFont(new Font("고딕체",Font.BOLD,50));
		c.add(sp,BorderLayout.NORTH);
		c.add(la,BorderLayout.CENTER);
		
		setSize(500,500);
		setVisible(true);
		
	}
class Sliderpane extends JPanel{
		
		public Sliderpane() {
			setBackground(Color.WHITE);
			
		}
	}
	public static void main(String[] args) {
	
		new Ex4();
		
	}
}
