package ProgramsDayFour;
@FunctionalInterface
public interface BillGenerator {

	void generate(double billamount);
	
	default void showBillFormat() {
		System.out.println("show bill receipt");
	}
	static void displayHeader() {
		System.out.println("welcome to online billing");
	}
}
