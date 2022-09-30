
public class Truck extends Vehicle {
	private double loadCapacity, towingCapacity = 0;
	
	public Truck(Person owner, String manufacturerName, int numberOfCylinder, double newLoadCapacity, double newTowingCapacity) {
		super(owner, manufacturerName, numberOfCylinder);
		loadCapacity = newLoadCapacity;
		towingCapacity = newTowingCapacity;
	}

	public double getLoadCapacity() {
		return loadCapacity;
	}

	public double getTowingCapacity() {
		return towingCapacity;
	}
	
	public boolean truckEquals(Object otherObject) {
		if (!(otherObject != null && otherObject instanceof Truck))
			return false;
		Truck otherTruck = (Truck)otherObject;
		return this.vehicleEquals(otherTruck) &&
				(this.loadCapacity == otherTruck.loadCapacity) &&
				(this.towingCapacity == otherTruck.towingCapacity);
	}
}
