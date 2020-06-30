import java.util.Scanner;


public class bankAccount {
	private int accNum = 0;
	private double bal = 0.0;
	private String custName = "";
	private String custMail = "";
	private String phoneNum = "-1";
	
	public bankAccount (int a, double b, String name, String mail, String phNum) {
		accNum = a;
		bal = b;
		custName = name;
		custMail = mail;
		phoneNum = phNum;
	}
	public void getBalance() {
		System.out.println("Account Balance: " + bal);
	}
	public int deposit (double x) {
		bal += x;
		return 1;
	}
	
	public int withdraw (double x) {
		if (x > bal) {
			System.out.println ("Unable to withdraw amount. Requested amount is larger than account balance");
			return -1;
		}
		bal -= x;
		dispense();
		System.out.println("Requested amount dispensed. \n Remaining account balance: $" + bal);
		return 1;
	}
	
	public void dispense() { // dummy method to simulate dispensing money
		return;
	}
	
	public void getInfo () {
		System.out.println("Customer Name: " + custName);
		System.out.println("Account Number: " + accNum);
		System.out.println("Account Balance: " + bal);
		System.out.println("Email: " + custMail);
		System.out.println("Phone Number: " + phoneNum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 0;
		double amount = 0.0;
		Scanner scan = new Scanner (System.in);
		System.out.println ("Hello! /n Please select enter an option:");
		System.out.println("1. Show  Account Balance");
		System.out.println("2. Deposit Money");
		System.out.println("3. Withdraw Money");
		System.out.println("4. Exit");
		
		switch (choice){
			case 1:
				getBalance();
				break;
			
			case 2:
				System.out.println("Please enter amount to deposit: ");
				amount = scan.nextDouble();
				depositMoney(amount);
				break;
			
			case 3:
				System.out.println("Please enter amount to withdraw: ");
				amount = scan.nextDouble();
				withdrawMoney(amount);
				break;
			
			case 4:
			
			default:
				System.out.println("Exiting...");
				return;
				break;
		}
		
		System.out.println("Thank you for using our service!");
	}

}
