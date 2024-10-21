package one;

class SinglyLinkedList {
    private Node head;

    // Method to create linked list
    public void createLinkedList(int data) {
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

    // Method to display linked list
    public void displayLinkedList() {
        if (head == null) {
            System.out.println("Linked List is empty.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method to search for a node
    public void searchNode(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                System.out.println("Node " + data + " found in the linked list.");
                return;
            }
            current = current.next;
        }
        System.out.println("Node " + data + " not found in the linked list.");
    }

    // Method to insert node at last position
    public void insertAtLast(int data) {
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
        System.out.println("Node " + data + " inserted at the last position.");
    }
}
