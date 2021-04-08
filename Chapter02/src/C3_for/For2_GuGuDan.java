package C3_for;

public class For2_GuGuDan {
		public static void main(String[] args) {
		
			System.out.println("구구단을 출력합니다.");
			
			//단
			for(int i=1; i<=9; i++) {
				System.out.println(i+"단 들어갑니다.");
			//수
				for(int j=1; j<=9; j++) {
					System.out.println(i+"*"+j+"="+(i*j));
				}
			
				System.out.println();		//즐바꿈염
			}
			
			
		}
}
