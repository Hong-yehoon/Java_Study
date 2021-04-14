/*
		버퍼 입출력 스트림
			. 입력과 출력전에 버퍼를 두어서 다 채워지면 한번에 입출력하게 함으로써 컴퓨터의 효율을 높인 것. 
			. 내부 버퍼를 가진다는 것 뿐이고 개발자에게 보이는 형식을 동일한다. 
			
			. FileReader ---> BufferReader ---> read()
*/
package InputOutput;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class C3_Buffer {

	public static void main(String[] args) throws IOException {
		
		//기반스트림
		FileReader fin = new FileReader("c:\\windows\\system.ini");
		
		//보조 스트림
		BufferedReader in = new BufferedReader(fin,20);
		
		//화면에 출력
		BufferedOutputStream out = new BufferedOutputStream(System.out, 20);
		
		//읽어오기
		int c;
		while((c=in.read())!=-1) {
			out.write((char)c);
		}
		out.flush();
		in.close();
		
	}
}
