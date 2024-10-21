package three;

/*C) Write a program to create Circular Singly Link list and display it.*/

public class CircularSinglyLinkedList {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void insert(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			head.next = head;
		} else {
			Node current = head;
			while (current.next != head) {
				current = current.next;
			}
			current.next = newNode;
			newNode.next = head;
		}
	}

	// Method to display the circular linked list
	public void display() {
		if (head == null) {
			System.out.println("The list is empty.");
			return;
		}

		Node current = head;
		do {
			System.out.print(current.data + " ");
			current = current.next;
		} while (current != head);
		System.out.println();
	}

	public static void main(String[] args) {
		CircularSinglyLinkedList circularList = new CircularSinglyLinkedList();

		circularList.insert(10);
		circularList.insert(20);
		circularList.insert(30);
		circularList.insert(40);

		System.out.println("Circular Singly Linked List:");
		circularList.display();
	}
}
