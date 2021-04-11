package Step6_접근지정자;

import bak.A;
import bak.Protected_A;

class Protected_B extends Protected_A {
	protected int b;
	protected void b() {
		b=5;
		a=50;
		a();
		printA();
				
	}
	protected void printB() {
		System.out.println("여기는 B");
	}
}

class Protected_C extends Protected_B {
	
	void f() {
	b=3;
	a=40;
		
	}
}

public class Protected_D {

	public static void main(String[] args) {
		
		Protected_C c = new Protected_C();
		c.b = 7; 	//같은 패키지
		c.b();		//부모 b의 메소드
		c.printB();
		
		
	}
}
