package day9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.Writer;

class Student1 implements Serializable{
	String name;
	int age;
	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", age=" + age + "]";
	}
	
}
public class SerializationDemo {
public static void main(String[] args) throws IOException {
	Student1 student=new Student1("sai",23);
	
	FileOutputStream fis=new FileOutputStream("C:\\Users\\saim0\\Desktop\\javaquestions.txt");
	ObjectOutputStream obj=new ObjectOutputStream(fis);
	obj.writeObject(student);
	obj.close();
	fis.close();
	System.out.println(student);
}
}
