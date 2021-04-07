package C4_pakage;

import java.util.Scanner;

public class D6_Boolean {
	public static void main(String[] args) {
		
		boolean a = true;
		System.out.println("boolean변수 a 값은"+a);
		
		boolean b = 10>20;
		System.out.println(b);
		
		boolean c = a;
		System.out.println(c);
		
		System.out.println("엑셀의 조건값을 입력해주세여");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		
		
		//예제
		boolean stop = i<j;
		if(stop) {
			 System.out.println("자동차를 멈춥니다.");
		} else {
			System.out.println("계속 진행합니다.");
			
		
		}
		sc.close();	
	}
}
