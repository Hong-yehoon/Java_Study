package InputOutput;

import java.io.FileWriter;
import java.io.IOException;

public class C2_FileWriter {

	public static void main(String[] args) {
		try {
			FileWriter fout = new FileWriter(".\\File\\cs1.txt");
			
			fout.write("파일에 입력해보자");
			fout.write("개졸려");
			fout.write('A');
			
			char [] buf = {'a','b','c','d'};
					fout.write(buf);
					fout.write(buf,1,2);
			
			
			System.out.println("정상출력되었습니더.");
			fout.close();
			
		} catch (IOException e) {
			System.out.println("출력에러 발생");
		}
	}
}
