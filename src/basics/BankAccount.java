package basics;

public class BankAccount {
	
	// Define variables
	String accountNumber;
	
	// STATIC >> belongs to the class not the object instance
	// final >> constant (often final use with static)
	static String routingNumber = "45643";
	String name;
	String ssn;
	String accountType;
	
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
		System.out.println("New Account: " + accountType);
		System.out.println("Initial deposit of: $ " + initDeposit);
		if (initDeposit < 1000) {
			String errorMsg = ("ERROR: Minimun deposit must be at least $1,000");
			System.out.println(errorMsg);
		}
	}
	
	
	
	// Define methods
	void deposit() {
		
		// System.out.println(initDeposit);
		
	}
	
	void withdraw() {
		
		
	}
	
	void checkBalance() {
		
	}
	
	void getStatus() {
		
	}
	
}
