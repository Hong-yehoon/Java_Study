/*
	1. 전역 변수(멤버 변수)	: 메소드 밖에 있는 변수
	2. 지역 변수			: 메소드 안에서 선언된 변수
	------------------------------------------------
	1. 인스턴스 변수 (객체 변수) : static이 안붙어져 있는 변수
	2. 클래스 변수			 : static이 붙어 있는 변수 (* static:??)


*/
package Step2_Variable;

public class V2_변수의종류 {

	
		int a;				//인스턴스 변수  - 객체
		String b;			//인스턴스 변수
		
		static int k;		//클래스 변수
		
		
		//생성자
		//메소드
		
		void aa() {
			int j=3;  //지역변수
			System.out.println("a값은"+a+", b값은"+b+", k값은"+k+", j값은"+j);
			
		}
		
		
		void bb() {
			
			//System.out.println("j값은"+j+"입니다.");   //j는 aa 메소드 안의 지역변수이기 때문에 호출할 수 없다.
			
		}

}

