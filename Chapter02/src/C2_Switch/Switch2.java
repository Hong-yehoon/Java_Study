package C2_Switch;

import java.util.Scanner;

public class Switch2 {
		public static void main(String[] args) {
			
			//스캐너로 성적을 받아서 (10단위)
			//grade A,B,C,D,F 로 출력해보세요
			//switch문 활용
			
			
			System.out.println("점수 입력해 주세여");
			Scanner sc = new Scanner(System.in);
			
			int score = sc.nextInt();
			
			String grade="";  //변수선언
			
			
			switch(score) {
			
			case 90: grade="A"; break;
			case 80: grade="B"; break;
			case 70: grade="C"; break;
			case 60: grade="D"; break;
			default: grade="F"; 
			
			}
			
			System.out.println("입력하신 점수는"+score+"이고 성적은"+grade+"입니당.");
			
			switch(score/10) {
				case 9: grade="A"; break;
				case 8: grade="B"; break;
				case 7: grade="C"; break;
				case 6: grade="D"; break;
				default: grade="F"; 
			}
			
			System.out.println("입력하신 점수는"+score+"이고 성적은"+grade+"입니당.");
		}
		
		
}
