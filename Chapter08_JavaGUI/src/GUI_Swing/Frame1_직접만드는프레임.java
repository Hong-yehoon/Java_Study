package GUI_Swing;

import javax.swing.JFrame;

public class Frame1_직접만드는프레임 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		
		f.setTitle("첫번째 프레임");
		f.setSize(600, 600);
		f.setLocation(30, 30);
		
		f.setVisible(false);
	}
}
