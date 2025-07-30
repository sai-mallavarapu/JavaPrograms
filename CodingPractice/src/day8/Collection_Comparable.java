package day8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Collection_Comparable implements Comparable<Collection_Comparable> {
	private String name;
	private int age;
	Collection_Comparable(String name,int age){
		this.name=name;
		this.age=age;
	}

	public int compareTo(Collection_Comparable others) {
		return this.age-others.age;
	}
	public String toString()
	{
		return name;
	}
	public static void main(String[] args) {
		
		List<Collection_Comparable> a=Arrays.asList(new Collection_Comparable("sai",23),new Collection_Comparable("sam",24));
		Collections.sort(a);
		System.out.println("sorted by age:	"+a);
	}

}
