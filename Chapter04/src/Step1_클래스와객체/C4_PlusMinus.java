package Step1_클래스와객체;

public class C4_PlusMinus {
	
	//멤버변수
	int plus;
	int minus;
	
	//생성자

	//메소드
	String plus(int x, int y) {
		plus = x+y;
		return "두 수의 합은" +plus; 		//문자+숫자 ==> 문자타입
	}
	//빼기
	String minus(int x, int y) {
		minus = x-y;
		return "두 수의 차는" +minus;
	}
}
