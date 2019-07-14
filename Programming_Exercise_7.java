//Tessa Biava
//CST-105
//July 12th, 2019
//This is my own work

/* Printing out numbers between 1 and 100000 that are both prime and palindromic.
 * Does not print out numbers that are not both. An example is 111 or 51515 or 545. 
 * This program will show 8 numbers on each line that are true for both until it reaches 100000.
 */

public class Programming_Exercise_7 {

	public static void main(String[] args) {
		// number limit
		int number = 100000;
		// numbers per line
		int perLine = 8;
		int count = 1;
		for (int i = 0; i < number; i++) {
			// if prime and palindromic
			if (isPrime(i) == true && isPalindromic(i) == true && i != 0 && i != 1) {
				if (i <= 100) {
					System.out.print(i + "     ");
				} else if (i > 100 && i < 1000) {
					System.out.print(i + "   ");
				} else {
					System.out.print(i + " ");
				}
				if (count % perLine == 0) {
					System.out.print("\n");
				}

				// increase the count
				count++;
			}
		}

	}

	// test if a palindrome
	public static boolean isPalindromic(int number) {
		String reverse = new StringBuilder(Integer.toString(number)).reverse().toString();
		int palindrome = Integer.parseInt(reverse);
		if (number == palindrome) {
			return true;
		} else {
			return false;
		}
	}

	// test if prime
	public static boolean isPrime(int number) {
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}