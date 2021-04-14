/*
 	바이트 단위 스트림
 		. InputStream 클래스 - 읽어오는 것, 바이트 단위
 		. OutputStream 클래스 - 출력하는 것, 바이트 단위
 		
 		. 메소드 : int read() : 입력스트림으로부터 1바이트씩 읽고 읽은 자료의바이트 수를 반환한다.
				 void close() : 입출력 스트림과 연결ㄹ된 대상 리소스를 닫는다. 
				 
		. 하위클래스
			- FileInputStream : 파일에서 바이트 단위로 자료를 읽어오는 클래스
			- FileOutStream : 파일로 바이트 단위로 자료를 쓰는 클래스
			
*/
package InputOutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1_InputStream {
	
	public static void main(String[] args) {
		
		
		
		try {
			FileInputStream fis = new FileInputStream(".\\file\\bs1.txt");
			
			//UTF-8 표현
			System.out.print(fis.read());
			System.out.print(fis.read());
			System.out.print(fis.read());
			System.out.print(fis.read());
			System.out.print(fis.read());
			System.out.print(fis.read());
			System.out.print(fis.read());
			System.out.print(fis.read());
			System.out.print(fis.read());
			System.out.print(fis.read());
			System.out.print(fis.read());
			System.out.print(fis.read());
			System.out.print(fis.read());
			System.out.print(fis.read());
			System.out.print(fis.read());
			System.out.print(fis.read());
			System.out.print(fis.read());
			System.out.print(fis.read());
			System.out.print(fis.read());
			
			//1.반복문활용 - 단 한글깨짐
			/*int i;
			while((i=fis.read())!= -1) {
				System.out.print((char)i);
			}*/
			
			//2. UTF-8을 설정해서 출력 - 한글 안깨짐
			InputStreamReader in = new InputStreamReader(fis,"utf-8");
			
			int c;
			while((c=in.read())!=-1) {
				System.out.print((char)c);
			}
			
			//스트림을 닫아준다.
			in.close();
			fis.close();
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
