/* 
The FizzBuzz game is a simple game where players count up from 1 and
replace any number divisible by 3 with "fizz", any number divisible by
5 with "buzz", and any number divisible by 15 with "fizzbuzz".
*/
public class FizzBuzz {
	public static void main (String[] args) {
		// Loop through the numbers 1 to 100
		for (int i = 1; i <= 100; i++) {
			// Check if the current number is divisible by 15
			if (i % 15 == 0) {
				System.out.println("fizzbuzz");
			} 
			// Check if the current number is divisible by 5
			else if (i % 5 == 0) {
				System.out.println("buzz");
			} 
			// Check if the current number is divisible by 3
			else if (i % 3 == 0) {
				System.out.println("fizz");
			} 
			// If the number is not divisible by 3, 5, or 15, just print the number
			else {
				System.out.println(i);
			} 
		}
	}
}