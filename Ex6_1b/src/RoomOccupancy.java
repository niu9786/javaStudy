
public class RoomOccupancy {
	private int roomNumber, peopleInRoom = 0;
	private static int totalNumber = 0;
	
	public RoomOccupancy(int roomNumber, int peopleInRoom) {
		this.roomNumber = roomNumber;
		this.peopleInRoom = peopleInRoom;
		RoomOccupancy.totalNumber = RoomOccupancy.totalNumber + peopleInRoom;
	}
	
	public void addOneToRoom() {
		this.peopleInRoom++;
		RoomOccupancy.totalNumber++;
	}
	
	public void removeOneFromRoom() {
		if ((this.peopleInRoom > 0) && (RoomOccupancy.totalNumber > 0)) {
			this.peopleInRoom--;
			RoomOccupancy.totalNumber--;
		}
		else {
			System.out.println("Error: the people in room and total people numbers should be 0 or higher.");
		}
		
	}
	
	public int getRoomNumber() {
		return this.roomNumber;
	}
	
	public static int getTotalNumber() {
		return RoomOccupancy.totalNumber;
	}
	
}
