package Assignment_4;

class EmployeeNode {
	int id;
	String name;
	double salary;
	String email;
	EmployeeNode next;

	public EmployeeNode(int id, String name, double salary, String email) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.email = email;
		this.next = null;
	}
}