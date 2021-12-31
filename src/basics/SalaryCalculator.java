package basics;

public class SalaryCalculator {

	public static void main(String[] args) {

		//rate x hoursperweek = weeksperyear
		
		//Declaring variables
		String career;
		career = "Software Developer";
		
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My salary as a " + career + " at the rate of R" + rate + " per hour is R" + salary + " per year.");
		
		System.out.println("Program has started");
		System.out.println("My career: " + career);
		
		
		
	}

}
