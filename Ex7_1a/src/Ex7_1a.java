import java.util.Scanner;

public class Ex7_1a {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		double sum = 0;
		
		double[] scores = new double[n];
		
		for (int i = 0; i < n; i++) {
			scores[i] = keyboard.nextDouble();
			sum = sum + scores[i];
		}
		
		double dN = (double)n;
		
		System.out.println("The average of the scores is " + sum / dN + ".");
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			if (scores[i] > (sum / dN)) {
				System.out.println(scores[i] + " is above the average.");
			}
		}
		keyboard.close();
	}

}
