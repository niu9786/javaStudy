
public class Faculty extends Employee {
	private String memberTitle;
	
	public Faculty() {
		super();
		memberTitle = "none";
	}
	
	public Faculty(String newMemberTitle) {
		super();
		memberTitle = newMemberTitle;
	}
	
	public Faculty(int newEmployeeID, String newDepartment, String newMemberTitle) {
		super(newEmployeeID, newDepartment);
		memberTitle = newMemberTitle;	
	}
	
	public Faculty(String initialName, int newEmployeeID, String newDepartment, String newMemberTitle) {
		super(initialName, newEmployeeID, newDepartment);
		memberTitle = newMemberTitle;
	}
	
	public void reset(String newName, int newEmployeeID, String newDepartment, String newMemberTitle) {
		reset(newName, newEmployeeID, newDepartment);
		this.memberTitle = newMemberTitle;
	}

	public String getMemberTitle() {
		return memberTitle;
	}

	public void setMemberTitle(String memberTitle) {
		this.memberTitle = memberTitle;
	}
	
	public void writeOutput() {
		super.writeOutput();
		System.out.println("Member's Title: " + memberTitle);
	}

}
