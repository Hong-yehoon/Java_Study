package Step6_접근지정자;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyColorButton extends JFrame {

		//생성자

		public MyColorButton() {
			
			// 1. 기본설정
			setTitle("내가 처음 만들어보는 화면");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			// 2. 화면생성
			Container c = getContentPane();
			
			// 3. 레이아웃 설정 
			c.setLayout(new GridLayout(1,8));
			
			// 4. 컴포넌트 생성
			JButton [] btn = new JButton[8];
			Color [] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
								Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY, Color.pink};
			
			for(int i = 0; i<btn.length; i++) {
				btn[i]= new JButton();
				btn[i].setOpaque(true);
				btn[i].setBackground(color[i]);
				
			// 5. 리스너 생성
			
			// 6. 화면에 컴포넌트 부착
			c.add(btn[i]);
			
			
			}
		// 7. 화면설정
			setSize(500,400);
			setVisible(true);
		
	}
		//실행메소드
		public static void main(String[] args) {
			
			//내 자신의 객체를 생성
			
			new MyColorButton();		//생성자의 모습으로 생성  굳이 피료없기때문에  newMyColorButton(); 으로 표시하기도 한다.
			
	}
}

