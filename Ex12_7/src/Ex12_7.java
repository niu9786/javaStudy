
import java.util.Scanner;

public class Ex12_7 {
	
	public static int fibonacciResult(int n) {
		int result = 0;
		if (n == 1) result = 0;
		else if (n == 2) result = 1;
		else {
			result = fibonacciResult(n - 1) + fibonacciResult(n - 2);
		}
		return result;
	}
	
	public static void fibonacciOutput(int n) {
		if (n == 1)
			System.out.println("Fibonacci #1 = 0");
		else if (n == 2) {
			fibonacciOutput(n - 1);
			System.out.println("Fibonacci #" + n + " = " + fibonacciResult(n));
		}
		
		else {
			fibonacciOutput(n - 1);
			System.out.print("Fibonacci #" + n + " = " + fibonacciResult(n) + "; ");
			System.out.println(fibonacciResult(n) + "/" + fibonacciResult(n - 1) + " = " + ((double)fibonacciResult(n) / (double)fibonacciResult(n - 1)));
		}
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		fibonacciOutput(n);
	}

}
