/*
 	추상클래스
 		. 매소드중에서 선언부만 있고 구현부가 없는 메소드
 		. abstract 키워드를 사용한다. 
 		. 하나라도 추상메서드가 있으면 그 클래스는 추상클래스가 된다. 
 		. 추상클래스는 모두 구현(implement)되기 전에는 객체를 생성할 수 없다. 
 		. 추상클래스는 상속받는 자식 클래스는 추상클래스가된다. 
 		. 추상클래스는 상속을 하기위한 크래스이지 객체를 생성해서 사용하려는 클래스가 아니다. 
 		. 업캐스팅, 다운캐스팅 모두된다.

	추상클래스 활용
		. 상속관계의 오버라이딩에서 공통된 머세더는 부모에서 구현해 놓지만, 
		. 자식에서 구현함에따라 달라지는 것은 추상클래스로 선언해 놓기만 하고 
			자식에서 구현하자는 것이다. 
*/
package Step8_추상과인터페이스;


abstract class Shape1 {
	int a = 3;
	abstract void draw();
	abstract void computeArea(double a, double b);
	void print() {
		System.out.println("추상클래스");
	}
}
class Circle2 extends Shape1 {

	String name;
	public Circle2() {
		System.out.println();
		// TODO Auto-generated constructor stub
	}
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("원을 그립니다.");
	}

	@Override
	void computeArea(double r1, double r2) {
		// TODO Auto-generated method stub
		System.out.println("원의 넓이: "+(3.14*r1*r1));
	}
	
}
class Rectangle2 extends Shape1 {

	@Override
	void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void computeArea(double a, double b) {
		// TODO Auto-generated method stub
		System.out.println("삼각형 넓이: "+((a*b)/2));
	}
	
}
public class Ab1 {

		public static void main(String[] args) {
			Shape1 s = new Circle2();
			
			//원
			s.draw();
			s.computeArea(5.0, 5.5);
			
			//사각형
			s = new Rectangle2();
			s.draw();
			s.computeArea(5.0, 10.0);
			
			//삼각형
		
		}
}
