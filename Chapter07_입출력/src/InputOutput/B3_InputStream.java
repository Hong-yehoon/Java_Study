package InputOutput;

import java.io.FileInputStream;
import java.io.IOException;

public class B3_InputStream {

	public static void main(String[] args) {
		
		try {
			FileInputStream fin = new FileInputStream("c:\\windows\\system.ini");
			
			int c;
			while((c=fin.read()) !=-1) {
				System.out.print((char)c);
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("입출력 오류가 발생");
		}
	}
}
