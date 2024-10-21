package Two;
/*B) Write a  program to sort elements of a singly linked list in ascending order and display the sorted List.
*/

public class SinglyLinkedList {
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
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	public void display() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public void sort() {
		head = mergeSort(head);
	}

	private Node mergeSort(Node head) {
		if (head == null || head.next == null) {
			return head;
		}

		Node middle = getMiddle(head);
		Node nextOfMiddle = middle.next;
		middle.next = null;

		Node left = mergeSort(head);
		Node right = mergeSort(nextOfMiddle);

		return merge(left, right);
	}

	private Node merge(Node left, Node right) {
		if (left == null)
			return right;
		if (right == null)
			return left;

		Node sortedList;

		if (left.data <= right.data) {
			sortedList = left;
			sortedList.next = merge(left.next, right);
		} else {
			sortedList = right;
			sortedList.next = merge(left, right.next);
		}

		return sortedList;
	}

	private Node getMiddle(Node head) {
		if (head == null)
			return head;

		Node slow = head;
		Node fast = head.next;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();

		list.insert(5);
		list.insert(2);
		list.insert(9);
		list.insert(1);
		list.insert(3);
		list.insert(7);

		System.out.println("Original List:");
		list.display();

		list.sort();

		System.out.println("Sorted List:");
		list.display();
	}
}
