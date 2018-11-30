package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingArrayList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(80);
		list.add(79);
		list.add(50);

		System.out.println(list);
		
		//sorting ArrayList
		Collections.sort(list);
		System.out.println(list);

	}

}
