package Step1_클래스와객체;

public class C5_Calculator {

		int add, sub, mul, did;
	
		double result;
		
		//생성자
		
		//메소드
		void add(int x, int y) {
			add = x+y;
			System.out.println("두 수의 합은"+add);
		}
		void sub(int x, int y) {
			sub = x-y;	
			System.out.println("두 수의 차는"+sub);
		}
		void mul(int x, int y) {
			mul = x*y;	
			System.out.println("두 수의 곱은"+mul);
		}
		void did(int x, int y) {
			did = x/y;	
			System.out.println("두 수의 나누기는"+did);
	}
	
 }

