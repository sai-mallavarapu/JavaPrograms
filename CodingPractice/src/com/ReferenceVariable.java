package com;

class Person {

	String name;
	public Person(String name) {
		
		this.name=name;
	}
	public String toString() {
		return name;
	}
	public class ReferenceVaraiable {
		public static void changename(Person p) {
			p.name="changed";
			
		}
		public static void main(String[] args) {
			int x=10;
			int y=x;
			y=20;
			System.out.println(x);
			Person p1=new Person("xyz");
			Person p2=p1;
			p2.name="abc";
			System.out.println(p1);
			changename(p1);
			System.out.println(p1);
			System.out.println();
		}
	}
	}