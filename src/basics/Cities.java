package basics;

public class Cities {

	public static void main(String[] args) {
		
		//Declaring and defining array
		String[] cities = {"Durban", "Johannesburg", "Cape Town", "Pretoria"};
		
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		System.out.println();
		
		String[] countries;
		countries = new String[3];
		countries[0] = "South Africa";
		countries[1] = "Sudan";
		countries[2] = "Nigeria";
		
		System.out.println(countries[2]);
		System.out.println();
		
		String[] provinces = new String[5];
		provinces[0] = "KwaZulu Natal";
		provinces[1] = "Gauteng";
		provinces[2] = "Western Cape";
		provinces[3] = "Eastern Cape";
		provinces[4] = "North West";
		
		int i = 0;
		
		//Do loop: Enters the loop THEN tests condition
		do {
		
			System.out.println("Province: " + provinces[i]);
			i = i + 1;
			
		} while (i < 5);
		
		System.out.println();
		int n = 0;
		boolean proFound = false;
		
		//While loop: Test condition THEN enters loop 
//		while(n < 5) {
//			
//			System.out.println("Province at " + n + ": " + provinces[n]);
//			n++;
//			
//		}
//		
//		System.out.println();
		
		while(!proFound) {
			
			String province = provinces[n];
			System.out.println(province);
			
			if (province == "Gauteng") {
				
				System.out.println("Province found!");
				proFound = true;
				
			}
			
			n++;
			
		}
		
		System.out.println();
		System.out.println("FOR LOOP:");
		
		//For loop: Best structure for iterating through an array
		for(int x = 0; x < 5; x++) {
			
			System.out.println(provinces[x]);
			
		}
		
	}

}
