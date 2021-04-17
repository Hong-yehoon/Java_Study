package GUI_Swing;

import javax.swing.JFrame;

public class Frame2_만들어보기 {

	public static void main(String[] args) {
		
		//(50,100)에 위치하고 크기가 넓이800, 높이 500인 창을 만드세용
		
		JFrame f = new JFrame();
			
			f.setTitle("두번째");
			f.setSize(800, 500);
			f.setLocation(50, 100);
		
			f.setVisible(true);
		
	}
}
