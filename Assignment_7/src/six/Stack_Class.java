package six;

/*F) Write a  program which accept the string and check whether the string is Palindrome or not using stack. (Use Static/Dynamic implementation of Stack)	*/

import java.util.ArrayList;
import java.util.Scanner;

public class Stack_Class {
	private ArrayList<Character> stack;

	public Stack_Class() {
		stack = new ArrayList<>();
	}

	public void push(char c) {
		stack.add(c);
	}

	public char pop() {
		if (!isEmpty()) {
			return stack.remove(stack.size() - 1);
		}
		throw new RuntimeException("Stack is empty");
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	public int size() {
		return stack.size();
	}
}
