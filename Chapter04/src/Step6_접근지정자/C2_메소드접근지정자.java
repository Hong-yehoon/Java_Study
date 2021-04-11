/*
		멤버 접근 지저자
		. private 		: 선언된 클래스 안에서만 접근가능하다.
		. 디폴트(없는거) 	: 같은 패키지 안에서만 접근가능하다.
		. protected		: 같은 패키지에서 모두 접근가능하다 
							+ 상속관계의 자식이라면 다른 패키지에서도 접근가능하다.
		. public		: 다른 패키지 안에서도 접근가능하다. 
		
*/
package Step6_접근지정자;


public class C2_메소드접근지정자 {
	public static void main(String[] args) {
		
		B b = new B();
		b.n =7;					//public 접근 지정자의 n변수 접근가능
		b.g();					//public 접근 지정자의 g메소드 접근가능
	}
}
