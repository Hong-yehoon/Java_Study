/*
	임의의 숫자 난수를 발생시키고 
	그 값을 몇번 만에 맞췄는지 보는 게임을 구현해 보자.
*/
package C5_Dowhile;

import java.util.Scanner;

public class D3_numericGame {
		public static void main(String[] args) {
			
			System.out.println("컴퓨터가 1~100까지 중 임의의 숫자를 생각하고 있습니다. 몇일까요?");
		
		//컴퓨터가 생각하고 있는 값(랜덤값)
		int answer = (int)(Math.random()*100+1);
		
		//맞추기 위해 숫자를 입력
		Scanner sc = new Scanner(System.in);
		
		int num;  //생각하는 숫자 
		int cnt=0; //카운트
		
		do {
			System.out.println("1~100중에 어떤 수 일까요?");
			num = sc.nextInt();
			
			if(answer == num) {
				System.out.println(cnt+"번 만에 맞추셨습니당.");
				break;				
			}else if(answer>num) {
				System.out.println("더 큰 수를 입력해보세요");
			}else {
				System.out.println("더 작은 수를 입력해 보세요");
			}
			
			cnt++; //cnt = cnt+1;
		}while(true);
		sc.close();
		}
}
