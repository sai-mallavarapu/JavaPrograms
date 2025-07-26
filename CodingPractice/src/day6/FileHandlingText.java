package day6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingText {
	public static void main(String[] args) {

		File f = new File("C:\\Users\\saim0\\Desktop\\textcode.txt");
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);

			String text = br.readLine();

			while (text != null) {
				System.out.println(text);
				text = br.readLine();
			}
            br.close();
            fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("filenot found");

		} catch (IOException e) {
			System.out.println("Io exception occurred");
		}
		finally {
			System.out.println("This is executed");
		}

	}
}
