package ProgramsDayThree;

public class BankAccount {
private String name;
private double balance;


public BankAccount(String name,double balance) {
	this.name=name;
	this.balance=balance;
}
public void display() {
	System.out.println("Account holder name:"+name);
	System.out.println("balance:"+balance);
}
public void deposit(double amount) {
	 balance=balance+amount;
	System.out.println("newamount after deposit"+balance);
}
public void withdraw(double withdrawAmount) {
	if(withdrawAmount<balance) {
		balance=balance-withdrawAmount;
	}
	System.out.println("balance after withdraw: "+balance);
}
}
