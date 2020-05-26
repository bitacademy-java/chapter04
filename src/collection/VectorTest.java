package collection;

import java.util.List;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		List<String> list = new Vector<>();
		list.add("둘리");
		list.add("마이콜");
		list.add("도우넛");
		
		list.remove(0);
		
		System.out.println(list.size());

	}

}
