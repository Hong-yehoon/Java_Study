package Step8_추상과인터페이스;

//추상클래스

abstract class Calculator{
	
	int a = 100; 											//일반 변수 선언 문제 엄쓔ㅜㅁ
	abstract void cal(int x, int y);	//추상메소드
	void print() {						//멤버 메소드
		System.out.println("여기는 추상클래스");
	}
}
class Add extends Calculator{
	int b;

	@Override
	void cal(int x, int y) {	
		System.out.println("추상을 상속받아 구현한 클래스");
		System.out.println(x+"+"+y+"="+(x+y));
		// TODO Auto-generated method stub
		}
	
}
class sub extends Calculator{

	@Override
	void cal(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println(x+"-"+y+"="+(x-y));
	}
	
}
public class Ab2_CalculatorEx {

	 public static void main(String[] args) {
		
		 //추상클래스를 상속받아 구현한 다음에 객체를 생성한 후 사용해야한다. 
		 Add c = new Add();
		 System.out.println(c.a);
		 System.out.println(c.b);
		 
		 
		 
		 //Calculator c = new Calculator(); -----> 추상 클래스는 객체를 생성할 수 없다.
		 /*Calculator c = new Calculator() {
			
			@Override
			void cal(int x, int y) {
				// TODO Auto-generated method stub
				
			}
		};*/
	
	 
	 }
	 
	 
}
