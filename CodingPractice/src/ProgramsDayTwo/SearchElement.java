package ProgramsDayTwo;

public class SearchElement {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 10, 40, 99 };
		int key = 40;
		boolean isFind = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				isFind = true;
				System.out.println("element found at index" + i+" "+"is"+" "+key);
				break;
			}
		}
		if (!isFind)
			System.out.println("element not in array");

	}
}
