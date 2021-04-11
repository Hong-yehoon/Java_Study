package Step2_Variable;

import java.io.IOException;

public class V8_Final {
	public static void main(String[] args) throws IOException {
		
		final int TRAIANGLE = 1;
		final int RECTNAGLE = 2;
		final int CIRCLE = 3;
		
		System.out.println("1~3 사이 숫자를 입력해 주세여>>");
		int num = System.in.read() - '0';		
		//'0'아스키코드값 80 ---> 만약 3을 입력하면 아스키코드값으로는 83 --> 83-80('0')=3
		
		if(num == TRAIANGLE) {
			System.out.println("삼각형을 그린다..");
		}else if (num == RECTNAGLE) {
			System.out.println("사각형을 그린다.");
		}else if (num == CIRCLE) {
			System.out.println("원을 그린다.");
		}else {
			System.out.println("숫자 잘못입력하였습니다.");
		}
	}
}
