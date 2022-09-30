
public class driverProgram {

	public static void main(String[] args) {
		Person LeeDongJae = new Person("LDJ");
		Person KimSiWon = new Person("KSW");
		
		Truck aTruck = new Truck(LeeDongJae, "Hyundai", 2000, 1.2, 1.5);
		Truck bTruck = new Truck(KimSiWon, "KIA", 3000, 1.6, 1.8);
		Truck cTruck = new Truck(LeeDongJae, "Hyundai", 2000, 1.2, 1.5);
		
		System.out.println(aTruck.getLoadCapacity());
		System.out.println(aTruck.getNumberOfCylinder());
		System.out.println(bTruck.getManufacturerName());
		System.out.println(bTruck.getTowingCapacity());
		System.out.println(LeeDongJae.getName());
		System.out.println(LeeDongJae.hasSameName(KimSiWon));
		System.out.println(aTruck.truckEquals(cTruck));
		System.out.println(aTruck.truckEquals(bTruck));
		System.out.println(aTruck.vehicleEquals(cTruck));
		System.out.println(aTruck.vehicleEquals(bTruck));
		
	}

}
