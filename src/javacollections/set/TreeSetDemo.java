package javacollections.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	// Set doesn't allow duplicate values. Only unique elements are stored in set
	// TreeSet maintains natural ascending order. (alphabetical order in case of String)
	// Null value can't be added in TreeSet

	public static void main(String[] args) {
		Set<String> s = new TreeSet<String>();
		s.add("ram");
		s.add("shyam");
		s.add("hari");
		s.add("mohan");
		System.out.println(s);

		Set<String> set = new TreeSet<String>();
		set.add("java");
		set.add("javascript");
		set.add("python");
		set.add("ruby");
		set.add("angular");
		set.add("pearl");
		// set.add(null); null value is not accepted in TreeSet

		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.contains("python"));
		System.out.println(set.isEmpty());

		set.addAll(s);
		System.out.println(set);
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + "  ");
		}
	}

}
