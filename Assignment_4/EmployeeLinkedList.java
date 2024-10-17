package Assignment_4;

class EmployeeLinkedList {
    private EmployeeNode head;

    public EmployeeLinkedList() {
        this.head = null;
    }

    
    
    
    // Add a new employee
    public String addEmployee(int id, String name, double salary, String email) {


        EmployeeNode emp = new EmployeeNode(id, name, salary, email);
        if (head == null) {
            head = emp;
        } else {
            EmployeeNode current = head;
            while (current.node != null) {
                current = current.node;
            }
            current.node = emp;
        }
        return "Employee registered successfully.";
    }

    
    // Find an employee by ID
    public String findEmployeeById(int id) {
        EmployeeNode current = head;
        while (current != null) {
            if (current.id == id) {
                return "Employee Found: ID: " + current.id + ", Name: " + current.name +
                        ", Salary: " + current.salary + ", Email: " + current.email;
            }
            current = current.node;
        }
        return "Error: Employee not found.";
    }

    // Display all employees
    public void displayAllEmployees() {
        if (head == null) {
            System.out.println("No employees to display.");
            return;
        }
        EmployeeNode current = head;
        System.out.println("Employee List:");
        while (current != null) {
            System.out.println("ID: " + current.id + ", Name: " + current.name +
                    ", Salary: " + current.salary + ", Email: " + current.email);
            current = current.node;
        }
    }
}