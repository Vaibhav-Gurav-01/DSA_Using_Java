/*Problem Statement:
Create a linear linked list-based system to manage employee information. Each node in the linked list should store the following employee attributes:

A unique integer identifier for the employee.
A string representing the employee's name.
A floating-point number representing the employee's salary.
A string representing the employee's email address.
The system should provide the following functionalities:
Add a new employee to the linked list.
Find an employee based on their ID,if found will return details.
Display information for all employees in the linked list as a list .
Input:

Employee information (ID, name, salary, email) for registration.
Search criteria (ID).
Output:

Success message for successful registration.
Employee information for search results.
List of all employees in the system.
Constraints:

Employee IDs should be unique.
The system should handle potential errors gracefully (e.g., invalid input, employee not found).
The linked list should be implemented efficiently for optimal performance.


*/

package Assignment_4;

import java.util.Scanner;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        EmployeeLinkedList employeeList = new EmployeeLinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Employee");
            System.out.println("2. Find Employee by ID");
            System.out.println("3. Display All Employees");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    
                    System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    
                    System.out.println(employeeList.addEmployee(id, name, salary, email));
                    break;

                case 2:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = scanner.nextInt();
                    System.out.println(employeeList.findEmployeeById(searchId));
                    break;

                case 3:
                    employeeList.displayAllEmployees();
                    break;

                case 4:
                    System.out.println("Exiting the system.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
