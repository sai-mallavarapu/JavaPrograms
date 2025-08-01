package day11;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderProgram {
public static void main(String[] args) throws IOException {
	
	FileReader f=new FileReader("C:\\Users\\saim0\\Desktop\\newfile.txt");
	int ch;
	while((ch=f.read())!=-1) {
		System.out.print((char) ch);
	}
}
}
