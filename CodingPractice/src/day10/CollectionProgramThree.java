package day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionProgramThree {
	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(7000, 3000, 2000, 10000));
		a.add(6000);
		a.add(17000);
		System.out.println(a);
		Collections.sort(a);

		System.out.println("sorted:" + a);
		int b = Collections.binarySearch(a, 2000);
		System.out.println("Index of 2000 in sorted list: " + b);
		Collections.reverse(a);
		System.out.println(a);

	}
}
