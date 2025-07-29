package practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreation {
public static void main(String[] args) throws IOException {
	/*File f=new File("newFile.txt");
	try {
		if(f.createNewFile()) {
			System.out.println("file created");
		}
		else {
			System.out.println("file already exists");
		}
	} catch (IOException e) {
		System.out.println("error occured");
		e.printStackTrace();
	} */
	
	FileWriter fw=new FileWriter("newFile.txt");
	fw.write("welcome to java file");
	fw.close();
	System.out.println("succesfully written to file");
}
}
