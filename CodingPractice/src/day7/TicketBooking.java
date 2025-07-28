package day7;

class Ticket {
	double amount;

	Ticket(double amount) {
		this.amount = amount;
	}

	public synchronized void debitcard(double price) {

		if (amount > price) {
			amount = amount - price;
			System.out.println("Amount in my debit card:"+amount);
			System.out.println("amount debited for ticket booking:" + price);
			System.out.println("Remaining amount:" + amount);
		} else {
			System.out.println("insufficient funds to book ticket");
		}
	}

	public synchronized void upi(double price) {
		if (amount > price) {
			amount = amount - price;
			System.out.println("Amount in my  Upi:"+amount);
			System.out.println("amount debited for ticket booking:" + price);
			System.out.println("Remaining amount:" + amount);
		} else {
			System.out.println("insufficient funds to book ticket");
		}
	}
}

public class TicketBooking {
	public static void main(String[] args) throws InterruptedException {
		Ticket ticketAccount = new Ticket(1500); // Initialbalance

		Thread t1 = new Thread(() -> {
			for (int i = 1; i < 3; i++) {
				ticketAccount.debitcard(200);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 1; i < 3; i++) {
				ticketAccount.upi(215);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
	}
}
