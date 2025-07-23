package ProgramsDayThree;

abstract class PaymentMode{
	double amount;

	PaymentMode(double amount){
		this.amount=amount;
	}
	
	void showMessage() {
		System.out.println("payment is processing");
	}
	abstract void makePayment();
}
class DebitCard extends PaymentMode{

	DebitCard(double amount) {
		super(amount);
		
	}

	@Override
	void makePayment() {
		showMessage();
		System.out.println("debit card payment done:"+amount);
		
	}
	
}
class UpiPayments extends PaymentMode{

	UpiPayments(double amount) {
		super(amount);
		
	}

	@Override
	void makePayment() {
		showMessage();
		System.out.println("upi payment is done:"+amount);
		
		
	}
	
}

public class PaymentNew {
public static void main(String[] args) {
	PaymentMode p=new DebitCard(5000);
	p.makePayment();
	PaymentMode p1=new UpiPayments(500);
	p.makePayment();
}
}
