package chapter04;

public class WrapperClassTest02 {

	public static void main(String[] args) {
		String s1 = "123456";
		int i = Integer.parseInt(s1);
		// cf 반대의 경우
		String s2 = String.valueOf(i);
		System.out.println(s1 + ":" + s2);
		
		int a = Character.getNumericValue('F');
		System.out.println(a);
		
		// 2진수 문자열
		String s3 = Integer.toBinaryString(15);
		System.out.println(s3);
		
		// 16진수 문자열
		String s4 = Integer.toHexString(15);
		System.out.println(s4);
		
	}

}
