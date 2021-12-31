package oop;

public class BankAccount implements IRate {

	// static: Belongs to the class, not the object instance
	// final: Constant (often static final)
	private static final String routingNum = "123189";

	// Instance variables
	String accountNum;
	private String name;
	private String id;
	String accountType;
	double balance;

	// Constructor definitions: unique methods
	// 1. They are used to
	// 2. Constructors are IMPLICTLY called upon INSTANTIATION
	// 3. The same name as the class itself
	// 4. Constructors have no return type

	BankAccount() {

		System.out.println("New account created");
		System.out.println();

	}

	// Overloading called same name with different arguments
	BankAccount(String accountType) {

		System.out.println("Account type: " + accountType);

	}

	BankAccount(String accountType, double initDeposit) {

		// accountType, initDeposit and errorMsg are local variables
		String errorMsg = null;
		System.out.println("Account type: " + accountType);
		System.out.println("Initial Deposit: R" + initDeposit);

		if (initDeposit < 1000) {

			errorMsg = "ERROR! Minimum deposit must be R1000,00.";

		} else {

			System.out.println("Initial deopsit of R" + initDeposit + " has been captured.");

		}

		System.out.println(errorMsg);
		balance = balance + initDeposit;

	}

	// Getters and Setters
	// Allow the user to define the name
	public void setName(String name) {

		this.name = "Ms." + name;

	}

	public String getName() {

		return name;

	}

	public String getId() {

		return id;

	}

	public void setId(String id) {

		this.id = id;

	}

	public void setRate() {

		System.out.println("Setting rate");

	}

	public void increaseRate() {

		System.out.println("Increasing rate");

	}

	// Define methods
	public void deposit(double amount) {

		balance = balance + amount;
		showActivity("Deposit");

	}

	void withdraw(double amount) {

		balance = balance - amount;

	}

	private void showActivity(String activity) {

		System.out.println("Showing recent activity: " + activity);
		System.out.println("Your new balance is: R" + balance);
		System.out.println();

	}

	void checkBalance() {

		System.out.println("Balance: R" + balance);

	}

	void getStatus() {

	}

	@Override
	public String toString() {

		return "[Name: " + name + ". Account Number: " + accountNum + ". Routing number: #" + routingNum
				+ ". Balance: R" + balance + "]";

	}

}
