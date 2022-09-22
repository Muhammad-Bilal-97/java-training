package oop;

public class BankAccountApp {
	
	public static void main (String[] args) {
		
		// Creating a new bank account >> think instantiate an object
		
		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "234325734957";
		acc1.name = "ABCD";
		acc1.balance = 10000;
		System.out.println(acc1.toString());
		acc1.setSsn("2452343");
		System.out.println("SSN: " + acc1.getSsn());
		
		
		/*
		BankAccount acc2 = new BankAccount("Employee");
		acc2.accountNumber = "2343254942357";
		
		BankAccount acc3 = new BankAccount("Bilal", 15000);
		acc3.accountNumber = "234325234734957";
		acc3.checkBalance();
		
		
		// demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.interestRate = "4.5";
		cd1.balance = 3000;
		cd1.name = "CD balance";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compunt();
		*/
		
		
	}

}
