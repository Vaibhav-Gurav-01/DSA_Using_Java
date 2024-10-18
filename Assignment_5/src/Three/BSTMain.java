package Three;

import java.util.Scanner;

public class BSTMain {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        BinarySearchTree bst = new BinarySearchTree();

	        System.out.print("Enter the number of integers to insert: ");
	        int n = scanner.nextInt();

	        System.out.println("Enter " + n + " integers:");
	        for (int i = 0; i < n; i++) {
	            int value = scanner.nextInt();
	            bst.insert(value);
	        }

	        System.out.println("Level order traversal of the BST:");
	        bst.levelOrderTraversal();
	    }
}
