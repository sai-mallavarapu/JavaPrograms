package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading {
public static void main(String[] args) {
	File f=new File("newFile.txt");
	try {
		Scanner sc=new Scanner(f);
		while(sc.hasNextLine()) {
			String data=sc.nextLine();
			System.out.println(data);
		}
		sc.close();
	} catch (FileNotFoundException e) {
		System.out.println("filenot found");
		e.printStackTrace();
	}
}
}
