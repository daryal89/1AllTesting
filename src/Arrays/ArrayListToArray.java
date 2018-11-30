package Arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);

		List<String> ar = new ArrayList<String>();
		ar.add("ram");
		ar.add("shyam");
		ar.add("geeta");
		ar.add("mohan");
		ar.add("prabha");

		System.out.println(al);
		System.out.println(ar);

		// converting to array
		Object[] obj = al.toArray();
		for (int a : al) {
			System.out.print(a + " ");
		}

		System.out.println();
		// Converting to array
		Object[] obj1 = ar.toArray();
		for (String s : ar) {
			System.out.print(s + " ");
		}

	}

}
