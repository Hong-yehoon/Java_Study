package InputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class B6_InOut {

	public static void main(String[] args) {
		
		try {
			//데이터를 저장 : file/Bs7.txt
			//10, 9, 8,~~1까지 for문으로 저장
			FileOutputStream fos = new FileOutputStream(".\\file\\Bs7.txt");
			
			int i;
			for(i=0; i<10; i++) {
				int n=10-i;
				fos.write(n);
			}
			fos.close();
			
			//************************************
			//데이터 읽어오기 
			FileInputStream fis = new FileInputStream(".\\file\\Bs7.txt");
			
			FileReader fr = new FileReader(".\\file\\Bs7.txt");
			
			int a;
			
			while((a=fis.read()) !=-1) {
				System.out.print((a));
			
			}
			fis.close();
		   }catch (IOException e) {
			System.out.println("데이터 입출력에 실패하였습니다.");// TODO: handle exception
			}
	
}
}

