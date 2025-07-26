package day6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingCsv {
	public static void main(String[] args) {

		File f = new File("C:\\Users\\saim0\\Desktop\\csvfile.csv");
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			String data=br.readLine();
			while(data!=null) {
				String [] values=data.split(",");
				for(String v:values) {
					System.out.print(v+"\t");
				}
				data=br.readLine();
				System.out.println();
			}
			br.close();
		} catch (FileNotFoundException e) {
           System.out.println("no file found");
		} catch (IOException e) {
           System.out.println("exception occured due to input missmatch");
		}
		finally {
			System.out.println("code execution done");
		}
	}
}
