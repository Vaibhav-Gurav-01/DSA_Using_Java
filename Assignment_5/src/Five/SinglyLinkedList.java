package Five;

public class SinglyLinkedList {
	
	    Node head;

	    // Method to add a new node at the end of the list
	    public void add(int data) {
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

	    // Method to display alternate nodes
	    public void displayAlternateNodes() {
	        Node current = head;
	        boolean alternate = true;

	        while (current != null) {
	            if (alternate) {
	                System.out.print(current.data + " ");
	            }
	            alternate = !alternate; // Toggle between true and false
	            current = current.next;
	        }
	        System.out.println(); // For a new line after displaying
	    }

}
