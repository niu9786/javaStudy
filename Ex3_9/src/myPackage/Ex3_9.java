package myPackage;

import java.util.Scanner;

public class Ex3_9 {

	public static void main(String[] args) {
		String word1;
		String word2;
		
		Scanner keyboard = new Scanner(System.in);
		
		while (true) {
			word1 = keyboard.next();
			
			if ((word1).equalsIgnoreCase("quit")) break;
			
			word2 = word1.substring(1) + word1.substring(0,1);
			
			word2 = reverseString(word2);
			
			if ((word1).equalsIgnoreCase(word2))
				System.out.println(word1 +" has this property.");
			else
				System.out.println(word1 +" doesn't have this property.");
			
		}
		
		keyboard.close();

	}
	
	public static String reverseString(String word2) {
		return ( new StringBuffer(word2) ).reverse().toString();
	}

}
