
public class subclassesDemo {
	
	public static boolean checkMinute(String mm) {
		try {
			if ((Integer.parseInt(mm) < 0) || (Integer.parseInt(mm) > 59))
				throw new InvalidMinuteException();
			return true;
		} catch(InvalidMinuteException e) {
			System.out.println("Error: Invalid Minute!!");
			return false;
		}
	}
	
	public static boolean checkHour(String hh) {
		try {
			if ((Integer.parseInt(hh) < 0) || (Integer.parseInt(hh) > 12))
				throw new InvalidHourException();
			return true;
		} catch(InvalidHourException e) {
			System.out.println("Error: Invalid Hour!!");
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(checkHour("12"));
		System.out.println(checkHour("32"));
		System.out.println(checkMinute("54"));
		System.out.println(checkMinute("82"));

	}

}
