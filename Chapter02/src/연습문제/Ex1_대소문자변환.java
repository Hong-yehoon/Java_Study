package 연습문제;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1_대소문자변환 {
	public static void main(String[] args) {
		
		System.out.println("대소문자변환을 위한 영문자를 입력해주세요>>");
		InputStreamReader rd = new InputStreamReader(System.in);
		
		int a;
		
		while(true) {
			
			try{
				 //실행문
				a= rd.read();
				
				if(a==-1) {		//ctrl+z 가 입력되면 read()메소드는 -1값을 리턴해준다.
					break;
				}else if(a== '\n' || a=='r') {	//Enter 키를 치면 \n\r 빈복헤라					
					continue; 
				}
				if(a>='a' && a<='z') {	//소문자면
					a = a - ('a'-'A');		//대문자로 변환 a=a-('a'-A): 65-(65-97) = 65 -(-32)=97				
				} else if(a>='A' && a<='Z') {// 대문자면
					a = a +('a'-'A');		//소문자로 변환 
				}else {
					System.out.println("영문자가 아닙니다.");
					continue; 
				}
					//위에서 받은 아스키코드 값을 문자로 형변환 해서 풀력
					System.out.println((char)a);
					
			}catch(IOException e) {
				//에러났을 떄 처리할 문장
				System.out.println("입력 에러 발생");
			}
			
			
		}
	}
}
