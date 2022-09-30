package myPackage;

import java.util.Scanner;

public class Ex3_2b {

	public static void main(String[] args) {
		int num = 0;
		int A = 0;
		int B = 0;
		int C = 0;
		int D = 0;
		int F = 0;
		int tot = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		while (true) {
			num = keyboard.nextInt();
			
			if (num < 0) break;
			
			if (num > 100) num = 0;
			else {
				if ((num >= 90) && (num <= 100)) A++;
				else if ((num >= 80) && (num < 90)) B++;
				else if ((num >= 70) && (num < 80)) C++;
				else if ((num >= 60) && (num < 70)) D++;
				else F++;
				
				tot++;
			}
		}
		
		System.out.println("total count: "+ tot);
		System.out.print("A count: "+ A +", ");
		System.out.print("B count: "+ B +", ");
		System.out.print("C count: "+ C +", ");
		System.out.print("D count: "+ D +", ");
		System.out.print("F count: "+ F);
		
		keyboard.close();

	}

}
