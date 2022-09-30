import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		String input, result, again;
		
		Scanner keyboard = new Scanner(System.in);
		while (true) {
			System.out.println("Enter time in 24-hour notation:");
			input = keyboard.next();
			try {
				if ((((input.length() == 5) && (Integer.parseInt(input.substring(0, 2)) > 23 || Integer.parseInt(input.substring(3, 5)) > 59
						|| Integer.parseInt(input.substring(3, 5)) < 0)))
						|| ((input.length() == 4) && ((Integer.parseInt(input.substring(0, 1)) < 0) || (Integer.parseInt(input.substring(2, 4)) < 0)
								|| Integer.parseInt(input.substring(2, 4)) > 59 )))
					throw new TimeFormatException();
				if (input.length() == 4) {
					result = input + " AM";
				}
				else {
					if (Integer.parseInt(input.substring(0, 2)) < 12) {
						result = input + " AM";
					}
					else {
						result = Integer.toString(Integer.parseInt(input.substring(0, 2)) - 12)
								+ input.substring(2) + " PM";
					}
				}
				System.out.println("That is the same as");
				System.out.println(result);
				System.out.println("Again? (y/n)");
				again = keyboard.next();
				if (again.equals("n")) {
					System.out.println("End of program");
					break;
				}
			} catch (TimeFormatException e) {
				System.out.println("There is no such time as " + input);
				System.out.println("Try Again:");
			}
		} 
		keyboard.close(); 
	}

}
