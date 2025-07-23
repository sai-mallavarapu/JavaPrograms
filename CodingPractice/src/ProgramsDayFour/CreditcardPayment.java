package ProgramsDayFour;


	public class CreditcardPayment extends Payment{

		public CreditcardPayment(double amount) {
			super(amount);
			
		}

		@Override
		public void makePayment() {
			System.out.println("processing credit card payment");
			printReceipt();
			
		}
		
	}
