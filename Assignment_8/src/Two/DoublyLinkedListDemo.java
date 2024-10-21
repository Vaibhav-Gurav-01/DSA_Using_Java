package Two;
import java.util.Scanner;

/*B)  Write a  program to create doubly link list and display nodes having odd value.*/


public class DoublyLinkedListDemo {
	
    public static void main(String[] args) {
	
        Scanner scanner = new Scanner(System.in);
        
        DoublyLinkedList list = new DoublyLinkedList();
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Node");
            System.out.println("2. Display Odd Values");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to add to the doubly linked list: ");
                    int data = scanner.nextInt();
                    list.addNode(data);
                    break;
                case 2:
                    System.out.println("Odd values in the doubly linked list:");
                    list.displayOddValues();
                    break;
                case 3:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}
