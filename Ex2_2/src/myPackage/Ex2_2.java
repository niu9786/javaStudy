package myPackage;

import java.util.Scanner;

public class Ex2_2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String txt;
		txt = keyboard.nextLine();
		
		int position = txt.indexOf(" ");
		txt = txt.substring(position+1) + " " +txt.substring(0, position);
		
		String fst;
		fst = txt.substring(0,1);
		fst = fst.toUpperCase();
		
		txt = fst + txt.substring(1);
		
		System.out.println(txt);
		
		keyboard.close();
	}
}
