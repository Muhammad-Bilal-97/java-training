package oop;

public class BankAccount {
	
	// Define variables
	String accountNumber;
	
	// STATIC >> belongs to the class not the object instance
	// final >> constant (often final use with static)
	static String routingNumber = "45643";
	
	//	Instance variables
	String name;
	String ssn;
	String accountType;
	double balance = 0;
	
	// Constructor definitions: unique methods
		// 1. used to define / setup / initialize prop's of an object
		// 2. constructors are IMPLICITLY called upon instantiation
		// 3. the same name as the class it self
		// 4. Constructors has NO return type
	BankAccount (){
		System.out.println("New Account Created");
	}
	
	// Overloading: call same method name with different arguments
	BankAccount( String accountType){
		System.out.println("New Account: " + accountType);
	}
	
	BankAccount( String accountType, double initDeposit){
		// initDeposit, accountType, msg are all local variables
		System.out.println("New Account: " + accountType);
		System.out.println("Initial deposit of: $ " + initDeposit);
		
		String msg = null;
		
		if (initDeposit < 1000) {
			msg = ("ERROR: Minimun deposit must be at least $1,000");
			
		} else {
			msg = "Thanks for your initial deposit of: $ " + initDeposit;
		}
		System.out.println(msg);
		balance = initDeposit;
	}
	
	
	
	// getters / setters
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSsn() {
		return ssn;
	}



	// Define methods
	void deposit() {
		
	}
	
	void withdraw() {
		
		
	}
	
	void checkBalance() {
		
		System.out.println("Balance: " + balance);
		
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[ " + name + ". " + accountNumber + ". BALANCE: $" + balance + " ]";
	}
}
