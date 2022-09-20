/**
 * This program is intended to check whether a number is prime or not.
 * This is written by Anirudh A V on 22 Dec 2021
 */

public class Prime {
	public static void main(String[] args) {
		int number = 17, flag = 0;
		if (number <= 1) {
			System.out.println("");
			System.out.println("The number is neither prime nor composite");
			return;
		}
		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				flag++;
				break;
			}
		}
		System.out.println("");
		if (flag == 1) {
			System.out.println(number + " is not a prime number.");
		} else {
			System.out.println(number + " is a prime number.");
		}
	}
}
