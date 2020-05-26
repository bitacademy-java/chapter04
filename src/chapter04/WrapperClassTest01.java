package chapter04;

public class WrapperClassTest01 {

	public static void main(String[] args) {
		Integer i1 = new Integer(10);
		Character c = new Character('A');
		Boolean b = new Boolean(true);
		
		System.out.println(i1);
		System.out.println(c);
		System.out.println(b);
		
		// Auto Boxing
		Integer i2 = 10;
		Integer i3 = 10;
		System.out.println(i2 == i3);
		System.out.println(i1 == i2);
		
		// Auto Unboxing
		//int j = 20 + i2.intValue();
		int j = 20 + i2;
		System.out.println(j);
	}

}
