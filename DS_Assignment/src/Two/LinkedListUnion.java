package Two;

/*B)Write a program to create two singly linked list of elements of type integer and find the union of the linked lists. (Accept elements in the sorted order.)
*/
import java.util.Scanner;

public class LinkedListUnion {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		SinglyLinkedList list1 = new SinglyLinkedList();
		SinglyLinkedList list2 = new SinglyLinkedList();

		System.out.print("Enter the number of elements for the first list: ");
		int n1 = scanner.nextInt();
		System.out.println("Enter the elements in sorted order for the first list:");
		for (int i = 0; i < n1; i++) {
			list1.insertSorted(scanner.nextInt());
		}

		System.out.print("Enter the number of elements for the second list: ");
		int n2 = scanner.nextInt();
		System.out.println("Enter the elements in sorted order for the second list:");
		for (int i = 0; i < n2; i++) {
			list2.insertSorted(scanner.nextInt());
		}

		System.out.println("First List:");
		list1.display();
		System.out.println("Second List:");
		list2.display();

		SinglyLinkedList unionList = list1.union(list2);
		System.out.println("Union of both lists:");
		unionList.display();

		scanner.close();
	}
}
