
public class Ex7_2b {
	public static double getSum(double[][] arr, int row) {
		double sum = 0;
		for (int i = 0; i < arr[row].length; i++) {
			sum = sum + arr[row][i];
		}
		return sum;
	}
	
	public static double getAverage(double[][] arr, int column) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i][column];
		}
		return sum / arr.length;
	}
	
}
