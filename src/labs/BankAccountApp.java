package labs;

public class BankAccountApp {

	public static void main(String[] args) {

		BankAccount acc1 = new BankAccount("127563671", 1000);

		acc1.setName("Nadia");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println();
		System.out.println(acc1.toString());

	}

}

class BankAccount implements IInterest {

	private static int id = 1000; // Internal ID
	private String accNum; // id + random 2 digit number + first 2 digits of ssn
	private static final String routingNum = "005400657";
	private String name;
	private String ssn;
	private double balance;

	// Constructor
	public BankAccount(String ssn, double initDeposit) {

		balance = initDeposit;
		this.ssn = ssn;
		id++;
		setAccNum();

	}

	private void setAccNum() {

		int random = (int) (Math.random() * 100);
		accNum = id + "" + random + ssn.substring(0, 2);
		System.out.println("New account: " + accNum);

	}

	public void setName(String name) {

		this.name = name;

	}

	public String getName() {

		return name;

	}

	public void payBill(double amount) {

		balance = balance - amount;
		System.out.println("Paying bill: " + amount);
		showBalance();

	}

	public void makeDeposit(double amount) {

		balance = balance + amount;
		System.out.println("Making deposit: " + amount);
		showBalance();

	}

	public void showBalance() {

		System.out.println("Balance: " + balance);

	}

	@Override
	public void accrue() {

		balance = balance * (1 + rate / 100);
		showBalance();

	}

	@Override
	public String toString() {

		return "[Name: " + name + "]\n[Account Number: " + accNum + "]\n[Routing Number: " + routingNum
				+ "]\n[Balance: " + balance + "]";

	}

}