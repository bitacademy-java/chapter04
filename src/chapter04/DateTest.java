package chapter04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		printDate1(now);
		printDate2(now);
	}

	public static void printDate1(Date d) {
		SimpleDateFormat sdf = 
			new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		
		String dateString = sdf.format(d);
		System.out.println(dateString);
	}
	
	public static void printDate2(Date d) {
		// 년도(+1900) 
		int year = d.getYear();
		
		// 월(0~11, +1)
		int month = d.getMonth();
		
		// 일
		int date = d.getDate();
		
		// 시
		int hour = d.getHours();
		
		// 분
		int minutes = d.getMinutes();
		
		// 초
		int seconds = d.getSeconds();
		
		System.out.println(
			(year+1900) + "년 " +
			(month+1)   + "월 " +
			date        + "일 " + 
			hour        + "시 " +
			minutes     + "분 " +
			seconds     + "초 "
		);
	}
}
