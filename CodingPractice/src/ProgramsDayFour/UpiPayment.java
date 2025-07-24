package ProgramsDayFour;

public class UpiPayment extends Payment{

	public UpiPayment(double amount) {
		super(amount);
	
	}

	@Override
	public void makePayment() {
		System.out.println("upi payment is processing: "+amount);
		
		printReceipt();
	}

}
