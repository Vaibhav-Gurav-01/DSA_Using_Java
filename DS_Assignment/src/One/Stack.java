package One;

public class Stack {
	private char[] stack;
	private int top;
	private int maxSize;

	public Stack(int size) {
		maxSize = size;
		stack = new char[maxSize];
		top = -1;
	}


	public void push(char c) {
		if (top < maxSize - 1) {
			stack[++top] = c;
		} else {
			System.out.println("Stack is full!");
		}
	}


	public char pop() {
		if (top >= 0) {
			return stack[top--];
		} else {
			System.out.println("Stack is empty!");
			return '\0'; 
		}
	}


	public boolean isEmpty() {
		return top == -1;
	}
}
