/*
 		for(시작점; 조건식(끝); 증감식){
 			실행문;
 		}
 	-조건식이 맞는 동안 반복한다.
 	-시작점, 조건식, 증감식은 모두 생략 가능하다.

*/
package C3_for;

public class For1_SumTo10 {
		public static void main(String[] args) {
			
			int sum=0;  //저장공간을 확보하는 것과 같음
			
			for(int i=1; i<=10 ;i++) {
				sum =sum + i;
				//0 = 0 + 1
				//1 = 1 + 2
				//3 = 3 + 3
				//6 = 6 + 4
				System.out.println(i+"까지의 합은"+sum+"임다");
			}
		System.out.println("총합계:"+sum);
		
		//조건식안의 칸을 비워서 구현해보자
		int j = 0;
		
		for(;;) {
			if(j>10) {
				break; 		//break: 반복문을 빠져나오게 하는 예약어
			}
			sum += j;
			System.out.println(j+"까지의 합은"+sum+"입니다.ㅇ");
			j++;
			
		}
		System.out.println("총합계:"+sum);
		}
}
