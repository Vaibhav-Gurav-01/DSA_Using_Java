package Four;
/*
D)Write a program to accept names from the user and sort in alphabetical order using bubble sort 
-	Accept n name									
-	Bubble sort Function							
-	Display	*/


import java.util.Scanner;

public class BubbleSortNames {
	public static void bubbleSort(String[] names) {
		int n = names.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				// Compare adjacent elements
				if (names[j].compareTo(names[j + 1]) > 0) {
					// Swap if they are in the wrong order
					String temp = names[j];
					names[j] = names[j + 1];
					names[j + 1] = temp;
				}
			}
		}
	}



public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Accept the number of names
    System.out.print("Enter the number of names: ");
    int n = scanner.nextInt();
    scanner.nextLine();  // Consume the newline

    String[] names = new String[n];

    // Accept names from the user
    for (int i = 0; i < n; i++) {
        System.out.print("Enter name " + (i + 1) + ": ");
        names[i] = scanner.nextLine();
    }

    // Sort the names using bubble sort
    bubbleSort(names);

    // Display the sorted names
    System.out.println("Sorted names in alphabetical order:");
    for (String name : names) {
        System.out.println(name);
    }

    // Close the scanner
    scanner.close();
}
}

