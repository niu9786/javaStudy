package myPackage;

import java.util.Scanner;

public class Ex4_5 {
	private String A, B, C, D, F;
	private double numA, numB, numC, numD, numF = 0;
	private double total;
	
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Write the grades:");
		System.out.println("(For example, 1 A 4 Bs 6 Cs 2 Ds 1 F)");
		
		Ex4_5 example = new Ex4_5();
		
		example.setNumA(keyboard.nextDouble());
		example.setA(keyboard.next());
		example.setNumB(keyboard.nextDouble());
		example.setB(keyboard.next());
		example.setNumC(keyboard.nextDouble());
		example.setC(keyboard.next());
		example.setNumD(keyboard.nextDouble());
		example.setD(keyboard.next());
		example.setNumF(keyboard.nextDouble());
		example.setF(keyboard.next());
		example.setTotal();
		
		System.out.print("0   10   20   30   40   50   60   70   80   90  100");
		System.out.println();
		System.out.print("|   |    |    |    |    |    |    |    |    |    |");
		System.out.println();
		for (int i = 0; i < 50; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 0; i < example.halfPerA(); i++) {
			System.out.print("*");
		}
		System.out.print(" ");
		System.out.print(example.getA().substring(0, 1));
		System.out.println();
		for (int i = 0; i < example.halfPerB(); i++) {
			System.out.print("*");
		}
		System.out.print(" ");
		System.out.print(example.getB().substring(0, 1));
		System.out.println();
		for (int i = 0; i < example.halfPerC(); i++) {
			System.out.print("*");
		}
		System.out.print(" ");
		System.out.print(example.getC().substring(0, 1));
		System.out.println();
		for (int i = 0; i < example.halfPerD(); i++) {
			System.out.print("*");
		}
		System.out.print(" ");
		System.out.print(example.getD().substring(0, 1));
		System.out.println();
		for (int i = 0; i < example.halfPerF(); i++) {
			System.out.print("*");
		}
		System.out.print(" ");
		System.out.print(example.getF().substring(0, 1));
		
		keyboard.close();
	}
	
	/** to get the _ percent of 50 rounded to the nearest integer */
	
	public double halfPerA() {
		return Math.round(this.perA() / 2);
	}
	
	public double halfPerB() {
		return Math.floor(this.perB() / 2);
	}
	
	public double halfPerC() {
		return Math.floor(this.perC() / 2);
	}
	
	public double halfPerD() {
		return Math.round(this.perD() / 2);
	}
	
	public double halfPerF() {
		return Math.round(this.perF() / 2);
	}
	
	/** get the percentage */
	public double perA() {
		return Math.round(numA / total * 100);
	}
	
	public double perB() {
		return Math.round(numB / total * 100);
	}
	
	public double perC() {
		return Math.round(numC / total * 100);
	}
	
	public double perD() {
		return Math.round(numD / total * 100);
	}
	
	public double perF() {
		return Math.round(numF / total * 100);
	}

	public String getA() {
		return A;
	}
	
	public void setTotal() {
		total = numA + numB+ numC+ numD+ numF;
	}
	
	public void setA(String a) {
		A = a;
	}

	public String getB() {
		return B;
	}

	public void setB(String b) {
		B = b;
	}

	public String getC() {
		return C;
	}

	public void setC(String c) {
		C = c;
	}

	public String getD() {
		return D;
	}

	public void setD(String d) {
		D = d;
	}

	public String getF() {
		return F;
	}

	public void setF(String f) {
		F = f;
	}

	public double getNumA() {
		return numA;
	}

	public void setNumA(double numA) {
		this.numA = numA;
	}

	public double getNumB() {
		return numB;
	}

	public void setNumB(double numB) {
		this.numB = numB;
	}

	public double getNumC() {
		return numC;
	}

	public void setNumC(double numC) {
		this.numC = numC;
	}

	public double getNumD() {
		return numD;
	}

	public void setNumD(double numD) {
		this.numD = numD;
	}
	
	public double getNumF() {
		return numF;
	}
	
	public void setNumF(double numF) {
		this.numF = numF;
	}

}
