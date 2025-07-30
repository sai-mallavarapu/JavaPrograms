package day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collections_Comparable1 {
	public static void main(String[] args) {
		Comparator<Integer> com = new Comparator<Integer>() {

			@Override
			public int compare(Integer i, Integer j) {
				if (i < j) {
					return 1;
				}
				return -1;
			}
		};

		List<Integer> list = new ArrayList<>();
		list.add(99);
		list.add(67);
		list.add(10);
		list.add(20);
		list.add(100);
		list.add(121);
		System.out.println("Before Sorting:" + list);
		Collections.sort(list, com);// sort accordingly to logic

		System.out.println("After sorting:" + list);
	}
}