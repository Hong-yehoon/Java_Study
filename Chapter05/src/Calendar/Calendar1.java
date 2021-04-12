/*
		Calendar클래스
			. static 멤버, 메소드들로 구성되어있다.
			. 컴퓨터의 시간을 가져와서 설정한다.
		
*/
package Calendar;

import java.util.Calendar;

public class Calendar1 {

	public static void printCalendar(String msg, Calendar cal) {
		
		//Calendar now = Calendar.getInstance();				//컴퓨터에 있는 년월일시간을 가져온다.
		
		int year = cal.get(Calendar.YEAR);	
		int month = cal.get(Calendar.MONTH)+1;				//1월이 0, 
		int day = cal.get(Calendar.DAY_OF_MONTH);			//월단위 날짜
		int week = cal.get(Calendar.DAY_OF_WEEK);			//일주일 단위 요일
		int hour = cal.get(Calendar.HOUR);
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);	
		int ampm = cal.get(Calendar.AM_PM);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND);
		
		System.out.print(msg+year+"/"+month+"/"+day+"/");		//년월일출력
		
		//요일출력 요일로 변환해서 출력
		switch(week) {
		case Calendar.SUNDAY: System.out.println("일요일"); break;
		case Calendar.MONDAY: System.out.println("월요일"); break;
		case Calendar.TUESDAY: System.out.println("화요일"); break;
		case Calendar.WEDNESDAY: System.out.println("수요일"); break;
		case Calendar.THURSDAY: System.out.println("목요일"); break;
		case Calendar.FRIDAY: System.out.println("금요일"); break;
		case Calendar.SATURDAY: System.out.println("토요일"); break;
		}
		
		if(ampm==Calendar.AM) {
			System.out.print("오전");
		}else {
			System.out.print("오후");
		}
		
		System.out.println(hour+"시"+minute+"분"+second+"초"+millisecond);
	}
	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		printCalendar("지금 시각은", now);
		
		//설정(set)
		Calendar DateTime = Calendar.getInstance();
		DateTime.clear();
		DateTime.set(2020, 9,16);
		DateTime.set(Calendar.HOUR_OF_DAY,20);
		DateTime.set(Calendar.MINUTE, 30);
		
		printCalendar("데이트 시간: ",DateTime);
	}
}
