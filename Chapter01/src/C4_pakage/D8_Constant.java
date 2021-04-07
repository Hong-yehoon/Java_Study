/*
		상수(변하지 않는 값)
			. 반복적으로 사용하고 변하지 않아야 하는 값을 상수로 선언해 둔다.
			. 예) 3.14
			. 선언방법
				final 대문자 변수 = 값;
*/

package C4_pakage;

import java.util.Scanner;

public class D8_Constant {
	public static void main(String[] args) {
	
		int age = 0;
		float a =(float) 0.3;
		double d = (float)age+a;
		final double PI = 3.14;
			
		Scanner sc = new Scanner(System.in);
			System.out.println("반지름을 입력해주세요");
	
		double radius = sc.nextDouble();			//반지름
		double circleArea = 0;		//원의 면적	
		double circlelength = 0;	//원의 둘레의 길이

	circleArea = radius* radius * radius *PI;
	circlelength = (2*radius)*PI;
	
	System.out.println("원의 면적:" + circleArea);
	System.out.println("원둘레의 길이:" + circlelength);
	
	
	
	//스캐너 활용

	
	sc.close();
	
	
	}
}
