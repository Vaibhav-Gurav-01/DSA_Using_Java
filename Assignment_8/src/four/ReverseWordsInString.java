package four;

import java.util.Scanner;

public class ReverseWordsInString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		String result = reverseWords(input);
		System.out.println("Output: " + result);

		scanner.close();
	}

	private static String reverseWords(String str) {
		StringBuilder reversedString = new StringBuilder();
		Stack_Class stack = new Stack_Class(str.length());

		for (int i = 0; i <= str.length(); i++) {
			char ch = (i < str.length()) ? str.charAt(i) : ' ';
			if (ch != ' ') {
				stack.push(ch);
			} else {
				while (!stack.isEmpty()) {
					reversedString.append(stack.pop());
				}
				reversedString.append(' ');
			}
		}

		return reversedString.toString().trim();
	}
}
