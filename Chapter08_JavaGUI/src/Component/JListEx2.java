package Component;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class JListEx2 extends JFrame {
	
	
	public JListEx2() {
		setTitle("이미지 리스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		String [] fruits = {"Apple", "Banana", "Mango","Melon","Orange","무화과","참외",
				"Pear","WaterMelon","Mandarin","Blueberry","grape","kiwi"};
		
		ImageIcon [] img = {new ImageIcon(".\\img\\apple.jpg"),
							new ImageIcon(".\\img\\pear.jpg"),
							new ImageIcon(".\\img\\cherry.jpg"),
							new ImageIcon(".\\img\\banana.jpg"),
							new ImageIcon(".\\img\\kiwii.jpg")};
		
		
		JList<ImageIcon> imglist = new JList<>(img);		//뒤에 생략해두 갱차나 
		//imglist.setListData(img);
		
		JScrollPane scroll = new JScrollPane(imglist);
		
		c.add(scroll);
		JList<String> flist = new JList<String>(fruits);
		JScrollPane fuscroll = new JScrollPane(flist);
		
		c.add(fuscroll);
		
		setSize(500,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JListEx2();
	}
}
