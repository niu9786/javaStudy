
public class Staff extends Employee {
	private int payGrade;
	
	public Staff() {
		super();
		payGrade = 1; // default pay grade
	}
	
	public Staff(int newPayGrade) {
		super();
		payGrade = newPayGrade;
	}
	
	public Staff(int newEmployeeID, String newDepartment, int newPayGrade) {
		super(newEmployeeID, newDepartment);
		payGrade = newPayGrade;
	}
	
	public Staff(String initialName, int newEmployeeID, String newDepartment, int newPayGrade) {
		super(initialName, newEmployeeID, newDepartment);
		payGrade = newPayGrade;
	}
	
	public void reset(String newName, int newEmployeeID, String newDepartment, int newPayGrade) {
		reset(newName, newEmployeeID, newDepartment);
		this.payGrade = newPayGrade;
	}

	public int getPayGrade() {
		return payGrade;
	}

	public void setPayGrade(int payGrade) {
		this.payGrade = payGrade;
	}
	
	public void writeOutput() {
		super.writeOutput();
		System.out.println("Pay Grade: " + payGrade);
	}

}
