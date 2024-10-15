package Assignment_2;

import java.util.Scanner;

public class Queue_Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Queue_Class queues = new Queue_Class(10);

		while (true) {
			System.out.println("Choose an option:");
			System.out.println("1. Enqueue to Queue 1");
			System.out.println("2. Enqueue to Queue 2");
			System.out.println("3. Dequeue from Queue 1");
			System.out.println("4. Dequeue from Queue 2");
			System.out.println("5. Print Queue 1");
			System.out.println("6. Print Queue 2");
			System.out.println("7. Exit");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter value to enqueue to Queue 1: ");
				int value1 = scanner.nextInt();
				queues.enqueue1(value1);
				break;
			case 2:
				System.out.print("Enter value to enqueue to Queue 2: ");
				int value2 = scanner.nextInt();
				queues.enqueue2(value2);
				break;
			case 3:
				System.out.println("Dequeued from Queue 1: " + queues.dequeue1());
				break;
			case 4:
				System.out.println("Dequeued from Queue 2: " + queues.dequeue2());
				break;
			case 5:
				queues.printQueue1();
				break;
			case 6:
				queues.printQueue2();
				break;
			case 7:
				System.out.println("Exiting...");
				scanner.close();
				return;
			default:
				System.out.println("Invalid choice, please try again.");
			}
		}
	}
}
