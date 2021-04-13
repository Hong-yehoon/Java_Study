//현재시간은 몊시부터 몇시까지


// 스캐너로 문장을 입력받아서 공백으로 분이된 어절이 몇갠나 들어있는지 카운트하고 분리된 토큰을 출력

package Warrper;

import java.util.Calendar;

public class morning1 {

	public static void printTime(String msg, Calendar cal) {
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int ampm = cal.get(Calendar.AM_PM);
		System.out.println(msg+hour+"시 "+minute+"분 입니다.");
		
		if(ampm==Calendar.AM) {
			System.out.print("Goodmorning");
		}else {
			System.out.print("Goodafternoon>3<");
		}
	
	}
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		printTime("지금시각은", now);
		
	}
}
