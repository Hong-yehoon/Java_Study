package C1_if;

import java.util.Scanner;

public class If4_Season {
		public static void main(String[] args) {
	//1. 스캐너로 월을 받는다.
	System.out.println("월 입력>>");
	
	Scanner sc = new Scanner(System.in);
	
	int num = sc.nextInt();
	
	
		
			
	//2. 조건문에서 3~6월은 봄, 7~9월 여름, 10~11월 가을, 12월~2월 겨울 
	
	if(num>=3 && num <=6){
		System.out.println("봄");
	} else if((num>=7) && num <=9) {
		System.out.println("여름");
	} else if((num>=10) && (num <=11)) {
		System.out.println("가을");
	} else if((num==12) || (num ==2) ||(num == 1)){
		System.out.println("겨울");
	} else {
		System.out.println("다시 입력하세욤");
	}
	sc.close();
}
}
