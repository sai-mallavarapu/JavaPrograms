package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CollectionProgram {
	public static void main(String[] args) {

		ArrayList<String> courses = new ArrayList<>();
		courses.add("java");
		courses.add("python");
		courses.add("c");
		courses.add("data Structures");
		courses.add("r");
		courses.add("python");
		for (String c : courses) {
			System.out.println(c);
		}
		Set<Integer> numbers = new HashSet<>();
		numbers.add(10);
		numbers.add(2);
		numbers.add(20);
		numbers.add(223);
		numbers.add(02);
		for (int i : numbers) {
			System.out.println(i);
		}
		Map<String, Integer> courseduration = new HashMap<>();
		courseduration.put("python", 30);
		courseduration.put("python", 35);
		courseduration.put("datastructures", 40);
		courseduration.put("testing", 25);
		courseduration.put("java", 25);

		for (String cd : courseduration.keySet()) {
			System.out.println(cd);
		}
	}
}
