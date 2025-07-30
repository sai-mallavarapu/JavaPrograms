package practice;

interface StrFunprogram {
	String run(String str);
}
	public class StrFun {
		public static void main(String[] args) {
			StrFunprogram exclaim = (s) -> s + "!!";
			StrFunprogram query = (s) -> s + "??";
			askQuery("Hello", query);
			askQuery("Hello", exclaim);
		}

		public static void askQuery(String str, StrFunprogram format) {
			String result = format.run(str);
			System.out.println(result);
		}

	}
