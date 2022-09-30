
public class Ex12_1d {
	
	public static boolean checkPalindrome(String s) {
		String punc = "[^\uAC00-\uD7A3xfe0-9a-zA-Z\\s]";
		s = s.replaceAll(" ", "");
		s = s.replaceAll(punc, "");
		s = s.toLowerCase();
		if (s.length() == 1) return true;
		else if (s.length() == 2)
			return s.charAt(0) == s.charAt(s.length() - 1);
		else if (s.charAt(0) == s.charAt(s.length() - 1))
			return true && checkPalindrome(s.substring(1, s.length() - 1));
		else return false;
	}

	public static void main(String[] args) {
		System.out.println(checkPalindrome("Straw? No, too stupid a fad, I put soot on warts"));
		System.out.println(checkPalindrome("AbcBa"));
		System.out.println(checkPalindrome("aBbA"));
	}

}
