package chapter04;

public class StringTest03 {

	public static void main(String[] args) {
		String s = "aBcABCabcAbC";
		
		System.out.println(s.length());
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf("abc"));
		System.out.println(s.indexOf("abc", 3));
		System.out.println(s.indexOf("abc", 7));
		System.out.println(s.substring(3));
		System.out.println(s.substring(3, 5));
		
		
		String s2 = "    ab cd   ";
		String s3 = "efg,hijk,lmno,pq";
		
		String s4 = s2.concat(s3);
		System.out.println(s4);
		System.out.println("------" + s2.trim() + "------");
		System.out.println("------" + s2.replaceAll(" ", "") + "------");
		
		String[] tokens = s3.split(",");
		for(String str : tokens) {
			System.out.println(str);
		}
		
		StringBuffer sb = new StringBuffer("");
		sb.append("Hello ");
		sb.append("World ");
		sb.append("Java");
		sb.append(10000);
		
		String s5 = sb.toString();
		System.out.println(s5);
		
		// String s6 = "Hello " + "World " + "Java";
		String s6 =
			new StringBuffer("Hello ")
			.append("World ")
			.append("Java")
			.toString();
		
		System.out.println(s6);
		 
	
		// 주의: 문자열 + 연산을 할 때 
//		String s7 = "";
//		for(int i = 0; i < 1000000; i++ ) {
//			s7 = s7 + i;
//			//s7 = new StringBuffer(s7).append(i).toString();
//		}

		StringBuilder sb2 = new StringBuilder("");
		for(int i = 0; i < 1000000; i++ ) {
			sb2.append(i);
		}
		String s7 = sb2.toString();
		System.out.println(s7.length());
	}

}
