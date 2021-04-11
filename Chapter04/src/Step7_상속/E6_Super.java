/*
		this 	: 내 자신 객체를 가르침
		this() 	: 내 자신의 생성자를 호출함. 반드시 생성자 속에서 사용해야함. 첫출에!
		
		super	: 부모의 객체를 가르침
		super()	: 부모의 생성자를 호출함. 반드시 생성자 속에서 사용해야함. 첫출에!

*/

package Step7_상속;

class A4 {
	int n = 5;
	int k  = 7;
	
	public A4() {
		System.out.println("1. 부모의 기본 생성자");
	}
	
	void display() {
		System.out.println("푸라이데이 나잇");
	}
	void print() {
		System.out.println("나는 부모 메소두");
		
	}
}
class A5 extends A4 {
	int n = 10;
	int k = 100;
	
	public A5() {
		System.out.println("2. 자식의 기본생성자");
		
	}
	void print() {
		super.print();				//부모의 프린트 메소트 호출
		System.out.println("난 자식 메소드의 n="+n);			//내 자신의 n 호출
		System.out.println("난 부모멤버의 a="+super.n);		//부모의 n호출
		
	}
}


public class E6_Super {
	
	public static void main(String[] args) {
	
		A5 a = new A5();
		 
		a.print();					//부모에도 있고 자식에도 있고
		a.display();				//부모에 있는 메소드
	}
}
