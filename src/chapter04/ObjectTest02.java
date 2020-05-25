package chapter04;

public class ObjectTest02 {

	public static void main(String[] args) {
		Point p1 = new Point(10, 20);
		Point p2 = new Point(10, 20);
		Point p3 = p2;
		
		// == : 두 객체의 동일성
		System.out.println(p1 == p2);
		System.out.println(p2 == p3);
		
		// equals : 두 객체의 동질성(내용 비교)
		//          Object의 기본구현은 ==와 같다. 즉 동일성 비교
		System.out.println(p1.hashCode() + ":" + p2.hashCode());
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
		
		// String Test
		String s1 = new String("ABC");
		String s2 = new String("ABC");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode() + ":" + s2.hashCode());
		System.out.println(System.identityHashCode(s1) + ":" + System.identityHashCode(s2));
	
		System.out.println("===========================");
		
		String s3 = "ABC";
		String s4 = "ABC";
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		System.out.println(s3.hashCode() + ":" + s4.hashCode());
		System.out.println(System.identityHashCode(s3) + ":" + System.identityHashCode(s4));
		
	
	}

}
