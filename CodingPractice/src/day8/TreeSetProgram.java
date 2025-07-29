package day8;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetProgram {
public static void main(String[] args) {
	
	TreeSet<String> data=new TreeSet<String>();
	data.add("hyderabad");
	data.add("ongole");
	data.add("nellore");
	data.add("tirupathi");
	data.add("chennai");
    data.add(" ");
    data.add(" ");
	data.contains("ongole");
	
	System.out.println(data);
}
}
