package practice;

import java.io.File;

public class FilePath {
public static void main(String[] args) {
	File f=new File("newFile.txt");
	
	if(f.exists()) {
		System.out.println(f.getClass());
		System.out.println("file name"+f.getAbsolutePath());
		System.out.println(f.canWrite());
		System.out.println(f.canRead());
		System.out.println(f.length());
	}
	else {
		System.out.println("file not found");
	}
}
}
