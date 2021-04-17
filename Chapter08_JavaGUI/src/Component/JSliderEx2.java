package Component;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSliderEx2 extends JFrame{

	Container c;
	JSlider []  colorSlider = new JSlider[3];
	JLabel colorLabel; //색상 출력하는 라벨
	
	
	public JSliderEx2() {
		
		setTitle("RGB");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c = getContentPane();
		c.setLayout(new FlowLayout());		//라벨 사이즈 지정해도 원하는대로 안나옴 속의 컨텐츠에 따라 크기가 맞춰짐
		
		for(int i=0; i<colorSlider.length; i++) {
			colorSlider[i] = new JSlider(0,255,100);
			colorSlider[i].setPaintTicks(true);
			colorSlider[i].setPaintTrack(true);
			colorSlider[i].setMinorTickSpacing(10);
			colorSlider[i].setMajorTickSpacing(50);
			colorSlider[i].setPaintLabels(true);

			
			colorSlider[i].addChangeListener(new ChangeListener() {
				
				public void stateChanged(ChangeEvent e) {
					
					int r = colorSlider[0].getValue();
					int g = colorSlider[1].getValue();
					int b = colorSlider[2].getValue();
				
					colorLabel.setBackground(new Color(r,g,b));
					colorLabel.setText("R "+r+" G "+g+" B "+b);	
					colorLabel.setFont(new Font("Arial",Font.BOLD,20));
				}
			});
			c.add(colorSlider[i]);
		}
		
		colorSlider[0].setForeground(Color.red);
		colorSlider[1].setForeground(Color.green);
		colorSlider[2].setForeground(Color.blue);
		
		colorLabel = new JLabel(new ImageIcon(".\\img\\naver.png"),SwingConstants.CENTER);
		colorLabel.setOpaque(true);
		c.add(colorLabel);
		
		setSize(500,500);
		setVisible(true);
				
	}

	public static void main(String[] args) {
		new JSliderEx2();
	
	}
}

