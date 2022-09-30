
public class Employee extends Person {
	private int employeeID;
	private String department;
	
	public Employee(){
		super();
		employeeID = 0;
		department = "None";
	}
	
	public Employee(int newEmployeeID, String newDepartment) {
		super();
		employeeID = newEmployeeID;
		department = newDepartment;
	}
	
	public Employee(String initialName, int newEmployeeID, String newDepartment) {
		super(initialName);
		employeeID = newEmployeeID;
		department = newDepartment;
	}
	
	public void reset(String newName, int newEmployeeID, String newDepartment) {
		setName(newName);
		this.employeeID = newEmployeeID;
		this.department = newDepartment;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void writeOutput() {
		super.writeOutput();
		System.out.println("Employee ID: " + employeeID);
		System.out.println("Department: " + department);
	}

}
