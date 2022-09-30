package myPackage;

import java.util.Scanner;

public class Ex2_3b {
	
	public static void main(String[] args) {
		System.out.println("Write the radius(in inches) and the depth(in feet).");
		
		double radius;
		double depth;
		double volume;
		
		Scanner keyboard = new Scanner(System.in);
		radius = keyboard.nextDouble();
		depth = keyboard.nextDouble();
		
		radius = radius/12;
		
		volume = Math.PI*radius*radius*depth;
		volume = 7.48*volume;
		
		System.out.println("it holds "+volume+" gallons of water");
		
		keyboard.close();
	}
}
