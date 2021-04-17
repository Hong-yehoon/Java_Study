/*
	겜블링 게임 개발
		. 세개의 숫자가 같으면 "축하합니다.", 다르면 "아쉽군요"
		. 레이블 3개를 붙여놓고 컨텐트팬을 클릯하면 1~9까지 숫자중 임의의 숫자가 각 레이블에 설정된다.  
		. keyEvent의 Pressed를 활용하세요.
						7	7	7
							
							
						시작합니다.
*/
package Listener;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.StyledEditorKit.BoldAction;

public class 겜블링게임 extends JFrame{
	JPanel c = new JPanel();
	JLabel la1, la2, la3, la4;
	
	public 겜블링게임() {
		
		setTitle("Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(c);
		
		
		la1 = new JLabel("7");

		la1.setFont(new Font("Arial",Font.BOLD,15));
		la1.setBackground(Color.LIGHT_GRAY);
		
		la2 = new JLabel("7");
		
		la2.setFont(new Font("Arial",Font.BOLD,15));
		la2.setBackground(Color.LIGHT_GRAY);
		
		la3 = new JLabel("7");
		
		la3.setFont(new Font("Arial",Font.BOLD,15));
		la3.setBackground(Color.LIGHT_GRAY);
		
		la4 = new JLabel("엔터키를 누르세요");
		
		
		c.add(la1);
		c.add(la2);
		c.add(la3);
		c.add(la4);
		
		setSize(500,500);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	class ListenerGame extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
	
			int keyCode = e.getKeyCode();
			
			if(keyCode =='\n') {
			int i = (int)(Math.random()*9);
			int j = (int)(Math.random()*9);
			int k = (int)(Math.random()*9);
			
			la1.setText(Integer.toString(i));
			la2.setText(Integer.toString(j));
			la3.setText(Integer.toString(k));
				
			if(i==j && j==k) {
				la4.setText("축하합니다.");
			}else {
				la4.setText("아쉽군요");
			}
			
			}
			
		}
	}
	public static void main(String[] args) {
		
		new 겜블링게임();
	}
}
