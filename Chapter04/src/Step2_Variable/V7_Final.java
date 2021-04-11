/*
	final 변수
		- final은 중간에 변경이 불가하고 변수면을 대문자로만 만들기를 권장한다.
		- 기능
			. 객체 생성 후 실행 중에 값은 변경할 수 없는 것을 선언할 때 사용 (급여, 단가, 파이=3.14등)
			. final 선언 클래슨느 상속될 수 없다.
			. final 선언된 메소드는 오버라이딩 시킬 수 없다.
*/
package Step2_Variable;

class Final {
	int a =7;
	final int ABC = 10; 	//변수를 대문자들로 구성
	
}

public class V7_Final {
	public static void main(String[] args) {
		
		//객체생성
		Final f1 = new Final();
		
		//a값과 ABC값을 변경시켜 보시고
		f1.a=11;
		//f1.ABC=13;
		
		
		//출력
		System.out.println("a="+f1.a);
		
	}
}
