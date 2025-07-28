package day7;

public class Bank_Mul {
	private double balance;

	Bank_Mul(double balance) {
		this.balance = balance;
	}

	public synchronized void depositAmount(double amount) {

		 balance = balance + amount;
		 System.out.printf("%s deposited: %.2f | Current Balance: %.2f%n", 
				    Thread.currentThread().getName(), amount, balance);
	}

	public synchronized void withdrawAmount(double withdrawAmount) {
		if (balance >= withdrawAmount) {
			balance = balance - withdrawAmount;
			System.out.printf("%s balance: %.2f | withdraw: %.2f%n",Thread.currentThread().getName(), balance, withdrawAmount);
		} else {
			System.out.println("Insufficient Funds");
		}
	}

	public synchronized double getBalance() {
		return balance;

	}
}
