/*
	초기화
		- 멤버변수(필드)의 값은 자바에서는 초기화 시키지 않아도 암묵적으로 초기화된다.
		- 예를 들어서 int는 0으로, String null로 초기화 된다. 
		


*/
package Step2_Variable;

public class V1_초기화1 {

	//멤버 변수
		String color ;		//초기값이 없다.
		int speed;			//초기값이 없다.

	//생성자
		public V1_초기화1() {
		}
		
	//메소드(기능을 구현)
		void speedUp(){
		System.out.println("속도를 올렸습니다.");	
		}
		void print() {
			System.out.println("색깔:"+color);
			System.out.println("속도:"+speed);
		}
	//실행메소드  -->이곳부터 해도 된다,.
		// public static void main(String[] args) {
			
		
}

