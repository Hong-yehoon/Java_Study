package String;

public class String2 {
	
	public static void main(String[] args) {
		
		//String객체 생성방법들
		String s1 = "Java Korea";			//단축초기화 문자열이라고 한다. -상수풀이용
		String s2 = new String("Java Korea");
		String s3 = s2.intern();			//intern()
		String s4 ="java Korea";			//단축 초기화 문자열
		String s5 = new String("Java Korea");
		
		// ==(주소,객체)와 equals()(값)로 비교
		if(s1==s2) {
			System.out.println("s1과 s2는 같은 장소입니다...즉, 같은 객체입니다.");
			
		}else {
			System.out.println("s1과 s2는 다른 장소입니다.");
		}
		if(s1.equals(s2)) {
			System.out.println("s1과 s2의 값이 같습니다.");
		}else {
			System.out.println("s1과 s2는 다른값입니다.");
		}
		if(s1==s3) {
			System.out.println("같은 장소?");
		}else {
			System.out.println("다른 장소");
		}
		if(s1.equals(s3)) {
			System.out.println("s1과 s3의 값이 같습니다.");
		}else {
			System.out.println("s1과 s3는 다른값입니다.");
		}
	}
	
}
