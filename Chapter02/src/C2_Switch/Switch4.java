package C2_Switch;

import java.util.Scanner;

public class Switch4 {
	public static void main(String[] args) {
		
		int a=7, b=12;
		
		System.out.println("연산자를(operator)를 입력해주새여>>");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		switch(str) {
		case "+": System.out.println("더하기:" +(a+b)); break;
		case "-": System.out.println("빼기:" +(a-b)); break;
		case "/": System.out.println("나누기:" +(a/b)); break;
		case "*": System.out.println("곱하기:" +(a*b)); break;
		case "%": System.out.println("나머지:" +(a%b)); break;
		default:System.out.println("nope"); 
		}
	}
}
