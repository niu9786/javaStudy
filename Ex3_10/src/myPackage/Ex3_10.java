package myPackage;

import java.util.Scanner;

public class Ex3_10 {

	public static void main(String[] args) {
		String tmp;
		double balance = 0;
		double interest = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		while (true) {
			System.out.println("Write a bank account balance.");
			System.out.println("(If you want to end this program, write \"end\".)");
			tmp = keyboard.next();
			
			if ((tmp).equals("end")) break;
			else balance = Double.parseDouble(tmp);
			
			System.out.println("Write an interest rate(in percentage).");
			interest = keyboard.nextDouble();
			
			for (int i = 0; i < 10; i++) {
				balance = balance + (balance * (interest / 100));
			}
			
			System.out.println("The value of the account of annually interest in ten years is "+balance);
			
			balance = Double.parseDouble(tmp);
			
			for (int i = 0; i < 120; i++) {
				balance = balance + (balance * (interest / 1200));
			}
			
			System.out.println("The value of the account of monthly interest in ten years is "+balance);
			
			balance = Double.parseDouble(tmp);
			
			for (int i = 0; i < 3650; i++) {
				balance = balance + (balance * (interest / 36500));
			}
			
			System.out.println("The value of the account of daily interest in ten years is "+balance);
			System.out.println();
		}
		
		keyboard.close();

	}

}
