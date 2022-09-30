
public class timeDemo {

	public static void main(String[] args) {
		Time timeA = new Time();
		
		timeA.setTime(23, 48);
		
		System.out.println(timeA.getHour() +" "+ timeA.getMinute());
		
		Time timeB = new Time();
		
		timeB.setTime(25, 68);
		
		System.out.println(timeB.getHour() +" "+ timeB.getMinute());
		
		Time timeC = new Time();
		
		timeC.setTime2(8, 31, true);
		
		System.out.println(timeC.getHour() +" "+ timeC.getMinute());

	}

}
