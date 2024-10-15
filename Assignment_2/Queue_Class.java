/*in this there exists 2 queues in single array
one act from start to end
other end to start
user will be given option enqueue from 1,enqueue from 2,dequeue from 1,dequeue from 2nd,print queue 1,print queue2
start from mid to create queues*/


package Assignment_2;

public class Queue_Class {
	
	    private int[] array;
	    private int front1, rear1, front2, rear2;
	    private int size;

	    public  Queue_Class(int size) {
	        this.size = size;
	        array = new int[size];
	        front1 = 0;
	        rear1 = 0;
	        front2 = size - 1;
	        rear2 = size - 1;
	    }

	    public void enqueue1(int value) {
	        if (rear1 < front2) {
	            array[rear1] = value;
	            rear1++;
	        } else {
	            System.out.println("Queue 1 is full");
	        }
	    }

	    public void enqueue2(int value) {
	        if (rear1 < front2) {
	            array[rear2] = value;
	            rear2--;
	        } else {
	            System.out.println("Queue 2 is full");
	        }
	    }

	    public Integer dequeue1() {
	        if (rear1 > front1) {
	            int value = array[front1];
	            front1++;
	            return value;
	        } else {
	            System.out.println("Queue 1 is empty");
	            return null;
	        }
	    }

	    public Integer dequeue2() {
	        if (rear2 < front2) {
	            int value = array[front2];
	            front2--;
	            return value;
	        } else {
	            System.out.println("Queue 2 is empty");
	            return null;
	        }
	    }

	    public void printQueue1() {
	        if (rear1 > front1) {
	            System.out.print("Queue 1: ");
	            for (int i = front1; i < rear1; i++) {
	                System.out.print(array[i] + " ");
	            }
	            System.out.println();
	        } else {
	            System.out.println("Queue 1 is empty");
	        }
	    }

	    public void printQueue2() {
	        if (rear2 < front2) {
	            System.out.print("Queue 2: ");
	            for (int i = front2 + 1; i < size - rear2; i++) {
	                System.out.print(array[i] + " ");
	            }
	            System.out.println();
	        } else {
	            System.out.println("Queue 2 is empty");
	        }
	    }
	}


