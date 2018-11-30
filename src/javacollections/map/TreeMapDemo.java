package javacollections.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	//it can have null value but not null key
	public static void main(String[] args) {

		Map<Integer, String> hm = new TreeMap<Integer, String>();
		hm.put(1, "Nepal");
		hm.put(0, "india");
		hm.put(2, "china");
		hm.put(3, "bhutan");
		hm.put(4, "bhutan");
		hm.put(8, null);
		hm.put(10, null);
		hm.put(12, null);

		System.out.println(hm);

	}

}
