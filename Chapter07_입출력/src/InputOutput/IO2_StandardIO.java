/*
	Enter = CR + LF
			13	 10
			\r	 \n
*/
package InputOutput;

import java.io.IOException;

public class IO2_StandardIO {

	public static void main(String[] args) {
		System.out.println("알파벳을 여러개 쓰고 [Enter]를 누르세요");
		int i;
		
		try {
			while((i=System.in.read())!=-1) {		//문장의 끝이 오면 마이너스 줘라
				System.out.print((char)i);		//1바이트 (8비트)의 값을 문자로 전환
				System.out.println();
				System.out.print(i);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
