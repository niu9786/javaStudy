import java.util.Scanner;
import java.util.Random;

public class Ex7_9 {
	private String password;
	private String input;
	
	static int[] numArr = new int[10];
	
	public Ex7_9() {
		Random rand = new Random();
		
		for (int i = 0; i < 10; i++) {
			numArr[i] = (rand.nextInt(3) + 1);
		}
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void inputNum() {
		Scanner keyboard = new Scanner(System.in);
		this.input = keyboard.next();
	}
	
	public boolean matchPW() {
		return ((numArr[Integer.parseInt(password.substring(0, 1))]) == Integer.parseInt(this.input.substring(0, 1))) &&
				((numArr[Integer.parseInt(password.substring(1, 2))]) == Integer.parseInt(this.input.substring(1, 2))) &&
				((numArr[Integer.parseInt(password.substring(2, 3))]) == Integer.parseInt(this.input.substring(2, 3))) &&
				((numArr[Integer.parseInt(password.substring(3, 4))]) == Integer.parseInt(this.input.substring(3, 4))) &&
				((numArr[Integer.parseInt(password.substring(4, 5))]) == Integer.parseInt(this.input.substring(4, 5)));
	}
	
	public static void numOutput() {
		System.out.println("NUM : " + numArr[0] + " " + numArr[1] + " " + numArr[2] + " " + numArr[3] + " "
				+ numArr[4] + " " + numArr[5] + " " + numArr[6] + " " + numArr[7] + " " + numArr[8] + " " + numArr[9]);
	}

}
