package Warrper;

public class W3_Wrapper {

	public static void main(String[] args) {
		
		Integer i = new Integer(10);
		char c = '4';
		Double d = new Double(3.14);
		
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.isDigit(4));	//문자면 t 숫자면 f
		
		if(Character.isDigit(c)) {
			System.out.println(Character.getNumericValue(c)+100);  //문자를 숫자 값으로
		}
		
		System.out.println(Integer.parseInt("-123"));
		int a = Integer.parseInt("123");
		int b = a+100;
		System.out.println(b);
		
		System.out.println(Integer.toBinaryString(28));		//정수를 이진수 문자로
		System.out.println(Integer.toHexString(28));		//정수를 16진수로
		System.out.println(i.doubleValue());  				//정수에서실수로
				
	
	}
}
