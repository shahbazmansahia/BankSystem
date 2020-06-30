import java.util.Scanner;


public class bankAccount {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomerAccount test = new CustomerAccount (123456789, 5000, "Bally Sagoo", "dilDaNiMarha@SidhuMooseAala.com", "314-060-6060");
		
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
				test.getBalance();
				break;
			
			case 2:
				System.out.println("Please enter amount to deposit: ");
				amount = scan.nextDouble();
				test.deposit(amount);
				break;
			
			case 3:
				System.out.println("Please enter amount to withdraw: ");
				amount = scan.nextDouble();
				test.withdraw(amount);
				break;
			
			case 4:
			
			default:
				System.out.println("Exiting...");
				break;
		}
		
		System.out.println("Thank you for using our service!");
		return;
	}

}
