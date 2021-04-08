/*
		정수가 아닌 문자열을 정수로 변환할 때
		실수가 아닌 문자열을 실수로 변환할 때

		. 정수문자 -----> 정수 : Integer.parseInt("정수문자")
		. 실수문자 -----> 실수 : Float.parsenInt("숫자문자")
		.					Double.parseInt("실수문자")
		
		. 정수숫자 -----> 문자 : Integer.toString(정수숫자)
		. 실수숫자 -----> 문자 : Float.toString(실수숫자)
		
*/
package C2_Exception;

public class E3_NumberFormatException {

		public static void main(String[] args) {
			
			//문자열을 저장하는 배열 strNum이라는 배열을 생성
			
			String [] strNum = {"23","12","998","3.141592"};
			
			
			try { 
				for(int i=0; i<strNum.length; i++) {
									//배열방에 있는 문자를 정수타입으로 변환해서 j방에 저장
				int j = Integer.parseInt(strNum[i]);
				System.out.println("숫자로 변환된 값은"+j);
				}
			
			} catch(NumberFormatException e) {
				System.out.println("오류");
			}
			
		}
	
}
