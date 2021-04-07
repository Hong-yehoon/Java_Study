/*
		형변환
			-컴퓨터는 정수+실수 이렇게 타입이 다른 것을 연산하지 못한다. 그래서 동일타입으로 바꿔줘야한다. 
			-이렇게 타입을 변환하는 것을 형변환이라고 하는데 자동으로 해주는 묵시적 형변환과 
			  내가 직접해줘야하는명시적 현변환잉 있자.
		
		-묵시적 형변환 :자동 형변환
			.작은 것		--> 큰 것으로 변환
			.덜 세밀(정수) 	--> 더 세밀한 것(실수)으로 변환
			.byte(1) >>short/char(2) >> int/float(4) >> long/double(8)

*/
package C4_pakage;

public class D7_TypeCasting {

		public static void main(String[] args) {
			
			byte b =127;		// 1byte 0000 0000
			int i =100;			// 4byte 0000 0000 0000 0000
			
			//묵시적 형 변환
			System.out.println("b+i+"+(b+i));
			System.out.println("10/4="+(10/4));		//기본 데이터 타입 int에 저장된다.
			System.out.println("10.4/4="+(10.4/4));
			
			//명시적 변환
			System.out.println("(char)0x1230041="+((char)0x12340041));		//2바이트 char에 담김(축소)
			System.out.println("(byte)(b+i)= "+((byte)+b+i)); 	// 1바이트+4바이트  --> 1바이트
			
			
		}
}
