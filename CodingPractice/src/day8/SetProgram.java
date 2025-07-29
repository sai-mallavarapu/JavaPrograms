package day8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetProgram {
public static void main(String[] args) {
	Set<Double> values=new HashSet<Double>();
	values.add(10.00);
	values.add(23.0);
	values.add(40.00);
	values.add(99.00);
	values.add(10.00);
	values.add(23.00);
	System.out.println(values.contains(10.00));
	System.out.println(values.isEmpty());
	 Iterator<Double> i=values.iterator();
	 while(i.hasNext()) {
		 System.out.println(i.next());
	 }
	 
}
}
