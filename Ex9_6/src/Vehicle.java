
public class Vehicle {
	private String manufacturerName;
	private int numberOfCylinder = 0;
	private Person owner;
	
	public Vehicle(Person newOwner, String newManufacturerName, int newNumberOfCylinder) {
		owner = newOwner;
		manufacturerName = newManufacturerName;
		numberOfCylinder = newNumberOfCylinder;
	}
	
	public String getManufacturerName() {
		return manufacturerName;
	}

	public int getNumberOfCylinder() {
		return numberOfCylinder;
	}

	public Person getOwner() {
		return owner;
	}

	public boolean vehicleEquals(Object otherObject) {
		if (!(otherObject != null && otherObject instanceof Vehicle)) 
			return false;
		Vehicle otherVehicle = (Vehicle)otherObject;
		return this.owner.hasSameName(otherVehicle.owner) &&
				this.manufacturerName.equalsIgnoreCase(otherVehicle.manufacturerName) &&
				(this.numberOfCylinder == otherVehicle.numberOfCylinder);
	}
}
