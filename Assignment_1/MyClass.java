/*Assignment - A data structure that follows the Last-In-First-Out (LIFO) principle, meaning the last element added is the first one to be removed.  
Efficiently manage two stacks within a single array, ensuring optimal space utilization and avoiding overflows.
Provide a user-friendly interface with options to perform various operations on the stacks, such as pushing, popping, peeking, checking emptiness, and displaying elements.
Example
  Enter the capacity of the array: 5 
 Menu:
1. Push to Stack 1 
2. Pop from Stack 1 
3. Peek at Stack 1 
4. Check if Stack 1 is empty 
5. Push to Stack 2 
6. Pop from Stack 2 
7. Peek at Stack 2 
8. Check if Stack 2 is empty 
9. Exit */ 


package mypackage;
import java.util.Scanner;

public class MyClass {
	private int capacity;
	private int[] array;
	private int top1, top2;

	public MyClass(int capacity) {
		this.capacity = capacity;
		this.array = new int[capacity];
		this.top1 = -1;
		this.top2 = capacity;
	}

	// Stack 1
	public void pushStack1(int value) {
		if (top1 + 1 < top2) {
			array[++top1] = value;
		} else {
			System.out.println("Stack 1 Overflow!");
		}
	}

	public Integer popStack1() {
		if (top1 >= 0) {
			return array[top1--];
		} else {
			System.out.println("Stack 1 Underflow!");
			return null;
		}
	}

	public Integer peekStack1() {
		if (top1 >= 0) {
			return array[top1];
		} else {
			System.out.println("Stack 1 is empty!");
			return null;
		}
	}

	public boolean isEmptyStack1() {
		return top1 == -1;
	}

	// Stack 2
	public void pushStack2(int value) {
		if (top2 - 1 > top1) {
			array[--top2] = value;
		} else {
			System.out.println("Stack 2 Overflow!");
		}
	}

	public Integer popStack2() {
		if (top2 < capacity) {
			return array[top2++];
		} else {
			System.out.println("Stack 2 Underflow!");
			return null;
		}
	}

	public Integer peekStack2() {
		if (top2 < capacity) {
			return array[top2];
		} else {
			System.out.println("Stack 2 is empty!");
			return null;
		}
	}

	public boolean isEmptyStack2() {
		return top2 == capacity;
	}
}

