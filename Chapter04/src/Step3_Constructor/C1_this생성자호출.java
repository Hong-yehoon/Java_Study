/*
		this의 활용법
			1. 다른 메소드 호출할 때 객체자신의 레퍼런스를 전달하는 경우
			2. 메소드가 객체 자신의 레퍼런스를 반환할 경우
			3. 객체의 멤버변수와 메소드속의 변수이름이 같은 경우


*/
package Step3_Constructor;

//도면
class Book {
	String title;
	String author;
	
	void show() {
		System.out.println("메소드 : "+title+", 저자 : "+author);
	}
	//생성자
	Book(){
		System.out.println("기본생성자");
	}
	Book(String title){
		System.out.println("제목 : "+title);
	}
	Book(String title, String author){
		System.out.println("제목 : "+title+", 저자:"+author);
	}
}

public class C1_this생성자호출 {

	public static void main(String[] args) {
		
		Book b1 = new Book();
		Book b2 = new Book("작자미상");
		Book b3 = new Book("황서넌", "바부");
	}
}
