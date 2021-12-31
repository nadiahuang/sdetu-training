package basics;

public class NumbersCalc {
	
	public static void main(String[] args) {

		//Declaring variables
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("Program has started.");
		
		//Calling functions
		printName();
		addNumbers(num1, num2);
		int product = multiplyNumbers(num1, num2);
		
		//System.out.println("The product of " + num1 + " and " + num2 + " is " + multiplyNumbers(num1, num2) + ".");
		System.out.println("The product of " + num1 + " and " + num2 + " is " + product + ".");
		
	}
	
	static void printName() {
		System.out.println("My name is Nadia.");
	}
	
	static void addNumbers(int numA, int numB) {
		int sum = numA + numB;
		System.out.println("The sum of numbers " + numA + " and " + numB + " is " + sum + ".");
		
	}
	
	static int multiplyNumbers(int numC, int numD) {
		int product = numC * numD;
		//addNumbers(product + 50, product);
		return product;
	}

}
