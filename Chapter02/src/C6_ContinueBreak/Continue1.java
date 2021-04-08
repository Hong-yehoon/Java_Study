/*
		for문에서 continue
			.continue를 만나면 그 지점에서 바로 조건문의 증감으로 이동해서 반복한다.
*/

package C6_ContinueBreak;

public class Continue1 {
		public static void main(String[] args) {
			
			for(int i=0;i<=5; i++) {
				for(int j=0; j<=5; j++) {
					System.out.println(j);
					
					if(j>2) {
						continue; 			//이 문장을 만나면 해당 반복문의 증감부로 올라간다.(아래 미실행)
					}
					System.out.println("대박");
					
				}
				System.out.println("쪽박 현재 i= "+i);
			}
		}
}
