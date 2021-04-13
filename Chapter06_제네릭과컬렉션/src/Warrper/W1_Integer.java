/*
		int i = 10
		Integer i = new Integer(10);
		
		Wrapper(포장) 클래스

			기본데이터 타입 					Wrapper 클래스
				int		  ------------		integer
				char	  ------------		Character
				double	  ------------		Double
				float	  ------------		Float
				byte	  ------------		Byte
*/
package Warrper;

public class W1_Integer {
	
	public static void main(String[] args) {
		
		Integer i = new Integer(10);
		//int ii = i.intValue();			//inValue() 언박싱, 즉 객체 -> 값으로 전환
		int ii= i;							//자동언박싱
		Integer.valueOf(ii);				//박싱  객체화 시킴
		System.out.println(i);
		
		System.out.println(ii);
	
		
		Character c = new Character('c');
		//char cc = c.charValue();			//언박싱
		char cc = c;
		Character.valueOf(cc);
		
		System.out.println(c);
		System.out.println(cc);
		
		Float f = new Float(3.14);
		//float ff = f.floatValue();
		float ff = f;
		System.out.println(f);
		System.out.println(ff);
		
		Boolean b = new Boolean(true);
		Boolean bb = b.booleanValue();
		System.out.println(b);
		System.out.println(bb);
	}
}
