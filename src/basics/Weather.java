package basics;

public class Weather {

	public static void main(String[] args) {

		//This program will suggest what to wear based on the weather
		
		int temp = 21;
		String sunCond = "Sunny";
		
		if(temp > 25) {
			System.out.println("It's pleasant. Wear shorts and a t-shirt.");
		}
		else if (temp > 20 && sunCond == "Sunny") {
			System.out.println("It's a little cooler. Perhaps wear a long sleeve t-shirt and jeans.");
			System.out.println("It's also going to be sunny. Wear a hat.");
		}
		else if (temp > 15 || sunCond == "Overcast") {
			System.out.println("Today is a cold day. Make sure to wear warmer clothes");

		}
		else {
			System.out.println("Looks like a cold day. Bring a jacket.");
		}
		
	}

}
