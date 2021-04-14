package InputOutput;

import java.io.FileReader;
import java.io.IOException;

/*
				Reader					Writer
				  |						  |
		 InputStreamReader		 OutputStreamReader
		 FileReader				 FileWriter	<가장 많이 사용>
		
		 BufferReader			 BufferWriter
		 FilterReader			 FilterWriter
		 CharArrayReader		 CharArrayWriter
		 StringReader			 StringWriter
*/
public class C1_FileReader {

	public static void main(String[] args) {
		
		try {
			
			FileReader in = new FileReader("c:\\Windows\\system.ini");
			
			int c;
			while((c=in.read()) !=-1) {
				System.out.println((char)c);
			}
			in.close();
			
		} catch (IOException e) {
			System.out.println("데이터 읽어오기 실패~");
		}
	}
}
