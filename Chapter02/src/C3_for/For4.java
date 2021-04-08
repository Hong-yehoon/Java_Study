/*
		*
		**
		***
		****
		*****
		****
		***
		**
		*
*/
package C3_for;

public class For4 {

		public static void main(String[] args) {
			
			
			for(int i=0; i<=4; i++) {
				for(int j=0; j<=i; j++) {
					
				System.out.print("*");
			
			}
			System.out.println();
		
		}
			for(int k=4; k>=0; k--) {
				for(int m=0; m<=k; m++) {
						System.out.print("*");
				}
				System.out.println();
			}
		
		System.out.println("다른 모양을 출력해보자");
		
		for(int i=6; i>0; i--) {						//i는 6,5,4,3,2,1 (6회반복
			for(int j=1; j<i; j++) {					//j는 1,2,3,4,5 (5회 반복
				System.out.print(" ");
				
			}
			for(int k=0; k<=6-i;k++) {					//k는 0,1,2,3,4,5
				System.out.println("*");
			}
			System.out.println();
		}
		
		
			
		}
		
}
