/*
		논리 연산자 
			AND(&&) 그리고, 논리곱 		참참....참
			
				0 0	?
				0 1	?
				1 0	?	-> 0
				1 1 ?   -> 1
				
			OR(||) 또는, 논리합			거짓....거짓
			
				0 0	?	-> 0
				0 1	?	-> 1
				1 0	?	-> 1
				1 1 ?   -> 1
			
			NOT(!) 아니다. 반대
			
				0 0	?
				0 1	?
				1 0	?	
				1 1 ?   


*/
package C5_Operator;

public class Operator5 {
	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 5;
		int n3 = 7;
		int n4 = 15;
		
		
		//AND
		System.out.println(n1>n2 && n3==n4);
		
		//OR
		System.out.println(false||true);

		//Not
		System.out.println(!true);
	
	}
}






