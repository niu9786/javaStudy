
public class Ex12_1c {
	
	public static int countDigits(String s) {
		if (s.length() == 0) return 0;
		else if (Character.isDigit(s.charAt(0)) == true) return 1 + countDigits(s.substring(1));
		else return countDigits(s.substring(1));
	}
	
	public static void main(String[] args) {
		System.out.println(countDigits("010-1234-3456"));
		System.out.println(countDigits("213.23;32;sw2a21"));
	}
}
