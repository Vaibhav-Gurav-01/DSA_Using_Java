package mypackage;

import java.util.Scanner;

public class MyMain {


		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

			System.out.print("Enter the size of the array: ");
			int size = scanner.nextInt();
			MyClass obj = new MyClass(size);

			while (true) {
				System.out.println("\nMenu:");
				System.out.println("1. Push to Stack 1");
				System.out.println("2. Pop from Stack 1");
				System.out.println("3. Peek at Stack 1");
				System.out.println("4. Check if Stack 1 is empty");
				System.out.println("5. Push to Stack 2");
				System.out.println("6. Pop from Stack 2");
				System.out.println("7. Peek at Stack 2");
				System.out.println("8. Check if Stack 2 is empty");
				System.out.println("9. Exit");

				System.out.print("Enter your choice: ");
				int choice = scanner.nextInt();

				switch (choice) {
				case 1:
					System.out.print("Enter value to push to Stack 1: ");
					obj.pushStack1(scanner.nextInt());
					break;
				case 2:
					System.out.println("Popped from Stack 1: " + obj.popStack1());
					break;
				case 3:
					System.out.println("Peek at Stack 1: " + obj.peekStack1());
					break;
				case 4:
					System.out.println("Stack 1 is empty: " + obj.isEmptyStack1());
					break;
				case 5:
					System.out.print("Enter value to push to Stack 2: ");
					obj.pushStack2(scanner.nextInt());
					break;
				case 6:
					System.out.println("Popped from Stack 2: " + obj.popStack2());
					break;
				case 7:
					System.out.println("Peek at Stack 2: " + obj.peekStack2());
					break;
				case 8:
					System.out.println("Stack 2 is empty: " + obj.isEmptyStack2());
					break;
				case 9:
					System.out.println("Exiting...");
					scanner.close();
					return;
				default:
					System.out.println("Invalid choice. Please try again.");
				}
			}
		}
	}

