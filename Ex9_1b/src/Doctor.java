
public class Doctor extends Person {
	private Specialty specialty;
	private double visit_fee;
	
	public Doctor() {
		super();
		this.visit_fee = 0;
	}
	public Doctor(String initialName, Specialty value, double visit_fee) {
		super(initialName);
		this.specialty = value;
		this.visit_fee = visit_fee;
	}
	public Specialty getSpecialty() {
		return specialty;
	}
	public void setSpecialty(Specialty specialty) {
		this.specialty = specialty;
	}
	public double getVisit_fee() {
		return visit_fee;
	}
	public void setVisit_fee(double visit_fee) {
		this.visit_fee = visit_fee;
	}
	public String toString() {
		return "Name: " + getName() + 
				"Specialty: " + getSpecialty() +
				"Visit Fee: " + getVisit_fee();
	}
	public boolean equals(Object otherObject) {
		if (!(otherObject != null && otherObject instanceof Doctor))
			return false;
		Doctor otherDoctor = (Doctor)otherObject;
		return this.hasSameName(otherDoctor) &&
				(this.specialty == otherDoctor.specialty) &&
				(this.visit_fee == otherDoctor.visit_fee);
	}

}
