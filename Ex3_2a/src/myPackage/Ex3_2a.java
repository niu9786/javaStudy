package myPackage;

import java.util.Scanner;

public class Ex3_2a {
	public static void main(String[] args) {
		int num;
		int max = 0;
		int min = 0;
		int sum = 0;
		double avg = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		while (true) {
			num = keyboard.nextInt();
			
			if (num < 0) break;
			
			if (num > max) max = num;
			
			if (min == 0) min = num;
			else if ((min != 0)  && (min >= 0)) {
				if (num < min) min = num;
			}
			
			if (num >= 0) {
				sum++;
				avg += num;
			}
		}
		
		System.out.println("The maximum value is "+max);
		System.out.println("The minimum value is "+min);
		System.out.println("The average is "+avg/sum);
		
		keyboard.close();
	}

}
