package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("둘리");
		list.add("마이콜");
		list.add("도우넛");
		
		list.remove(0);
		
		System.out.println(list.size());
	}

}
