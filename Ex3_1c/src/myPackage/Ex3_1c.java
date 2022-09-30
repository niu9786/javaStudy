package myPackage;

import java.util.Scanner;

public class Ex3_1c {
	public static void main(String[] args) {
		char grade;
		
		System.out.println("Write your grade.");
		
		Scanner keyboard = new Scanner(System.in);
		grade = keyboard.next().charAt(0);
		
		if ((grade == 'a') || (grade == 'A'))
			System.out.println("4.0");	
		else if ((grade == 'b') || (grade == 'B'))
			System.out.println("3.0");
		else if ((grade == 'c') || (grade == 'C'))
			System.out.println("2.0");
		else if ((grade == 'd') || (grade == 'D'))
			System.out.println("1.0");
		else
			System.out.println("0.0");
		
		keyboard.close();
	}

}
