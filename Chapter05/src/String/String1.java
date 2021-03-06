/*
	String 클래스
		. 자바는 문자열을 사용할 수 있도록 String 클래스를 제공한다. 
		. String 은 특별히 2가지 방식을 제공한다. 
			- 하나: 이미 생성된 문자열 상수툴을 활용하는 방식
					String str = "자바학습";
			- 둘 	 : String 클래스를 활용하여 객체를 생성해서 사용하는 방법
					String str = new String("자바학습");

	- 주요생성자
		. String ();
		. String (char [] value);		char 배열에 있는 문자열들을 스트링 객체로 생성
		. String (String original);		매개변수로 주어진 문자열과 동일한 스트링 객체 셍성
		. String (StringBuffer buffer);	매개변수로 주어진 스트링버퍼의 문자열 객체 생성

*	- 주요 메소드
*		. char charAt(int index) 	: 해당 인덱스의 문자값 리턴
*		. int compareTo(String anotherString) : 두 스트링을 사전순으로 비교해서 같으면 0, 먼저나오면 음수
		. String concat(String str) : 현재 스트링에 str 덧붙인 새로운 스트링
		. int length() : 스트링의 길이 리턴
		. String replace(charsequence target, Charsequence replacement);
		. String toLoxerCase() : 소문자로 변환
		. Stirng toUpCAse() : 대문자로 변환
		. String trim() : 스트링 앞뒤의 공백문자를 한개만 남기고 다 제거
		. boolean contains(charSequence s ) : s 에 지정한 문자들을 포함하고 있으면 true 리턴
		
		- String 은 고정 ---> 변경할 수 없다. ---> 그래서 StringBuffer 클래스를 따로 제공하고 있다. 
		
*/

package String;


public class String1 {

		public static void main(String[] args) {
			
			char [] a = {'C','o','m','P','u','t','e','R'};
			
			String s1 = new String(a);
			String s2 = new String(a,3,2); 	//a 배열에 인텍스 3부터 2글자
			String s3 = new String("자바가 제일 재밌어");
			
			String s4 = "처음 시작하는 자바"; 		//상수풀에 저장활용 방식
			
			System.out.println("문자열 s1:" +s1);
			System.out.println("s1 문자열의 길이"+s1.length());
			System.out.println("문자열 s2:" +s2);
			System.out.println("문자열 s3:" +s3);
			System.out.println("문자열 s4:" +s4);
			
			
		}
}
