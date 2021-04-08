/*
		
	(실습)
	주사위 두개를 던졌을 때 두수의 합이 6이 되는 경우만을 출력하시오
	i + j = 6

*/
package C3_for;

public class For5 {
	public static void main(String[] args) {
		
		for(int i=1; i<=6; i++) {				//1				2
		
			for(int j=1; j<=6; j++) {			//1 2 3 4 5 6	1 2 3 4 5 6
				
				if((i+j)==6) {
					System.out.println(i+"+"+j+"="+(i+j));
				}
			}
		}
	}
}
