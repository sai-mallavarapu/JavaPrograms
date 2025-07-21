package com;

import java.util.Scanner;

public class ATMProject {

    private double balance;
    private Scanner scanner;

    public ATMProject() {
        balance = 1000.0;
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("\n---------------ATM Menu------------------");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Amount");
        System.out.println("3. Withdraw Amount");
        System.out.println("4. Exit");
        System.out.println("-------------------------------------------");
    }

    public void checkBalance() {
        System.out.println("Your balance is: "+balance);
    }

    private void deposit() {
        System.out.print("Enter deposit amount: ");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance=balance+amount;
            System.out.println("Deposited: "+amount);
            System.out.println("Updated balance: "+balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdrawAmount() {
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        if (withdrawAmount>0 && withdrawAmount<=balance) {
            balance=balance-withdrawAmount;
            System.out.println("Withdrawal successful: " + withdrawAmount);
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println("Invalid or insufficient balance.");
        }
    }

    public static void main(String[] args) {
        ATMProject atm = new ATMProject();

        while (true) {
            atm.displayMenu();
            System.out.print("Enter your choice: ");
            int choice = atm.scanner.nextInt();
            atm.scanner.nextLine();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    atm.deposit();
                    break;
                case 3:
                    atm.withdrawAmount();
                    break;
                case 4:
                    System.out.println("Thank you for using ATM. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid selection. Please try again.");
            }
        }
    }
}
