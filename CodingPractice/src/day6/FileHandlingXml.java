package day6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingXml {
public static void main(String[] args) {
	
	File f=new File("C:\\Users\\saim0\\Desktop\\xmlfile.xml");
	try {
		BufferedReader br=new BufferedReader(new FileReader(f));
		String data=br.readLine();
		while(data!=null) {
			System.out.println(data);
			data=br.readLine();
		}
	} catch (FileNotFoundException e) {
		System.out.println("file not found");
	} catch (IOException e) {
		System.out.println("Exception occured");
	}
	finally {
		System.out.println("execution done");
	}
}
}
