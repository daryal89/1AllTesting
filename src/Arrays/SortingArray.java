package Arrays;

import java.util.Arrays;

public class SortingArray {
	public static void main(String[] args) {

		String[] name = { "ram", "hari", "mohan", "gita", "srijana", "binayak", "amrit", "anuj" };

		Arrays.sort(name);
		for (String s : name) {
			System.out.print(s + " ");
		}

		System.out.println();
		System.out.println(Arrays.toString(name));
	}

}
