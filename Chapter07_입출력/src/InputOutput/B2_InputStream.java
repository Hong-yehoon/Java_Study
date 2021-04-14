package InputOutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2_InputStream {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream fis = new FileInputStream(".\\file\\bs2.txt");
			
			InputStreamReader in = new InputStreamReader(fis,"utf-8");
			
			int c;
			while((c=in.read()) !=-1) {
				System.out.print((char)c);
			}
			in.close();
			fis.close();
			
			System.out.println();
		} catch (IOException e) {
			
		} 
	}
}
