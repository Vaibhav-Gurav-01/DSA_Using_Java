package Five;
import java.util.Scanner;
/*E)Write a  program to create a singly Link list and display lits alternative nodes.
 *  (start displaying from first node)	*/

public class SinglyLinkedListMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SinglyLinkedList list = new SinglyLinkedList();

		// Adding nodes to the list
		System.out.println("Enter The Total Numbers Nodes::");
		int nodes = sc.nextInt();
		
	for(int i =0; i<nodes;i++) {
		System.out.print("Enter Element to add: ");
		int ele = sc.nextInt();
		list.add(ele);
	}


		// Displaying alternate nodes
		System.out.println("\nAlternate nodes in the list:");
		list.displayAlternateNodes();
	}
}
