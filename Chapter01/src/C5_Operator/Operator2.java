/*
		전위증감연산자(prefix), 후위증감연산자(postfix)

*/

package C5_Operator;

public class Operator2 {
	
	public static void main(String[] args) {
		
		int a = 5 ;
		int b = 2 ;
		
		int sum = a+b;
		int sub = a-b;
		int mul = a*b;
		int div = a/b;
		
		
		System.out.println("a+b="+sum);
		
		//뻬기
		System.out.println("a-b="+sub);
		//곱하기
		System.out.println("a*b="+mul);
		//나누기(소수점나오게)
		System.out.println("a/b="+(float)div);
		
		//나머지
		
		//전위증감연산자( ++a,  --a)
		
		//현재 a값은 5
		int c1 = ++a;		// a = a +1
		System.out.println("전위증감연산자 c1의 값은 얼마일까요?:"+c1);
		System.out.println("현재 a의 값은?"+a);
		
		//현재 a값은 6
		int c2 = a++;		// a=a , a=a+1
		System.out.println("후위증감연산자 c2의 값"+c2);
		System.out.println("현재 a의 값은?"+a);
		
			
		
	}
	
	

}
