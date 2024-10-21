package six;

import java.util.Scanner;

public class PalindromeChecker {

	public static boolean isPalindrome(String str) {
		Stack_Class stack = new Stack_Class();

		for (char c : str.toCharArray()) {
			stack.push(c);
		}

		for (char c : str.toCharArray()) {
			if (c != stack.pop()) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		String sanitizedInput = input.replaceAll("\\s+", "").toLowerCase();

		if (isPalindrome(sanitizedInput)) {
			System.out.println("\"" + input + "\" is a palindrome.");
		} else {
			System.out.println("\"" + input + "\" is not a palindrome.");
		}

		scanner.close();
	}
}
