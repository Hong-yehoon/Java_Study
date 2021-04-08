/*
	try~catch와 Throws차이 
		- try~catch : 예외가 발생한 메서드에서 그 예외를 바로 처리
		- throws	: 예외처리를 미루면서 그 메서드를 호출하여 사용하는 부분에서 처리
*/
package C2_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex5_Throws처리 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		
		FileInputStream fis = new FileInputStream("./file/A.txt");
		
		int c;
		while((c=fis.read()) != -1) {
			System.out.print((char)c);

		}
		fis.close();
	}
}
