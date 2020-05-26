package collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("둘리");
		list.add("마이콜");
		list.add("도우넛");
		
		list.remove(0);
		
		System.out.println(list.size());

	}

}
