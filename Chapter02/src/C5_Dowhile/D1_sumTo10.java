/*
	Do While 문 
		. 먼저 실행하고 뒤에서 비교해서 조건에 맞으면 또 실행
		. 문법
					
*/

package C5_Dowhile;

public class D1_sumTo10 {
		public static void main(String[] args) {
			
			int sum = 0;
			int i = 1;
			
			do {
				sum = sum + i;
				System.out.println(i+"까지의 합은"+sum+"입니다.");
				i++;
			}while(i<10);
			System.out.println("10까지 합계"+sum);
		}
}
