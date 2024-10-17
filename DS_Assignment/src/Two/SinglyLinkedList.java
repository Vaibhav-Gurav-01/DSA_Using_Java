package Two;

class SinglyLinkedList {
	Node head;


	public void insertSorted(int data) {
		Node newNode = new Node(data);
		if (head == null || head.data > data) {
			newNode.next = head;
			head = newNode;
		} else {
			Node current = head;
			while (current.next != null && current.next.data < data) {
				current = current.next;
			}
			newNode.next = current.next;
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


	public SinglyLinkedList union(SinglyLinkedList list2) {
		SinglyLinkedList unionList = new SinglyLinkedList();
		Node current1 = this.head;
		Node current2 = list2.head;

		while (current1 != null && current2 != null) {
			if (current1.data < current2.data) {
				unionList.insertSorted(current1.data);
				current1 = current1.next;
			} else if (current1.data > current2.data) {
				unionList.insertSorted(current2.data);
				current2 = current2.next;
			} else {
				unionList.insertSorted(current1.data); 
				current1 = current1.next;
				current2 = current2.next;
			}
		}


		while (current1 != null) {
			unionList.insertSorted(current1.data);
			current1 = current1.next;
		}

	
		while (current2 != null) {
			unionList.insertSorted(current2.data);
			current2 = current2.next;
		}

		return unionList;
	}
}
