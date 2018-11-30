package javacollections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	//It maintains the insertion order
	//LinkedHashMap implements map interface
	// map stores element in key value pair
	// There can be one null key and any number of null values in a hashMap.

	public static void main(String[] args) {

		Map<Integer, String> hm = new LinkedHashMap<Integer, String>();
		hm.put(1, "Nepal");
		hm.put(0, "india");
		hm.put(2, "china");
		hm.put(3, "bhutan");
		hm.put(4, "bhutan");
		hm.put(null, "pakistan");
		hm.put(null, "barma");
		hm.put(null, null);
		hm.put(null, "himanchal");
		hm.put(8, null);
		hm.put(10, null);
		hm.put(12, null);

		System.out.println(hm);

	}

}
