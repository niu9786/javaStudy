import java.util.Arrays;

public class Ex12_1b {
	
	public static void displayAsWords(int number) {
		int count = 0;
		int tmp = number;
		
		while (true) {
			tmp = tmp / 10;
			count ++;
			if (tmp < 10) break;
		}
		
		for (int i = 0; i < count + 1; i++) {
			int ex = number / (int)Math.pow(10, (count - i));
			System.out.print(getWordFromDigit(ex) + " ");
			number = number % (int)Math.pow(10, (count - i));
		}
	}
	
	public static String getWordFromDigit(int digit) {
		String[] word = new String[] {
				"zero", "one", "two", "three", "four",
				"five", "six", "seven", "eight", "nine"
		};
		return word[digit];
	}
	
	public static void main(String[] args) {
		displayAsWords(987);
		System.out.println();
		displayAsWords(42345);
		System.out.println();
		displayAsWords(23);
	}

}
