package javacollections.list;

import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		List<String> vec = new Vector<String>();

		vec.add("java");
		vec.add("javascript");
		vec.add("ruby");
		vec.add("angular");
		vec.add("python");
		vec.add("pearl");
		vec.add("phantom js");
		vec.add("javascript");
		vec.add("ruby");
		System.out.println("Vector is: " + vec);
		System.out.println(vec.toString());
		System.out.println("size is: " + vec.size());

		System.out.println(vec.remove(0));
		System.out.println(vec);
		Collections.sort(vec);

		// Let us print the sorted list
		System.out.println("List after the use of" + " Collection.sort() :\n" + vec);

		ListIterator<String> it = vec.listIterator();
		while (it.hasNext()) {
			System.out.print(it.next() + "  ");
		}

		System.out.println();

		while (it.hasPrevious()) {
			System.out.print(it.previous() + "   ");
		}
	}

}
