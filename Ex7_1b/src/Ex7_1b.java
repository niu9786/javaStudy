import java.util.Scanner;

public class Ex7_1b {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		while(true) {
			int[] frequency = new int[10];
			
			for (int i = 0; i < 10; i++) {
				frequency[i] = 0;
			}
			System.out.println("Write the phone number. If you want to stop the program, write \"quit\"");
			
			String phoneNumber = keyboard.next();
			
			if (phoneNumber.equalsIgnoreCase("quit")) break;
			
			for (int i = 0; i < phoneNumber.length(); i++) {
				if (phoneNumber.substring(i, i+1).equals("0")) {
					frequency[0]++;
				}
				else if (phoneNumber.substring(i, i+1).equals("1")) {
					frequency[1]++;
				}
				else if (phoneNumber.substring(i, i+1).equals("2")) {
					frequency[2]++;
				}
				else if (phoneNumber.substring(i, i+1).equals("3")) {
					frequency[3]++;
				}
				else if (phoneNumber.substring(i, i+1).equals("4")) {
					frequency[4]++;
				}
				else if (phoneNumber.substring(i, i+1).equals("5")) {
					frequency[5]++;
				}
				else if (phoneNumber.substring(i, i+1).equals("6")) {
					frequency[6]++;
				}
				else if (phoneNumber.substring(i, i+1).equals("7")) {
					frequency[7]++;
				}
				else if (phoneNumber.substring(i, i+1).equals("8")) {
					frequency[8]++;
				}
				else if (phoneNumber.substring(i, i+1).equals("9")) {
					frequency[9]++;
				}
			}
			
			for (int i = 0; i < 10; i++) {
				System.out.println("f[" + i + "] = " + frequency[i]);
			}
		}
		
		keyboard.close();
	}

}
