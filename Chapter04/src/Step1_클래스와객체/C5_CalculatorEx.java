package Step1_클래스와객체;

import java.util.Scanner;

public class C5_CalculatorEx {
	public static void main(String[] args) {
		
		// 1. 계산기 객체생성
		C5_Calculator cc = new C5_Calculator();
		
		
		// 2. Scanner로 x와 y값을 입력받는다.
		System.out.println("정수 두개 작성");
		Scanner sc = new Scanner(System.in);
		
		
		int x =sc.nextInt();
		int y =sc.nextInt();
		
		cc.add(x, y);
		cc.sub(x, y);
		cc.mul(x, y);
		cc.did(x, y);
		
		
		// 3. 257 + 300 더하기 계산을 한다. - Calculator 클래스 속의 	add()호출활용
		//				빼기 계산 		 - 					  	sub()호출활용 
		//				곱하기 계산		 - 						mul()호출활용
		//				나누기 계산								did()호출활용
	
		
		sc.close();
	}

}
