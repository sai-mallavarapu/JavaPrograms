package ProgramsDayThree;

public class BankAccountMain {
public static void main(String[] args) {
	BankAccount b=new BankAccount("sai", 1000);
	b.display();
	b.deposit(500);
	b.withdraw(200);
}
}
