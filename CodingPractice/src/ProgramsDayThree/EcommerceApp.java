package ProgramsDayThree;

interface Payment {
	void pay(double amount);
}

class PaymentUpi implements Payment {
	@Override
	public void pay(double amount) {
		System.out.println("amount paid via upi :" + amount);
	}

}

class CreditcardPayment implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("credit card payment:" + amount);
	}
}

class CashOnDelivery implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("cash on delievry payment :" + amount);

	}

}

public class EcommerceApp {
	public static void main(String[] args) {

		Payment p;

		p = new PaymentUpi();
		p.pay(100);
		p = new CreditcardPayment();
		p.pay(200);
		p = new CashOnDelivery();
		p.pay(300);

	}
}
