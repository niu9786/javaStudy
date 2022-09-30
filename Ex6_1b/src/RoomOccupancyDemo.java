
public class RoomOccupancyDemo {

	public static void main(String[] args) {
		RoomOccupancy saerom101 = new RoomOccupancy(101, 2);
		
		saerom101.addOneToRoom();
		
		System.out.println(RoomOccupancy.getTotalNumber());
		
		for (int i=0; i < 2; i++) {
			saerom101.removeOneFromRoom();
		}
		
		System.out.println(RoomOccupancy.getTotalNumber());
		
		for (int i=0; i < 2; i++) {
			saerom101.removeOneFromRoom();
		}
		
		System.out.println(RoomOccupancy.getTotalNumber());
		
		for (int i=0; i < 2; i++) {
			saerom101.addOneToRoom();
		}
		
		System.out.println(RoomOccupancy.getTotalNumber());
		
		RoomOccupancy saerom102 = new RoomOccupancy(102, 3);
		
		System.out.println(RoomOccupancy.getTotalNumber());
		
		saerom102.removeOneFromRoom();
		
		System.out.println(RoomOccupancy.getTotalNumber());
		
		saerom101.addOneToRoom();

		System.out.println(RoomOccupancy.getTotalNumber());
	}

}
