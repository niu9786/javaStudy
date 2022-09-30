package myPackage;

import java.util.Scanner;

public class Ex3_1a {
	public static void main(String[] args) {
		int check;
		
		System.out.println("Write check amount.");
		
		Scanner keyboard = new Scanner(System.in);
		check = keyboard.nextInt();
		
		if (check < 10)
			System.out.println("The charge is $1.");
		else if (check < 100)
			System.out.println("The charge is $"+(check/10)+".");
		else if (check < 1000)
			System.out.println("The charge is $"+(5+(check/20))+".");
		else
			System.out.println("The charge is $"+(40+(check/100))+".");
		
		keyboard.close();
	}
}
