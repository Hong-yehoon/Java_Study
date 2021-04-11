package Step1_클래스와객체;

//도면 클래스
class 말하기 {
		     // 클래스이름 선언
	
	// 1. 멤버변수 (필드, 전역변수)			---- 명사  / 속성
	String str;
	// 2. 생성자(String a) {}			---- 객체를 생성하고 초기화 시켜주는 역할을 한다.
	//								---- 생성자는 클래스이름과 동일하다.
	말하기(String s){
		str = s;
		System.out.println(str);
	}
	
	
	// 3. 메소드(함수) {}				---- 동사  / 기능
	String 웃기다() {
		System.out.println("말하면서 웃겨");
		return "값";
	}
	
}

//실행클래스
public class C1_동물 {
	
	public static void main(String[] args) {
		
		
		//객체 생성 
		
		말하기 s1 = new 말하기("하하하");
		말하기 s2 = new 말하기("호호호");
		말하기 s3 = new 말하기("하하하");
		
		//객체 접근(활용)
		String s = s1.str;
		System.out.println("필드값 str은 "+s+" 입니다");
		
		s1.웃기다();  //메소드 접근(호출)
		
		
	}
}
