/*
	외부에서 입력받은 숫자들의 평균을 구하시오
	단, 0을 입력하면 압력상태를 빠져나오고 평균결과를 출력하시오
	
*/
package C4_While;

import java.util.Scanner;

public class While2_Avg {
		public static void main(String[] args) {
			
			//스캐너로 반복하새 입력받고, 0을 누르면 빠져나오도록 하시오.
			//입력받은 숫자의 갯수와 평균을 구해봅시다.
			
		System.out.println("숫자를 입력하고 싶은대로 입력하고, 중단하려면 0을 입력하시오>>");
		Scanner sc = new Scanner(System.in);
		
		int n=0, i=0;
		double sum=0;
		
		while((i=sc.nextInt())!=0) {
			
			sum = sum+i;
			n=n+1;
		}
		System.out.println("입력된 수의 개수는"+n+"개이며 평균은"+sum/(float)n+"입니다.");
		}
	
	
		
}
