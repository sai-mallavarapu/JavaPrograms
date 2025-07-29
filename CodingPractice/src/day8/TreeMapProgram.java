package day8;

import java.util.TreeMap;

public class TreeMapProgram {
	public static void main(String[] args) {

		TreeMap<Integer, String> data = new TreeMap<Integer, String>();

		data.put(1, "apple");
		data.put(2, "mango");
		data.put(3, "orange");
		data.put(4, "Grapes");
		data.put(5, "pineapple");

		System.out.println(data.keySet());
		System.out.println(data.values());
		System.out.println(data.entrySet());

	}
}
