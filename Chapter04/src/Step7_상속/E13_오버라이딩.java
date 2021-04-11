/*
		오버라이딩 학습 
			- 재정의
			- 오버라이딩 조건
				1) 슈퍼클래스의 메소드와 완전히 동일한 메소드를 재정의 한다. 
				2) 메소드 오버라이딩 시에 슈퍼 클래스 메소드의 접근 지정자보다 접근의 범위가 좁아질 수 없다. (에러)
				3) 메소드 오버라이딩 시에 메소드 이름, 매개변수 리스트, 리턴타입까지 모두 같아야한다.
				
				
			오버로딩							오버라이딩
		-----------------------------------------------------------------
		. 정적바인딩							. 동적바인딩
		. 컴파일시 중복메소드중						. 실행시간에 오버라이딩 된
			호출되는 메소드 결정						메소드를 찾아 호출
		
		이름이 같은 여러개의 						슈퍼크래스에서 규현된 메소드를 무시하고
		매소드를 중복정의하여						서브클래스에서 새로운 기능의 메소드를
		사용의 편리성 향상하기 위함					재정의 하고자 할 경우
*
*/
package Step7_상속;

class Shape{
	public void draw() {
		System.out.println("shape");
	}
}
//****************************************************


class Line extends Shape{
	public void draw() {
		System.out.println("선을 그립니다.");
	}
}
class Rect extends Shape {
	public void draw() {
		System.out.println("사각형을 그립니다.");
	}
}
class Circle extends Shape {
	public void draw() {
		System.out.println("원을 그립니다.");
	}
}

public class E13_오버라이딩 {

		public static void main(String[] args) {
		
			Line line = new Line();
			line.draw();
			
			
			//동적바인딩 - 오버라이딩 - 상속, 업캐스팅
			Shape shape = new Line();		
			shape.draw();
			
			shape = new Rect();
			shape.draw();
			
			shape = new Circle();
			shape.draw();
		}
		
}
