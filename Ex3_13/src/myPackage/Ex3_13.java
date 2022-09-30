package myPackage;

import java.util.Scanner;

public class Ex3_13 {

	public static void main(String[] args) {
		int size = 0;
		
		System.out.println("Enter the size of a triangle.");
		
		Scanner keyboard = new Scanner(System.in);
		size = keyboard.nextInt();
		
		for (int i = 0; i < size; i++) {
			
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for (int i = 0; i < size; i++) {
			
			for (int j = size-1; i < j; j--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		keyboard.close();

	}

}
