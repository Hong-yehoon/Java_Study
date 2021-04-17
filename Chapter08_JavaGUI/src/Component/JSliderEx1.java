/*
	JSlider
		; 슬라이드 바를 출력하여서 마우스로 값을 선택하도록 하는 컴포넌트
		
		. 이벤트 : changeEvent
		. 종  류  : JSlider.HORIZONTAL, 	jslider.VERTICAL
			(Orientation)
		. 구  성  : 
		 		- knob
		 		- MajorTickSpacing
		 		- MinorTickSpacing
		 		- label
		 		- track
		 		- value

  		. 메소드 
  				- setOrientation()
  				- setMinimum() / setMaximum()
  				- setPaintTicks()
  				- setPaintTrack()
  				- setPaintLabels()
  				- setMajorTickSpacing()
  				- setMinorTickSpacing()
  				- setValue()
  				- getValue()
*/
package Component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class JSliderEx1 extends JFrame{

	public JSliderEx1() {
		
		setTitle("슬라이드 컴포넌트 학습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		//1. 슬라이드를 붙일 판델
		Sliderpane sp = new Sliderpane();
		//2. 기본 슬라이드
		JSlider slider1 = new JSlider(0,100,20);		//최소 ,최대, 간격
			slider1.setPaintTrack(true);
			slider1.setBackground(Color.GRAY);
		
			sp.add(slider1);
		//3. 수직 min/max/value 지정 슬라이드
		JSlider slider2 = new JSlider(0,100,50);
			slider2.setOrientation(JSlider.VERTICAL);
			slider2.setPaintTrack(true);
			slider2.setPaintTicks(true);
			slider2.setMinorTickSpacing(5); 
			slider2.setMajorTickSpacing(10);
			slider2.setPaintLabels(true);
		
		//4. 수평
		JSlider slider3 = new JSlider(JSlider.HORIZONTAL,0,100,90);
			slider3.setPaintTicks(true);
			slider3.setPaintTrack(true);
			slider3.setMajorTickSpacing(5);
			slider3.setMinorTickSpacing((int)2.5);
			slider3.setPaintLabels(true);
			
		c.add(slider3,BorderLayout.SOUTH);
			
		
		c.add(sp,BorderLayout.NORTH);
		c.add(slider2,BorderLayout.CENTER);
			
		setSize(500,500);
		setVisible(true);
	}
	class Sliderpane extends JPanel{
		
		public Sliderpane() {
			setBackground(Color.ORANGE);
			
		}
	}
	public static void main(String[] args) {
		new JSliderEx1();
	}
}
