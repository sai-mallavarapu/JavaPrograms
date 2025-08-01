package day10;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
	public static void main(String[] args) {

		String data = "hello sai welcome";
		
		try {
			FileWriter f = new FileWriter("C:\\Users\\saim0\\Desktop\\newfile.txt");
			f.write(data);
			f.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("successfully written");
	}
}
