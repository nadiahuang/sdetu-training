package oop;

public class BankAccountApp {

	public static void main(String[] args) {

		// Creating a new bank account .. think instantiating object
		BankAccount acc1 = new BankAccount();
		acc1.accountNum = "019284784";
		acc1.balance = 5000;
		acc1.setRate();
		acc1.setRate();
		
		//acc1.name = "Nadia";
		// Encapsulation
		acc1.setName("Nadia Huang");
		acc1.setId("9603290348087");
		
		System.out.println(acc1.getId());
		System.out.println();
		
		acc1.deposit(1500);
		
		// Polymorphism through overriding 
		System.out.println(acc1.toString());

		// Polymorphism through overloading 
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNum = "821731929";

		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.accountNum = "123848383";
		
//		acc3.checkBalance();
//
//		CDAccount cd1 = new CDAccount();
//		cd1.balance = 3000;
//		cd1.interestRate = "4.5";
//		cd1.name = "Jane";
//		cd1.accountType = "CD Account";
//		System.out.println(cd1.toString());
//		cd1.compound();

	}

}
