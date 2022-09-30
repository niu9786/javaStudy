
public class Ex12_9 {
	
	public static int getTotalGrains(int k) {
		double grains;
		if (k == 1) {
			grains = 1;
			return (int)grains;
		}
		else {
			grains = Math.pow(2, (k - 1));
			return (int)grains + getTotalGrains(k - 1);
		}
	}

	public static void main(String[] args) {
		System.out.print("The total number of grains for all 4 squares: ");
		System.out.println(getTotalGrains(4));
		System.out.print("The total number of grains for all 6 squares: ");
		System.out.println(getTotalGrains(6));
	}

}
