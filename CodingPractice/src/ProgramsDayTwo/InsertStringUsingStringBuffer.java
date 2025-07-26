package ProgramsDayTwo;

public class InsertStringUsingStringBuffer {
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("ram is going");
		sb.insert(12, " to school");

		System.out.println(sb);
	}
}
