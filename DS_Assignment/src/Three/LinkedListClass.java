package Three;

public class LinkedListClass {

	Node head;

	public LinkedListClass() {
		this.head = null;
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
			System.out.print(current.data + ",  ");
			current = current.next;
		}
		System.out.println();
	}
}
