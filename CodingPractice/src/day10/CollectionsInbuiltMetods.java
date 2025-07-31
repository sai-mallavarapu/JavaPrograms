package day10;

import java.util.*;

public class CollectionsInbuiltMetods {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("banana");
		list.add("apple");
		list.add("cherry");
		list.add("apple");
		list.add("grapes");

		System.out.println("Original List: " + list);
		Collections.sort(list);
		System.out.println("Sorted List: " + list);

		Collections.reverse(list);
		System.out.println("Reversed List: " + list);

		Collections.shuffle(list);
		System.out.println("Shuffled List: " + list);

		Collections.swap(list, 0, 1);
		System.out.println("after swap:" + list);

		Collections.sort(list);
		int index = Collections.binarySearch(list, "apple");
		System.out.println(index);

		String max = Collections.max(list);
		System.out.println("max list:" + max);

		String min = Collections.min(list);
		System.out.println("min list:" + min);

		int freq = Collections.frequency(list, "apple");
		System.out.println(freq);

		Collections.replaceAll(list, "apple", "mango");
		System.out.println("after replacing list:" + list);

		List<String> filllist = new ArrayList<>(Arrays.asList("apple", "gauva"));
		// Collections.fill(list,"orange");
		System.out.println("filllist:" + filllist);
		System.out.println(list);

		List<String> empty = Collections.emptyList();
		System.out.println(empty);
	}
}
