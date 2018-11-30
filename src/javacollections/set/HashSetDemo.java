package javacollections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	// Set doesn't allow duplicate values
	// Set doesn't necessarily maintains insertion order

	public static void main(String[] args) {

		Set<String> s = new HashSet<String>();
		s.add("Hello");
		s.add("How");
		s.add("are");
		s.add("you");
		s.addAll(s);
		System.out.println(s);

		Set<String> set = new HashSet<String>();
		set.add("java");
		set.add("javascript");
		set.add("python");
		set.add("ruby");
		set.add("angular");
		set.add("pearl");
		set.add(null);

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
