package C2_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;

public class E4_FileNotFoundException {

	public static void main(String[] args) {
	
		
		try {
			FileInputStream fis = new FileInputStream("./file/B.txt");
		
		int c;
		while((c=fis.read()) != -1) {
			System.out.print((char)c);
		
		}
			fis.close();
		}catch(FileNotFoundException e1) {
			System.out.println("찾는 파일이 없습니다.");
		}catch(IOException e2) {
			
		System.out.println("파일에 내용이 없거나 입출력오류 발생");
		
		
		}
	}
	
}
