package Two;

public  class DoublyLinkedList {
    private Node head;

    // Method to add a node to the end of the doubly linked list
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    // Method to display nodes with odd values
    public void displayOddValues() {
        Node current = head;
        boolean foundOdd = false;

        while (current != null) {
            if (current.data % 2 != 0) {
                System.out.print(current.data + " ");
                foundOdd = true;
            }
            current = current.next;
        }

        if (!foundOdd) {
            System.out.println("No odd values found in the doubly linked list.");
        } else {
            System.out.println();
        }
    }
}
