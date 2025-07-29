package day8;

import java.util.LinkedHashSet;

public class LinkedHashSetProgram {
public static void main(String[] args) {
	
	LinkedHashSet<String> data=new LinkedHashSet<String>();
	data.add("sai");
	data.add("sam");
	data.add("kiran");
	data.add("ramu");
	data.add("subash");
	data.getFirst();
	data.getLast();
	data.isEmpty();
	System.out.println(data);
}
}
