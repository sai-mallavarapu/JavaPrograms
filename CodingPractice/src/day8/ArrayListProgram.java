package day8;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListProgram {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(50);
		list.add(5);
		list.add(99);
		System.out.println(list.contains(10));
		list.remove(3);
		System.out.println(list.size());
	    System.out.println();
		
		for (Integer values : list) {
			
			System.out.println(values);
		}
	}
}
