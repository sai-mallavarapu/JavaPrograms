package day11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterProgram {
public static void main(String[] args) throws IOException {
	BufferedWriter b=new BufferedWriter(new FileWriter("C:\\Users\\saim0\\Desktop\\newfile.txt",true));
	b.write("new lined added");
	b.newLine();
	b.write("todays task done");
	b.close();
}
}
