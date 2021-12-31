package basics;

public class Strings {

	public static void main(String[] args) {

		String bookTitle;
		String word = "Potter";
		bookTitle = "Harry Potter";
		
		if(bookTitle.contains("Potter")) {
			System.out.println("The book contains the word " + word + ".");
		}
		
		String browser = "Edge";
		
		if(browser.equalsIgnoreCase("edge")) {
			
			System.out.println("The browser is Edge.");
			
		}
		
		String firstName = "Nadia";
		String lastName = "Huang";
		String ID = "9603290348087";
		
		System.out.println("\nThere are " + ID.length() + " digits in your ID number.\n");
		
		System.out.print(firstName.substring(0, 1));
		System.out.print(lastName.substring(0, 1));
		System.out.print(ID.substring(6));
		
	}

}
