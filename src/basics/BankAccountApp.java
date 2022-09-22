package basics;


public class BankAccountApp {
	
	public static void main (String[] args) {
		
		// Creating a new bank account >> think instantiate an object
		
		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "234325734957";
        
		
		BankAccount acc2 = new BankAccount("Employee");
		acc2.accountNumber = "2343254942357";
		
		BankAccount acc3 = new BankAccount("Bilal", 15000);
		acc3.accountNumber = "234325234734957";
		
		
	}

}
