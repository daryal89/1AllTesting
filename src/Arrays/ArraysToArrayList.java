package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysToArrayList {

	public static void main(String[] args) {
		int[] array = new int[7];
		array[0] = 50;
		array[1] = 20;
		array[2] = 10;
		array[3] = 40;
		array[4] = 80;
		array[5] = 10;
		array[6] = 5;

		for (int al : array) {
			System.out.print(al + " ");
		}

		System.out.println();

		// To sort an array: Arrays.sort(ArrayName)
		// Arrays.toString(ArrayName) --> to print the sorted array
		Arrays.sort(array);
		System.out.println("After sorting: " + Arrays.toString(array));

		// converting arrays to ArrayList
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();


	}

}
