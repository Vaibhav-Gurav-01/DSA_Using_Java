package one;

/*A) Write menu driven program  for Binary Search Tree. The menu includes 
-	Create a Binary Search Tree
-	Traverse it by using Preorder and Post order traversing technique*/

import java.util.Scanner;

public class BSTMain {
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		Scanner scanner = new Scanner(System.in);
		int choice, key;

		do {
			System.out.println("\nMenu:");
			System.out.println("1. Create a Binary Search Tree");
			System.out.println("2. Traverse Preorder");
			System.out.println("3. Traverse Postorder");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter a value to insert: ");
				key = scanner.nextInt();
				bst.insert(key);
				break;
			case 2:
				System.out.print("Preorder Traversal: ");
				bst.preorder();
				System.out.println();
				break;
			case 3:
				System.out.print("Postorder Traversal: ");
				bst.postorder();
				System.out.println();
				break;
			case 4:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice! Please try again.");
			}
		} while (choice != 4);

		scanner.close();
	}
}
