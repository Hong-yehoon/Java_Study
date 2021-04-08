package C2_Switch;

import java.util.Scanner;

public class Switch3 {
		public static void main(String[] args) {
			
			System.out.println("월을 입력해 주세요>>");
			String season="";
			
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			
			switch(num) { 
			case 1: 
			case 2: case 12: season="겨울"; break;
			case 3: case 4: case 5: season="봄"; break;
			case 6: case 7: case 8: case 9: season="여름"; break;
			case 10: case 11: season="가을"; break;
			default: season="엄써용";
			}
		System.out.println(num+"월은"+season+"입니당");
			
		}
}
