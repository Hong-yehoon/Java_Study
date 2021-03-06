/*
예외란? ㅍ로그램 실행중에 런타임 오류의 발생을 응용프로그램에게 알리는 행위이다.
		
		*컴파일 오류: 코드작성 중 실수로 발생하는 오류로, 실행중 프로그램이 의도하지 않은 동작을 한다.
		*실행오류	: 프로그램이 실행되고 있는 동안의 동작중에
		*		1) 시스템 오류 : 동적 메모리가 없는 경우나 스택메모리의 오버플로우등 >>>> 제어 불가능
		*		2) 예외(Exception): 사용자 프로그램에서 try~catch 블럭을 이용하여 제어할 수 있다.
		*
		*프로그램 실행 중 예외가 발생할 때, 프로그램에서 예외처리를 따로 하지 않으면 프로그램은 강제종료된다.

	자바에서 제공하는 오류에 대한 클래스 구조
					
			 			Throwable
			 				|
		  --------------------------------------
		  |										|
		 Error								Exception
		  |										|
	시스템에서 발생하는 오류					 	-------------------
										|				  |
									입출력 예외처리			실행오류예외처리
								  (IOException)		(RuntimeException)
								  		|				  |
						------------------			    --------------------
						|				 |				|					|
				.FileNotFoundException	 | 			.ArithmeticException	|
								.scoketException					.IndexOutOfBoundExecption
								
		자주 사용되는 예외 클래스
			
			. 예외가 발생하는 경우									. 예외타입(예외클래스)
	--------------------------------------------------------------------------------
	1. 정수를 0으로 나누었을 경우 								ArithmeticException
	2. null레퍼런스를 참조할 때 								NullPointerException
	3. 변환할 수 없ㄴ는 타입으로 객체를 변환할 때						ClassCastException
	4. 메모리가 부족한 경우										OutOfMemoryException
	5. 배열의 크기보다 큰 인덱스로 접근할 때 							ArrayIndexOutOfBoundException
	6. 잘못된 인자 전달 할 때 									IlleagalArbrumentException
	7. 입출력 동작 실패 또는 인터럽트시 								IOException
	8. 문자열이 나탄내는 숫자와 일치하지 않는 타입의 숫자로 변활 할 때           		NumberformatException
	9. Scanner클래스의 enxtInt()를 호출하여 정수로 입력 받고자 하였으나 	InputMismatchException
		'a' 등과 같이 문자가 입력되었을 때  			
		
	예외처리 문법
		try{
			예외가 발생할 가능성이 있는 실행문;
			
		}catch(  ){
			예외가 발생했을 떄 해야할 상황문;
		}catch(  ){
		
		}finally{
			예외가 발생되는 위에 try~catch를 싱핼하고 난 다음에 실행문;(생략가능)	
		}
			
							
*/
package C2_Exception;

import java.util.Scanner;

public class E1_ArithmeticException {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int divisor; 			//분모
		int dividend;			//분자
		
		System.out.println("분모를 입력해주세여>>");
		dividend = sc.nextInt();
		
		System.out.println("분자를 입력해주세요>>");
		divisor = sc.nextInt();
		
		try {
			System.out.println(dividend+"/"+divisor+"="+(dividend/divisor));
		}catch(ArithmeticException e) {
			System.out.println("혹시 0으로 나눠썽?");
		}
		
		
	}
	
}
