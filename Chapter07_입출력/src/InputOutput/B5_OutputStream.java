package InputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
		OutPutStream 클래스
			- 바이너리 타입으로 파일에 쓰고자 할 때 사용한다.
			- 메서드
				. void write (int b) : 한 바이트를 출력한다.
				. void write (byte [] b) : b[] 배열에 있는 자료를 출력한다. 
				. void write (byte[], int off, int len) : b[]배열에 있는 자료의 off 위치부터 len개수만큼 출력
				. void flush() : 출력을 위해 잠시 자료가 머무르는 출력 버퍼를 강제로 비워 자료를 출력한다. 
									write()로 값을 출력해도 파일이나 네트워크로 전송되지 않고 출력을 위해
									자료가 쌓이는 출력버퍼에 어느정도 자료가 모여야 출력된다. 자료의 양이 많지 않으면
									출력해도 파일에 전송되지 않을 수 있다. 이때 flush()를 호출하여 남아있는 것을 비운다. 
				. void close() 									 
								
*/
public class B5_OutputStream {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream(".\\file\\Bs5.txt");
			
			fos.write(72);
			fos.write(65);
			fos.write(80);
			fos.write(80);
			fos.write(89);
			fos.write(32);		//SP(space bar)
			fos.write(66);
			fos.write(77);
			fos.write(75);
			
			System.out.println("정상적으로 파일이 생성되었습니다.");
			fos.close();
			
			//바이트 배열을 생성해서 한 번 해보자.
			FileOutputStream foss = new FileOutputStream(".\\file\\Bs5_1.txt");
				
				byte[] bs = new byte[26];
				
				byte data = 65;
				for (int i=0; i<bs.length; i++) {
					bs[i]= data; 
					data++;
				}
				
				//배열을 출력스트림을 통해 저장
				foss.write(bs);
				
				//줄바꿈처리
				foss.write(13);
				foss.write(10);
			
				foss.write(bs,2,10);
				
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
