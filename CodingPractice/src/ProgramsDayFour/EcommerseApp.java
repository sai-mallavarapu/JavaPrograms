package ProgramsDayFour;

interface Payments {

	void makePayment();
	
}	
	abstract class PaymentSystems implements Payments{
		 double amount;
		PaymentSystems(double amount) {
			this.amount=amount;
		}
	    void showMessage() {
	    	System.out.println("payment done");
	    }
}
	class NetBanking extends PaymentSystems{

		NetBanking(double amount) {
			super(amount);
			
		}

		@Override
		public void makePayment() {
			System.out.println("netbanking is done:"+amount);
			showMessage();
		}
		
	}
	class Upipayments extends PaymentSystems{

		Upipayments(double amount) {
			super(amount);
			
		}

		@Override
		public void makePayment() {
			System.out.println("upi payment done:"+amount);
			showMessage();
		}
		
	}
	public class EcommerseApp{
		public static void main(String[] args) {
			PaymentSystems p=new NetBanking(1000);
			p.makePayment();
			PaymentSystems p1=new Upipayments(1000);
			p1.makePayment();
		}
		
	}
