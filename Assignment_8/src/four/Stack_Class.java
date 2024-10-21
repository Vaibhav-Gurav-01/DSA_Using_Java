package four;
import java.util.Scanner;

/*D) Write a program which accept the string and reverse each word of the string using Static implementation of stack.
Example: Input - This is an input string
   Output - sihTsinatupnignirts.
*/

public class Stack_Class {
    private char[] stack;
    private int top;
    private int maxSize;

    public Stack_Class(int size) {
        maxSize = size;
        stack = new char[maxSize];
        top = -1;
    }

    public void push(char ch) {
        if (top < maxSize - 1) {
            stack[++top] = ch;
        }
    }

    public char pop() {
        if (top >= 0) {
            return stack[top--];
        }
        return '\0'; 
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
