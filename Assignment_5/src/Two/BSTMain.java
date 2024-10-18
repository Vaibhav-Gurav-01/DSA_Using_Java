/*B) Write menu driven program  for Binary Search Tree. The menu includes 
-	Create a Binary Search Tree
-	Display
-	Delete a given element from Binary Search Tree*/


package Two;
import java.util.Scanner;
public class BSTMain {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Create a Binary Search Tree");
            System.out.println("2. Display the Binary Search Tree");
            System.out.println("3. Delete an element from the Binary Search Tree");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int value = scanner.nextInt();
                    bst.insert(value);
                    break;
                case 2:
                    System.out.print("Inorder traversal of the BST: ");
                    bst.inorder();
                    break;
                case 3:
                    System.out.print("Enter value to delete: ");
                    int deleteValue = scanner.nextInt();
                    bst.delete(deleteValue);
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
