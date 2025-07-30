package day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
	String name;
	int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name;
	}
}

public class Collections_Comparable2 {
public static void main(String[] args) {
	
	Comparator<Employee> com=new Comparator<Employee>() {
		

		@Override
		public int compare(Employee i, Employee j) {
			if(i.age>j.age) 
				return 1;
				else 
					return -1;
		}
	};
	List<Employee> list=new ArrayList<>();
	list.add(new Employee("sai",23));
	list.add(new Employee("sam",24));
	list.add(new Employee("ravi",18));
	list.add(new Employee("raki",20));
	list.add(new Employee("kabeer",19));
	Collections.sort(list,com);
	System.out.println(list);
	
	}

  }
