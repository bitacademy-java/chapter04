package chapter04;

public class ObjectTest01 {

	public static void main(String[] args) {
		Point p = new Point(10, 20);
		
		//Class<Point> klass = (Class<Point>)p.getClass();
		System.out.println(p.getClass());   // reflection
		System.out.println(p.hashCode());   // address X
											// reference X
											// address 기반으로 한 해싱값

		System.out.println(p.toString());   // getClass() + "@" + hashCode()
		System.out.println(p);
		

	}

}
