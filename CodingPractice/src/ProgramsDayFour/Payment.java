package ProgramsDayFour;

public abstract class Payment {
protected double amount;

public Payment(double amount) {
	this.amount=amount;
}

public void printReceipt() {
	System.out.println("amount is processed :"+amount);
}
public abstract void makePayment();
}

