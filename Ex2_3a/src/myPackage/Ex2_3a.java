package myPackage;

import java.util.Scanner;

public class Ex2_3a {
	public static void main(String[] args) {
		int item;
		int quarter;
		int dime;
		int nickel;
		
		Scanner keyboard = new Scanner(System.in);
		item = keyboard.nextInt();
		
		item = 100-item;
		
		quarter = item/25;
		dime = (item%25)/10;
		nickel = ((item%25)%10)/5;
		
		System.out.println(quarter+" quarters "+dime+" dimes "+nickel+" nickels ");
		
		keyboard.close();
	}
}
