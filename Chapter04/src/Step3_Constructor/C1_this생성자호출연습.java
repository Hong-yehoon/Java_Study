/*
		this의 활용법
			1. 다른 메소드 호출할 때 객체자신의 레퍼런스를 전달하는 경우
			2. 메소드가 객체 자신의 레퍼런스를 반환할 경우
			3. 객체의 멤버변수와 메소드속의 변수이름이 같은 경우


*/
package Step3_Constructor;

//도면
class Book1 {
	String title;
	String author;
	
	void show() {
		System.out.println("메소드 : "+title+","+author);
	}
	//생성자
	Book1(){
		this(" ");										//this() - 내자신의 생성자 호출
		System.out.println("생성자를 호출하였습니다");
	}
	Book1(String title){
		this(title,"작자미상");							//this()
		
	}
	Book1(String title, String author){					//this - 내 자신의 변수
		this.title = title;
		this.author = author;
	}
}

public class C1_this생성자호출연습 {

	public static void main(String[] args) {
		
		/*Book b1 = new Book();
		Book b2 = new Book("작자미상");
		Book b3 = new Book("황서넌", "바부");*/
		
		Book1 LittlePrince = new Book1("어린왕자","생떼쥐페리");
		System.out.println(LittlePrince.title+","+LittlePrince.author);
		
		Book1 LoveStory = new Book1("춘향전");
		System.out.println(LoveStory.title+","+LoveStory.author);
	
		Book1 emptyBook = new Book1();
		System.out.println(emptyBook.title+","+emptyBook.author);
	}
	
}
