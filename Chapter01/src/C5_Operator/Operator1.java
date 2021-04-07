/*
		사칙연산




*/
package C5_Operator;

import java.nio.charset.MalformedInputException;
import java.util.Scanner;

public class Operator1 {

			public static void main(String[] args) {
				
				
				//스캐너로 n1과 n2값을 설정해보세여ㅛ
				
				System.out.println("숫자 두개 입력");
				
				Scanner sc = new Scanner(System.in);
				
				
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();
				int result ;
					
				
			
				//더하기
				System.out.println("더하기: "+ (n1+n1));
				
				//빼기
				System.out.println("빼기: "+ (n2-n1));
				
				//곱하기
				System.out.println("곱하기: "+(n1*n2));
				
				//나누기
				System.out.println("나누기: "+(n1/(float)n2));
				
				//나누기 %
				System.out.println("나머지 나누기:" + (n1/n2));
			
				sc.close();
				//홀짝 판별
				
			}

}
