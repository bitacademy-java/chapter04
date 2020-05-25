package chapter04;

public class StringTest01 {

	public static void main(String[] args) {
		// c:\temp
		String s1 = "c:\\temp";
		System.out.println(s1);
		
		// "Hello"
		String s2 = "\"Hello\"";
		System.out.println(s2);
		
		// \t -> tab  제어문자
		// \n -> new line 제어문자
		// \r -> carrige return 제어문자
		System.out.println("Hello\tWorld\r\n");
		System.out.println("Hello\tWorld\n");

		// '
		char c = '\'';
		System.out.println(c);
	}

}
