// 두사람이 엔터를 치면 초만읽어온다 각각의 읽어온 초시간이 처음시간보다 10초에 근접한 사람이 이김
// 스캐너로 문장을 입엵받아서 공백으로 분리돠ㅣㄴ 어절이 몇개나 들어있는지 키은ㅌ,ㅎ고 분히된 토큰응 룿ㄹ력하시오 
//입력받은 단어가 "그만이라고 하면 종료합니다라고 하고 종료하는 반복하는 프로그램을 작성
package Warrper;

import java.util.Calendar;
import java.util.Scanner;
class Player1 {
	
	int p1;
	
	void result1 (int p1) {
		this.p1=p1;
		
		
	}
}
class Player2{
	
}
class GameStart{
	
}
public class morning2 {

	public static void printTimeGame(String msg, Calendar cal) {
		
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(msg+second+"초");
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("게임을 시작하려면 s를 입력해주세요");
		Calendar startTime = Calendar.getInstance();
		
		String gs = sc.next();
		
		
		switch(gs) {
		case "s" : printTimeGame("시작 시간: ",startTime); break;
		default : System.out.println("게임을 시작하려면 s를 입력해주세요");
		}
		for(int i = 0; i<gs.length(); i++) {
			System.out.println("Player1 차례입니다.숫자 1을 입력하세요"); 
			String p1 = sc.next();
			
			
			switch(p1) {
			
			case "1" : Calendar play1Time = Calendar.getInstance();
				printTimeGame("Player1의 시간 : ",play1Time); break;
			}
			System.out.println("Player2 차례입니다.숫자2를 입력하세요");
			String p2 =sc.next();
			switch(p2) {
				
			case "2" : Calendar play2Time = Calendar.getInstance();
				printTimeGame("Player2의 시간 : ",play2Time); break;
				 
			}
		}
		sc.close();
	}

}
