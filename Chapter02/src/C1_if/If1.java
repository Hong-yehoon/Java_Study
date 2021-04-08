/*
		if(조건식) {
		실행해야할 문장들;
		}

	----------------------
	if(조건식) {
	실행해야할문장들;
	
	} else {
	실행해야할문자등;
	}
	
	-----------------------
	if(조건식) {
	실행해야할 문장들;
	
	} else if(조건식) {
	
	} else if(조건식) {
	
	} else{
	
	}
	
	--------


*/

package C1_if;

import java.util.Scanner;

public class If1 {

	
	public static void main(String[] args) {
		
		System.out.println("양수인지 음수인지 판단하고 싶은 정수를 입력해주세요>> ");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		//비교처리
		if(a>0) {
			System.out.println("양수입니다.");
		}else {
			System.out.println("음수입니다.");
		}
		
		//입력박은 수가 짝수인지 홀수인지 비교처리 해보세요
		
		if(a % 2 ==0  ) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
			
		
		
		
	}
	
}
