/*
		StringTokenizer 클래스
			- 문자열 분리
			- String split()메소드와 동일 가능
			- 구분문자(delimiter)라고 부름.
			- 토큰(token)은 분리된 문자열을 말한다. 
			
			-포함된 메소드
				. countTokens()	: 몇개의 토큰으로 분리되어 있는지 카운트해준다.
				. nextTokens()	: 토큰을 하나씩 읽어내기 위해 다음 토큰을 반환해준다.
				. hasMoreTomken() : 스트링 토크나이저에 포함된 토큰의 개수를 반환해준다.
*/
package StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizer1 {

	public static void main(String[] args) {
		String query = "name=korea&address=seoul&age=21";
		StringTokenizer st = new StringTokenizer(query,"e");
		
		int n = st.countTokens();
		System.out.println("분리된 토큰 갯수 : "+n);
		
		for(int i=0; i<=st.countTokens(); i++) {
			System.out.println(st.nextToken());
		}
			
		
	}
}
