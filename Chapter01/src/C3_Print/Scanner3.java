package C3_Print;

import java.util.Scanner;

public class Scanner3 {
	
	public static void main(String args[]) {
		
		System.out.println("이름, 도시, 나이, 체중을 입력해주세요>>");
		
		Scanner sc = new Scanner(System.in);
		
		String name		= sc.next();
		String city		= sc.next();
		int age			= sc.nextInt();
		double weight 	= sc.nextDouble();
		
		System.out.println(city+"에서 근무하는"+name+"님의 나이는"+age+"이고");
		System.out.printf("몸무게는 %.1f kg 입니다.", weight);
		
		sc.close();
		
	}
	

}
