package myPackage;

import java.util.Scanner;

public class Ex3_1b {
	public static void main(String[] args) {
		int item;
		int quarter;
		int dime;
		int nickel;
		
		Scanner keyboard = new Scanner(System.in);
		item = keyboard.nextInt();
		
		if (item < 25)
			System.out.println("Error: the cost should be more than 25 cents.");
		else if (item%5 != 0)
			System.out.println("Error: every costs are an integer multiple of 5.");
		else if (item > 100)
			System.out.println("Error: the cost should be less than $1.");
		else {
			item = 100-item;
			quarter = item/25;
			dime = (item%25)/10;
			nickel = ((item%25)%10)/5;
			System.out.println(quarter+" quarters "+dime+" dimes "+nickel+" nickels ");
		}
		
		keyboard.close();
	}
}
