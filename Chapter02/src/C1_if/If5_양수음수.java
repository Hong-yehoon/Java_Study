//1.스캐너로 숫자를 입력받아서 
//2.양수인지 음수인지?  짝수인지 홀수인지?


package C1_if;

import java.util.Scanner;

public class If5_양수음수 {
	public static void main(String[] args) {
		
		System.out.println("숫자를 입력해주세여>>");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
			if(num>0) {
				if(num % 2 ==0) {
					System.out.println("입력하신 숫자는 양수이며 짝수입니다.");
				}else {
					System.out.println("입력하신 숫자는 양수이며 홀수입니다.");
				}
			} else {
				if(num % 2== 0) {
					System.out.println("입력하신 숫자는 음수이며 짝수입니다.");
				}else {
					System.out.println("입력하신 숫자는 음수이며 홀수입니다.");
				}
		sc.close();
	}
}
}
