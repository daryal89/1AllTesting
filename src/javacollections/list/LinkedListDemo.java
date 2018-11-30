package javacollections.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {

		List<String> linklist = new LinkedList<String>();

		linklist.add("java");
		linklist.add("javascript");
		linklist.add("ruby");
		linklist.add("angular");
		linklist.add("python");
		linklist.add("pearl");
		linklist.add("phantom js");
		linklist.add("javascript");
		linklist.add("ruby");
		System.out.println("LinkedList is: " + linklist);
		System.out.println(linklist.toString());
		System.out.println("size is: " + linklist.size());

		System.out.println(linklist.remove(0));
		System.out.println(linklist);
		Collections.sort(linklist);

		// Let us print the sorted list
		System.out.println("List after the use of" + " Collection.sort() :\n" + linklist);

	}

}
