package C3_Print;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String args[]) {
		
		// 1.안내문구
		System.out.println("이름과 나이, 몸무게를 공란으로 구분해서 입력해주세요>> ");
		
		// 2.스캐너
		Scanner sc = new Scanner(System.in);
			
		// 3.입력활용
		String name 	= sc.next();			//next()문자
		int age 		= sc.nextInt();			//nextInt()정수
		double weight	= sc.nextDouble();		//nextDouble() 실수
		
		System.out.println(name+"씨의 나이는"+age+"세 이고");
		System.out.printf("몸무게는 %.1f kg입니다.",weight);
		
		// 4.스캐너 닫는다.
		sc.close();
	}
	
	
}
