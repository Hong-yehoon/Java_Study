package Step4_ObjArray;

import java.util.Scanner;

class Book{
	String title, author;
	Book(String title, String author){
		this.title = title;
		this.author =author;
	}
	
}
public class Obj2_BookEx {
	public static void main(String[] args) {
		
		//Book클래스의 객체를 담을 배열 2개를 생성
		Book [] b1 = new Book [2];    //  [Book][Book]
	
		
		//for 문을 이용해서 Book 클래스 객체를 저장한다.
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<b1.length; i++) {
			
			//책 제목입력하기
			System.out.println("제목>>");
			String title = sc.next();
			System.out.println("저자>>");
			String author = sc.next();
			
			b1 [i] = new Book(title,author);  //객체를 배열에 저장 
			}
		
		for(int i=0; i<b1.length; i++) {
			
			System.out.println(b1[i].title);
			System.out.println(b1[i].author);
			System.out.println("*******************************");
				
		}
	}
}
