package Three;

import java.util.Scanner;

/*Write a program to create linked list with given number in which data part of each node contains individual digit of the number.
(Ex. Suppose the number is 368 then the nodes of linked list should contain 3, 6, 8)*/
public class LinkedListDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A number: ");
		int number = sc.nextInt();

		LinkedListClass list = new LinkedListClass();

		String numberString = String.valueOf(number);

		for (char digit : numberString.toCharArray()) {
			list.insert(Character.getNumericValue(digit));
		}

		list.display();
	}
}