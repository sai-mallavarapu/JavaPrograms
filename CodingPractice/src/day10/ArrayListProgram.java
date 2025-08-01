package day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListProgram {
	public static void main(String[] args) {

		ArrayList<String> s = new ArrayList<String>(Arrays.asList("zara", "lara", "sara", "mohan"));

		s.stream().filter(names ->names.length()>4).forEach(names -> System.out.println(names));
		System.out.println();
	}
}
