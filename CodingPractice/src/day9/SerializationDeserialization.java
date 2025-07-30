package day9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	String name;
	String age;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String age) {
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

}

public class SerializationDeserialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student s = new Student();
		s.setName("sai");
		s.setAge("23");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\saim0\\Desktop\\textcode.txt");
		ObjectOutputStream obj = new ObjectOutputStream(fos);

		obj.writeObject(s);
		obj.close();
		fos.close();
		System.out.println("Serializable:" + s);

		FileInputStream fis = new FileInputStream("C:\\Users\\saim0\\Desktop\\textcode.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Student student = (Student) ois.readObject();

		ois.close();
		fis.close();
		System.out.println("Deseriablizable:" + student);
		// FileWriter fw = new FileWriter("C:\\Users\\saim0\\Desktop\\textcode.txt"); //
		// This will overwrite
		// fw.write("Name: " + student.name + "\n");
		// fw.write("Age: " + student.age + "\n");
		// fw.close();
		// System.out.println("file over written");
	}
}
