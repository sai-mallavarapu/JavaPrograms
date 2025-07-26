package day5;

public class SavingsAccount implements Bank{
private double balance;
	
SavingsAccount(double initialbalance){
	this.balance=initialbalance;
}
	
	@Override
	public double getBalance() {
		
		return balance;
	}

	@Override
	public void deposit(double amount) {
		
		balance=balance+amount;
	}

	@Override
	public void withdraw(double amount) {
		if(balance>=amount) {
			balance=balance-amount;
		}
		else {
		System.out.println("insufficient funds");
	}
	}
	@Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }

}
