package day8;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListProgram {
public static void main(String[] args) {
	LinkedList<String> data=new LinkedList<String>();
	data.add("sai");
	data.add("ravi");
	data.add("sam");
	data.add("bhanu");
	
	data.addFirst("hi");
	data.addLast("bye");
	data.add(1, "kiran");
	//data.remove(2);
	System.out.println(data.contains("sai"));
	
	//Collections.sort(data);
	Iterator<String> i=data.iterator();
	while(i.hasNext()) {
	System.out.println(i.next());
	
	}
}
}
