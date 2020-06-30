
public class CustomerAccount {
	private int accNum = 0;
	private double bal = 0.0;
	private String custName = "";
	private String custMail = "";
	private String phoneNum = "-1";
	
	public CustomerAccount (int a, double b, String name, String mail, String phNum) {
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
	
}
