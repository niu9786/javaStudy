
public class TimeDemo {

	public static void main(String[] args) {
		Time one = new Time();
		
		one.setTime(15, 5);
		
		System.out.println(one.getTime24());
		System.out.println(one.getTime12());
		
		Time two = new Time();
		
		two.setTime2(8, 40, false);
		
		System.out.println(two.getTime24());
		System.out.println(two.getTime12());
		
		Time three = new Time();
		
		three.setTime(12, 0);
		
		System.out.println(three.getTime24());
		System.out.println(three.getTime12());
		
		Time four = new Time();
		
		four.setTime2(11, 7, true);
		
		System.out.println(four.getTime24());
		System.out.println(four.getTime12());
		
		Time five = new Time();
		
		five.setTime(7, 38);
		
		System.out.println(five.getTime24());
		System.out.println(five.getTime12());

	}

}
