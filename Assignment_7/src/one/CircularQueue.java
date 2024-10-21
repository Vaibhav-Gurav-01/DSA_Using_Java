/*A)Implement Dynamic implementation of circular queue of integers with following operation:
- Initialize(),insert(), delete(), isempty(), isfull(), display()*/
package one;

public class CircularQueue {
	private int[] queue;
	private int front;
	private int rear;
	private int capacity;
	private int size;

	public CircularQueue(int capacity) {
		this.capacity = capacity;
		this.queue = new int[capacity];
		this.front = 0;
		this.rear = -1;
		this.size = 0;
	}

	public void initialize() {
		front = 0;
		rear = -1;
		size = 0;
		queue = new int[capacity];
	}

	public void insert(int value) {
		if (isFull()) {
			System.out.println("Queue is full! Expanding capacity...");
			expandCapacity();
		}
		rear = (rear + 1) % capacity;
		queue[rear] = value;
		size++;
	}

	public Integer delete() {
		if (isEmpty()) {
			System.out.println("Queue is empty! Cannot delete.");
			return null;
		}
		int deletedValue = queue[front];
		front = (front + 1) % capacity;
		size--;
		return deletedValue;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == capacity;
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Queue is empty!");
			return;
		}
		System.out.print("Queue elements: ");
		for (int i = 0; i < size; i++) {
			System.out.print(queue[(front + i) % capacity] + " ");
		}
		System.out.println();
	}

	private void expandCapacity() {
		int newCapacity = capacity * 2;
		int[] newQueue = new int[newCapacity];
		for (int i = 0; i < size; i++) {
			newQueue[i] = queue[(front + i) % capacity];
		}
		queue = newQueue;
		front = 0;
		rear = size - 1;
		capacity = newCapacity;
		System.out.println("Queue capacity expanded to " + newCapacity);
	}

	public static void main(String[] args) {
		CircularQueue cq = new CircularQueue(5);

		cq.insert(1);
		cq.insert(2);
		cq.insert(3);
		cq.insert(4);
		cq.insert(5);
		cq.display();

		System.out.println("Deleted: " + cq.delete());
		cq.display();

		cq.insert(6);
		cq.display();
	}
}
