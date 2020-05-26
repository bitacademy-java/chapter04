package chapter04;

import java.util.Formatter;

public class FormatterTest {

	public static void main(String[] args) {

		String name = "안대혁";
		int score = 9;
		
		System.out.println(name + "님의 점수는 " + score + " 입니다.");
		//%f: 실수, %02d: 정수, %s: 문자열, %c: 문자.... 
		String s = String.format("%s님의 점수는 %02d 입니다.", name, score);
		System.out.println(s);
	}
}
