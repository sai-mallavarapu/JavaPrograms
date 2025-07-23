package ProgramsDayFour;

public class PaymentMainClass {

	public static void main(String[] args) {
		
		Payment p=new CreditcardPayment(1000);
		p.makePayment();
		
		Payment p1=new UpiPayment(500);
		p1.makePayment();
		BillGenerator.displayHeader();
		BillGenerator b=(amount)->{
			System.out.println(amount);
			System.out.println("thank you for your payment");
		};
		b.showBillFormat();
		b.generate(1500);
	}
}
