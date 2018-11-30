package javacollections.map;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class DemoHashtable {

	// doesn't necessarily maintains insertion order
	// It is a synchronized implementation
	// It can't have null value or null keys.
	// map stores element in key value pair

	public static void main(String[] args) {

		Map<Integer, String> hm = new Hashtable<Integer, String>();
		hm.put(1, "Nepal");
		hm.put(0, "india");
		hm.put(2, "china");
		hm.put(3, "bhutan");
		hm.put(4, "bhutan");

		System.out.println(hm);
		System.out.println(hm.size());

	}

}
