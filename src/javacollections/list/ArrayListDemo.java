package javacollections.list;

import java.util.ArrayList;

public class ArrayListDemo {
	
	// ArrayList is dynamic means grows and shrinks dynamically as we add or remove elements on arrayList
	// It maintains insertion order
	//It allows duplicate elements
	//It is not thread safe

	static int a = 10;
	static ArrayList<Integer> b = new ArrayList<Integer>();
	static ArrayList<Integer> array = new ArrayList<Integer>();

	public static void main(String[] args) {
		b.add(1);
		b.add(2);
		b.add(3);
		b.add(4);
		b.add(5);

		array.add(10);
		array.add(0, 20);
		array.add(30);
		array.add(40);
		array.add(50);

		System.out.println("Array is: " + array);
		System.out.println("The first element is " + array.get(0));
		System.out.println("Size is: " + array.size());

		array.addAll(b);

		System.out.println("After adding ------b-----collection ");
		System.out.println("Array is: " + array);
		System.out.println("The first element is " + array.get(0));
		System.out.println("Size is: " + array.size());

		//array.clear();
		System.out.println("After clearing the arraylist: " + array.isEmpty());
		System.out.println("After clearing the arraylist: " + array.size());
		
		array.set(0, 100);
		System.out.println(array);
	}

}
