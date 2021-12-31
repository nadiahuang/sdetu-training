package labs;

public class Lab1 {

	public static void main(String[] args) {

		// Q1 Write a function that takes a value and returns the sum of 1 to n
		System.out.println("Sum: " + sum(3));

		// Q2 Write a function that computes factorial (recursion)
		System.out.println("Factorial: " + fact(5));

		// Q3 Write 3 functions that return min, max, average of array
		int[] numbers = { 2, 45, 32, 13, 10 };
		System.out.println("Min: " + min(numbers));
		System.out.println("Ave: " + ave(numbers));
		System.out.println("Max: " + max(numbers));
	}

	// Q1
	public static int sum(int n) {

		int sum = 0;

		for (int i = 1; i <= n; i++) {

			sum = sum + i;

		}

		return sum;

	}

	// Q2
	public static int fact(int n) {

		if (n == 0) {
			return 1;
		}

		return fact(n - 1) * n;

	}

	// Q3
	public static int min(int[] arr) {

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < min) {

				min = arr[i];

			}

		}
		return min;
	}

	public static int ave(int[] arr) {
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			sum = sum + arr[i];
			
		}
		
		return sum/arr.length;
		
	}

	public static int max(int[] arr) {

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {

				max = arr[i];

			}

		}
		return max;
	}

}
