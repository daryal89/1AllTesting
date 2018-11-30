package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringArrayToArrayList {

	public static void main(String[] args) {

		String[] name = { "ram", "Hari", "mohan", "gita", "srijana", "binayak", "amrit", "anuj" };

		String[] geeks = { "Rahul", "Utkarsh", "Shubham", "Neelam" };

		List<String> al = new ArrayList<String>();

		// adding elements of array to arrayList.
		Collections.addAll(al, name);

		System.out.println(al);

	}
}
