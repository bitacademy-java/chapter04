package chapter04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		printDate(cal);
		
		//2021년 12월 31일
		cal.set(Calendar.YEAR, 2021);
		cal.set(Calendar.MONTH, 11); //month(12)-1
		cal.set(Calendar.DATE, 31); //month(12)-1

		printDate(cal);
		
		//2007년 11월 18일(저 결혼한 날)
		cal.set(2007, 10, 18);
		cal.add(Calendar.DATE, 5000);
		printDate(cal);
		
		// Date 객체로 변경
		Date d = new Date(cal.getTimeInMillis());
		printDate1(d);
	}

	public static void printDate1(Date d) {
		SimpleDateFormat sdf = 
			new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		String dateString = sdf.format(d);
		System.out.println(dateString);
	}
	
	public static void printDate(Calendar cal) {
		String[] days = { "일" , "월", "화", "수", "목", "금", "토" };
		
		//년도
		int year = cal.get(Calendar.YEAR);
		
		//월(0~11, +1)
		int month = cal.get(Calendar.MONTH);
		
		//일
		int date = cal.get(Calendar.DATE);
		
		//요일[1(일) 2(월) 3(화) 4(수) 5(목) 6(금) 7(토)]
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		//AMPM
		int am = cal.get(Calendar.AM_PM);
		
		//시
		int hour = cal.get(Calendar.HOUR);
		int hours = cal.get(Calendar.HOUR_OF_DAY);
		
		//분
		int minute = cal.get(Calendar.MINUTE);
		
		//초
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(
			year        + "년 " +
			(month+1)   + "월 " +
			date        + "일(" +
			days[day-1]	+ "요일) " +
			(am == 0 ? "오전 " : "오후 ") +
			hour        + "(" + 
			hours       + ")시 " +
			minute      + "분 " +
			second      + "초 "		
		);
	}
}
