package one;
import java.util.Scanner;

/*A) Write a menu driven program for singly linked list-
-	To create linked list.
-	To display linked list
-	To search node in linked list.
-	Insert at last position*/


public class MenuDrivenLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinglyLinkedList linkedList = new SinglyLinkedList();
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Create Linked List");
            System.out.println("2. Display Linked List");
            System.out.println("3. Search Node");
            System.out.println("4. Insert at Last Position");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to add to linked list: ");
                    int data = scanner.nextInt();
                    linkedList.createLinkedList(data);
                    break;
                case 2:
                    linkedList.displayLinkedList();
                    break;
                case 3:
                    System.out.print("Enter value to search: ");
                    int searchData = scanner.nextInt();
                    linkedList.searchNode(searchData);
                    break;
                case 4:
                    System.out.print("Enter value to insert at last: ");
                    int insertData = scanner.nextInt();
                    linkedList.insertAtLast(insertData);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
