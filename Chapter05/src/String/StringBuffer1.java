/*
		StringBuffer : String클래스 불변문제를 새선 --> 스레드 동시 요청시 안전한 변경 보장, 상대적으로 느림
		
			. 메소드
				append(String str) : str스트링을 스트링 버퍼에 덧붙인다.
				capacity() 		   : 스트링버퍼의 현재 크리를 정수값으로 리턴해준다.
				delete(int start, int end) : start 위치에서 end 위치 앞까지 문자삭제
				insert(int offset, String str) : str을 offset 위치에 삽입시킨다.
				reverse() : 문자열을 반대로 순서변경해준다.
				void setLength(int newLength) : 스트링버터 내 문자열의 길이를 새롭게 재 설정한다. 
*/
package String;

public class StringBuffer1 {
	
	public static void main(String[] args) {
		
		//1. 객체생성 (가져다 쓰려면 객체 생성 해야지)
		StringBuffer sb1 = new StringBuffer("Hellow Java");
		StringBuffer sb2 = new StringBuffer("처음 시작하는 자바");
		
		System.out.println(sb1);
		System.out.println(sb1.length());
		
		//capacity(): 현재 문자 버퍼의 크기변환
		System.out.println("sb1 버퍼를 포함한 길이 :"+sb1.capacity());
		
		
		System.out.println(sb2);
		System.out.println(sb2.length());
		System.out.println("sb2 버퍼를 포함한 길이 :"+sb2.capacity());
	
		//insert()
		System.out.println("문자열 끼워넣기: "+sb2.insert(8, "power"));
		System.out.println("문자열 끼워 넣기: " + sb1.insert(2, 'a'));
		
		//charAt()
		System.out.println("8번째 문자추출: "+sb2.charAt(8));
		
		//setCharAt()
		sb2.setCharAt(5, '잉');
		System.out.println("5번째 값을 \'잉\'로 변경: "+sb2);
	
		//setLength();
		sb2.setLength(5);
		System.out.println("문자열을 5까지만 고정시킨새로운 값"+sb2);
		
		//reverse()
		System.out.println("문자열의 역순으로 출력하기 "+sb2.reverse());
		
		
	}
}
