package day5;

public class BankProject {
	public static void main(String[] args) {
		Bank account = new SavingsAccount(1000);

		account.displayAccountType();
		account.executeTransaction("deposit",500);
		account.executeTransaction("withdraw",100);
		account.executeTransaction("withdraw", -80);
		System.out.println("Final Balance: "+account.getBalance());

	}
}
