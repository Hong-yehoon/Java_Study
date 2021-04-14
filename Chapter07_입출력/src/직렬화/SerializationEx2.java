package 직렬화;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Goods implements Serializable{
	private static final long serialVersionUID = 1L;
	String item;
	int price;
	String shop;
	
	Goods (String item, int price, String shop){
		this.item = item;
		this.price = price;
		this.shop = shop;
	}
	@Override
	public String toString() {
		return "상품명 :" +item+",가격 : "+price;
	}
}
public class SerializationEx2 {

	public static void main(String[] args) {
		
		//제품명과 제품가격, 제조사를 입력해주세요
		//Scanner sc = new Scanner(System.in);
		
		
		//직렬화할 클래스 객체 생성
		Goods cup1 = new Goods("텀블러", 5000, "스타벅스");
		Goods cup2 = new Goods("머그컵", 3500, "이디야");
		
		//직렬화
		
		try {
			FileOutputStream fos = new FileOutputStream(".\\file\\goods.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(cup1);
			oos.writeObject(cup2);
			
		} catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		//역직렬화
		try {
			FileInputStream fis = new FileInputStream(".\\file\\goods.out");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Goods g1 = (Goods)ois.readObject();
			Goods g2 = (Goods)ois.readObject();
			
			System.out.println(g1);
			System.out.println(g2);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			
		}
		
	}
}
