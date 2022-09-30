package myPackage;

import java.util.Scanner;

public class Ex3_14 {

	public static void main(String[] args) {
		double velocity = 0;
		double height = 0;
		int time = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the initial velocity of the ball:");
		velocity = keyboard.nextDouble();
		
		for (int i = 0; i < 5; i ++) {
			while (true) {
				System.out.println("Time: "+time+" Height: "+height);
				
				height = height + velocity;
				velocity = velocity - 32;
				
				time ++;
				
				if (height < 0) {
					System.out.println("Bounce!");
					velocity = (velocity+32) * (-0.5);
					height = height * (-0.5);
					break;
				}
			}
		}
		
		keyboard.close();

	}

}
