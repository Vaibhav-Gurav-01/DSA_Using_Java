package five;

/*E)Write a  program to count all non-zero elements, odd numbers and even numbers in the singly linked list.	
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

    public void countElements() {
        Node current = head;
        int nonZeroCount = 0;
        int oddCount = 0;
        int evenCount = 0;

        while (current != null) {
            if (current.data != 0) {
                nonZeroCount++;
            }
            if (current.data % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            current = current.next;
        }

        System.out.println("Count of Non-Zero Elements: " + nonZeroCount);
        System.out.println("Count of Odd Numbers: " + oddCount);
        System.out.println("Count of Even Numbers: " + evenCount);
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insert(10);
        list.insert(15);
        list.insert(0);
        list.insert(-3);
        list.insert(4);
        list.insert(-8);
        list.insert(5);

        System.out.println("Singly Linked List:");
        list.display();

        list.countElements();
    }
}
