package javacollections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	// Set doesn't allow duplicate values. Only unique elements are stored in set
	// LinkedHashSet follows insertion order

	public static void main(String[] args) {

		Set<String> s = new LinkedHashSet<String>();
		s.add("Hello");
		s.add("How");
		s.add("are");
		s.add("you");
		s.addAll(s);
		System.out.println(s);

		Set<String> set = new LinkedHashSet();
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
