/*A) Write a  program to accept a string from user and reverse it using Static implementation of Stack.*/
package One;

import java.util.Scanner;

public class ReverseStringUsingStack {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string to reverse: ");
		String input = scanner.nextLine();

		Stack stack = new Stack(input.length());

		for (char c : input.toCharArray()) {
			stack.push(c);
		}

		StringBuilder reversedString = new StringBuilder();
		while (!stack.isEmpty()) {
			reversedString.append(stack.pop());
		}

		System.out.println("Reversed string: " + reversedString.toString());

		scanner.close();
	}
}