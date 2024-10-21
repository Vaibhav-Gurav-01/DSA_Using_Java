package three;
import java.util.Scanner;

/*C)Write a  program to accept names from the user and sort in alphabetical order using bubble sort 
-	Accept n name									
-	Bubble sort Function							
-	Display	*/


public class BubbleSortNames {

    // Bubble sort function to sort names in alphabetical order
    public static void bubbleSort(String[] names) {
        int n = names.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    // Swap names[j] and names[j+1]
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }
    }

    // Main method to accept names and display sorted names
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String[] names = new String[n];

        // Accept names from the user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        // Sort names using bubble sort
        bubbleSort(names);

        // Display sorted names
        System.out.println("\nSorted names in alphabetical order:");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}

