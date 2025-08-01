package day10;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.ListIterator;

public class ListIteratorProgram {
	public static void main(String[] args) {
		List<String> list = new ArrayList(Arrays.asList("A", "B", "C", "D"));

		ListIterator<String> it = list.listIterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		while (it.hasPrevious()) {
			System.out.println(it.previous());
		}
	}
}
