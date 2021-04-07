package C4_pakage;

public class D2_char {
	
	public static void main(String[] args) {
		
		char c1 = 'A';					//그냥 문자로 입력
		char c2 = 65;					//숫자 --> 2진수--> 아스키드코드--->A
		char c3 = '\u0041';				//유니코드  
										// 0000 0000 0100 0001 ---> 0000000001000001  (65)
										//								64+1=65-->(char)65 ---> A
		
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		
		char c4 ='가';
		char c5 = 44032;
		char c6 = '\uac00';				//	1010 1100 0000 0000 ---> 1010110000000000 ---> 44032
		
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
				
	}

}
