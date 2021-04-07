/*
	향 후 학습에 활용하기 위해서 Scanner룰 우선 학습해 봄
	콘솔창으로 값을 입력받아서 내부에서 처리하기 위함 

	활용순서를 익히고, 사용절차를 자꾸 반복해서 따라해보기

*/
package C3_Print;

import java.util.Scanner;

public class Scanner1 {

		public static void main(String args[]) {
			
			//1. 안내문구를 띄워준다. 
			System.out.println("이름을 입력해주십시요 >>");
		
			//2. 스캐너를 준비한다. 
			Scanner sc = new Scanner(System.in);
			
			//3. 스캐너로 입력받은 값을 활용한다.
			String str = sc.next();	//데이터 타입: char 문자(한글자), String 문자열(한글자이상)
			System.out.println("입력받은 이름은"+str+"입니다.");
			
			//4. 스캐너를 닫아준다.
			sc.close();
			
		}
}
