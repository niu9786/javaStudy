
public class InvalidTimeExceptionDemo {
	public static boolean checkTime(String t) {
		try {
			if ((Integer.parseInt(t.substring(0, 2)) < 0) || (Integer.parseInt(t.substring(0, 2)) > 12)
					|| (Integer.parseInt(t.substring(3, 5)) < 0) || (Integer.parseInt(t.substring(3, 5)) > 59)
					|| (!((t.substring(6, 8).equals("am")) || (t.substring(6, 8).equals("pm")))))
				throw new InvalidTimeException();
			return true;
		} catch(InvalidTimeException e) {
			System.out.println("Error: Invalid time!!");
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(checkTime("12:34 am"));
		System.out.println(checkTime("23:12 pm"));
		System.out.println(checkTime("08:23 ws"));
		System.out.println(checkTime("02:43 am"));
	}
}
